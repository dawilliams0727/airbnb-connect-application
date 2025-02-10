<template>
    <div @click="toggleHighlights" class="experience-card">
        <h2>{{ experience.title }}</h2>
        <h3>{{ experience.institution }} | {{ experience.begin }} - {{ experience.end }}</h3>
        <ul>
            <li v-for="(highlight, index) in experience.highlights" :key="index">{{ highlight }}</li>
        </ul>
    </div>
</template>

<script>
export default {
    name: 'ExperienceCard',
    props: {
        experience: {
            type: Object,
            required: true,
            default: () => ({
                title: '',
                description: '',
                begin: '',
                end: '',
                highlights: []
            })
        }
    },
    data() {
        return {
            showHighlights: false
        }
    },
    methods: {
        toggleHighlights() {
            this.showHighlights = !this.showHighlights;
        }
    }
}
</script>

<style scoped>
li {
    text-align: left;
}
.experience-card {
    border: 1px solid #ccc;
    padding: 16px;
    border-radius: 8px;
    cursor: pointer;
    transition: background-color 0.5s;
}
.show-more{
    background-color: #ff4d4d;
    color: white;
    padding: 8px 16px;
    border-radius: 4px;
    text-align: center;
    display: inline-block;
    font-size: 14px;
    font-weight: 500;
}
.experience-card:hover {
    background-color: #ff000048;
}
.fade-enter-active, .fade-leave-active {
    transition: opacity 0.5s;
}
.fade-enter, .fade-leave-to {
    opacity: 0;
}
</style>