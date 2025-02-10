<template>
    <div class="skill-card" @mouseover="hover = true" @mouseout="hover = false">
        <img :src="image" :alt="title"/>
        <h4>{{ title }}</h4>
    </div>
</template>

<script>

export default {
    name: 'SkillCard',
    props: ["skill"],
    data() {
        return {
            title: "",
            description: "",
            image: "",
            hover: false
        };
    },
    created() {
        this.title = this.skill.title;
        this.description = this.skill.description;
        this.image = this.skill.image;
    }
}
</script>

<style scoped>


img {
    width: 90%;
    height: auto;
    max-height: 90%;
    object-fit: contain;
}
.skill-title{
    background-color: rgba(0, 0, 0, 0.3);
    color: white;
    text-align: left;

}
.skill-card {
    display: inline-block;
    width: 100px;   
    height: 150px;
    border-radius: 8px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    margin: 20px;
    padding: 10px;

}
.slide-enter-from,.slide-leave-to {
    transform: translateY(-20px);
    opacity: 0;
}
.slide-enter-active,.slide-leave-active{
    transition: all 0.5s;
}
</style>