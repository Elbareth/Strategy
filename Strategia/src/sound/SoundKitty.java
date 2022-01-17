package sound;

import interfaces.Sound;

public class SoundKitty implements Sound {
    @Override
    public String makeASound() {
        return "meow";
    }
}
