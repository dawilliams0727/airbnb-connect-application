<template>
    <div class="essay-prompt" @click="showParagraph = !showParagraph">
        <h2 >{{essay.prompt}}</h2>
        <Transition name="expand" mode="in-out">
            <p v-if="showParagraph">{{ essay.response }}</p>
        </Transition>
    </div>
</template>
<script>  
export default {
    name: 'EssayPrompt',
    props: ["data"],
    data() {
        return {
            essay: {
                id: 0,
                prompt: "This is a sample prompt",
                response: "This is a sample response"
            },
            showParagraph: false
        };
    },
    created() {
        this.essay.id = this.data.id;
        this.essay.prompt = this.data.prompt;
        this.essay.response = this.data.response;
    }
};
</script>

<style scoped>
    h2 {
        text-align: center;
        width: 95%;

    }
    p {
        text-align: left;
        width: 95%;
        margin: 20px;
    
    }
    .essay-prompt {
        margin: 10px;
        padding: 10px;
        border: 1px solid black;
        border-radius: 5px;
        width: 100%
    }
    .expand-enter-from,
    .expand-leave-to {
        transform: translateY(-20px);
        opacity: 0;
    }
    .expand-enter-active,
    .expand-leave-active{
        transition: all 1.0s;
    }
</style>