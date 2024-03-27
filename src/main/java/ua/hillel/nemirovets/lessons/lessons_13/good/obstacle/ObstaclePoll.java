package ua.hillel.nemirovets.lessons.lessons_13.good.obstacle;

import ua.hillel.nemirovets.lessons.lessons_13.bad.ParticipantCat;
import ua.hillel.nemirovets.lessons.lessons_13.bad.ParticipantFrog;
import ua.hillel.nemirovets.lessons.lessons_13.good.participants.Participant;

public class ObstaclePoll extends Obstacle {

    @Override
    public void start(Participant participant) {
        System.out.println(participant.getName() + " start swim");
    }

}