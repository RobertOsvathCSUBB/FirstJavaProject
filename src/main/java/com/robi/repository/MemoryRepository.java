package com.robi.repository;
import com.robi.models.ParticipantInterface;
import java.util.ArrayList;

public class MemoryRepository extends RepositoryClass implements RepositoryInterface {
    public MemoryRepository() {
        super();
    }

    public void addParticipant(ParticipantInterface participant) {
        this.participants.add(participant);
    }

    public ArrayList<ParticipantInterface> getAllParticipants() {
        return this.participants;
    }
}
