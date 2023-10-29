import { createRouter, createWebHistory } from 'vue-router'
import PageHome from '@/view/PageHome.vue'
import PageBoard from '@/view/PageBoard.vue'

const routes = [
  {
    path: '/',
    name: 'PageHome',
    component: PageHome
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../view/PageAbout.vue')
  },
  {
    path: '/board/list',
    name: 'Board',
    component: PageBoard
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router