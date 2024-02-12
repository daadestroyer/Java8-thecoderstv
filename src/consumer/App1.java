package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Movie {
	String movieName;
	String heroName;
	String heroineName;
	Float imdbRating;

	public Movie(String movieName, String heroName, String heroineName, Float imdbRating) {
		super();
		this.movieName = movieName;
		this.heroName = heroName;
		this.heroineName = heroineName;
		this.imdbRating = imdbRating;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", heroName=" + heroName + ", heroineName=" + heroineName
				+ ", imdbRating=" + imdbRating + "]";
	}

}

public class App1 {
	public static void main(String[] args) {
		List<Movie> movieList = Arrays.asList(new Movie("Pathan", "SRK", "Kajol", 8.4F),
				new Movie("DDLJ", "SRK", "Kajol", 9.4F), new Movie("Tubelight", "Salman", "xjsd", 5.4F),
				new Movie("XYZ", "sds", "xjsd", 5.4F), new Movie("sdsd", "Salsdsman", "xjsd", 5.4F));

		Consumer<Movie> c = (cons) -> {
			System.out.println(cons);
		};

		for (Movie movie : movieList) {
			c.accept(movie);
		}
	}
}
