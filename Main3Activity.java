package com.example.admin.ayurveda;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    DBHelper dbHelper;
    SQLiteDatabase db;
    ListView lv;
    TextView tv;
    final TextView[] myt=new TextView[10];
    ArrayList<String> list = new ArrayList<String>();
    Context mcontext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        lv=(ListView)findViewById(R.id.lv2);
        tv=(TextView)findViewById(R.id.tv);
        Toast.makeText(getApplicationContext(),"haaiii",Toast.LENGTH_LONG).show();


    }

}
