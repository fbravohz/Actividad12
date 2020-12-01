import java.io.*;
import java.util.HashMap;

public class AdressBook implements Serializable{
    HashMap<String, String> hashMap = new HashMap<String, String>();


    public Object load() throws IOException, ClassNotFoundException {
        WritterReader writterReader = new WritterReader();
        return writterReader.leerObjeto();
    }
    public void save(Object objeto) throws IOException {
        WritterReader writterReader = new WritterReader();
        writterReader.escribirObjeto(objeto);
    }
    public void list(){
        System.out.println("Imprimiendo lista:");
        for (HashMap.Entry<String, String> entry : hashMap.entrySet()) {
                System.out.println("{"+entry.getKey()+"}"+" : "+"{"+entry.getValue()+"}");
        }
    }
    public void create(String key, String value){
    hashMap.put(key,value);
    }
    public void delete(String key){
    hashMap.remove(key);
    }
}
