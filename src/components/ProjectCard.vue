<template>
    <div class="project-card">
        <!-- Replace with Component that Cycles through Photos
            First: Logo of the Project
            Seconds: Challenges Faced
            Third: Technologies Used 
        -->
        <img :src="project.image" :alt="project.name" class="project-image" />
        <div>        
            <h3>{{ project.name }}</h3>
            <h5>{{ project.description }}</h5>
            <a :href="project.repoUrl" target="_blank">SOURCE CODE</a>
        </div>
    </div>
</template>

<script>
export default {
    name: 'ProjectCard',
    props: ['project'],
    data() {
        return {
            name: "Project Card"
        };
    }
};
</script>

<style scoped>
    h3, h5, a {
        overflow: hidden;
        text-overflow: ellipsis;
        white-space: normal;
        text-align: center;
    }
    .project-image {
        background-color: rgb(255, 255, 255);
        height: 200px;
        max-width: 200px;
        margin: auto;
        padding: 0px;
    }
    .project-card {
        margin: 20px;
        max-width: 200px;

    }
</style>