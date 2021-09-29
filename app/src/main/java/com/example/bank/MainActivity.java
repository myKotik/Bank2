package com.example.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    //private Document doc;
    TextView data;

    //private Thread secThread;
    //private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Дата 
        data = findViewById(R.id.data);
        Calendar c = Calendar.getInstance();
        SimpleDateFormat simpleDataFormat = new SimpleDateFormat("dd-MM-yy");
       String d = simpleDataFormat.format(c.getTime());
//        data.setText(d);

       // init();

    }
    /*private void init(){
        runnable = new Runnable() {
            @Override
            public void run() {
                getWeb();
            }
        };
        secThread = new Thread(runnable);
        secThread.start();
    }*/

    /*private void getWeb(){
        try {
            doc = Jsoup.connect("www.cbr.ru").get();
            Log.d("MyLog", "Title" + doc.text());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}