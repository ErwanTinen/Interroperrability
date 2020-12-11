
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestSerialisation {

    public static void main(final String[] args) {
        final GsonBuilder builder = new GsonBuilder();
        final Gson gson = builder.create();

        final Room classRoom = new Room(120, 12, 5,2,true,"7Y");

        final String json = gson.toJson(classRoom);
        System.out.println("Resultat = " + json);
    }
}