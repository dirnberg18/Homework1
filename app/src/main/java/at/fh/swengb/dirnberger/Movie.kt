package at.fh.swengb.dirnberger

import android.media.Rating

class Movie (val id: String,
             val title: String,
             val release: String,
             val plot: String,
             val genre: MovieGenre,
             val director: Person,
             val actors: List<Person>,
             val ratings: MutableList<Review>)
{

    fun ratingAverage(): Double {
        var sum = 0.0
        ratings.forEach {
            sum += it.reviewValue
        }

        val average = String.format("%.3f", sum / ratings.count()).toDouble()
        return average
    }

    override fun toString(): String {
        return "Movie(id='$id', title='$title', release='$release', plot='$plot', genre=$genre, director=$director, actors=$actors, ratings=$ratings)"
    }

}