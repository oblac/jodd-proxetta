package jodd.proxetta;

public class Value<T> {
	private T value;

	Value(final T v) {
		this.value = v;
	}

	public T get() {
		return value;
	}

	public void set(final T value) {
		this.value = value;
	}

}
