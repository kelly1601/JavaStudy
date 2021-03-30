//package chapter1;
//
//public class Ex1 {
//	private static Object text;
//
//	public static void main(String[] args) {
//		int val1 = 10;
//		int val2 = 1;
//		
//		try {
//			System.out.println(val1 / --val2);
//			int[] val3 = new int[3];
//			System.out.println(val3[3]);
//			char c = Ex1.text.charAt(0);
//
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열의 범위를 벗어났습니다.");                                                                        
//		} catch(ArithmeticException e) {
//			System.out.println("0으로 나누려는 시도를 하고 있습니다.");
//		} catch(NullPointerException e) {
//			System.out.println("오류입니다.");
//		}
//		
//		int result = val1 + val2;
//		System.out.println(result);
//	}
//}
