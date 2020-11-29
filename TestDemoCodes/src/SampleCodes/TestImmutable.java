package SampleCodes;

public final class TestImmutable {

	private int i;

	TestImmutable(int i) {
		this.i = i;
	}

	public TestImmutable modify(int i) {
		if (this.i == i)
			return this;
		else
			return new TestImmutable(i);
	}

	public static void main(String args[]) {
		TestImmutable tm1 = new TestImmutable(10);
		TestImmutable tm2 = tm1.modify(100);
		TestImmutable tm3 = tm1.modify(10);
		System.out.println(tm1==tm2);
		System.out.println(tm1==tm3);
	}

}
