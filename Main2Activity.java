package com.example.admin.ayurveda;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;

import static android.R.id.list;

public class Main2Activity extends AppCompatActivity {
    ListView lv;
    String[] titles = {"തലവേദന | Headache",
            "ഉറക്കമില്ലായ്മ | Insomnia/Sleeplessness",
            "ഓര്മ്മക്കുറവ് |  To Improve Memory/Brain Power",
            "കഷണ്ടി | Bald Head",
            "ചെന്നിക്കുത്ത് | Sinusitis",
            "കൊടിഞ്ഞി | Migraine",
            "അകാലനര | Grey Hair",
            "താരന് | Dandruff",
            "അര്ബുദം | Cancer",
            "കണ്കുരു | Eye Pimple"};
    //DBHelper dbhelper;
    //SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lv = (ListView) findViewById(R.id.listview);
        ArrayAdapter ad=new ArrayAdapter(this,android.R.layout.simple_list_item_1,titles);
        lv.setAdapter(ad);
        // adddata();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent in=new Intent(Main2Activity.this,Main4Activity.class);
                in.putExtra("id",position);
                startActivity(in);

            }
        });
    }
   public void adddata()
    {
        DBHelper dbhelper = new DBHelper(this);
        SQLiteDatabase db = dbhelper.getWritableDatabase();
        ContentValues values=new ContentValues();
//head ache
        values.put(DBHelper.COL1,"1");
        values.put(DBHelper.COL2,"നെല്ലിയുടെതൊലിപാലില് നല്ലവണ്ണംഅരച്ചുനെറ്റിയില് തേക്കുക.");
        db.insert(dbhelper.TBNAME1,null,values);
        values.put(DBHelper.COL1,"2");
        values.put(DBHelper.COL2,"തെങ്ങിന്റെമച്ചിങ്ങയുടെനടുഭാഗംതുരന്നെടുത്ത്കുരുമുളകുംചേര്ത്ത്നെറ്റിയില് ഇടുക");
        db.insert(dbhelper.TBNAME1,null,values);
        values.put(DBHelper.COL1,"3");
        values.put(DBHelper.COL2,"സൂര്യകാന്തിയുടെവിത്ത്അഞ്ചെണ്ണംചവച്ചരച്ചുതിന്നുക");
        db.insert(dbhelper.TBNAME1,null,values);
        values.put(DBHelper.COL1,"4");
        values.put(DBHelper.COL2,"കോഴിമുട്ടയുടെവെള്ളക്കരുപച്ചജാതിക്കാചേര്ത്ത്അരച്ച്നെറ്റിയില് ഇടുക");
        db.insert(dbhelper.TBNAME1,null,values);
        values.put(DBHelper.COL1,"5");
        values.put(DBHelper.COL2,"മഞ്ഞകോളാമ്പിപൂവെടുത്ത്അരച്ച്നെറ്റിയില് ഇടുക..");
        Toast.makeText(this,"added to Headache successfully",Toast.LENGTH_LONG).show();

//inserting values to insomnia
        values.put(DBHelper.COL1,"1");
        values.put(DBHelper.COL2,"രാത്രിയില് വൈകി ടി.വി, കമ്പ്യൂട്ടര്, ഫോണ് ഉപയോഗംഒഴിവാക്കുക");
        db.insert(dbhelper.TBNAME2,null,values);
        values.put(DBHelper.COL1,"2");
        values.put(DBHelper.COL2,"രാത്രിയില് എരുമ/ആട്ടിന്പാലുംപഴവുംകഴിക്കുക");
        db.insert(dbhelper.TBNAME2,null,values);
        values.put(DBHelper.COL1,"3");
        values.put(DBHelper.COL2,"അയഞ്ഞവസ്ത്രങ്ങള് ഉറങ്ങുമ്പോള് ഉപയോഗിക്കുക");
        db.insert(dbhelper.TBNAME2,null,values);
        values.put(DBHelper.COL1,"4");
        values.put(DBHelper.COL2,"കിടക്കാന്നേരംചെറുചൂടുള്ളവെള്ളത്തില് രണ്ടുസ്പൂണ് തേനൊഴിച്ചുകുടിക്കുക");
        db.insert(dbhelper.TBNAME2,null,values);
        values.put(DBHelper.COL1,"5");
        values.put(DBHelper.COL2,"പാലില് ജാതിക്കഅരച്ചുചേര്ത്ത്കഴിക്കുക.");
        db.insert(dbhelper.TBNAME2,null,values);
        Toast.makeText(this,"added to insomnia successfully",Toast.LENGTH_LONG).show();

//brain power
        values.put(DBHelper.COL1,"1");
        values.put(DBHelper.COL2,"കണക്കുകള് കൂട്ടാന് കാല്ക്കുലേറ്റര് കഴിവതുംഒഴിവാക്കിമനക്കണക്ക്കൂട്ടുക.");
        db.insert(dbhelper.TBNAME3,null,values);
        values.put(DBHelper.COL1,"2");
        values.put(DBHelper.COL2,"ഇരട്ടിമധുരംതേനില് ചാലിച്ചുകഴിക്കുക.");
        db.insert(dbhelper.TBNAME3,null,values);
        values.put(DBHelper.COL1,"3");
        values.put(DBHelper.COL2,"ബ്രഹ്മിപൊടിച്ചത്തേനില് ചേര്ത്ത്കഴിക്കുക..");
        db.insert(dbhelper.TBNAME3,null,values);
        values.put(DBHelper.COL1,"4");
        values.put(DBHelper.COL2,"കേരളബ്രഹ്മിയുടെ (കുടകന്) ഇലകല്ലില് അരച്ചതുതേനുംകൂട്ടികഴിക്കാം. ഇലക്കറിയായിട്ടുംഉപയോഗിക്കാം..");
        db.insert(dbhelper.TBNAME3,null,values);
        values.put(DBHelper.COL1,"5");
        values.put(DBHelper.COL2,"നെല്ലിക്കയുംശര്ക്കരയുംതേനുംഒരുമിച്ച്അരഗ്ലാസ്എന്നുംരാവിലെകഴിക്കുക ");
        db.insert(dbhelper.TBNAME3,null,values);
        Toast.makeText(this,"added to Memory successfully",Toast.LENGTH_LONG).show();


        //inserting values to bald head
        values.put(DBHelper.COL1,"1");
        values.put(DBHelper.COL2,"ചേര്ക്കുരുവുംഎള്ളിന്പൂവുംചന്ദനവുംഅരച്ചത് കഷണ്ടിയുള്ളഭാഗത്ത് തേക്കുക.");
        db.insert(dbhelper.TBNAME4,null,values);
        values.put(DBHelper.COL1,"2");
        values.put(DBHelper.COL2,"കരടിനെയ്യില് ആനക്കൊമ്പ്അരച്ച്കഷണ്ടിയില് പുരട്ടുക");
        db.insert(dbhelper.TBNAME4,null,values);
        values.put(DBHelper.COL1,"3");
        values.put(DBHelper.COL2,"എല്ലാദിവസവുംനെല്ലിക്കയുടെനീരുംതൈരുംഒരുമിച്ചുകഴിക്കുക.");
        db.insert(dbhelper.TBNAME4,null,values);
        values.put(DBHelper.COL1,"4");
        values.put(DBHelper.COL2,"കിഴുകാനെല്ലിഅരച്ചതിനുശേഷംതലയോട്ടിയില് തേച്ചുപിടിപ്പിക്കുക. കുറച്ചുസമയംകഴിഞ്ഞുകുളിക്കുക.");
        db.insert(dbhelper.TBNAME4,null,values);
        values.put(DBHelper.COL1,"5");
        values.put(DBHelper.COL2,"നിത്യവുംവെളിച്ചെണ്ണതലയില് തിരുമ്മിയശേഷംകുളിക്കുക");
        db.insert(dbhelper.TBNAME4,null,values);
        Toast.makeText(this,"added to bald_head successfully",Toast.LENGTH_LONG).show();


//sinasitis

        values.put(DBHelper.COL1,"1");
        values.put(DBHelper.COL2,"രാത്രിയില് വൈകിടി.വി, കമ്പ്യൂട്ടര്, ഫോണ് ഉപയോഗംഒഴിവാക്കുക");
        db.insert(dbhelper.TBNAME5,null,values);
        values.put(DBHelper.COL1,"2");
        values.put(DBHelper.COL2,"രാത്രിയില് എരുമ/ആട്ടിന്പാലുംപഴവുംകഴിക്കുക");
        db.insert(dbhelper.TBNAME5,null,values);
        values.put(DBHelper.COL1,"3");
        values.put(DBHelper.COL2,"അയഞ്ഞവസ്ത്രങ്ങള് ഉറങ്ങുമ്പോള് ഉപയോഗിക്കുക");
        db.insert(dbhelper.TBNAME5,null,values);
        values.put(DBHelper.COL1,"4");
        values.put(DBHelper.COL2,"കിടക്കാന്നേരംചെറുചൂടുള്ളവെള്ളത്തില് രണ്ടുസ്പൂണ് തേനൊഴിച്ചുകുടിക്കുക");
        db.insert(dbhelper.TBNAME5,null,values);
        values.put(DBHelper.COL1,"5");
        values.put(DBHelper.COL2,"പാലില് ജാതിക്കഅരച്ചുചേര്ത്ത്കഴിക്കുക.");
        db.insert(dbhelper.TBNAME5,null,values);
        Toast.makeText(this,"added to Sinusitis successfully",Toast.LENGTH_LONG).show();

    }


}

