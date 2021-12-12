package se.iths.multitasker;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        while (true){

            System.out.println("------------------------");

            List<Runnable> taskList = new ArrayList<>();

            taskList.add(new Task1());
            taskList.add(new Task2());
            taskList.add(new Task3());
            taskList.add(new Task4());
            taskList.add(new Task5());
            taskList.add(new Task6());

            MultiTasker multiTasker = new MultiTasker(taskList);

            multiTasker.runAllTask();

            Thread.sleep(1000);
        }
    }

    public static class Task1 implements Runnable{
        @Override
        public void run(){
            System.out.println("Hello from task 1, this is task run number: " + count);
            count++;
        }
    }

    public static class Task2 implements Runnable{
        @Override
        public void run(){
            System.out.println("Hello from task 2, this is task run number: " + count);
            count++;
        }
    }

    public static class Task3 implements Runnable{
        @Override
        public void run(){
            System.out.println("Hello from task 3, this is task run number: " + count);
            count++;
        }

    }

    public static class Task4 implements Runnable{
        @Override
        public void run(){
            System.out.println("Hello from task 4, this is task run number: " + count);
            count++;
        }

    }

    public static class Task5 implements Runnable{
        @Override
        public void run(){
            System.out.println("Hello from task 5, this is task run number: " + count);
            count++;
        }

    }

    public static class Task6 implements Runnable{
        @Override
        public void run(){
            System.out.println("Hello from task 6, this is task run number: " + count);
            count++;
        }

    }
}
