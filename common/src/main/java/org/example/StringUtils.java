package org.example;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author NhatPA
 * @since 23/12/2022 - 15:44
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class StringUtils {

    public static boolean isNotBlank(String text) {
        return !org.apache.commons.lang3.StringUtils.isBlank(text);
    }
}
