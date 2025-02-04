<template>
    <div class="project-card">
        <!-- Replace with Component that Cycles through Photos
            First: Logo of the Project
            Seconds: Challenges Faced
            Third: Technologies Used 
        -->
        <img src="/src/assets/vue.svg" alt="Vite Logo" class="project-image" />
        <h3>{{ project.name }}</h3>
        <h5>{{ project.description }}</h5>
        <h6> Technologies used: Java, Swift, Postgres, SQL</h6>
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
.project-card {
    padding: 20px;
    text-align: left;

}
.project-image {
    background-color: aliceblue;
    width: 100%;
    margin: 0 auto;
    display: block;
}
</style>