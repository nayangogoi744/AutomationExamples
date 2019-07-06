package pck;

public class TestInterface implements AnotherInterface{

	public static void main(String[] args) {
		TestInterface t = new TestInterface();
		t.add();

	}

	@Override
	public void add() {
		System.out.println(i+j+k);
		
	}

}
