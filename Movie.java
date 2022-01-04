package Final;

public class Movie {
	String title;
	int year;
	String genre;
	public Movie (String g, String t, int y) {
		genre = g;
		title = t;
		year = y;
	}
	public String toString() {
		return genre +":"+ title + "(" + year + ")";
	}
}

