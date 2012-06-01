package core.ch05.inheritance.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class GenerateClassStructure {
	public static void main(String[] args) {
		//Step1. 표준입력으로 클래스 이름 입력
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Class Name(e.g. java.util.Date): ");
		String name = in.next();
		
		try {
			Class mClass = Class.forName(name);
			Class superClass = mClass.getSuperclass();
			String modifier = Modifier.toString(mClass.getModifiers());
			
			if(modifier.length() > 0)
				System.out.print(modifier + " ");
			
			System.out.print("class " + name);
			
			if(superClass != null && superClass != Object.class)
				System.out.print(" extends "+superClass.getName());
			
			System.out.println(" {\n");
			printFields(mClass);
			System.out.println();
			printConstructors(mClass);
			System.out.println();
			printMethods(mClass);
			System.out.println("\n}");
			
		} catch (ClassNotFoundException e) {
			//name을 가진 클래스를 찾지 못한 경우!!
			e.printStackTrace();
		}
		System.exit(0);
	}
	private static void printFields(Class mClass) {
		Field[] fields = mClass.getDeclaredFields();
		for(Field f : fields) {
			Class type = f.getType();
			String name = f.getName();
			System.out.print("  ");
			String modifier = Modifier.toString(f.getModifiers());
			if(modifier.length() > 0)
				System.out.print(modifier+" ");
			System.out.println(type.getName() + " " + name + ";");
		}
	}
	private static void printConstructors(Class mClass) {
		Constructor[] consts = mClass.getDeclaredConstructors();
		for(Constructor con : consts) {
			String name = con.getName();
			System.out.print("  ");
			String modifier = Modifier.toString(con.getModifiers());
			if(modifier.length() > 0)
				System.out.print(modifier+" ");
			System.out.print(name + "(");
			
			//get parameters
			Class[] params = con.getParameterTypes();
			for(int i=0; i < params.length; i++) {
				if(i > 0) System.out.print(", ");
				System.out.print(params[i].getName());
			}
			System.out.println(");");
		}
	}
	private static void printMethods(Class mClass) {
		Method[] methods = mClass.getDeclaredMethods();
		for(Method m : methods) {
			Class returnType = m.getReturnType();
			String name = m.getName();
			System.out.print("  ");
			String modifier = Modifier.toString(m.getModifiers());
			if(modifier.length() > 0)
				System.out.print(modifier + " ");
			System.out.print(returnType.getName() + " " + name + "(");
			
			//get parameters
			Class[] params = m.getParameterTypes();
			for(int i=0; i < params.length; i++) {
				if(i > 0) System.out.print(", ");
				System.out.print(params[i].getName());
			}
			System.out.println(");");
		}
	}
}
