package design.pattern.structural.facade.impl;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private SoundSystem soundSystem;
    private Projector projector;
    private Lights lights;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, SoundSystem soundSystem, Projector projector, Lights lights) {
        this.dvdPlayer = dvdPlayer;
        this.soundSystem = soundSystem;
        this.projector = projector;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        projector.setInput("DVD");
        soundSystem.on();
        soundSystem.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down home theater...");
        lights.on();
        projector.off();
        soundSystem.off();
        dvdPlayer.off();
    }
}
