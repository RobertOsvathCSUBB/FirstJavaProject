package com.robi;
import com.robi.repository.RepositoryInterface;
import com.robi.models.ParticipantInterface;
import com.robi.models.ParticipantClass;
import com.robi.models.Student;
import com.robi.models.Professor;
import com.robi.models.ITSpecialist;
import com.robi.repository.MemoryRepository;
import com.robi.controller.Controller;
import com.robi.view.View;

public class Main {
    public static void main(String[] args) {
        RepositoryInterface repository = new MemoryRepository();
        Controller controller = new Controller(repository);
        View view = new View(controller);

        ParticipantInterface student = new Student("John", 20, true);
        controller.addParticipant(student);
        ParticipantInterface professor = new Professor("Jane", 30, false);
        controller.addParticipant(professor);
        ParticipantInterface itSpecialist = new ITSpecialist("Jack", 40, true);
        controller.addParticipant(itSpecialist);

        view.run();        
    }
}