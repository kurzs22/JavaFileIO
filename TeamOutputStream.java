import java.io.OutputStream;
import java.util.List;

public class TeamOutputStream extends PersonOutputStream {

    TeamOutputStream(OutputStream output) {
        super(output);
    }

    public void writeTeam(List<Person> team) {
        for (Person p : team) {
            writePerson(p);
        }
    }
}
