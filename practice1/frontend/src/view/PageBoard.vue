<template>
    <div>
      <h1>게시판</h1>
      <ul>
        <li v-for="post in posts" :key="post.id">{{ post.boardTitle }}</li>
      </ul>
    </div>
  </template>
  
  <script>
  import axios from 'axios';
  
  export default {
    data() {
      return {
        posts: []
      };
    },
    created() {
      // Axios를 사용하여 백엔드에서 데이터 가져오기
      axios.get('http://localhost:8080/board/list')
        .then(response => {
          this.posts = response.data;
        })
        .catch(error => {
          console.error(error);
        });
    }
  };
  </script>