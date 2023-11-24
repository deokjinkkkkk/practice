<template>
    <div id="app" class="container mt-5">
      <h1 class="mb-4">영화 추천</h1>
      <div class="row">
        <div v-for="movie in movies" :key="movie.id" class="col-md-4 mb-4">
          <div class="card">
            <img :src="'https://image.tmdb.org/t/p/w500/'+movie.poster_path" class="card-img-top" alt="Movie Poster">
            <div class="card-body">
              <h5 class="card-title">{{ movie.original_title }}</h5>
              <p class="card-text">{{ movie.overview }}</p>
              <a @click="showMovieDetails(movie.id)" class="btn btn-primary">자세히 보기</a>
            </div>
          </div>
        </div>
      </div>
      <div v-if="selectedMovie">
        <h2 class="mt-5">{{ selectedMovie.title }}</h2>
        <p>{{ selectedMovie.description }}</p>
        <!-- 추가적인 영화 정보 표시 -->
      </div>
    </div>
  </template>
  
  <script>
  import axios from 'axios';
  
  export default {
    data() {
      return {
        movies: [],
        selectedMovie: null
      };
    },
    methods: {
      async showMovieDetails(movieId) {
        try {
          // Axios를 사용하여 GET 요청 보내기
          const response = await axios.get(`http://localhost/movies/${movieId}`);
  
          // API 응답이 현재 데이터와 유사한 구조를 가진다고 가정합니다
          this.selectedMovie = response.data;
        } catch (error) {
          console.error('영화 세부 정보를 가져오는 중 오류 발생:', error);
        }
      },
      async loadMovies() {
        try {
          // Make a GET request to fetch the movie list
          const response = await axios.get('http://localhost/movies/list');
            console.log(response.data)
          // Assuming your API response has a similar structure as your current data
          this.movies = response.data;
        } catch (error) {
          console.error('Error fetching movie list:', error);
        }
      }
    },
    mounted() {
      // Load movies when the component is mounted
      this.loadMovies();
    }
  };
  </script>