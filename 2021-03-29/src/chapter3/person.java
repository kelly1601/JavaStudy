//���׸��� generics
//�ϳ��� ���� ���� ������ �پ��� Ÿ���� ���� �����ϱ� ���� ���
/*
 * ���׸� Ÿ�� - Ŭ������ Generics ���� (Ŭ���� �� ���� <������ �ϳ�(���� T)> ����)
 * ���׸� �Լ� - �޼��忡 Generics ���� 
 */
package chapter3;

//E - Element
//K - Key
//V - Value
//T - Type
//N - Number

//T1, T2 �̷� ������ ���� ���� ����
//������ŭ Ÿ�� ������ ��� ��
public class person <T> {
	private int eye;
	private int nose;
	private int mouth;
	
	private T id;
	private T tel;
	
	public person(T tel) {
		this.tel = tel;
	}
	
	public void setTel() {
		this.tel = tel;
	}
	
//	public person(int eye, int nose, int mouth, T id) {
//		this.eye = eye;
//		this.nose = nose;
//		this.mouth = mouth;
//		this.id = id;
//	}
	
	public void add(T val1, T val2) {
		System.out.println(1);
	}
	
	public void setID(T id) {
		this.id = id;
	}
	
	public T getID() {
		return id;
	}

}
