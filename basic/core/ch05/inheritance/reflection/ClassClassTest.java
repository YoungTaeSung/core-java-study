package core.ch05.inheritance.reflection;

class Person {
	private String name;

	public Person() {}

	public Person(String _name) {name = _name;}

	public String getName() {return name;}

	public void setName(String _name) {name = _name;}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}

public class ClassClassTest {
	public static void main(String[] args) {
		try {
			Person bob = new Person();
			// Class ��ü ������#1
			Class cls1 = bob.getClass();
			// Class ��ü ������#2
			Class cls2 = Person.class;
			// Class ��ü ������#3
			Class cls3 = Class
					.forName("core.ch05.inheritance.reflection.Person");
			if (cls1 == cls2 && cls2 == cls3) {
				System.out.println("OK");
			} else {
				System.out.println("NO");
			}
			//bob ��ü�� Ŭ���� ��ü ���� �� default ������ ȣ��
			Person bob2 = bob.getClass().newInstance();
			Object object = Class.forName("java.lang.Object").newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
}
