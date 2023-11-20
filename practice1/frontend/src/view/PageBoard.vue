<template>
  <div id="app" class="container mt-5">
    <h1 class="mb-4">게시판</h1>
    <form @submit.prevent="addPost" class="mb-4">
      <div class="mb-3">
        <label for="title" class="form-label">제목:</label>
        <input type="text" id="title" v-model="post.boardTitle" class="form-control" required>
      </div>
      <div class="mb-3">
        <label for="content" class="form-label">내용:</label>
        <textarea id="content" v-model="post.boardContents" class="form-control" required></textarea>
      </div>
      <button type="submit" class="btn btn-primary">게시물 작성</button>
    </form> 
    <ul class="list-group">
      <li v-for="post in posts" :key="post.id" class="list-group-item">
        <strong>{{ post.boardTitle }}</strong>: {{ post.boardContents }}
      </li>
    </ul>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      posts: [],
      post: { boardTitle: '', boardContents: '' }
    };
  },
  mounted() {
    this.fetchPosts();
  },
  methods: {
    fetchPosts() {
      axios.get('http://localhost:8080/board/list')
        .then(response => {
          this.posts = response.data;
        })
        .catch(error => {
          console.error('Error fetching posts:', error);
        });
    },
    addPost() {
      axios.post('http://localhost:8080/board/posts', this.post)
        .then(() => {
          this.post = { boardTitle: '', boardContents: '' };
          this.fetchPosts();
        })
        .catch(error => {
          console.error('Error adding post:', error);
        });
    }
  }
};
</script>
