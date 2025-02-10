<template>
    <div>
        <h1>AirBnb Connect Essays</h1>
        <TransitionGroup tag="div" display="none">
                <div v-for="essay in essays" :key="essay.id">
                    <EssayPrompt :data="essay" class="essay-prompt"/>
                </div>
        </TransitionGroup>
    </div>
</template>

<script>
    import EssayPrompt from '../components/EssayPrompt.vue';


    export default {
        data() {
            return {
                essays:[ 
                    /*{
                        id: 0,
                        prompt: "Placeholder Prompt",
                        response: "This is a placeholder response"
                    }, */
                    {
                        id: 1,
                        prompt: "Which Airbnb Core Value most resonates with your personal story and how does that make you a unique addition to this company?",
                        response: `I embrace life because of the strangers who dared to love me. For years, I believed that I was destined to die alone. I tried to enjoy my own company—taking myself to dinner, booking Airbnb stays, exploring new cities, and going to local concerts—but it felt hollow. I was bereft of belonging until I found the EDM community, where PLUR—peace, love, unity, and respect—transformed strangers into family. They showed me that I can embrace my uniqueness without judgment and that I will never truly be alone. They inspired my LED Halo project, merging self-expression with my love for technology, drawing me closer to a career in software development. 
I owe my victories to the global community that brought me in, and Airbnb’s Core Value, “Champion the Mission” resonates with me most because of it. I intimately understand the impact of belonging and how technology can uniquely foster it. Now, I want to build a world where anyone can find genuine connection—anywhere they may roam.
`
                    }, 
                    {
                        id: 2,
                        prompt: "How Did you get interested in engineering and why did you choose this path? What impact would this apprenticeship have on your future as a software engineer and how would you leverage this opportunity to get there?",
                        response: `I love nothing more than when my synapses conspire to create something beautiful. I wanted to make a wireless LED halo, but I had no idea how to program microcontrollers, so I took a Python course online. The feeling of challenging myself to create something new ignited my desire to shift my career from custom PC sales to software development. I wanted to push myself further, so I enrolled in a full-stack web development bootcamp. Structured learning worked well for me, so I took more online courses through Coursera.org on DevOps, Software Engineering, and Machine Learning.
This apprenticeship will allow me to collaborate with experienced engineers from diverse backgrounds—each with a lifetime of knowledge and novel perspectives. Through challenging work, structured mentorship, real-world experience, and the belief in continuous growth, I will deepen my understanding of not only the lines of code that shapes our lives, but also the people and communities that we write them for.
`
                    }, 
                    {
                        id: 3,
                        prompt: "What is one of the most challenging personal or professional) things you worked on or had to overcome?",
                        response: `As I embraced the adventure and set out to find a software development job, I met a rough sea. Waves of rejection came crashing in, and I felt anger, sadness, and hopelessness. Imposter syndrome set in, and I felt that I would be relegated to a life of mediocrity, and as a result, my mental health declined.
Determined to push forward, I sought help from a therapist. She helped me reframe my perspective and I dove headfirst into online courses to expand my skillset. I built a small neural network without relying on TensorFlow, a scalable RESTful API with Flask and Kubernetes, and automated workflows with CI/CD pipelines—using scrum and GitHub to work in a DevOps mindset.
Now, I’m grateful for the rejections. It paved the path to creating a more adaptable, analytical, and resilient software developer. I will overcome the challenge of landing my first software development job. I will find where I belong. I set my sights on Airbnb—where innovation, technology, and human connection collide.
`
                    }, 
                   
                ]
            };
        },
        name: 'EssaysView',
        components: {
            EssayPrompt
        },
        
    };
    
</script>

<style scoped>
    .essay-prompt {
        margin: 30px;
    }
</style>