package interfaces;

public abstract class Animal {
    private Play play;
    private Sound sound;

    public Animal(Play play, Sound sound) {
        this.play = play;
        this.sound = sound;
    }

    public abstract String getName();
    public abstract String getPhoto();
    public String getPlay(){
        return play.playWithMe();
    }
    public String getSound(){
        return sound.makeASound();
    }
}
