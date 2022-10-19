package course;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music{
    @Override
    public String getSong() {
        return "Generics_Rapsody";
    }
}
