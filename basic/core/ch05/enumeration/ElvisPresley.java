package core.ch05.enumeration;

public class ElvisPresley {
	private final String name;
	private final String job;
	private final int born_year;
	private final int d_year;
	private final String well_known_song;
	
	private final static ElvisPresley ELVIS = new ElvisPresley();
	
	private ElvisPresley() {
		name = "Elvis Aron Presley";
		job = "Singer";
		born_year = 1935; d_year=1977;
		well_known_song = "Love me tender";
	}
	
	public static ElvisPresley getElvis() { return ELVIS; }
	
	public String getName() { return name; }
	public String getJob() { return job; }
	public String getWellKnownSong() { return well_known_song; }
	public int getBornYear() { return born_year; }
	public int getDYear() { return d_year; }
	public String toString() {
		return "Elvis("+name+", "+job+", "+well_known_song+", "+born_year+", "+d_year+")";
	}
}
