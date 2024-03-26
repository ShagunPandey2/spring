package springass5.springass5;

/**
 * Hello world!
 *
 */

import java.util.List;

public class App {
    public static void main(String[] args) {
        service trainerService = new service();
        List<Trainer> trainers = trainerService.getAllTrainersWithSessions();
        for (Trainer trainer : trainers) {
            System.out.println("Trainer: " + trainer.getName());
            System.out.println("Sessions:");
            int c=1;
            for (session session : trainer.getSessions()) {
                System.out.println(c+". " + session.getName());
                c++;
            }
            c=1;
            System.out.println();
        }
    }
}