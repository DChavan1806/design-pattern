package design.pattern.structural.facade.impl;

public class HomeTheaterTest {
    public static void main(String[] args) {
        // Create subsystems
        DVDPlayer dvdPlayer = new DVDPlayer();
        SoundSystem soundSystem = new SoundSystem();
        Projector projector = new Projector();
        Lights lights = new Lights();

        // Create the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, soundSystem, projector, lights);

        // Use the simplified interface
        homeTheater.watchMovie("Inception");
        System.out.println("\n");
        homeTheater.endMovie();
    }
}
