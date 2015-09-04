package com.example.ryanmonica;

public class RyanAndMonicaJob implements Runnable{
	
	private BankAccount account = new BankAccount();
	
	public static void main(String[] args) {
		RyanAndMonicaJob theJob = new RyanAndMonicaJob();
		Thread one = new Thread(theJob);
		Thread two = new Thread(theJob);
		
		//define names
		one.setName("Ryan");
		two.setName("Monica");
		
		one.start();
		two.start();
	}

	@Override
	public void run() {
		for(int x=0;x<10;x++)
		{
			makeWithdrawl(10);
			if(account.getBalance()<0){
				System.out.println("Overwithdrawn!!");
			}
		}
		
	}

	private synchronized void makeWithdrawl(int amount) {
		if(account.getBalance()>= amount){
			System.out.println(Thread.currentThread().getName() + "is about to withdraw");
			try{
			System.out.println(Thread.currentThread().getName() + "is going to sleep");
			Thread.sleep(500);
			}catch(InterruptedException e){ e.printStackTrace();}
			
			System.out.println(Thread.currentThread().getName() + "woke up");
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + "completed the withdrawal");
		}
		else{
			System.out.println("Sorry, not enough for "+Thread.currentThread().getName()	);
		}
	}
}