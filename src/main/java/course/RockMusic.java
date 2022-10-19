package course;

import org.springframework.stereotype.Component;

@Component("someRockMusic")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Ace of Spades";
    }
}
