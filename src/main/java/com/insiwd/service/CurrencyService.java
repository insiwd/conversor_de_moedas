package com.insiwd.service;

import com.google.gson.Gson;
import com.insiwd.CurrencyDto.CurrencyDto;
import io.github.cdimascio.dotenv.Dotenv;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyService {

    CurrencyDto currencyDto = null;
    Dotenv dotenv = Dotenv.load();
    String apiKey = dotenv.get("API_KEY");
    public CurrencyDto getCurrency(String base_code) throws IOException, InterruptedException {


        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/"+ apiKey + "/latest/" + base_code))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                Gson mapper = new Gson();
                currencyDto = mapper.fromJson(response.body(), CurrencyDto.class);
            }
            else {
                System.out.println("Erro: " + response.statusCode());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return currencyDto;
    }
}
