package course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" + "\n" +
                "id=" + id + "\n" +
                "musicPlayer=" + musicPlayer + "\n" +
                "music = " + "\n" + musicPlayer.playMusic() + "\n" +
                '}';
    }
}
