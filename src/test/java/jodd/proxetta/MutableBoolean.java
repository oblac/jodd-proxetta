package jodd.proxetta;

public class MutableBoolean {

	public MutableBoolean() {
	}

	public MutableBoolean(final boolean value) {
		this.value = value;
	}

	/**
	 * The mutable value.
	 */
	public boolean value;

	/**
	 * Returns mutable value.
	 */
	public boolean get() {
		return value;
	}

	/**
	 * Sets mutable value.
	 */
	public void set(final boolean value) {
		this.value = value;
	}

	/**
	 * Sets mutable value. Throws exception if boolean value is
	 * <code>null</code>.
	 */
	public void set(final Boolean value) {
		this.value = value.booleanValue();
	}

}
