package com.example.notificationservice.controller.v2;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.api.response.v1.DataResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NhatPA
 * @since 24/12/2022 - 21:25
 */
@Slf4j
@RestController
@RequestMapping("/api/v2/notis")
@RequiredArgsConstructor
public class NotiControllerV2 {
    @PostMapping("/{id}")
    public DataResponse<String> get(@PathVariable String id) {
        return DataResponse.ok();
    }
}
