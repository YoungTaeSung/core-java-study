package corev.ch03.network;

import java.net.InetAddress;

public class InetAddressTest {
	public static void main(String[] args) {
		try {
			if(args.length > 0) {
				String host = args[0];
				InetAddress address = InetAddress.getByName(host);
				InetAddress[] address2 = InetAddress.getAllByName(host);
				
				System.out.println("Single Address:"+address);
				
				for(InetAddress i : address2)
					System.out.println(i);
			}
		} catch (Exception e) { e.printStackTrace(); }
	}

}
