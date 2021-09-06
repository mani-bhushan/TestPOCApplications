package app.org.com.inheritance.multiple;

public class ChildA implements ParentA, ParentB {

	@Override
	public String useCaseB() {
		System.out.print("child : useCaseB");
		return null;
	}

	@Override
	public String useCaseA() {
		System.out.print("child : useCaseA");
		return null;
	}

	@Override
	public void show() {
		ParentB.super.show();
		System.out.print("child : show");
	}


}
