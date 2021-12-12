package se.iths.multitasker;

import java.util.ArrayList;
import java.util.List;

public record MultiTasker(List<Runnable> tasks) {

    public void runAllTask() {
        List<Thread> threads = new ArrayList<>(tasks.size());

        for (Runnable task : tasks) {
            Thread thread = new Thread(task);
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.start();
        }
    }
}
