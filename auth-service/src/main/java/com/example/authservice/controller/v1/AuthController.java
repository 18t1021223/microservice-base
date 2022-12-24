package com.example.authservice.controller.v1;

import com.example.authservice.controller.v1.request.SearchUserDto;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.api.response.v1.DataResponse;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * @author NhatPA
 * @since 12/06/2022 - 20:10
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    @PreAuthorize(value = "hasAnyAuthority('ADMIN', 'SUB_ADMIN')")
    @Operation(description = "- TopDev việc làm IT hàng đầu\n" +
            "  - Cộng sự đắc lực hỗ trợ doanh nghiệp tuyển dụng\n" +
            "  - Người bạn đồng hành giúp các Developer tìm được công việc mơ ước")
    @GetMapping
    public DataResponse<SearchUserDto> getUsers(@ParameterObject SearchUserDto request) {
        log.info("{}", request);
        return DataResponse.ok(request);
    }


    @PostMapping("/login")
    public DataResponse<String> login(@PathVariable String userId) {
        return DataResponse.ok();
    }
}
