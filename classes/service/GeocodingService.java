package classes.service;
import classes.location.Location;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GeocodingService {
    public Location findLocation(String address) {
        HttpClient client = HttpClient.newHttpClient();
        return new Location(address,23,-84);

    }

}
