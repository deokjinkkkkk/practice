
<template>
  <div id="app" class="container mt-5">
    <div class="row">
      <div class="col-md-12">
        <div class="card">
          <div class="card-header bg-primary text-white">
            <h2 class="mb-0">게시물 목록</h2>
          </div>
          <ul class="list-group list-group-flush">
            <li v-for="post in posts" :key="post.id" class="list-group-item">
              <strong>{{ post.boardTitle }}</strong>
            </li>
          </ul>
          <div class="card-footer text-center">
            <router-link to="/board/create" class="btn btn-success">게시물 작성하기</router-link>
          </div>
        </div>
      </div>
    </div>
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
      axios.get('http://localhost/board/list')
        .then(response => {
          this.posts = response.data;
        })
        .catch(error => {
          console.error('Error fetching posts:', error);
        });
    },
    addPost() {
      axios.post('http://localhost/board/posts', this.post)
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
