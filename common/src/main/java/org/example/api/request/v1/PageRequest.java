package org.example.api.request.v1;

import lombok.Data;

/**
 * @author NhatPA
 * @since 24/12/2022 - 16:53
 */
@Data
public class PageRequest {
    private Integer page;

    private Integer limit;

    /**
     * ex: sort=created_at-desc&sort=name
     */
    private String[] sort;
}
