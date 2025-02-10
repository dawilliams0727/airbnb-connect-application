import {createRouter as _createRouter, createWebHistory} from 'vue-router'
import Home from '../views/HomeView.vue'
import Projects from '../views/ProjectsView.vue'
import Essays from '../views/EssaysView.vue'
import Resume from '../views/ResumeView.vue'
import ExperienceView from '../views/ExperienceView.vue'
import Skills from '../views/SkillsView.vue'


const routes = [
    {path: '/', component: Home},
    {path: '/skills', component: Skills},
    {path: '/projects', component: Projects},
    {path: '/essays', component: Essays},
    {path: '/resume', component: Resume},
    {path: '/education-experience', component: ExperienceView},
];

export function createRouter(){
    return _createRouter({
        history: createWebHistory(),
        routes
    });
};