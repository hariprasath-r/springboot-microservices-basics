package in.hp.boot.models;

public class Movie {
	
	private String movieId;
	private String name;
	
	// Empty constructor for Unmarshalling
	public Movie() {
		
	}
	
	public Movie(String movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}