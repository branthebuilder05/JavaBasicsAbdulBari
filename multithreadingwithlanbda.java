import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Runnable r1= ()->{
	    
	    for(int i=0;i<1000;i++)
    System.out.println("I am running");
};
Runnable r2= ()->{
	    for(int i=0;i<1000;i++)
    System.out.println("I am walking");
};



Thread t1=new Thread(r1);

Thread t2=new Thread(r2);
t1.start();
t2.start();
    
	}
}
