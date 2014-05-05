package test;

import java.text.SimpleDateFormat;

import com.feng.model.Survey;
import com.feng.model.User;

public class Test extends T_Test<User>{
	public Test() {
		System.out.println("sssssss");
	}
	public static void main(String[] args) {
		Survey s= new Survey();
		
		SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		System.out.println(time.format(s.getCreateTime()));
		
	}

}
