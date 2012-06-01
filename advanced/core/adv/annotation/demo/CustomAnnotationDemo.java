package core.adv.annotation.demo;

import core.annotation.ForCoreJavaLecture;
import core.annotation.ForTest;
import core.annotation.SingleElementAnnotation2;

@ForTest
@ForCoreJavaLecture(cagetory = "", date = "", version = "")
class Something {
	
}
@SingleElementAnnotation2("Hello")
@ForCoreJavaLecture(cagetory="Annotation", date = "2011.12.14", version = "0.1")
public class CustomAnnotationDemo {
	public static void main(String[] args) {
		System.out.println("Hello, Annotation!");
		
		System.exit(0);
	}
}
