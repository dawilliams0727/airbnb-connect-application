<template>
    <div>
        <h1 class="headline">Projects</h1>
        <TransitionGroup name="slide">
            <project-card v-for="(project) in projects" 
            :key="project.name" 
            style="list-style-type: none;" 
            :project="project"
            class="project"/>
        </TransitionGroup>
    </div>
</template>

<script>

import ProjectCard from '../components/ProjectCard.vue';
export default {
    components: {
        ProjectCard
    },
    name: 'ProjectsView',
    data() {
        return {
            projects: [
                {
                    name: "DevOps Final Capstone",
                    description: "",
                    repoUrl: "https://www.github.com/dawilliams0727/devops-capstone-project",
                    skills: [
                        "python", "javascript","html", "css", "postgresql", "nodejs",
                        "docker", "kubernetes", "restful api", "git", "gihub", "scrum", "devops", "ci-cd",
                        "object-oriented-programming"
                    ],
                    highlights:[
                        "Executed a plan to create a RESTful API using test driven development practices—minimizing impertinent code written.",
                        "Coordinated development tasks using Scrum through a GitHub Project to serve as a proxy for working on a team, retaining focus on efficient development and solidifying collaborative workflow practices through distributed version control systems.",
                        "Integrated code changes and automated OpenShift cluster deployment through CI/CD pipelines created with GitHub Actions and Tekton pipelines, enhancing code quality, reducing feature lead time, and minimizing human error. ",
                    ],
                    image: "https://upload.wikimedia.org/wikipedia/commons/0/05/Devops-toolchain.svg"
                },
                {
                    name: "Pizza Ordering System",
                    description: "",
                    repoUrl: "https://www.github.com/dawilliams0727/Portfolio/tree/main/Pizza%20Ordering%20Application",
                    skills: [
                        "java", "javascript", "html", "css", "postgresql", "spring-framework", "vuejs",
                        "restful-api", "git", "scrum", "object-oriented-programming"
                    ],
                    highlights:[
                        "Developed backend services using Java and Spring Boot, leveraging a PostgreSQL database for user accounts, orders, and menu",
                        "Integrated an external API to validate addresses, ensuring accurate delivery information and reducing order fulfillment errors.",
                        "Implemented admin functionality for restaurant staff to modify orders, manage inventory, and access historical sales data, streamlining order processing and business operations.",
                        "Worked in a team of four, applying scrum development practices through Trello, improving collaboration and task management."
                    ],
                    image: "/src/assets/super-pizza.png"
                },
                {
                    name: "Tenmo Peer-to-Peer Payment Application",
                    description: "",
                    repoUrl: "https://www.github.com/dawilliams0727/Portfolio/tree/main/Tenmo%20P2P%20Payment%20Application",
                    skills: [
                        "java", "postgresql", "spring-framework", "restful-api", "git", "object-oriented-programming"
                    ],
                    highlights:[
                        "Designed a mock payment platform that allows users to register, view balances, and send/receive money using a CLI. Used Spring Boot to manage transactions securely. Ensured robust data integrity with a PostgreSQL database.",
                        "Reinforced programming partners understanding of course materials by providing debugging guidance and guided problem-solving approaches, improving team effectiveness and solidifying self-understanding.",
                    ],
                    image: "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse3.mm.bing.net%2Fth%3Fid%3DOIP.xQTRC-KpoYh0E-I2B_Q4LgHaGn%26pid%3DApi&f=1&ipt=759dbc7efb86d71b84c377af54d7f39da69bd8fe6bc360c67fc035532eadac65&ipo=images"
                },
                {
                    name: "LED Lighting Accessories",
                    description: "",
                    repoUrl: "https://www.github.com/dawilliams0727/Portfolio/tree/main/LED%20Ravewear",
                    skills: [
                        "python", "object-oriented-programming"
                    ],
                    highlights:[
                        "Engineered and prototyped app-controlled LED Halo using CircuitPython. Formed basis of understanding of software development principles such as object-oriented programming and event-driven architecture.",
                        "Acquired skills in software programming, parametric modeling, 3d printing, and electrical engineering to execute the vision. Inspired transition to software development as a career path.",
                    ],
                    image: "/src/assets/halo.png"
                }

            ]
        };
    },

};
</script>

<style scoped>
    h1 {
        text-align: center;
        width: 100%;
    }
    .project {
        display: inline-block;
        margin: 10px;
        padding: 10px;
        border: 1px solid #ddd;
        border-radius: 20px;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        transition: transform 0.2s, box-shadow 0.2s;
        }
        .project:hover {
        transform: translateY(-10px);
        box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
    }

</style>