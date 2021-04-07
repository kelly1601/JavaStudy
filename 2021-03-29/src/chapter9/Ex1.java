//네트워킹(Networking)
//서버: 서비스를 제공하는 컴퓨터
//클라이언트: 서비스를 사용하는 컴퓨터

//도메인: IP 주소로 서버에 접근해야 하는데 IP 주소는 0~255 사이의 4자리 숫자로 이루어져 있으므로 접근성 떨어짐.
//		-> 숫자를 의미 있는 문자로 지정해서 사용하는 게 더 편함 -> [도메인 네임 서비스] -> DNS

package chapter9;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex1 {
	public static void main(String[] args) {
		InetAddress ip = null;
		InetAddress[] ipArray = null;
		
		try {
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName() = " + ip.getHostName());
			//도메인의 IP 주소를 알려주는 메서드
			System.out.println("getHostAddress() = " + ip.getHostAddress());
			System.out.println("toString() = " + ip.toString());
			
			//IP -> 4자리 숫자로 이루어져 있음/각 자리는 1Byte
			byte[] ipAddress = ip.getAddress();
			System.out.println("getAddress() = " + Arrays.toString(ipAddress));
			
			String result = "";
			for(int i=0; i < ipAddress.length; i++) {
				result += (ipAddress[i] < 0) ? ipAddress[i] + 256 : ipAddress[i];
				result += ".";
			}
			
			System.out.println("getAddress() + 256 = " + result);
			System.out.println("===== =====");
			
			ip = InetAddress.getLocalHost();
			
			System.out.println("getHostName() = " + ip.getHostName());
			System.out.println("getHostAddress() = " + ip.getHostAddress());
			System.out.println("===== =====");
			
			ipArray = InetAddress.getAllByName("www.naver.com");
			for(int i = 0; i < ipArray.length; i++) {
				System.out.println("ipArray[" + i + "] = " + ipArray[i]);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
