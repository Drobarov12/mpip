package com.example.movie.models

class Movie (
    val id: Int,
    val name: String,
    val description: String,
    val director: String,
    val listOfFeatures: List<String>,
)

fun getAll(): List<Movie> {
    return mutableListOf(
        Movie(
            id = 0,
            name = "Eclipse Over Eden",
            description = "In a dystopian future where the sun never rises, a group of rebels discovers a hidden truth that could bring light back to their world.",
            director = "Ava Martell",
            listOfFeatures = listOf("Stunning visual effects depicting perpetual darkness", "A gripping, suspenseful storyline", "Award-winning costume design", "A haunting original score")
        ),
        Movie(
            id = 1,
            name = "The Last Canvas",
            description = "An aging artist struggling with creative block embarks on a journey to find his last great inspiration.",
            director = "Carlos Rivera",
            listOfFeatures = listOf("Beautifully shot landscapes", "Deep character development", "A poignant exploration of art and aging", "Critically acclaimed screenplay")
        ),
        Movie(
            id = 2,
            name = "Whispers of the Past",
            description = "A historical drama set in the Victorian era, following a young woman's quest to uncover her family's secretive history.",
            director = "Helen Zhou",
            listOfFeatures = listOf("Authentic period costumes and sets", "Strong female lead character", "Intriguing plot twists", "Rich, detailed storytelling")
        ),
        Movie(
            id = 3,
            name = "Cybernetic Heart",
            description = "In a world where humans and machines are merging, a cyborg must choose between his human emotions and robotic efficiency.",
            director = "Tariq Al-Fayed",
            listOfFeatures = listOf("Groundbreaking special effects", "Philosophical exploration of human-machine relationships", "Intense action sequences", "Thought-provoking script")
        ),
        Movie(
            id = 4,
            name = "Mystic Tides",
            description = "A fantasy adventure about a pirate and a mermaid who join forces to find a legendary treasure.",
            director = "Sophia Kwon",
            listOfFeatures = listOf("Breathtaking underwater cinematography", "Dynamic lead duo with great chemistry", "A mix of fantasy and swashbuckling action", "Imaginative creature designs")
        ),
        Movie(
            id = 5,
            name = "Quantum Paradox",
            description = "A sci-fi thriller involving time travel, where a detective tries to prevent a catastrophe while dealing with the complexities of altering time.",
            director = "Leon Bates",
            listOfFeatures = listOf("Innovative time travel concept", "Suspenseful and intricate plot", "Stellar lead performance", "Visually striking time-warp effects")
        ),
        Movie(
            id = 6,
            name = "Frostbound",
            description = "A survival story set in the Arctic, following a group of researchers stranded after a disastrous expedition.",
            director = "Mia Johansson",
            listOfFeatures = listOf("Intense survival drama", "Stunning shots of Arctic landscapes", "Strong ensemble cast", "Realistic depiction of survival challenges")
        ),
        Movie(
            id = 7,
            name = "Gilded Shadows",
            description = "In the roaring 1920s, a detective delves into the underworld of jazz clubs to solve a series of mysterious crimes.",
            director = "James Calloway",
            listOfFeatures = listOf("Authentic 1920s set design and costumes", "Jazz-infused soundtrack", "Engrossing mystery plot", "Rich atmospheric mood")
        ),
        Movie(
            id = 8,
            name = "Skyward Bound",
            description = "A heartwarming tale of a young girl's dream to become an astronaut and her journey to reach the stars.",
            director = "Nora Kim",
            listOfFeatures = listOf("Inspirational story with a strong message", "Visually stunning space sequences", "Empowering female lead", "Educational elements about space exploration")
        ),
        Movie(
            id = 9,
            name = "Echoes of Tomorrow",
            description = "A post-apocalyptic tale where survivors of a global disaster must navigate a world they no longer recognize.",
            director = "Alexei Petrov",
            listOfFeatures = listOf("Post-apocalyptic world-building", "Deeply emotional character arcs", "Stunning visual effects depicting a shattered world", "A gripping, hopeful storyline")
        ),
        Movie(
            id = 10,
            name = "Shadows in Silence",
            description = "A suspenseful thriller about a detective solving a mystery in a town where everyone communicates only in sign language.",
            director = "Elena Miro",
            listOfFeatures = listOf("Innovative use of sign language", "Gripping suspense", "Unique sound design", "Compelling character development")
        ),
        Movie(
            id = 11,
            name = "Neon Dreams",
            description = "A vibrant journey through a futuristic city, exploring the life of a young artist finding her way.",
            director = "Rajiv Srinivasan",
            listOfFeatures = listOf("Stunning neon visuals", "Uplifting story", "Memorable electronic soundtrack", "Rich, detailed world-building")
        ),
        Movie(
            id = 12,
            name = "Infinite Echoes",
            description = "A science fiction saga about explorers discovering parallel universes, each with its own set of challenges.",
            director = "Liam O'Connor",
            listOfFeatures = listOf("Cutting-edge visual effects", "Intricate plot across multiple universes", "Philosophical and scientific themes", "Diverse and complex characters")
        ),
        Movie(
            id = 13,
            name = "Labyrinth of Time",
            description = "An epic fantasy adventure where a group of heroes must navigate a shifting maze to find an ancient artifact.",
            director = "Maria Fernandez",
            listOfFeatures = listOf("Imaginative set designs", "Dynamic action sequences", "Deep lore and mythology", "Strong ensemble cast")
        ),
        Movie(
            id = 14,
            name = "Chasing Horizons",
            description = "A heartwarming road trip movie about a group of friends rediscovering themselves and their friendships.",
            director = "Henry Chu",
            listOfFeatures = listOf("Scenic cinematography", "Relatable characters", "Great balance of humor and drama", "Soundtrack featuring indie music")
        ),
        Movie(
            id = 15,
            name = "Beyond the Rift",
            description = "A deep-sea exploration film that uncovers mysteries at the bottom of the ocean.",
            director = "Anika Patel",
            listOfFeatures = listOf("Spectacular underwater filming", "Tense, atmospheric plot", "Educational content about marine life", "Stellar special effects")
        ),
        Movie(
            id = 16,
            name = "The Painter's Vision",
            description = "A historical drama about the life and struggles of a famous painter during the Renaissance.",
            director = "Thomas Blackburn",
            listOfFeatures = listOf("Accurate historical representation", "Beautiful period costumes and sets", "In-depth character study", "Stunning visual compositions")
        ),
        Movie(
            id = 17,
            name = "Whispering Winds",
            description = "A touching story about a small town coming together to save their local environment from destruction.",
            director = "Sofia Alvarez",
            listOfFeatures = listOf("Inspiring environmental message", "Strong community spirit", "Beautiful natural landscapes", "Heartfelt performances")
        ),
        Movie(
            id = 18,
            name = "Starbound",
            description = "A space opera set in a galaxy where humans and aliens strive to coexist and face cosmic threats together.",
            director = "Ahmed Khan",
            listOfFeatures = listOf("Dazzling space battles", "Complex alien cultures", "Themes of unity and diversity", "Impressive CGI aliens")
        ),
        Movie(
            id = 19,
            name = "Eternal Sonata",
            description = "The tale of a musician who discovers a magical instrument that alters reality, leading to unforeseen consequences.",
            director = "Claire Young",
            listOfFeatures = listOf("Magical realism", "Breathtaking musical performances", "Thought-provoking narrative", "Visually stunning effects")
        )
    )
}