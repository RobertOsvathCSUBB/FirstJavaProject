package com.robi.view;
import com.robi.controller.Controller;
import com.robi.models.ParticipantInterface;

public class View {
    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void run() {
        for (ParticipantInterface participant : this.controller.getParticipantsWhoPresentedWork()) {
            System.out.println(participant.toString());
        }
    }
}
