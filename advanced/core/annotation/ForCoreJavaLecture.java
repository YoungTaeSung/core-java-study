package core.annotation;

public @interface ForCoreJavaLecture {
	String author()
		default "YoungTaeSung";
	String version();
	String date();
	String comment() 
		default "No comment";
	String cagetory();
}