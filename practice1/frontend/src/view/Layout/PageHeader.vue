<!-- PageHeader.vue -->
<template>
    <header>

      <div id="nav">
        <router-link to="/">Home</router-link> |
        <router-link to="/about">About</router-link> |
        <router-link to="/board/list">게시판</router-link>
      </div>
    </header>
    <hr/>
  </template>
  
  <script>
  
  import axios from 'axios';
  export default {
    created() {
      // Axios를 사용하여 백엔드에서 데이터 가져오기
      axios.get('http://loaclhost:8080/board/saveForm')
        .then(response => {
          this.posts = response.data;
        })
        .catch(error => {
          console.error(error);
        });
    }
  }
  
  </script>
  
  <style scoped>
  
  </style>