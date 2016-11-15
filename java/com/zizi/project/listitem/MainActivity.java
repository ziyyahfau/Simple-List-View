package com.zizi.project.listitem;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    // Array of strings (Hard coding of all item)
    String[] snackDelicious = {"Cheese","Chocho","Chrunchy","Blueberry bar",
            "Wistos Milk","Silver Queen","Candy Yuppi","Lays"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listwiew, snackDelicious);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
    }
}

