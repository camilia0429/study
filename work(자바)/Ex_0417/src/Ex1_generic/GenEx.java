package Ex1_generic;

public class GenEx<T> {
	
//	���׸���
//	�Ϲ����� �ڵ带 �ۼ��ϰ� �� �ڵ带 �پ��� Ÿ���� ��ü�� ���Ͽ� ���� �ϴ� ��ü���� ���
//	��ü�� Ÿ���� ������ �� �� üũ�ϱ� ������ Ÿ�Կ� ���� �������� ������ �ຯȯ�� ����ϴ� ���ŷο��� ���� �� �ִ�.
	
//	public class Ŭ������<���׸�Ÿ��> {}
//	public interface �������̽���<���ʸ�Ÿ��> {}
//	T�� Ÿ�Ժ���(typed variable)��� �ϸ� Type�� ù���ڿ��� ���°�
//	E(Element),K(Key),V(Value)�� ����ϱ⵵ �Ѵ�.
	
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	

}
