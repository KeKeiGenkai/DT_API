package com.example.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequestExample {

    public static void main(String[] args) throws IOException {
        int actionNumber = 1; // Номер действия, который нужно выполнить

        // URL, куда отправляется запрос
        String url = "http://localhost:8080/docker-action?actionNumber=" + actionNumber;

        // Создание объекта URL из строки
        URL obj = new URL(url);
        // Открытие соединения
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // Установка метода запроса GET
        con.setRequestMethod("GET");

        // Чтение ответа
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // Вывод ответа
        System.out.println("Ответ от сервера:");
        System.out.println(response.toString());
    }
}
