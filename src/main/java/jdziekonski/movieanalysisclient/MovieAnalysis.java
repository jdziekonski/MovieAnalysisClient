package jdziekonski.movieanalysisclient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class MovieAnalysis {
    
    public Movie parseMovieJson(String movieJson) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(movieJson, Movie.class);
    }
    
    public String getMovieJson(String serviceUrl, String movieId) throws IOException
    {
       
        String url = serviceUrl + "/" + String.valueOf(movieId);
       
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
       
        HttpResponse response = client.execute(request);
    
        System.out.println("Response Code: "+ response.getStatusLine().getStatusCode());
        
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
                result.append(line);
        }
        
        return result.toString();
    } 
}
