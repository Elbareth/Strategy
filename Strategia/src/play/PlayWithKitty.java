package play;

import interfaces.Play;

public class PlayWithKitty implements Play {
    @Override
    public String playWithMe() {
        return "Play with mouse and feather";
    }
}
