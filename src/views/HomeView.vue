<template>
    <div>
        
        <Headshot/>
        <h1 class="headline">{{ headline }}</h1>
         <p>{{message}}</p>
    
        
    </div>
   
</template>

<script>

    import Headshot from '../components/Headshot.vue';
    import SkillCard from '../components/SkillCard.vue';

    export default {
        name: 'HomeView',
        data() {
            return {
                headline: "David Williams",
                message: "Full-Stack Software Developer aiming to create a better world one line of code at a time. Lifelong learner that thrives when working collaboratively, solving complex problems, and embracing unique experiences. Eager to grow as a programmer and as a person in an encouraging, yet challenging, environment, where technology and community synergizes to create the adventure of a lifetime.",
                skills: [
                    {
                        title: "Java",
                        description: "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "Python",
                        description: "Python is an interpreted high-level general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant whitespace.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "JavaScript",
                        description: "JavaScript, often abbreviated as JS, is a high-level, often just-in-time compiled language that conforms to the ECMAScript specification.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "HTML",
                        description: "The HyperText Markup Language, or HTML is the standard markup language for documents designed to be displayed in a web browser.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "CSS",
                        description: "Cascading Style Sheets is a style sheet language used for describing the presentation of a document written in a markup language such as HTML.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "PostgreSQL",
                        description: "PostgreSQL is a powerful, open-source object-relational database system with a strong reputation for reliability, feature robustness, and performance.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "Spring Framework",
                        description: "The Spring Framework is an application framework and inversion of control container for the Java platform.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "TensorFlow",
                        description: "TensorFlow is a free and open-source software library for machine learning and artificial intelligence.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "Vue.js",
                        description: "Vue.js is an open-source model–view–viewmodel front end JavaScript framework for building user interfaces and single-page applications.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "Node.js",
                        description: "Node.js is an open-source, cross-platform, back-end JavaScript runtime environment that runs on the V8 engine and executes JavaScript code outside a web browser.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "Docker",
                        description: "Docker is a set of platform as a service products that use OS-level virtualization to deliver software in packages called containers.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "Kubernetes",
                        description: "Kubernetes is an open-source container-orchestration system for automating computer application deployment, scaling, and management.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "RESTful API",
                        description: "A RESTful API is an application programming interface that conforms to the constraints of REST architectural style and allows for interaction with RESTful web services.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "Git",
                        description: "Git is a distributed version-control system for tracking changes in source code during software development.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "GitHub",
                        description: "GitHub is a provider of Internet hosting for software development and version control using Git.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "Scrum",
                        description: "Scrum is an agile process framework for managing complex knowledge work, with an initial emphasis on software development.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "DevOps",
                        description: "DevOps is a set of practices that combines software development and IT operations to shorten the development lifecycle and provide continuous delivery with high software quality.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "CI/CD",
                        description: "CI/CD is a method to frequently deliver apps to customers by introducing automation into the stages of app development.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "Machine Learning",
                        description: "Machine learning is a branch of artificial intelligence focused on building applications that learn from data and improve their accuracy over time without being programmed to do so.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "Artificial Intelligence",
                        description: "Artificial intelligence is intelligence demonstrated by machines, in contrast to the natural intelligence displayed by humans and animals.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "Object-Oriented Programming",
                        description: "Object-oriented programming is a programming paradigm based on the concept of 'objects', which can contain data and code to manipulate the data.",
                        image: "./src/assets/vue.svg"
                    },
                    {
                        title: "Swift",
                        description: "Swift is a powerful and intuitive programming language for macOS, iOS, watchOS, and tvOS.",
                        image: "./src/assets/vue.svg"
                    }
                ]
            };
        },
        components: {
            Headshot, SkillCard
        }
    };
</script>

<style scoped>
</style>