<template>
    <div>
        <h1>Home</h1>
        <p>{{message}}</p>
    </div>
</template>

<script>
    import testService from '../services/testService';
    export default {
        name: 'HomeView',
        data() {
            return {
                message: 'Default Message',
            };
        },
        created() {
            testService.getHello().then(response => {
                this.message = response.data;
            });
        },
    };
</script>

<style>
</style>