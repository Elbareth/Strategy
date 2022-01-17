package sound;

import interfaces.Sound;

public class SoundBase implements Sound {
    @Override
    public String makeASound() {
        return "Nothing";
    }
}
