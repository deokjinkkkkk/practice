package com.dj.model;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class MovieVO {
    private List<MovieItem> results;

    @Data
    @Getter
    @Setter
    public static class MovieItem {
        private int id;
        private String original_title;
        private String overview;
        private String poster_path;
        // 다른 필드들도 필요에 따라 추가

        // 생성자, 게터, 세터 등도 필요에 따라 추가
    }
}
