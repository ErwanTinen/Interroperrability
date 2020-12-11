import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestDeserialisation {

    public static void main(final String[] args) {
        final Gson gson = new GsonBuilder().create();

        final String json = "{\"color\":\"red\",\"nb_etoiles\":148,\"nb_lunes\":2}";
        final Ciel test = gson.fromJson(json, Ciel.class);
        System.out.println(test);
    }
}