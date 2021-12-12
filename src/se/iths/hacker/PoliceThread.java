package se.iths.hacker;

public class PoliceThread  extends Thread{

    @Override
    public void run(){
        for (int i = 10; i > 0; i--){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }

            System.out.println(i + " seconds for the arrival of the police...");
        }
        System.out.println("The game is up, hacker!");
        System.exit(0);
    }
}
