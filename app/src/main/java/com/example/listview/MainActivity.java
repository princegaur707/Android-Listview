package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private String [] months_list={"Jan","Feb","Mar","Apr","May","June"};
    private ListView monthsListView;
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monthsListView=(ListView) findViewById(R.id.List);
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,months_list);
        monthsListView.setAdapter(arrayAdapter);

        monthsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition=position;
                String itemValue=(String) monthsListView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),itemValue+itemPosition,Toast.LENGTH_LONG).show();
            }
        });




    }
}