import java.util.Scanner;

public class BankAccount {
	
	static Scanner sc = new Scanner(System.in);
	public static class bankaccount{
		 public String accountnumber;
		 public String bankname;
		 public String accountholder;
		 public long balance;
		 public long withdraw;
		 public long deposit;
		 
		public void setAccountmethod(String i) {
			 accountholder = i;
		}
		public void getAccountmethod() {
			System.out.println(accountholder+"���� ����");
		}
		public long setDeposit() {
			deposit = sc.nextLong();
			return balance = balance+deposit; 
		}
		public void getDeposit() {
			System.out.print("�Ա� �ݾ�: ");
		}
		public long setwithdraw() {
			withdraw=sc.nextLong();
			return balance = balance - withdraw;
		}
		public void getwithdraw() {
			System.out.print("��� �ݾ�: ");
		}
		public long setBalance() {
				return balance;
		}
		public void getBalance() {
			System.out.println("���� �ܰ� : "+balance+"��");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bankaccount bank = new bankaccount();
		
		bank.bankname="����";
		bank.accountnumber="453038-56-198842";
		bank.setAccountmethod("�ڼ���");
		bank.getAccountmethod();
		System.out.println(bank.bankname+" : "+bank.accountnumber);
		try {
		while(true) {
			System.out.println("���� �Է�");
			System.out.println("1:�Ա�/2:���/3:�����ܰ�/4:����");
			int ��ɾ� = sc.nextInt();
		switch(��ɾ�) {
		case 1:{
			bank.getDeposit();
			bank.setDeposit();
			break;
		}
		case 2: {
			bank.getwithdraw();
			bank.setwithdraw();
			break;
		}
		case 3: {
			bank.setBalance();
			bank.getBalance();
			break;
		}case 4: {
			System.out.println("���¸� �����մϴ�.");
			return;
				
		}default:{
			System.out.println("1~4���߿� �������ּ���.");
			break;
		}
	}
}
}catch(Exception e) {
	System.out.println(e+" errer : 1~4���߿� �����ϼž��մϴ�. �ٽ� �����ϼ���.");
}
		sc.close();
}
}
	
	




