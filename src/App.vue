<template>
  <body>
  <div id="app">
    <header>
      <nav>
        <router-link to="/"> Summary </router-link>
        <router-link to="/skills"> Skills and Interests </router-link>
        <router-link to="/education-experience"> Education and Experience</router-link>
        <router-link to="/projects"> Projects </router-link>
        <router-link to="/essays"> Essays </router-link>
      </nav>
    </header>
    <router-view v-slot = "{ Component }">
      <transition name="fade" mode="out-in">
        <component :is="Component">
        </component>
      </transition>
    </router-view>
  </div>
  </body>
</template>

<script>
</script>

<style>
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
  }
  nav {
    position: fixed;
    display: flex;
    justify-content: space-between;
    top: 0;
    left: 50%;
    transform: translateX(-50%);
    align-items: center;
    z-index: 1000;
    width: 95%;
    padding: 10px 20px;
    box-sizing: border-box;
    
  }

   a {
    color: white;
    text-decoration: none;
    padding: 10px;
  }

   a:hover {
    color: red;
  }

  nav a.router-link-exact-active {
    background-color: red;
    color: white;
  }
  .fade-enter-from{
    opacity: 0;
    transform: translateX(-100px);
  }
  .fade-leave-to{
    opacity: 0;
    transform: translateX(100px);
  }
  .fade-enter-active,
  .fade-leave-active {
    transition: all .5s;
  }
  .slide-enter-from{
        opacity: 0;
        transform: translateY(30px);
    }
    .slide-enter-active, .slide-leave-active {
        transition: transform .5s ease;
    }

</style>
