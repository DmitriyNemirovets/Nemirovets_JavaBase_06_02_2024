package ua.hillel.nemirovets.lessons.lessons_13.bad;

public class Main {
    public static void main(String[] args) {
        ObstacleWall obstacleWall = new ObstacleWall();
        ObstaclePoll obstaclePoll = new ObstaclePoll();

        ParticipantCat participantCat = new ParticipantCat("Cat1");
//        ParticipantDog participantDog = new ParticipantDog("Dog1");
        ParticipantFrog participantFrog = new ParticipantFrog("Frog1");

        obstacleWall.start(participantCat);
//        obstacleWall.start(participantDog);
        obstacleWall.start(participantFrog);

        obstaclePoll.start(participantCat);
//        obstaclePoll.start(participantDog);
        obstaclePoll.start(participantFrog);
    }

}
