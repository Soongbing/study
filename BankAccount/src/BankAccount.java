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
			System.out.println(accountholder+"님의 계좌");
		}
		public long setDeposit() {
			deposit = sc.nextLong();
			return balance = balance+deposit; 
		}
		public void getDeposit() {
			System.out.print("입금 금액: ");
		}
		public long setwithdraw() {
			withdraw=sc.nextLong();
			return balance = balance - withdraw;
		}
		public void getwithdraw() {
			System.out.print("출금 금액: ");
		}
		public long setBalance() {
				return balance;
		}
		public void getBalance() {
			System.out.println("현재 잔고 : "+balance+"원");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bankaccount bank = new bankaccount();
		
		bank.bankname="농협";
		bank.accountnumber="453038-56-198842";
		bank.setAccountmethod("박순빈");
		bank.getAccountmethod();
		System.out.println(bank.bankname+" : "+bank.accountnumber);
		try {
		while(true) {
			System.out.println("서비스 입력");
			System.out.println("1:입금/2:출금/3:현재잔고/4:종료");
			int 명령어 = sc.nextInt();
		switch(명령어) {
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
			System.out.println("계좌를 종료합니다.");
			return;
				
		}default:{
			System.out.println("1~4번중에 선택해주세요.");
			break;
		}
	}
}
}catch(Exception e) {
	System.out.println(e+" errer : 1~4번중에 선택하셔야합니다. 다시 시작하세요.");
}
		sc.close();
}
}
	
	




