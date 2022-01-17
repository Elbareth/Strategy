package play;

import interfaces.Play;

public class PlatWithDoggy implements Play {
    @Override
    public String playWithMe() {
        return "Get ball and throw it";
    }
}
