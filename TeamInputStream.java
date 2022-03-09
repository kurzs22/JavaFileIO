import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;

public class TeamInputStream extends PersonInputStream {
    
    public TeamInputStream(InputStream input) {
        super(input);
    }

    public List<Person> readTeam() throws IOException {
        List<Person> team = new ArrayList<Person>();
        Person p;
        
        do {
            p = readPerson();
            if (p != null) team.add(p);
        } while (p != null);

        return team;
    }
}
