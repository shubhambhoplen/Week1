package Day2;

class demo{
    synchronized void maint(int num){
        try {
            wait();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Main thread executing======");
        for(int i=1;i<num;i++) {
            int fact=1;
            for(int j=1;j<=i;j++) {
                fact=fact*j;
            }
            System.out.println("Factorial of "+i+" is "+fact);
        }
    }

    synchronized void childt(int num) {
        System.out.println("Child thread executing======");
        int fact=1;
        for(int i=1;i<=num;i++) {
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
        notify();
    }
}
 
public class Assignment4{
 
    public static void main(String[] args) throws  Exception{
        // TODO Auto-generated method stub
        int a=10;
        demo d = new demo();
        Thread maint= new Thread(new Runnable() {public void run() {d.maint(a);}});

        Thread childt= new Thread(new Runnable() {public void run() {d.childt(a);}});

        maint.start();
        childt.start();

        }
 
    }