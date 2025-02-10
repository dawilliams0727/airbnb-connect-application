<template>
    <div class="headshot">
        <img src="https://media.licdn.com/dms/image/v2/D4E03AQHNppFL_8XIFA/profile-displayphoto-shrink_800_800/profile-displayphoto-shrink_800_800/0/1718285486296?e=1744243200&v=beta&t=AFxKWkDECCRO7hEt31ytnSluPDPmaJ4li4bjXhShXds"
        alt="Profile Picture"/>
    </div>
</template>

<script>
export default {
    name: 'DavidsHeadshot'
}
</script>

<style scoped>
.headshot img {
    width: 300px;
    height: 300px;
    border-radius: 50%;
    object-fit: cover;
}
</style>