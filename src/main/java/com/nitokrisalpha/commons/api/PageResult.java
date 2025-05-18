package com.nitokrisalpha.commons.api;

import java.util.Collection;
import lombok.Data;

@Data
public class PageResult<T> {

    private Collection<T> data;

    private Pagination pagination;

    @Data
    public static class Pagination {

        private Integer total;

        private Integer pageSize;

        private Integer currentPage;

        private Integer totalPages;

        private boolean hasNext;

        private boolean hasPrev;

    }

}
