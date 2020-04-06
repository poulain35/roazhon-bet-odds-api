package com.roazhonspartiates.roazhonbetoddsapi.odds;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OddsServiceImpl implements OddsService  {

    private static String URL = "https://api.the-odds-api.com";
    private static String API_KEY = "b4007c4a2bff4aa6e7bccec5c40813cf";

    public OddsServiceImpl() {
    }

    // one instance, reuse
    private final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();

    @Override
    public void getOdds() throws Exception {

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                //.uri(URI.create(URL + "/v3/odds/?apiKey=" + API_KEY + "&sport=soccer_france_ligue_one&region=eu&mkt=h2h"))
                .uri((URI.create("https://api.the-odds-api.com/v3/odds/?sport=upcoming&region=uk&mkt=h2h&apiKey=b4007c4a2bff4aa6e7bccec5c40813cf")))
                //.setHeader("User-Agent", "Java 11 HttpClient Bot")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();
        Odds odds = mapper.readValue(response.body(), Odds.class);

        // print status code
        System.out.println(response.statusCode());

        // print response body
        System.out.println(response.body());
    }

}
