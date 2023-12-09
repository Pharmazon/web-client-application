package ru.sbt.synapse;

import jakarta.servlet.http.HttpServletRequest;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Enumeration;

@Slf4j
@RestController
@RequestMapping("log")
public class LogController {

    @GetMapping
    public String get(HttpServletRequest request) {
        log.info("Получен GET запрос");
        logHeaders(request);

        return "SUCCESS";
    }

    @PostMapping
    public String post(HttpServletRequest request, @RequestBody @NonNull String payload) {
        log.info("Получен POST запрос");
        log(request, payload);

        return "SUCCESS";
    }

    @PutMapping
    public String put(HttpServletRequest request, @RequestBody @NonNull String payload) {
        log.info("Получен PUT запрос");
        log(request, payload);

        return "SUCCESS";
    }

    @PatchMapping
    public String patch(HttpServletRequest request, @RequestBody @NonNull String payload) {
        log.info("Получен PATCH запрос");
        log(request, payload);

        return "SUCCESS";
    }

    private void log(HttpServletRequest request, @NonNull String payload) {
        log.info("ТЕЛО ЗАПРОСА: {}", payload);
        logHeaders(request);
    }

    private void logHeaders(HttpServletRequest request) {
        log.info("ЗАГОЛОВКИ ЗАПРОСА:");

        final Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            final String headerName = headerNames.nextElement();
            final String headerValue = request.getHeader(headerName);
            log.info("{}: {}", headerName, headerValue);
        }

        log.info("-------------------------------------------------------");
    }
}