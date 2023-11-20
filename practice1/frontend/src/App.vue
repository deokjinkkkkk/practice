e3<template>
  <PageHeader/>
  <router-view/>
  <PageFooter/>
  
</template>

<script>

import PageHeader from './view/Layout/PageHeader.vue'
import PageFooter from './view/Layout/PageFooter.vue'

export default {
  name: 'App',
  components: {
    PageFooter,
    PageHeader
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
