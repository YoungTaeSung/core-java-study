package core.ch05.enumeration;

public enum ElvisPresleyEnum {
	ELVIS("Elvis Aron Presley", "Singer", "Love me tender", 1935, 1977);
	
	private String name;
	private String job;
	private String well_known_song;
	private int born_year, d_year;
	
	private ElvisPresleyEnum(String name, String job, String song, int start, int end) {
		this.name = name; this.job=job; this.well_known_song=song; 
		this.born_year = start;	this.d_year=end;
	}
	public String getName() { return name; }
	public String getJob() { return job; }
	public String getWellKnownSong() { return well_known_song; }
	public int getBornYear() { return born_year; }
	public int getDYear() { return d_year; }
	public String toString() {
		return "ElvisE("+name+", "+job+", "+well_known_song+", "+born_year+", "+d_year+")";
	}
}