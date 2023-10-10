package com.robi.repository;
import com.robi.models.ParticipantInterface;
import java.util.ArrayList;

public interface RepositoryInterface {
    public void addParticipant(ParticipantInterface participant);
    public ArrayList<ParticipantInterface> getAllParticipants();
}
