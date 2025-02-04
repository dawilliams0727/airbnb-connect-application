<script>
</script>

<template>
  <header>
    <div id="nav">
      <nav>
        <router-link to="/"> Home |</router-link>
        <router-link to="/about-me"> About Me |</router-link>
        <router-link to="/projects"> Projects |</router-link>
        <router-link to="/essays"> Essays </router-link>
      </nav>
    </div>
  </header>

  <div id="app">
    <router-view v-slot = "{ Component }">
      <transition name="fade" mode="out-in">
        <component :is="Component">

        </component>
      </transition>
    </router-view>
  </div>
</template>

<style scoped>
  #nav {
    position: absolute;
    top: 0;
    max-width: 100%;
    margin: 0 auto;
    z-index: 1000;
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
    transition: all 0.3s ease;
  }
</style>
