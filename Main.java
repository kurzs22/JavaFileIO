import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person me = new Person("Stefan", "Kurz", 51);
        File file = new File("person.txt");
        
        System.out.println("\n## Single Person written to a file and read in and printed out:");
        try {
            OutputStream sout = new FileOutputStream(file);
            PersonOutputStream fout = new PersonOutputStream(sout);
            fout.writePerson(me);
            sout.close();
    
            InputStream sin = new FileInputStream(file);
            PersonInputStream fin = new PersonInputStream(sin);
            Person someone = fin.readPerson();
            sin.close();
    
            PersonOutputStream pout = new PersonOutputStream(System.out);
            pout.writePerson(someone);
        } catch (Exception e) {
            System.err.println("Fehler!!! " + e);
        }

        List<Person> fohlenElf = new ArrayList<Person>();
        fohlenElf.add(new Person("Yann", "Sommer", 33));
        fohlenElf.add(new Person("Ramy", "Bensebaini", 27));
        fohlenElf.add(new Person("Jordan", "Beyer", 21));
        fohlenElf.add(new Person("Nico", "Elvedi", 25));
        fohlenElf.add(new Person("Matthias", "Ginter", 28));
        fohlenElf.add(new Person("Stefan", "Lainer", 29));
        fohlenElf.add(new Person("Christoph", "Kramer", 31));
        fohlenElf.add(new Person("Florian", "Neuhaus", 25));
        fohlenElf.add(new Person("Breel", "Embolo", 25));
        fohlenElf.add(new Person("Alassan", "Plea", 29));
        fohlenElf.add(new Person("Marcus", "Thuram", 26));
        file = new File("fohlen.txt");

        System.out.println("\n## Team written to a file and read in and printed out:");
        try {
            OutputStream sout = new FileOutputStream(file);
            TeamOutputStream fout = new TeamOutputStream(sout);
            fout.writeTeam(fohlenElf);
            sout.close();
    
            InputStream sin = new FileInputStream(file);
            TeamInputStream fin = new TeamInputStream(sin);
            List<Person> team = fin.readTeam();
            sin.close();
    
            TeamOutputStream pout = new TeamOutputStream(System.out);
            pout.writeTeam(team);
        } catch (Exception e) {
            System.err.println("Fehler!!! " + e);
        }



    }
}
