package com.moneyconverter;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class TasaCambioAPI {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/";

    public static double obtenerTasaCambio(String deMoneda, String aMoneda) throws Exception {
        String apiKey = System.getenv("EXCHANGE_RATE_API_KEY");
        if (apiKey == null) {
            throw new RuntimeException("Clave API no encontrada en las variables de entorno");
        }

        URI uri = new URI(API_URL + apiKey + "/latest/" + deMoneda);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new RuntimeException("Fallo : código de error HTTP : " + response.statusCode());
        }

        Gson gson = new Gson();
        RespuestaTasaCambio respuesta = gson.fromJson(response.body(), RespuestaTasaCambio.class);
        return respuesta.getTasas().get(aMoneda);
    }
}
