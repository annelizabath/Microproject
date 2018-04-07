package com.example.admin.ayurveda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    ListView l;
    ImageView iv;
    String[] headache={"തലവേദന |  Headache","",
            "1.നെല്ലിയുടെതൊലിപാലില് നല്ലവണ്ണം അരച്ചുനെറ്റിയില് തേക്കുക",
            "2.തെങ്ങിന്റെമച്ചിങ്ങയുടെനടുഭാഗംതുരന്നെടുത്ത്കുരുമുളകുംചേര്ത്ത്നെറ്റിയില് ഇടുക",
            "3.സൂര്യകാന്തിയുടെവിത്ത്അഞ്ചെണ്ണംചവച്ചരച്ചുതിന്നുക",
            "4.കോഴിമുട്ടയുടെവെള്ളക്കരുപച്ചജാതിക്കാചേര്ത്ത്അരച്ച്നെറ്റിയില് ഇടുക.",
            "5.മഞ്ഞകോളാമ്പിപൂവെടുത്ത്അരച്ച്നെറ്റിയില് ഇടുക.",
            "6.ജാതിക്കയോവെളുത്തുള്ളിയോപച്ചവെള്ളത്തില് അരച്ചിടുക"},

    insomnia={"ഉറക്കമില്ലായ്മ | Insomnia/Sleeplessness","",
            "1.രാത്രിയില് വൈകി ടി.വി, കമ്പ്യൂട്ടര്, ഫോണ് ഉപയോഗംഒഴിവാക്കുക.",
            "2.രാത്രിയില് എരുമ/ആട്ടിന്പാലുംപഴവുംകഴിക്കുക.",
            "3.അയഞ്ഞവസ്ത്രങ്ങള് ഉറങ്ങുമ്പോള് ഉപയോഗിക്കുക",
            "4.കിടക്കാന്നേരംചെറുചൂടുള്ളവെള്ളത്തില് രണ്ടുസ്പൂണ് തേനൊഴിച്ചുകുടിക്കുക.",
            "5.tപാലില് ജാതിക്കഅരച്ചുചേര്ത്ത്കഴിക്കുക.",
            "6.തണുത്തവെള്ളത്തില് കുളിച്ചതിനുശേഷംഉറങ്ങാന് പോകുക.",
            "7.നല്ലഇരുട്ടുള്ളമുറിയില് ഉറങ്ങുക."},

    memory={"ഓര്മ്മക്കുറവ് | Memory/Brain Power","",
            "1.കണക്കുകള് കൂട്ടാന് കാല്ക്കുലേറ്റര് കഴിവതുംഒഴിവാക്കിമനക്കണക്ക്കൂട്ടുക.",
            "2.ഇരട്ടിമധുരംതേനില് ചാലിച്ചുകഴിക്കുക.",
            "3.ബ്രഹ്മിപൊടിച്ചത്തേനില് ചേര്ത്ത്കഴിക്കുക.",
            "4.ബ്രഹ്മിപാലിന്റെകൂടെകഴിക്കുക.",
            "5.കേരളബ്രഹ്മിയുടെ (കുടകന്) ഇലകല്ലില് അരച്ചതുതേനുംകൂട്ടികഴിക്കാം. ഇലക്കറിയായിട്ടുംഉപയോഗിക്കാം."},
            bald={"കഷണ്ടി | Bald Head","",
                    "1.ചേര്ക്കുരുവുംഎള്ളിന്പൂവുംചന്ദനവുംഅരച്ചത് കഷണ്ടിയുള്ളഭാഗത്ത് തേക്കുക.",
                    "2.കരടിനെയ്യില് ആനക്കൊമ്പ്അരച്ച്കഷണ്ടിയില് പുരട്ടുക.",
                    "3.എല്ലാദിവസവുംനെല്ലിക്കയുടെനീരുംതൈരുംഒരുമിച്ചുകഴിക്കുക",
                    "4.കിഴുകാനെല്ലിഅരച്ചതിനുശേഷംതലയോട്ടിയില് തേച്ചുപിടിപ്പിക്കുക. കുറച്ചുസമയംകഴിഞ്ഞുകുളിക്കുക.",
                    "5.നിത്യവുംവെളിച്ചെണ്ണതലയില് തിരുമ്മിയശേഷംകുളിക്കുക"},

    sinusitis={"ചെന്നിക്കുത്ത് (സൈനുസൈറ്റിസ്) | Sinusitis","",
            "1.കഞ്ഞുണ്ണിനീരുകൊണ്ട്നസ്യംചെയ്യുക.",
            "2.നാല്പാമരത്തോല് നെറ്റിയില് അരച്ചുതേക്കുക.",
            "3.ചുവന്നുള്ളിവെള്ളംചേര്ത്ത്അരച്ചെടുത്തത്അരിച്ചെടുത്ത്തലവേദനയില്ലാത്തഭാഗത്തെമൂക്കില് ഒഴിക്കുക.",
            "4.ഗോതമ്പുകഞ്ഞിയില് നെയ്യ്ചേര്ത്തുരാവിലെവെറുംവയറ്റില് കഴിക്കണം.",
            "5.മുന്തിരിപ്പഴവുംജീരകവുംകല്ലില് അരച്ച്പശുവിന്പാലില് കുടിക്കുക.",
            "6.കുങ്കുമപൂവ്മുലപ്പാലില് അരിച്ചെടുത്ത്നസ്യം.",
            "7.വ്യോഷാദിവടകംതേന് ചേര്ത്ത്രാത്രികഴിക്കുക."},

    migrane={"കൊടിഞ്ഞി (മൈഗ്രേന്) | Migraine","",
            "1.കുറച്ച് ഉഴുന്നുപരിപ്പ് അരച്ചു പാലില് ചേര്ത്ത് ഉറങ്ങാന്നേരം കുടിക്കുക.",
            "2.തൊട്ടാവാടി സമൂലം അരച്ചു നെറ്റിയില് പുരട്ടുക",
            "3.കാട്ടുകടുക് അരച്ച് നല്ലെണ്ണയില് കാച്ചിയെടുത്ത് നെറ്റിയിലും മൂക്കിലും തേക്കുക",
            "4.മഞ്ഞള് കത്തിച്ചു പുക ദിവസം രണ്ടുനേരം വലിക്കുക","ജീരകം പാലില് അരച്ചു ചേര്ത്തത് രാവിലെ കുടിക്കുക."
    },

    GreyHair={"അകാലനര | Grey Hair","",
            "1.നെല്ലിക്കയിട്ടു തിളപ്പിച്ചാറിയ വെള്ളത്തില് പതിവായി തല കഴുകുക.",
            "2.തണുത്ത കട്ടന്ചായ വെള്ളം കൊണ്ടു മുടി കഴുകുക.",
            "3.ശുദ്ധമായ വെളിച്ചെണ്ണയും അരച്ച ബദാം പരിപ്പും തുല്യമായി ചേര്ത്ത് തലയില് പുരട്ടുക.",
            "4.കരിംജീരകത്തിന്റെ എണ്ണ തലയില് പുരട്ടുക"},

    Dandruff={"താരന് | Dandruff","",
            "1.മാങ്ങാണ്ടിയുടെ പരിപ്പ് ഉണക്കിയത് തലയില് പുരട്ടിയ ശേഷം കുളിക്കുക",
            "2.തേങ്ങാപ്പാലില് ചെറുനാരങ്ങാനീര് ചേര്ത്ത് തലയില് പുരട്ടുക","കടുക് അരച്ച് തലയില് പുരട്ടിയ ശേഷം കുളിക്കു",
            "3.ഒലിവെണ്ണ തലയോട്ടിയില് തിരുമ്മിയ ശേഷം പത്തു മിനിറ്റ് കഴിഞ്ഞു കുളിക്കുക."},


    Cancer={"കാന്സര് (അര്ബുദം) | Cancer","",
            "1.നിലംപാല പാലില് അരച്ചശേഷം കുടിക്കുക.",
            "2.കറുത്ത എള്ളും നെല്ലിക്കയും തേനില് പൊടിച്ചു കഴിക്കുക.",
            "3.ചിറ്റമൃത് തേനില് ലയിപ്പിച്ചു കഴിക്കുക",
            "4.കൃഷ്ണതുളസിയിലയുടെ നീര് കുടിക്കുക.",
            "5.കറുകപ്പുല്ലിന്റെ നീര് കുടിക്കുക"},
            kankuru={"കണ്കുരു | Eye Pimple","",
                    "1.കുരുമുളകിന്റെ ഇല കനലില് വാട്ടിയെടുത്ത് കണ്പോളമേല് വയ്ക്കുക.",
                    "2.തഴുതാമയുടെ വേര് തേനില് അരച്ച് കണ്ണെഴുതുക.",
                    "3.ഇരട്ടിമധുരം തേനില് ചാലിച്ച് പുരട്ടുക.",
                    "4.ആട്ടിന്പാല് കറന്നപാടേ കണ്ണില് ഇറ്റിക്കുക.",
                    "5.നന്ത്യാര്വട്ടത്തിന്റെ പൂവ് പിഴിഞ്ഞ ചാറും മുലപ്പാലും ചേര്ത്ത് കണ്ണില് തുള്ളിയായി ഒഴിക്കുക."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        l=(ListView)findViewById(R.id.lv);
        iv=(ImageView)findViewById(R.id.imageView);
        Intent in=getIntent();
        int id=in.getIntExtra("id",0);
        // Toast.makeText(this,"value is"+id,Toast.LENGTH_SHORT).show();
        if(id==0) {
           iv.setImageResource(R.drawable.headache1);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,headache);
            l.setAdapter(adapter);
        }
        else if(id==1){
            iv.setImageResource(R.drawable.insomania);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,insomnia);
            l.setAdapter(adapter);
        }
        else if(id==2){
            iv.setImageResource(R.drawable.memory);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,memory);
            l.setAdapter(adapter);
        }
        else if(id==3){
            iv.setImageResource(R.drawable.bald);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,bald);
            l.setAdapter(adapter);
        }
        else if(id==4){
            iv.setImageResource(R.drawable.sinusatis);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sinusitis);
            l.setAdapter(adapter);
        }
        else if(id==5){
           iv.setImageResource(R.drawable.migraine);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,migrane);
            l.setAdapter(adapter);
        }
        else if(id==6){
            iv.setImageResource(R.drawable.nara);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,GreyHair);
            l.setAdapter(adapter);
        }
        else if(id==7){
           iv.setImageResource(R.drawable.tharan);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Dandruff);
            l.setAdapter(adapter);
        }
        else if(id==8){
            iv.setImageResource(R.drawable.cancer);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Cancer);
            l.setAdapter(adapter);
        }
        else if(id==9){
            iv.setImageResource(R.drawable.eyepimple);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,kankuru);
            l.setAdapter(adapter);
        }
    }
}
