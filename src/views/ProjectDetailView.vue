<template>
    <div class="project-detail">
        <h1>{{ project.name }}</h1>
        <div class="slideshow">
            <img v-for="image in project.images" :key="image" :src="image" alt="Project Image" />
        </div>
        <div class="highlights">
            <h2>Highlights</h2>
            <ul>
                <li v-for="highlight in project.highlights" :key="highlight">{{ highlight }}</li>
            </ul>
        </div>
        <div class="skills">
            <h2>Skills Used</h2>
            <div class="skill-card" v-for="skill in project.skills" :key="skill.name">
                <h3>{{ skill.name }}</h3>
                <p>{{ skill.description }}</p>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: 'ProjectDetailView',
    props: {
        project: {
            type: Object,
            required: true
        }
    }
}
</script>

<style scoped>
.project-detail {
    padding: 20px;
}

.slideshow img {
    max-width: 100%;
    margin-bottom: 10px;
}

.highlights ul {
    list-style-type: disc;
    padding-left: 20px;
}

.skills {
    display: flex;
    flex-wrap: wrap;
}

.skill-card {
    border: 1px solid #ccc;
    padding: 10px;
    margin: 10px;
    flex: 1 1 calc(33.333% - 20px);
    box-sizing: border-box;
}
</style>