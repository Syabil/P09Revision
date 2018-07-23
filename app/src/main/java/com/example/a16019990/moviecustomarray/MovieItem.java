package com.example.a16019990.moviecustomarray;

public class MovieItem {
    private String MovieName;
    private int Rating;

    public MovieItem(String MovieName, int Rating) {
        this.MovieName = MovieName;
        this.Rating = Rating;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    public String toString() {
        return "MovieItem{MovieName='" + getMovieName() + "\'" + ", Rating='" + getRating() + "\'}";
    }
}
