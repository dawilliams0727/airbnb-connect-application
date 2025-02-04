<template>
    <div>
        <h1>Projects</h1>
        <div class="test">
        <TransitionGroup name="slide" tag="div">
            <div v-for="(project) in projects" 
            :key="project.name" 
            style="list-style-type: none;">
                <project-card :project="project"></project-card>
            </div>
        </TransitionGroup>
        </div>
    </div>
</template>

<script>
import testService from '../services/testService';
import ProjectCard from '../components/ProjectCard.vue';
export default {
    components: {
        ProjectCard
    },
    name: 'ProjectsView',
    data() {
        return {
            projects: []
        };
    },
    created() {
        // Fetch projects from the server
        testService.getProjects().then(response => {
            this.projects = response.data;
        });
    }
};
</script>

<style>
    .test{
        display: grid;
        grid-template-columns: repeat(auto-fill, minmax(300px, 1fr));
        grid-gap: 20px;
        
    }
    .slide-enter-from{
        opacity: 0;
        transform: translateY(30px);
    }
    .slide-enter-active, .slide-leave-active {
        transition: transform 0.5s ease;
    }
</style>