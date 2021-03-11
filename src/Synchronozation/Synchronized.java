package Synchronozation;

class Table1{
	synchronized void printTable(int n)
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(n*i);
		}
		try
		{
			Thread.sleep(400);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}

class MyThread extends Thread
{
	Table t;
	MyThread(Table t)
	{
	this.t=t;
    }
public void run()
{
	t.printTable(4);
}
}

class MyThread0 extends Thread
{
	Table t;
	MyThread0(Table t){
		this.t=t;
	}
	public void run()
	{
		t.printTable(9);
	}
}

public class Synchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Table obj=new Table();
		MyThread t1=new MyThread(obj);
		MyThread0 t2=new MyThread0(obj);
		t1.start();
		t2.start();

	}

}
