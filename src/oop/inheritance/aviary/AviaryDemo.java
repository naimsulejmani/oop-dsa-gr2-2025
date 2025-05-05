package oop.inheritance.aviary;

public class AviaryDemo {
    public static void main(String[] args) {
        Goose goose1 = new Goose();
        System.out.println(goose1);

        TalkingParrot talkingParrot = new TalkingParrot("Barca", "red-blue",
                new String[]{"Real Madrid", "Loose", "Ronaldo", "LoserMessi", "spo spo di"});

        System.out.println(talkingParrot.talk());
        Owl owl = new Owl("Real Madrid", "white");
        System.out.println(owl.toString());

        //FEmija mundet me u ruajt te prindi
        Parrot parrot = new TalkingParrot("Parrot1", "Green", new String[]{"a", "b", "c"});
        FlyingBird flyingBird1 = parrot;
        Bird bird = parrot;
        Object object = parrot;


    }
}










