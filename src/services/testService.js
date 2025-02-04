import axios from "axios";

const http = axios.create({
    baseURL: import.meta.env.VITE_REMOTE_API_URL});

export default {
    getHello(){
        return http.get("/hello");
    },
    getProjects(){
        return http.get("/projects");
    },
    getAboutMe(){
        return http.get("/about-me");
    }
}