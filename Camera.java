interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {

    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    public void playMusic() {
        System.out.println("Playing music...");
    }

    void display() {
        System.out.println("Smartphone supports:");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        Smartphone phone = new Smartphone();

        phone.display();
        phone.takePhoto();
        phone.playMusic();
    }
}