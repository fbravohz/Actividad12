import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WritterReader {

    public void escribirObjeto(Object objeto) throws IOException {
        FileOutputStream f = new FileOutputStream(new File("myFile.txt"));
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(objeto);
        o.flush();
        o.close();
        f.close();
    }

    public Object leerObjeto() throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream(new File("myFile.txt"));
        ObjectInputStream oi = new ObjectInputStream(fi);
        Object objeto = (Object) oi.readObject();
        oi.close();
        fi.close();
        return objeto;
    }
}

