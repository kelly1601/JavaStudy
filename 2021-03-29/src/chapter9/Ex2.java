//UPL: 서버가 제공하는 자원에 접근하기 위한 경로
//	   -> 프로토콜://호스트명:포트번호/경로명/자원명?쿼리스트링

package chapter9;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class Ex2 {
	public static void main(String[] args) {
		String protocol = "http://";
		String host = "www.ddaily.co.kr/";
		String path = "data/photos/cdn/20210104";
		String resource = "art_1611539583.jpg";
		String queryString = "?referer = naver";
		String anchor = "#index";
		
		try {
			URL url = new URL(protocol + host + path + resource + queryString + anchor);
			
			System.out.println("url.getAuthority() = " + url.getAuthority());
			System.out.println("url.getContent() = " + url.getContent());
			System.out.println("url.getDefaultPort() = " + url.getDefaultPort());
			System.out.println("url.getPort() = " + url.getPort());
			System.out.println("url.getFile() = " + url.getFile());
			System.out.println("url.getHost() = " + url.getHost());
			System.out.println("url.getPath() = " + url.getPath());
			System.out.println("url.getProtocol() = " + url.getProtocol());
			System.out.println("url.getQuery() = " + url.getQuery());
			System.out.println("url.getRef() = " + url.getRef());
			System.out.println("url.getUserInfo() = " + url.getUserInfo());
			System.out.println("url.toExternalForm() = " + url.toExternalForm());
			System.out.println("url.toURI() = " + url.toURI());

		} catch (IOException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
}
