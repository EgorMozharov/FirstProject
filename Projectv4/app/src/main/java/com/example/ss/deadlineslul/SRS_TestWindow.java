package com.example.ss.deadlineslul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SRS_TestWindow extends AppCompatActivity {

    String[] empty={""};

    ListView choiceList1;
    ListView choiceList2;
    ListView choiceList3;
    ListView choiceList4;
    ListView choiceList5;
    ListView choiceList6;
    ListView choiceList7;

    String[] country={"EU","AM","AS","GG"};
    String[] ff1={"1","2","3","4"};
    String[] ff2={"1","2","3","4"};
    String[] ff3={"1","2","3","4"};
    String[] ff4={"1","2","3","4"};
    String[] ff5={"1","2","3","4"};
    String[] ff6={"1","2","3","4"};


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srs__test_window);
        Defolt();
        ListView lvMain=findViewById(R.id.lvMain);
        ArrayAdapter<String> adapter2;
        adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,empty);
        lvMain.setAdapter(adapter2);

        choiceList1 = (ListView) findViewById(R.id.listView1);
        ArrayAdapter<String> ItsSoSad1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, country);
        choiceList1.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        choiceList1.setAdapter(ItsSoSad1);

        choiceList2 = (ListView) findViewById(R.id.listView2);
        ArrayAdapter<String> ItsSoSad2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, ff1);
        choiceList2.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        choiceList2.setAdapter(ItsSoSad2);

        choiceList3 = (ListView) findViewById(R.id.listView3);
        ArrayAdapter<String> ItsSoSad3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, ff2);
        choiceList3.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        choiceList3.setAdapter(ItsSoSad3);

        choiceList4 = (ListView) findViewById(R.id.listView4);
        ArrayAdapter<String> ItsSoSad4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, ff3);
        choiceList4.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        choiceList4.setAdapter(ItsSoSad4);

        choiceList5 = (ListView) findViewById(R.id.listView5);
        ArrayAdapter<String> ItsSoSad5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, ff4);
        choiceList5.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        choiceList5.setAdapter(ItsSoSad5);

        choiceList6 = (ListView) findViewById(R.id.listView6);
        ArrayAdapter<String> ItsSoSad6 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, ff5);
        choiceList6.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        choiceList6.setAdapter(ItsSoSad6);

        choiceList7 = (ListView) findViewById(R.id.listView7);
        ArrayAdapter<String> ItsSoSad7 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, ff6);
        choiceList7.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        choiceList7.setAdapter(ItsSoSad7);
    }


    public String[] Names={
            "Город 1",
            "Город 2",
            "Город 3"
    };


    public List<List<String> > Characters= new ArrayList<>();


    public void Defolt(){
        Characters.add(getList("EU","1","1","1","1","1","1"));
        Characters.add(getList("AM","2","2","2","2","2","2"));
        Characters.add(getList("AS","3","3","3","3","3","3"));
    }


    public List<String> getList(String chrfi, String chrse, String chrth,String chfou,String chfif,String chsix,String chsev){
        List<String> gtl=new ArrayList<>();
        gtl.clear();
        gtl.add(chrfi);
        gtl.add(chrse);
        gtl.add(chrth);
        gtl.add(chfou);
        gtl.add(chfif);
        gtl.add(chsix);
        gtl.add(chsev);
        return gtl;
    }


    public void SRS(View view){
        // Объект SparseBooleanArray содержит массив значений, к которым можно получить доступ
        // через valueAt(index) и keyAt(index)
        List<String> first=new ArrayList<>();
        List<String> secnd=new ArrayList<>();
        List<String> third=new ArrayList<>();
        List<String> forth=new ArrayList<>();
        List<String> fifth=new ArrayList<>();
        List<String> sixth=new ArrayList<>();
        List<String> seven=new ArrayList<>();
        SparseBooleanArray chosen =  choiceList1.getCheckedItemPositions();
        for (int i = 0; i < chosen.size(); i++) {
            if (chosen.valueAt(i)) {
                first.add(country[chosen.keyAt(i)]);
            }
        }
        chosen =  choiceList2.getCheckedItemPositions();
        for (int i = 0; i < chosen.size(); i++) {
            if (chosen.valueAt(i)) {
                secnd.add(ff1[i]);
            }
        }
        chosen =  choiceList3.getCheckedItemPositions();
        for (int i = 0; i < chosen.size(); i++) {
            if (chosen.valueAt(i)) {
                third.add(ff2[i]);
            }
        }
        chosen =  choiceList4.getCheckedItemPositions();
        for (int i = 0; i < chosen.size(); i++) {
            if (chosen.valueAt(i)) {
                forth.add(ff3[i]);
            }
        }
        chosen =  choiceList5.getCheckedItemPositions();
        for (int i = 0; i < chosen.size(); i++) {
            if (chosen.valueAt(i)) {
                fifth.add(ff4[i]);
            }
        }
        chosen =  choiceList6.getCheckedItemPositions();
        for (int i = 0; i < chosen.size(); i++) {
            if (chosen.valueAt(i)) {
                sixth.add(ff5[i]);
            }
        }
        chosen =  choiceList7.getCheckedItemPositions();
        for (int i = 0; i < chosen.size(); i++) {
            if (chosen.valueAt(i)) {
                seven.add(ff6[i]);
            }
        }
        finals.clear();
        List<String> year=new ArrayList<>();
        for(int i=0;i<first.size();i++){
            for(int j=0;j<secnd.size();j++){
                for(int k=0;k<third.size();k++){
                    for(int q=0;q<forth.size();q++){
                        for(int w=0;w<fifth.size();w++){
                            for(int e=0;e<sixth.size();e++){
                                for(int r=0;r<seven.size();r++){
                                    year=Search(country[i],ff1[j],ff2[k],ff3[q],ff4[w],ff5[e],ff6[r]);
                                    for(int t=0;t<year.size();t++){
                                        finals.addAll(year);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


        ListView lvMain=findViewById(R.id.lvMain);
        ArrayAdapter<String> adapter2;
        adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,finals);
        lvMain.setAdapter(adapter2);


        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                Intent intent = new Intent(SRS_TestWindow.this,Information.class);
                intent.putExtra("Name",finals.get(position));
                intent.putExtra("Currency","SRS");
                startActivity(intent);
            }
        });
    }


    List<String> finals = new ArrayList<>();


    public List<String> Search(String chr1,String chr2,String chr3,String chr4,String chr5,String chr6,String chr7){
        List<String> answer=new ArrayList<>();
        List<String> search = new ArrayList<>();
        search.add(chr1);
        search.add(chr2);
        search.add(chr3);
        search.add(chr4);
        search.add(chr5);
        search.add(chr6);
        search.add(chr7);
        List<String> search2=new ArrayList<>();

        int counter=0;
        for(int i=0;i<Characters.size();i++){
            search2.clear();
            search2.add(Characters.get(i).get(0));
            search2.add(Characters.get(i).get(1));
            search2.add(Characters.get(i).get(2));
            search2.add(Characters.get(i).get(3));
            search2.add(Characters.get(i).get(4));
            search2.add(Characters.get(i).get(5));
            search2.add(Characters.get(i).get(6));
            counter=0;
            for(int j=0;j<7;j++){
                if(search.get(j)==search2.get(j))
                    counter++;
            }
            if(counter>6){
                answer.add(Names[i]);
            }
        }
        return answer;
    }
}
