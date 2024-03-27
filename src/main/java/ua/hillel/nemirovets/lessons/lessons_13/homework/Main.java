package ua.hillel.nemirovets.lessons.lessons_13.homework;

public class Main {
    public static void main(String[] args) {

        PopMusic popBand = new PopMusic();
        RockMusic rockBand = new RockMusic();
        ClassicMusic classicOrchestra = new ClassicMusic();


        for (MusicStyles band : new MusicStyles[]{popBand, rockBand, classicOrchestra}) {
            band.playMusic();
        }
    }
}