package course;

import org.springframework.stereotype.Component;

@Component("someClassicMusic")
public class ClassicMusic implements Music{
    private ClassicMusic(){}
    @Override
    public String getSong() {
        return "Generics_Rapsody";
    }
}
