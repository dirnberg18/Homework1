package at.fh.swengb.dirnberger

object MovieRepository {
    private val movies: List<Movie>

    init {

        val harry = Person("Daniel Radcliffe", "23.07.1989")
        val ron = Person("Emma Watson", "15.04.1990")
        val hermine = Person("Rupert Grint", "24.08.1988")
        val director7 = Person ("David Yates", "30.11.1963")
        val director3 = Person ("Alfonso Cuarón", "28.11.1961")
        val director1 = Person ("Chris Columbus", "10.09.1958")
        val director4 = Person ("Mike Newell", "28.03.1942")
        val Eddie = Person("Eddie Redmayne", "06.01.1982")
        val Kathi = Person("Katherine Waterston", "03.03.1980")
        val director8 = Person ("Gary Ross", "03.11.1956")
        val Katniss = Person ("Jennifer Lawrence", "15.08.1990")
        val Peeta = Person ("Joshua Ryan Hutcherson", "12.10.1992")

        movies = listOf(

            Movie("1",
                "Harry Potter And The Philosopher's Stone",
                "23.11.2001",
                "The young orphan Harry Potter grows up with his aunt and uncle, who only exploit him. Shortly before his eleventh birthday, however, his life changes when he receives an invitation to Hogwarts, a school for witchcraft and sorcery. There, magical creatures, magic potion lessons and the teacher Snape, who doesn't seem to like him, await him. Harry finds friends in his classmates Ron and Hermione. And soon he gets to deal with the most evil of all wizards.",
                MovieGenre.FANTASY,
                director1,
                listOf(harry, ron, hermine),
                mutableListOf()),

            Movie("2",
                "Harry Potter And The Chamber of Secrets",
                "14.11.2002",
                "In Harry's second year, strange things happen at Hogwarts. One by one, students are found petrified in the corridors and everything points to a mysterious chamber with which Hagrid is supposed to have something to do. The new teacher of defense against the dark arts, Gilderoy Lockhart, seems anything but qualified, and when Dumbledore is finally suspended, Harry, Ron and Hermione set about solving the mystery themselves.",
                MovieGenre.FANTASY,
                director1,
                listOf(harry, ron, hermine),
                mutableListOf()),

            Movie("3",
                "Harry Potter And The Prisoner of Azkaban",
                "04.06.2004",
                "Harry can hardly wait for the holiday to end, especially when Vernon's sister announces her visit. Trouble can hardly be avoided and Harry finally runs away - much to the concern of the wizard community, because the criminal Sirius Black has broken out of prison and is probably looking for him. Back in Hogwarts, Harry finds out that Black is responsible for the death of his parents. And then Ron's rat behaves even more strange.",
                MovieGenre.FANTASY,
                director3,
                listOf(harry, ron, hermine),
                mutableListOf()),

            Movie("4",
                "Harry Potter And The Goblet of Fire",
                "16.11.2005",
                "Harry Potter and his friends witness a historic event: This year the Trimagic Tournament takes place at Hogwarts. For inexplicable reasons, Harry becomes a participant and has to face dangerous dragons, water demons and difficult puzzles - and find a companion to the school prom. Harry soon realizes that he has landed in a game of life and death and that Voldemort is closer than expected.",
                MovieGenre.FANTASY,
                director4,
                listOf(harry, ron, hermine),
                mutableListOf()),

            Movie("5",
                "Harry Potter And The Order of the Phoenix",
                "28.06.2007",
                "Harry Potter has a lonely summer with the Dursleys when he and his cousin Dudley are suddenly attacked by dementors. Harry can drive them away with difficulty, but because he has conjured in front of a Muggle, he is then threatened with expulsion from school. But this is only the beginning of the evil, because hardly anyone wants to believe that Voldemort is back when he returns to Hogwarts. And then there's the new teacher, who apparently tries to prevent the students from learning magic.",
                MovieGenre.FANTASY,
                director7,
                listOf(harry, ron, hermine),
                mutableListOf()),

            Movie("6",
            "Harry Potter And The Half-Blood Prince",
            "16.06.2009",
            "The magic of love dominates the sixth school year of Harry and his friends Hermione and Ron. Hormones and a love potion cause confusion while Voldemort's devotees form an attack on the young protagonists and their greatest magical ally. But when Harry and Professor Dumbledore discover the secret of Voldemort's eternal life, his influence grows behind the walls of Hogwart. The Dark Lord has already sent Death to Hogwarts.",
            MovieGenre.FANTASY,
            director7,
            listOf(harry, ron, hermine),
            mutableListOf()),

            Movie("7",
                "Harry Potter And The Deathly Hallows - 1",
                "17.11.2010",
                "Dumbledore is dead and both Hogwarts and the Ministry of Magic are under the control of the Death Eaters. Harry, Ron and Hermione search for the remaining Horcruxes, whose destruction could defeat Voldemort once and for all. However, the Horcruxes soon become a test for the three friends. And when Harry learns of the legendary deathly hollows, he doubts which path is the right one for him.",
                MovieGenre.FANTASY,
                director7,
                listOf(harry, ron, hermine),
                mutableListOf()),
            Movie("8",
                "Harry Potter And The Deathly Hallows - 2",
                "13.07.2011",
                "Only two Horcruxes are missing to finally defeat Voldemort. Harry, Ron and Hermione find out that one of them must be in Gringotts, and plan to break into the Wizard's Bank with the help of the goblin Griphook. It doesn't take long and they are discovered - now Voldemort knows what the three are up to. The last Horcrux leads the friends back to Hogwarts, where soon wizards and Death Eaters meet for a final battle.",
                MovieGenre.FANTASY,
                director7,
                listOf(harry, ron, hermine),
                mutableListOf()),

            Movie("9",
                "Fantastic Beasts And Where To Find Them",
                "18.11.2016",
                "In 1926, the eccentric wizard Newt Scamander arrives in New York at the end of his worldwide journey to explore magical animals. The atmosphere in the city is tense as the magical community threatens to explode. And when the non-magician Jacob accidentally releases some of the creatures from Newt's suitcase, disaster takes its course. When Newt, Jacob and two witch sisters try to catch the creatures again, they have to deal with dangerous enemies.",
                MovieGenre.FANTASY,
                director7,
                listOf(Eddie, Kathi),
                mutableListOf()),

            Movie("10",
                "Fantastic Beasts And Where To Find Them - 2",
                "16.11.2018",
                "When the black magician Gellert Grindelwald flees from prison, he builds up a following in order to assert the supremacy of the magicians over the non-magicians. The powerful sorcerer Albus Dumbledore's hands are tied at first, which is why he asks the magizoologist Newt Scamander to stop the villain. After some hesitation, the young magician goes to Paris, where Grindelwald wants to pull the destructive Obscurus Credence on his side.",
                MovieGenre.FANTASY,
                director7,
                listOf(harry, ron, hermine),
                mutableListOf()),

            Movie("11",
                "Fantastic Beasts And Where To Find Them - 3",
                "20.11.2020",
                "Not yet publicly known.",
                MovieGenre.FANTASY,
                director7,
                listOf(Eddie, Kathi),
                mutableListOf()),

            Movie("12",
                "The Hunger Games",
                "23.03.2012",
                "In order to demonstrate its power, the regime of the totalitarian state of Panem organizes every year the 'hunger games': 24 young people compete against each other and only one can survive. The 16-year-old Katniss voluntarily goes to the arena for her little sister. The second candidate from Katniss' district is Peeta, whom she has known since childhood. Shortly before the perfidious tournament begins, Peeta confesses his love to Katniss. But the Capitol turns her into a mortal enemy.",
                MovieGenre.FANTASY,
                director8,
                listOf(Katniss, Peeta),
                mutableListOf()),

            Movie("13",
                "The Hunger Games - Catching Fire",
                "11.11.2013",
                "Katniss Everdeen will be forced to face former winners and fight for their lives at this year's Hunger Games after President Snow's last games. Snow hopes to get Katniss and her family out of the way. But Katniss becomes more and more the symbol of a movement against the bloody rules of the tournament and the revolution begins.",
                MovieGenre.FANTASY,
                director7,
                listOf(Katniss, Peeta),
                mutableListOf()),

            Movie("14",
                "The Hunger Games - Mockingjay1",
                "10.11.2014",
                "After the second Hunger Games, Katniss is taken to safety by the rebels in the destroyed underground District 13, while Peeta is held captive by the government. For the oppressed society, Katniss is a heroic symbol of resistance. The rebels want to exploit their popularity and turn it into a propaganda idol, the 'Mockingjay'. Katniss hesitates to join the rebels. Their decision will determine Panem's fate.",
                MovieGenre.FANTASY,
                director7,
                listOf(Katniss, Peeta),
                mutableListOf()),

            Movie("15",
                "The Hunger Games - Mockingjay2",
                "19.11.2915",
                "All of Panem is at war. Revolutionary icon Katniss Everdeen, hiding in the 13th district, must realize that the battle against the Capitol is no longer about survival, but about the future of Panem. Together with a small unit of her closest friends, Katniss embarks on a final, secret mission to save the lives of all citizens and kill President Snow. But there is also danger from within the ranks of the revolutionary leaders.",
                MovieGenre.FANTASY,
                director7,
                listOf(Katniss, Peeta),
                mutableListOf())

        )
    }

    fun movieList(): List<Movie> {
        return movies
    }

    fun movieById(id: String): Movie? {
        return movies.find { it.id == id }
    }

    fun rateMovie(id: String, rating: Review) {
        movieById(id)?.ratings?.add(rating)
    }

    fun getItemId(position: Int): Any {
        return position.toLong()
    }
}