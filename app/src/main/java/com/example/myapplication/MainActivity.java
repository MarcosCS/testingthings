 package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.JsonReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


/*
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                // Create URL
                URL placeHolderEndpoint = null;
                try {
                    placeHolderEndpoint = new URL("https://jsonplaceholder.typicode.com/todos/1/");
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                // Create connection
                try {
                    HttpsURLConnection myConnection =
                            (HttpsURLConnection) placeHolderEndpoint.openConnection();
                    InputStream responseBody = myConnection.getInputStream();
                    InputStreamReader responseBodyReader = new InputStreamReader(responseBody, "UTF-8");
                    JsonReader jsonReader = new JsonReader(responseBodyReader);
                    System.out.println(jsonReader.toString());

                } catch (IOException e) {
                    e.printStackTrace();
                    return;
                }












            }
        });*/




    }
}
