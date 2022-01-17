import animal.Bunny;
import animal.Cat;
import animal.Dog;
import interfaces.Play;
import interfaces.Sound;
import play.PlatWithDoggy;
import play.PlayBase;
import play.PlayWithKitty;
import sound.SoundBase;
import sound.SoundDoggy;
import sound.SoundKitty;

public class main {

    public static void main(String args[]){
        Play platWithDoggy = new PlatWithDoggy();
        Sound soundDoggy = new SoundDoggy();
        Dog dog = new Dog(platWithDoggy,soundDoggy);
        System.out.println(dog.getName());
        System.out.println(dog.getPhoto());
        System.out.println(dog.getPlay());
        System.out.println(dog.getSound());
        System.out.println("-------------------------------------------");
        //---------------------------------------------------------------
        Play playWithKitty = new PlayWithKitty();
        Sound soundKitty = new SoundKitty();
        Cat cat = new Cat(playWithKitty,soundKitty);
        System.out.println(cat.getName());
        System.out.println(cat.getPhoto());
        System.out.println(cat.getPlay());
        System.out.println(cat.getSound());
        System.out.println("-------------------------------------------");
        //---------------------------------------------------------------
        Play platWithBunny = new PlayBase();
        Sound soundBunny = new SoundBase();
        Bunny bunny = new Bunny(platWithBunny,soundBunny);
        System.out.println(bunny.getName());
        System.out.println(bunny.getPhoto());
        System.out.println(bunny.getPlay());
        System.out.println(bunny.getSound());
        System.out.println("-------------------------------------------");
        //---------------------------------------------------------------
    }
}
