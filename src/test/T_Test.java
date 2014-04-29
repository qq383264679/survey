package test;

import java.lang.reflect.ParameterizedType;

import com.sun.xml.internal.ws.policy.sourcemodel.ModelNode.Type;

public class T_Test<T> {
	Class clazz;
	@SuppressWarnings("unchecked")
	public T_Test() {
		java.lang.reflect.Type genType = this.getClass().getGenericSuperclass();  
        java.lang.reflect.Type[] params = ((ParameterizedType) genType).getActualTypeArguments();  
        this.clazz = (Class<T>) params[0]; 
        System.out.println(clazz.toString());
	}
}
