package sound;

import interfaces.Sound;

public class SoundDoggy implements Sound {
    @Override
    public String makeASound() {
        return "wow";
    }
}
