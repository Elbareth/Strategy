package animal;

import interfaces.Animal;
import interfaces.Play;
import interfaces.Sound;

public class Bunny extends Animal {

    public Bunny(Play play, Sound sound) {
        super(play, sound);
    }

    @Override
    public String getName() {
        return "bunny";
    }

    @Override
    public String getPhoto() {
        return "https://3.bp.blogspot.com/-htGCNTwGtAM/T_iEdk_iZRI/AAAAAAAAPQU/nbT-G18eIEY/s1600/cute-bunny-pictures-001.jpg";
    }
}
