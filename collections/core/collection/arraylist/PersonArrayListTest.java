package core.collection.arraylist;

import java.util.ArrayList;

import core.collection.objects.Person;

public class PersonArrayListTest {
	public static void main(String[] args) {
		/*
		 * @descr Person �������� ���� �� ArrayList ����
		 * @descr ũ�Ⱑ �������� ���� ����
		 */
		ArrayList<Person> people1 = new ArrayList<Person>();
		people1.add(new Person("YoungTae", "Sung"));
		people1.add(new Person("Bogeun", "Cheun"));
		
		/*
		 * @descr �ʱ� �뷮(capacity)�� 3���� ������ ArrayList
		 */
		ArrayList<Person> people2 = new ArrayList<Person>(3);
		people2.add(new Person("GiUng", "Joe"));
		people2.add(new Person("SeeNai", "Ryu"));
		people2.add(new Person("HyunMin", "Kim"));
		
		System.out.println("Actual Elements1:"+people1.size());
		System.out.println("Actual Elements2:"+people2.size());
		
		people1.trimToSize();
		people1.add(new Person("A", "B"));
		
		ArrayList<Person> people3 = new ArrayList<Person>();
		//people3.set(0, new Person("C", "C"));
		
		Person YTSung = people1.get(0);
		System.out.println(YTSung);
		
		Person[] copyOfPeople1 = new Person[people1.size()];
		people1.toArray(copyOfPeople1);
		for(Person p : copyOfPeople1)
			System.out.println(p);
		
		Person SeeNai = people2.remove(1);
		System.out.println(SeeNai);
		
		for(Person p : people2) {
			System.out.println(p);
		}
		System.exit(0);
	}
}
