package jodd.proxetta.fixtures.inv;

import java.util.function.IntFunction;

public class WithFun<T> implements WithFunInt {
	public IntFunction<T[]> foo(IntFunction<T[]> in) {
		return in;
	}

}
