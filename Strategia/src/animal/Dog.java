package animal;

import interfaces.Animal;
import interfaces.Play;
import interfaces.Sound;

public class Dog extends Animal {

    public Dog(Play play, Sound sound) {
        super(play, sound);
    }

    @Override
    public String getName() {
        return "Doggy";
    }

    @Override
    public String getPhoto() {
        return "https://getwallpapers.com/wallpaper/full/e/8/a/699359-amazing-cute-dog-backgrounds-2560x1600.jpg";
    }
}
