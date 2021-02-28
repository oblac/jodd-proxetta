package jodd.proxetta.fixtures.inv;

import java.util.function.IntFunction;

public interface WithFunInt {

	default <T> T[] toArray(IntFunction<T[]> generator) {
		return null;
	}

}
