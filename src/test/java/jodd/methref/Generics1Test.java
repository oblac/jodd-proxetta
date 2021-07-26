package jodd.methref;

import jodd.methref.Methref;
import org.junit.jupiter.api.Test;

class Generics1Test {

	public interface Bar<T> {
		T bar();
	}

	public static class Foo implements Bar<Foo> {

		public Foo() {
		}

		@Override
		public Foo bar() {
			return new Foo();
		}
	}

	@Test
	void testStringIndexOutOfBoundsException() {
		Foo foo = Methref.of(Foo.class).proxy();
	}
}
