package com.example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/docker-action")
    public String handleAction(@RequestParam("action") String action) {
        switch (action) {
            case "1":
                // Выполните действие для парсинга TG даты
                return "Выполнено действие 1: Парсинг TG даты";
            case "2":
                // Выполните действие для подсчета количества отправленных сообщений каждым пользователем
                return "Выполнено действие 2: *колличетво отправленных сообщений каждым пользователем*";
            case "3":
                // Выполните действие для статистики
                return "Выполнено действие 3: Статистика";
            case "4":
                // Выполните действие для расчета средней длины сообщения
                return "Выполнено действие 4: Средняя длина сообщения";
            case "5":
                // Выполните действие для подсчета количества мусора
                return "Выполнено действие 5: Количество мусора";
            case "6":
                // Выполните действие для сброса данных
                return "Выполнено действие 6: Сброс данных";
            case "7":
                // Выполните действие для указания пути к json
                return "Выполнено действие 7: Путь к JSON";
            case "8":
                // Выполните действие для завершения работы приложения
                return "Выполнено действие 8: Выход";
            default:
                return "Неизвестное действие: " + action;
        }
    }
}
