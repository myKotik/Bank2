package com.example.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Дата 
        data = findViewById(R.id.data);
        Calendar c = Calendar.getInstance();
        SimpleDateFormat simpleDataFormat = new SimpleDateFormat("dd-MM-yy");
       String d = simpleDataFormat.format(c.getTime());
//        data.setText(d);


    }
}