import {createRouter as _createRouter, createWebHistory} from 'vue-router'
import Home from '../views/HomeView.vue'
import AboutMe from '../views/AboutMeView.vue'
import Projects from '../views/ProjectsView.vue'
import Essays from '../views/EssaysView.vue'
import Resume from '../views/ResumeView.vue'

const routes = [
    {path: '/', component: Home},
    {path: '/about-me', component: AboutMe},
    {path: '/projects', component: Projects},
    {path: '/essays', component: Essays},
    {path: '/resume', component: Resume}
];

export function createRouter(){
    return _createRouter({
        history: createWebHistory(),
        routes
    });
};