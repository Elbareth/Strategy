package animal;

import interfaces.Animal;
import interfaces.Play;
import interfaces.Sound;

public class Cat extends Animal {
    public Cat(Play play, Sound sound) {
        super(play, sound);
    }

    @Override
    public String getName() {
        return "Kitty";
    }

    @Override
    public String getPhoto() {
        return "https://scoopempire.com/wp-content/uploads/2014/09/cutestkittenever.jpg";
    }
}
