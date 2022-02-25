package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] countries = {"Nepal", "India", "China", "USA"};

    //strings.xml ma vako file activity_main.xml ma lani ani main activity.java code ma import garni
    String string = getString(R.string.semester);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Spinner
        Spinner spin  = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                countries);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);


        //ListView
//        ListView listview = findViewById(R.id.list1);
//        String items [] = {
//                "Pizza",
//                "Burger",
//                "Momo",
//                "Rice"
//        };
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
//                R.layout.support_simple_spinner_dropdown_item,
//                items);
//
//        listview.setAdapter(arrayAdapter);
//        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view , int i, long l){
//                String val  = arrayAdapter.getItem(i);
//                Toast.makeText(getApplicationContext(), val, Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}