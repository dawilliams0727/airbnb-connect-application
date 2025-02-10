<template>
    <div>
        <h1 class="headline">Projects and Professional Experience</h1>
        <div>
            <ExperienceCard 
                v-for="(item, index) in experience" 
                :key="index" 
                :experience="item" 
            />
        </div>
    </div>
</template>

<script>
import ExperienceCard from '../components/ExperienceCard.vue';
export default {
    name: 'ExperienceView',
    data() {
        return {
            experience: [
                {
                    title: "Custom PC Specialist", 
                    institution: "Micro Center",
                    location: "Mayfield Heights, OH",
                    begin: "Aug '13",
                    end: "Present",
                    highlights: [
                        "Assisted 10-30 customers daily with creating and troubleshooting a variety of custom desktop PC solutions.",
                        "Integrated new technology into customer systems, improving the performance and longevity of provided solutions",
                        "Communicated complex information clearly and concisely, earning many 100 Net Promoter Scores",
                        "Applied deep technical expertise to properly qualify customers, resulting in return rates 25-35% lower than average"
                    ]
                },
                {
                    title: "Full-stack Web Development Bootcamp",
                    institution: "Tech Elevator",
                    location: "Cleveland, OH",
                    begin: "May '24",
                    end: "Aug '24",
                    highlights: [
                    ]
                },
                {
                    title: "Introduction to Programming and Artificial Intelligence with Python",
                    institution: "HarvardX",
                    location: "EdX.org",
                    begin: "Feb '24",
                    end: "Aug '24",
                    highlights: [

                    ]
                },
                {
                    title: "Bachelor of Science in Advertising",
                    institution: "Kent State University",
                    location: "Kent, OH",
                    begin: "Jan '15",
                    end: "Mar '19",
                    highlights: [

                    ]
                },
            ]
        };
    },
    components: { ExperienceCard }
};
</script>

<style scoped>
    div {
        margin: 0px;
    }
</style>