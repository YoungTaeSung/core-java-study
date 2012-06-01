package core.ch05.enumeration;

public class ElvisPresleyTest {

	public static void main(String[] args) {
		ElvisPresley elvis = ElvisPresley.getElvis();
		System.out.println(elvis);
		
		ElvisPresley elvis2 = ElvisPresley.getElvis();
		
		if(elvis != elvis2) {
			System.out.println("There must be just ONE ELVIS");
		}
		
		ElvisPresleyEnum elvisE = ElvisPresleyEnum.ELVIS;
		System.out.println(elvisE);
		System.exit(0);
	}
}
