package ����������;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Now{
	  // SimpleDateFormat dayTime =new SimpleDateFormat("[hh:mm:ss]");
	   private String time;// dayTime.format(new Date());
	   
	   private String name="";
	   public String getTime() {
	      return time;
	   }

	   public void setTime(String t) {
	      this.time = t;
	   }

	   public String getName() {
	      return name;
	   }

	   public void setName(String n) {
	      this.name = n;
	   }
	}
	public class �ð� {

	   public static void main(String[] args) {
	      SimpleDateFormat dayTime =new SimpleDateFormat("[hh:mm:ss]");
	      Scanner sc =new Scanner(System.in);
	      Now now =new Now();
	      
	      System.out.println("������ �̸��� �Է��ϼ���:");
	      String str=sc.nextLine();
	      now.setName(str);
	      String time1 =dayTime.format(new Date());
	      now.setTime(time1);
	      System.out.println("���� �ð�:"+now.getTime());
	      System.out.println("���� �̸�:"+now.getName());
	      
	      sc.close();
	   }

	}