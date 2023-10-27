<!-- PageFooter.vue -->
<template>
    <hr/>
    <footer>
      여기는 footer 자리입니다.
    </footer>
  </template>
  
  <script>
  import axios from 'axios';
  export default {
    created() {
      // Axios를 사용하여 백엔드에서 데이터 가져오기
      axios.get('http://loaclhost:8080/board/save')
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