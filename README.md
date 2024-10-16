<p align="center">
  <img src="imagenes/logos.png" width="300">
</p>

# Currency Converter

Repository created for the "Backend Developer" track of Alura Latam and ORACLE ONE.

## Badges

![GitHub License](https://img.shields.io/github/license/Nicole-lq/Challenge1-BackEndONE)
![Maven Central Version](https://img.shields.io/maven-central/v/org.apache.maven.plugins/maven-compiler-plugin)
![GitHub Release](https://img.shields.io/github/v/release/Nicole-lq/Challenge1-BackEndONE?filter=v0.1.0-beta&display_name=tag)

## Table of Contents

* [Currency Converter](#Currency-Converter)

* [Badges](#Badges)

* [Table of Contents](#table-of-contents)

* [Project Description](#Project-Description)

* [Project Status](#Project-Status)

* [Application Features and Demo](#Application-Features-and-Demo)

* [Access to the Project](#access-project)

* [Technologies Used](#technologies-used)
  
* [ExchangeRate API](#ExchangeRate-API)
  
* [Conclusions](#conclusions)

* [Developer](#Developer)

## Project Description

This challenge consisted of creating a currency converter that fetches updated exchange rates through an API. The steps for completing the challenge are detailed below:

* Java Environment Setup
* Project Creation
* API Consumption
* JSON Response Analysis
* Currency Filtering
* Display of Results to Users

The project followed an agile development process using Trello, with the following stages:

* "Ready to Start"
* "In Development"
* "Paused"
* "Completed"

The user interface can be seen below:

[<img src="imagenes/trello.png">](https://trello.com/b/RU41cvaQ/conversor-de-moneda-challenge-one-java-back-end)

## Project Status

While the project meets all the requirements of the Alura Latam and ORACLE ONE Backend Developer Challenge, it is still considered in active development by the developer for personal learning and continuous improvement.

The following functionalities have been implemented so far:
* Java development environment setup.
* Project creation with Maven.
* API consumption for exchange rates using HttpClient.
* JSON response analysis with GSON.
* Currency conversion and display of results in the console.

Personal future challenges:
* Improving the user interface in the console (this project does not include a Front-End phase, but it could be added eventually).
* Adding more currencies and corresponding unit tests.

## Application Features and Demo

The application allows conversions between different currencies using updated exchange rates from the ExchangeRate-API. 

### Main Features

* Conversion from Chilean pesos (CLP) to US dollars (USD) and South Korean won (KRW), as well as their respective reverse conversions.
* Console user interface that allows users to select actions from a menu.
* Handling HTTP requests and analyzing JSON responses.
* Using GSON to deserialize JSON data.

### Demo

Below is a video that summarizes the development, implementation, and testing process of the project (clicking the image will open the video on YouTube).

[![](https://img.youtube.com/vi/3vpaPzChi10/maxresdefault.jpg)](https://youtu.be/3vpaPzChi10)

You can also run the application locally using an IDE like **IntelliJ IDEA**, by copying all the necessary folders to the appropriate paths, and then following the console instructions to select the desired conversion.

## Access to the Project

You can clone this repository using the following command:

```sh
git clone https://github.com/Nicole-lq/Challenge1-BackEndONE.git
```

## Technologies Used

* Java 11+
* Maven
* HttpClient
* GSON
* IntelliJ IDEA

## ExchangeRate API

This API gathers exchange rate data from multiple central banks and commercial sources, and then uses its own algorithm to combine these data sets. This process reduces the impact of an incorrect exchange rate provided by a particular source. The API supports a currency code if it has at least three data sources for it. The data is updated every hour for users with paid plans, while free exchange rate data is updated once every 24 hours. Each API response displays a timestamp and the UNIX time of the most recent data update that was used. The data is collected from various central banks and commercial sources worldwide.

Each HTTPS GET request to the API is deducted from the quota allowed by the personal plan (in this case, the free format has been used). The API sends a warning email when 75% and then 100% of the available quota has been used (you can also view consumption details on the API website).

To gain access to the API, simply enter an email address on the website and follow the instructions, as shown below:

[<img src= "imagenes/API.png">](https://www.exchangerate-api.com)

## Conclusions

The application of knowledge is key to consolidating learning in all disciplines, especially in the case of programming. Developing this project has been an excellent opportunity to practice Java and backend development skills learned throughout the Alura Latam and ORACLE ONE program. Implementing API consumption, manipulating JSON data, and handling HTTP requests are fundamental skills in modern development, as well as using agile management tools (Trello) for project organization and tracking, making this challenge a great learning opportunity.

## Developer

|[<img src="https://avatars.githubusercontent.com/u/84999245?s=96&v=4"><br><sub> Nicole Lastra Quiroz </sub>](https://github.com/Nicole-lq)|
|---|
