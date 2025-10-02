package deadlock;

public class MainDeadlock {
    private static Account account1 = new Account();
    private static Account account2 = new Account();

    public static void main(String[] args) {
        Thread t1 = new Thread(()-> {
           synchronized (account1) {
               System.out.println("Thread 1 locked acc1");
               try {
                   Thread.sleep(100);
               } catch (InterruptedException e) {}
               synchronized (account2) {
                   System.out.println("Thread 2 locked acc2");
               }
           }
        });


        Thread t2 = new Thread(()-> {
            synchronized (account2) {
                System.out.println("Thread 2 locked acc2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {}
                synchronized (account1) {
                    System.out.println("Thread 1 locked acc1");
                }
            }

        });

        t1.start();
        t2.start();


    }
}
