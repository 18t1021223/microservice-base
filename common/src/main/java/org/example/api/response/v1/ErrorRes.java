package org.example.api.response.v1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorRes {
    private int code;
    private String message;

    public static ErrorRes bad(String message) {
        return new ErrorRes(DataResponse.HTTP_STATUS_BAD, message);
    }
}