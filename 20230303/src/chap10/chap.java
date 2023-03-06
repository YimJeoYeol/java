package chap10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class chap {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		//SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/mm/dd"); 	// 소문자 mm 분으로 출력하게 된다.
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd h:m:s");
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		
		
		
//		
//		Date today2 = new Date(2023,3,3);	//다른방식으로 써야한다.
//		System.out.println(today);
//		
//		Calendar cl = Calendar.getInstance(); 
//		
	}

}
