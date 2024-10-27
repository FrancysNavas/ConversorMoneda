import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversor {

    public Conversor consultaConversor(String moneda1, String moneda2, double montoACambiar){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/be713e0c7e9e40bbe2bba9b5/pair/"+moneda1+"/"+moneda2+"/"+montoACambiar);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversor.class);

        } catch (Exception e) {
            throw new RuntimeException("No encontré esa moneda " + e);
        }
    }
}

