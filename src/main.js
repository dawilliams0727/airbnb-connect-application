import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import { createRouter } from './router'

const router = createRouter();

const app = createApp(App);
app.use(router);
app.mount('#app');
