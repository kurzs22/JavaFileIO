import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class PersonInputStream extends BufferedReader {

    public PersonInputStream(InputStream input) {
        super(new InputStreamReader(input));
    }

    public Person readPerson() throws IOException {
        String firstname;
        String lastname;
        String age;

        firstname = readLine();
        if (firstname == null) return null;
        lastname = readLine();
        if (lastname == null) return null;
        age = readLine();
        if (age == null) return null;

        return new Person(firstname, lastname, Integer.parseInt(age));
    }
}
