<template>
    <div id="app" class="container mt-5">
      <div class="row justify-content-center">
        <div class="col-md-8">
          <div class="card">
            <div class="card-header bg-success text-white text-center">
              <h2>게시물 작성</h2>
            </div>
            <div class="card-body">
              <form @submit.prevent="addPost">
                <div class="mb-3">
                  <label for="title" class="form-label">제목:</label>
                  <input type="text" id="title" v-model="post.boardTitle" class="form-control" required>
                </div>
                <div class="mb-3">
                  <label for="content" class="form-label">내용:</label>
                  <textarea id="content" v-model="post.boardContents" class="form-control" required></textarea>
                </div>
                <button type="submit" class="btn btn-primary" >작성 완료</button>
              </form>
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
      post: { boardTitle: '', boardContents: '' }
    };
  },
  methods: {
    addPost() {
      axios.post('http://localhost/board/posts', this.post)
        .then(() => {
          this.post = { boardTitle: '', boardContents: '' };
          this.$router.push({name : 'Board'})
        })
        .catch(error => {
          console.error('Error adding post:', error);
        });
    }
  }
};
</script>