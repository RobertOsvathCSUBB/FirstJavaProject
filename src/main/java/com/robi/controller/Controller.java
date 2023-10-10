package com.robi.controller;
import com.robi.models.ParticipantInterface;
import com.robi.repository.RepositoryInterface;
import java.util.ArrayList;

public final class Controller {
    private RepositoryInterface repository;

    public Controller(RepositoryInterface repository) {
        this.repository = repository;
    }

    public void addParticipant(ParticipantInterface participant) {
        this.repository.addParticipant(participant);
    }

    public ArrayList<ParticipantInterface> getParticipantsWhoPresentedWork() {
        ArrayList<ParticipantInterface> participantsWhoPresentedWork = new ArrayList<ParticipantInterface>();
        for (ParticipantInterface participant : this.repository.getAllParticipants()) {
            if (participant.checkIfTheyPresentedWork()) {
                participantsWhoPresentedWork.add(participant);
            }
        }
        return participantsWhoPresentedWork;
    }
}
