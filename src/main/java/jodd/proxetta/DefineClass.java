package jodd.proxetta;

import jodd.util.ClassLoaderUtil;

import java.lang.reflect.Method;

public class DefineClass {
	/**
	 * Defines a class from byte array into the specified class loader.
	 * Warning: this is a <b>hack</b>!
	 * @param className optional class name, may be <code>null</code>
	 * @param classData bytecode data
	 * @param classLoader classloader that will load class
	 */
	public static Class of(final String className, final byte[] classData, ClassLoader classLoader) {
		if (classLoader == null) {
			classLoader = ClassLoaderUtil.getDefaultClassLoader();
		}
		try {
			final Method defineClassMethod = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, int.class, int.class);
			defineClassMethod.setAccessible(true);
			return (Class) defineClassMethod.invoke(classLoader, className, classData, 0, classData.length);
		} catch (final Throwable th) {
			throw new RuntimeException("Define class failed: " + className, th);
		}
	}

}
