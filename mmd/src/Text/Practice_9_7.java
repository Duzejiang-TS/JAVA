package Text;

import java.util.Date;
import java.util.Scanner;

public class Practice_9_7 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("����һ��ID���������ÿո������");
		int id = input.nextInt();
		double balance = input.nextDouble();
		Account one = new Account(id,balance);
		
		System.out.print("���������ʣ�");
		double annualInterestRate = input.nextDouble();
		one.setAnnualInterestRate(annualInterestRate);
		
		System.out.print("����ȡ����Ǯ��");
		double payMoney = input.nextDouble();
		one.withDraw(payMoney);
		
		System.out.print("��������Ǯ��");
		double getMoney = input.nextDouble();
		one.deposit(getMoney);
		
		System.out.print("��" + one.getBalance());
		System.out.print("����Ϣ��" + one.getMonthlyInterestRate());
		System.out.print("�������ڣ�" + one.getDateCreated());
	}

}


class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account() {
		//dateCreated = new Date();
	}
	
	public Account (int id,double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public Date getDateCreated() {
        return dateCreated;
    }

	public double getMonthlyInterestRate() {
        double monthlyInterestRate = annualInterestRate / 12;
        return balance * monthlyInterestRate / 100;
    }
	
	public void withDraw(double payMoney){
		balance -= payMoney;
	}
	
	public void deposit(double getMoney){
		balance += getMoney;
	}
}








