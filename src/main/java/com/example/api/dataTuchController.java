package com.example.api;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@RestController
public class dataTuchController {

    @GetMapping("/dataTuch-action")
    public String performDockerAction(int actionNumber) {
        // Определяем URL вашего консольного приложения
        String apiUrl = "http://localhost:8080/datatuch-action?action=" + actionNumber;

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(apiUrl);

            // Выполняем запрос к вашему консольному приложению
            HttpResponse response = httpClient.execute(request);

            // Считываем ответ и возвращаем его
            BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            StringBuilder result = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error performing Docker action";
        }
    }
}
