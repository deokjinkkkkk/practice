
<template>
    

<div id="app" class="container mt-5">
    <h1 class="mb-4">영화 추천</h1>
    
    <div class="row">
        <div v-for="movie in movies" :key="movie.id" class="col-md-4 mb-4">
            <div class="card">
                <img :src="movie.poster" class="card-img-top" alt="Movie Poster">
                <div class="card-body">
                    <h5 class="card-title">{{ movie.title }}</h5>
                    <p class="card-text">{{ movie.description }}</p>
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
<script src="https://cdn.jsdelivr.net/npm/vue@2"></script>

<script>
new Vue({
    el: '#app',
    data: {
        movies: [
            {
                id: 1,
                title: '인셉션',
                description: '꿈 속의 꿈 속의 여정을 다루는 사이킷 액션 영화',
                poster: 'https://example.com/poster1.jpg'
            },
            {
                id: 2,
                title: '인터스텔라',
                description: '우주 여행을 다루는 과학적 SF 영화',
                poster: 'https://example.com/poster2.jpg'
            },
            // 다른 영화들 추가
        ],
        selectedMovie: null
    },
    methods: {
        showMovieDetails(movieId) {
            // 선택한 영화의 상세 정보 표시 로직
            this.selectedMovie = this.movies.find(movie => movie.id === movieId);
        }
    }
});
</script>

</body>
</html>
