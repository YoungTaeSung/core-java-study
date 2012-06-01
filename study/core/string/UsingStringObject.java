package core.string;

import core.common.Core;

public class UsingStringObject {
	public static void main(String[] args) {
		String str = "Hello String";
		Core.println(Integer.toHexString(System.identityHashCode(str)));
		
		System.exit(0);
	}
}
