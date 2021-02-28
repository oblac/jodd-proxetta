package jodd.proxetta;

public class MutableInteger {
	public MutableInteger() {
		this(0);
	}
	public MutableInteger(int value) {
		this.value = value;
	}

	public int value;

	public int get() {
		return value;
	}

	public void set(int i) {
		this.value = i;
	}
}
