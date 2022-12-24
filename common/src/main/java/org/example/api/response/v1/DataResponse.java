package org.example.api.response.v1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author NhatPA
 * @since 23/03/2022 - 08:14
 */
@Getter
@Setter
@AllArgsConstructor
public class DataResponse<T> {
    public static final int HTTP_STATUS_OK = 200;
    public static final int HTTP_STATUS_BAD = 400;

    private int code;

    private T data;

    public static <T> DataResponse<T> build(int status, T data) {
        return new DataResponse<>(status, data);
    }

    public static <T> DataResponse<T> ok() {
        return build(HTTP_STATUS_OK, null);
    }

    public static <T> DataResponse<T> ok(T data) {
        return build(HTTP_STATUS_OK, data);
    }

    public static <T> DataResponse<T> bad(T data) {
        return build(HTTP_STATUS_BAD, data);
    }
}
