import java.io.OutputStream;
import java.io.PrintWriter;

public class PersonOutputStream extends PrintWriter {

    public PersonOutputStream(OutputStream output) {
        super(output);
    }
    
    public void writePerson(Person p) {
        String firstname = p.getFirstname();
        String lastname = p.getLastname();
        int age = p.getAge();

        write(firstname);
        write('\n');
        write(lastname);
        write('\n');
        write(Integer.toString(age));
        write('\n');
        flush();
    }
}
