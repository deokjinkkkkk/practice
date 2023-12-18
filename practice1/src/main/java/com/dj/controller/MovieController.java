package com.dj.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.dj.model.MovieVO;
import com.dj.model.MovieVO.MovieItem;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final String apiKey = "7bbfae676cd04a8047092dc78245883a";
    private final String apiUrl = "https://api.themoviedb.org/3/discover/movie";

    private final RestTemplate restTemplate;

    public MovieController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/list")
    public ResponseEntity<List<MovieItem>> getMovies() {
        try {
            // 외부 API에 GET 요청을 보내고 응답을 단일 MovieVO로 받음
        	MovieVO movie = restTemplate.getForObject(buildUrl(), MovieVO.class);
        	List<MovieVO.MovieItem> movies = movie.getResults();

            // 단일 MovieVO를 List로 변환

            // MovieVO 리스트 반환
            return ResponseEntity.ok(movies);
        } catch (Exception e) {
            // 에러를 로깅
            e.printStackTrace();

            // 적절한 상태 코드와 함께 에러 응답 반환
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<MovieItem> getMovieById(@PathVariable int id) {
        try {
            // 외부 API에 GET 요청을 보내고 응답을 단일 MovieVO로 받음
            MovieVO movie = restTemplate.getForObject(buildUrl(), MovieVO.class);
            List<MovieVO.MovieItem> movies = movie.getResults();

            // 특정 ID와 일치하는 영화 찾기
            Optional<MovieVO.MovieItem> selectedMovie = movies.stream()
                    .filter(m -> m.getId() == id)
                    .findFirst();

            // 일치하는 영화가 있다면 해당 영화를 반환
            return selectedMovie.map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
        } catch (Exception e) {
            // 에러를 로깅
            e.printStackTrace();

            // 적절한 상태 코드와 함께 에러 응답 반환
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
    
    private String buildUrl() {
        return UriComponentsBuilder.fromUriString(apiUrl)
                .queryParam("api_key", apiKey)
                .toUriString();
    }
}
