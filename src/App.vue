<script>
</script>

<template>
  <div id="nav">
    <nav>
      <ul>
        <li>
          <router-link to="/">Home</router-link>
        </li>
        <li>
          <router-link to="/about-me">About Me</router-link>
        </li>
        <li>
          <router-link to="/projects">Projects</router-link>
        </li>
        <li>
          <router-link to="/essays">Essays</router-link>
        </li>
      </ul>
    </nav>
  </div>
  <div id="app">
    <router-view />
  </div>
</template>

<style scoped>
#nav {
  display: flex;
  background-color: #ffffff;
  color: rgb(149, 76, 76);
  padding: 0.5em;
}
</style>
