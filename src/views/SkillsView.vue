<template>
    <div class="skills">
        <span>
            <h1>Skills</h1>
            <div class="skill-cards">
                <SkillCard v-for="skill in skills" :key="skill.title" :skill="skill"/>
            </div>
        </span>
    </div>
</template>

<script>
import SkillCard from '../components/SkillCard.vue';

export default {
    name: 'SkillsView',
    data() {
        return {
            skills: [
                    {
                        title: "Java",
                        description: "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.",
                        image: "https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg"
                    },
                    {
                        title: "Python",
                        description: "Python is an interpreted high-level general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant whitespace.",
                        image: "https://upload.wikimedia.org/wikipedia/commons/c/c3/Python-logo-notext.svg"
                    },
                    {
                        title: "JavaScript",
                        description: "JavaScript, often abbreviated as JS, is a high-level, often just-in-time compiled language that conforms to the ECMAScript specification.",
                        image: "https://upload.wikimedia.org/wikipedia/commons/6/6a/JavaScript-logo.png"
                    },
                    {
                        title: "HTML",
                        description: "The HyperText Markup Language, or HTML is the standard markup language for documents designed to be displayed in a web browser.",
                        image: "https://upload.wikimedia.org/wikipedia/commons/6/61/HTML5_logo_and_wordmark.svg"
                    },
                    {
                        title: "CSS",
                        description: "Cascading Style Sheets is a style sheet language used for describing the presentation of a document written in a markup language such as HTML.",
                        image: "https://upload.wikimedia.org/wikipedia/commons/d/d5/CSS3_logo_and_wordmark.svg"
                    },
                    {
                        title: "PostgreSQL",
                        description: "PostgreSQL is a powerful, open-source object-relational database system with a strong reputation for reliability, feature robustness, and performance.",
                        image: "https://upload.wikimedia.org/wikipedia/commons/2/29/Postgresql_elephant.svg"
                    },
                    {
                        title: "Spring Framework",
                        description: "The Spring Framework is an application framework and inversion of control container for the Java platform.",
                        image: "https://upload.wikimedia.org/wikipedia/commons/4/44/Spring_Framework_Logo_2018.svg"
                    },
                    {
                        title: "TensorFlow",
                        description: "TensorFlow is a free and open-source software library for machine learning and artificial intelligence.",
                        image: "https://upload.wikimedia.org/wikipedia/commons/2/2d/Tensorflow_logo.svg"
                    },
                    {
                        title: "Vue.js",
                        description: "Vue.js is an open-source model–view–viewmodel front end JavaScript framework for building user interfaces and single-page applications.",
                        image: "https://upload.wikimedia.org/wikipedia/commons/9/95/Vue.js_Logo_2.svg"
                    },
                    {
                        title: "Node.js",
                        description: "Node.js is an open-source, cross-platform, back-end JavaScript runtime environment that runs on the V8 engine and executes JavaScript code outside a web browser.",
                        image: "https://upload.wikimedia.org/wikipedia/commons/d/d9/Node.js_logo.svg"
                    },
                    {
                        title: "Docker",
                        description: "Docker is a set of platform as a service products that use OS-level virtualization to deliver software in packages called containers.",
                        image: "https://pbs.twimg.com/profile_images/1816856437567406080/ByISu1ft_400x400.jpg"
                    },
                        {
                        title: "Kubernetes",
                        description: "Kubernetes is an open-source container-orchestration system for automating computer application deployment, scaling, and management.",
                        image: "https://upload.wikimedia.org/wikipedia/commons/3/39/Kubernetes_logo_without_workmark.svg"
                    },
                    {
                        title: "RESTful API",
                        description: "A RESTful API is an application programming interface that conforms to the constraints of REST architectural style and allows for interaction with RESTful web services.",
                        image: "https://uxwing.com/wp-content/themes/uxwing/download/web-app-development/rest-api-icon.png"
                    },
                    {
                        title: "Git",
                        description: "Git is a distributed version-control system for tracking changes in source code during software development.",
                        image: "https://upload.wikimedia.org/wikipedia/commons/e/e0/Git-logo.svg"
                    },
                    {
                        title: "GitHub",
                        description: "GitHub is a provider of Internet hosting for software development and version control using Git.",
                        image: "https://upload.wikimedia.org/wikipedia/commons/9/91/Octicons-mark-github.svg"
                    },
                    {
                        title: "Scrum",
                        description: "Scrum is an agile process framework for managing complex knowledge work, with an initial emphasis on software development.",
                        image: "https://upload.wikimedia.org/wikipedia/commons/5/58/Scrum_process.svg"
                    },
                    {
                        title: "DevOps",
                        description: "DevOps is a set of practices that combines software development and IT operations to shorten the development lifecycle and provide continuous delivery with high software quality.",
                        image: "https://upload.wikimedia.org/wikipedia/commons/0/05/Devops-toolchain.svg"
                    },
                    {
                        title: "CI/CD",
                        description: "CI/CD is a method to frequently deliver apps to customers by introducing automation into the stages of app development.",
                        image: "https://mlops-guide.github.io/MLOps/CICDML/ci-cd.png"
                    },
                    {
                        title: "Machine Learning",
                        description: "Machine learning is a branch of artificial intelligence focused on building applications that learn from data and improve their accuracy over time without being programmed to do so.",
                        image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYL1njQ3RsvzEO8LYJaGTtjCMheWk0jAbTzg&s"
                    },
                    {
                        title: "Artificial Intelligence",
                        description: "Artificial intelligence is intelligence demonstrated by machines, in contrast to the natural intelligence displayed by humans and animals.",
                        image: "https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Dall-e_3_%28jan_%2724%29_artificial_intelligence_icon.png/640px-Dall-e_3_%28jan_%2724%29_artificial_intelligence_icon.png"
                    },
                    {
                        title: "Object-Oriented Programming",
                        description: "Object-oriented programming is a programming paradigm based on the concept of 'objects', which can contain data and code to manipulate the data.",
                        image: "https://cdn-icons-png.flaticon.com/512/1814/1814430.png"
                    },
                    {
                        title: "Swift",
                        description: "Swift is a powerful and intuitive programming language for macOS, iOS, watchOS, and tvOS.",
                        image: "https://developer.apple.com/swift/images/swift-og.png"
                    }
                ]
        };
    },
    components: {SkillCard}
};
</script>

<style scoped>

</style>