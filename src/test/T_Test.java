package test;

import java.lang.reflect.ParameterizedType;

import com.feng.util.GenericsUtil;



public class T_Test<T> {
	Class<T> clazz;
	@SuppressWarnings("unchecked")
	public T_Test() {
		this.clazz = GenericsUtil.getSuperClassGenricType(T_Test.class);
		System.out.println(clazz.toString());
	}
}
