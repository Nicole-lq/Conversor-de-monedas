# Challenge Conversor de Monedas

Respositorio del primer desafío de la ruta "Desarrollador BackEnd" de Alura Latam y ORACLE ONE.

## Insignias

![GitHub License](https://img.shields.io/github/license/Nicole-lq/Challenge1-BackEndONE)
![Maven Central Version](https://img.shields.io/maven-central/v/org.apache.maven.plugins/maven-compiler-plugin)
![GitHub Release](https://img.shields.io/github/v/release/Nicole-lq/Challenge1-BackEndONE)


## Índice

* [Challenge Conversor de Monedas](#Challenge-Conversor-de-Monedas)

* [Insignias](#insignias)

* [Índice](#índice)

* [Descripción del proyecto](#Descripción-del-proyecto)

* [Estado del proyecto](#Estado-del-proyecto)

* [Características de la aplicación y demostración](#Características-de-la-aplicación-y-demostración)

* [Acceso al proyecto](#acceso-proyecto)

* [Tecnologías utilizadas](#tecnologías-utilizadas)
  
* [Conclusiones](#conclusiones)

* [Desarrollador](#Desarrollador)



## Descripción del proyecto

Este desafío consistía en crear un conversor de monedas, que por medio de solicitudes a una API, obtuviera las tasas de cambio actualizadas.
Los pasos para completar el desafío se detallan a continuación:

* Configuración del Ambiente Java
* Creación del Proyecto
* Consumo de la API
* Análisis de la Respuesta JSON
* Filtro de Monedas
* Exibición de Resultados a los usuarios

La modadlidad de trabajo se dió bajo el sistema ágil de desarrollo, por medio de la herramienta Trello, considerando las  siguientes etapas:

* "Listos para iniciar"
* "En Desarrollo"
* "Pausado"
* "Concluido"

La interfaz de usuario se puede apreciar a continuación:

[<img src ="imagenes/trello.png">](https://trello.com/b/RU41cvaQ/conversor-de-moneda-challenge-one-java-back-end)


## Estado del proyecto

El proyecto está en una fase de desarrollo activa. Actualmente, se han implementado las siguientes funcionalidades:

* Configuración del entorno de desarrollo en Java.
* Creación del proyecto con Maven.
* Consumo de la API de tasas de cambio utilizando HttpClient.
* Análisis de la respuesta JSON con GSON.
* Conversión de monedas y presentación de resultados en la consola.

Pendientes:
* Mejora de la interfaz de usuario en la consola (este proyecto no incluye la etapa Front-End, pero eventualmente podría agregarse).
* Adición de más monedas y sus respectivas pruebas unitarias.

## Características de la aplicación y demostración

La aplicación permite realizar conversiones entre diferentes monedas usando tasas de cambio actualizadas desde la API de ExchangeRate-API. 

### Características principales:

* Conversión desde pesos chilenos (CLP), a dólares estadounidenses (USD) y won surcoreano (KRW), así como su respectiva conversión inversa.
* Interfaz de usuario en la consola que permite seleccionar la acción a realizar desde un menú de opciones.
* Manejo de solicitudes HTTP y análisis de respuestas JSON.
* Uso de GSON para deserializar datos JSON.

Para una demostración, simplemente ejecuta la aplicación y sigue las instrucciones en la consola para seleccionar la conversión que deseas realizar.

## Acceso al proyecto

Puedes clonar este repositorio usando el siguiente comando:

```sh
git clone https://github.com/Nicole-lq/Challenge1-BackEndONE.git
```

## Tecnologías utilizadas

* Java 11+
* Maven
* HttpClient
* GSON
* IntelliJ IDEA

## ExchangeRate-API

Esta API recopila datos de tipo de cambio de múltiples bancos centrales y fuentes comerciales, y luego utiliza su propio algoritmo para combinar estos conjuntos de datos. Este proceso reduce el impacto de un cambio incorrecto de moneda proporcionado por una determinada fuente. LA API admite un código de moneda si se tienen al menos tres fuentes de datos para ella. Los datos se actualizan cada hora para los usuarios con planes de pago, mientras que los datos de tipo de cambio gratuitos se actualizan una vez cada 24 horas. Cada respuesta de la API muestra una marca de fecha y la hora UNIX de la actualización más reciente de los datos que fueron utilizados. Los datos recopilados provienen de varios bancos centrales y fuentes comerciales de todo el mundo.

Cada solicitud HTTPS GET de la API, es descontada de la cuota permitida por el plan personal (en este caso se ha utilizado el formato gratuito). La API envía un correo de aviso cuando se ha utilizado el 75% y luego el 100% de la cuota disponible (también se puede ver el detalle del consumo en el sitio web de la API).

Para obtener acceso a la API, basta con ingresar una direción de correo electrónico en el sitio web y seguir las instrucciones, como se muestra a continuación:

[<img src= "imagenes/API.png">](https://www.exchangerate-api.com)


## Conclusiones

La aplicación de conocimientos es clave para consolidar el aprendizaje en todas las disciplinas, en especial en el caso de la programación. El desarrollo de este proyecto ha significado una excelente oportunidad para pone en práctica los conocimientos de Java y desarrollo backend aprendidos a lo largo de la formación del programa de Alura Latam y ORACLE ONE. El implementar el consumo de una API, manipular datos JSON y manejar solicitudes HTTP son habilidades fundamentales en el desarrollo moderno, tanto como el uso de herramientas de gestión ágil (Trello), para la organización y seguimiento de proyectos, lo que hace de este desafío, una gran instancia de aprendizaje.



## Desarrollador

|[<img src="https://avatars.githubusercontent.com/u/84999245?s=96&v=4"><br><sub> Nicole Lastra Quiroz </sub>](https://github.com/Nicole-lq)|
