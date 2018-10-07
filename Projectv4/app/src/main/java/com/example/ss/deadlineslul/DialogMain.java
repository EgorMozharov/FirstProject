package com.example.ss.deadlineslul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.AbsoluteSizeSpan;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

public class DialogMain extends AppCompatActivity {


    private final static String FILE_NAME = "content.txt";
    private final static String FILE_NAME2= "content2.txt";
    final String LOG_TAG = "myLogs";
    int current=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dialog_main);
        ArrayAdapter<String> adapter;
        ArrayAdapter<String> adapter2;

        ListView IvMain = (ListView) findViewById(R.id.lvMain1);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Parameters);
        IvMain.setAdapter(adapter);


        IvMain.setOnScrollListener(new AbsListView.OnScrollListener() {
        public void onScrollStateChanged(AbsListView view, int scrollState) {
               Log.d(LOG_TAG, "scrollState = " + scrollState);
            }

            public void onScroll(AbsListView view, int firstVisibleItem,
                                 int visibleItemCount, int totalItemCount) {
               }
        });
        ListView IvMain1 = (ListView) findViewById(R.id.lvMain);
        adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Names);
        IvMain1.setAdapter(adapter2);

        IvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                          @Override
                                          public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                                                  long id) {
                                              setter(position);
                                              current=position;
                                          }});

        IvMain1.setOnScrollListener(new AbsListView.OnScrollListener() {
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                Log.d(LOG_TAG, "scrollState = " + scrollState);
            }

            public void onScroll(AbsListView view, int firstVisibleItem,
                                 int visibleItemCount, int totalItemCount) {
            }
        });

        IvMain1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                    saver(position);
                    Intent intent =new Intent(DialogMain.this,Achivements.class);
                    startActivity(intent);
            }});



    }
    public void setter(int pos){
        ArrayAdapter<String> adapter;
        if(pos==0){
            ListView IvMain1 = (ListView) findViewById(R.id.lvMain);
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,EU);
            IvMain1.setAdapter(adapter);
        }
        if(pos==1){
            ListView IvMain1 = (ListView) findViewById(R.id.lvMain);
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Asia);
            IvMain1.setAdapter(adapter);
        }
        if(pos==2){
            ListView IvMain1 = (ListView) findViewById(R.id.lvMain);
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Africa);
            IvMain1.setAdapter(adapter);
        }
        if(pos==3){
            ListView IvMain1 = (ListView) findViewById(R.id.lvMain);
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Oceania);
            IvMain1.setAdapter(adapter);
        }
        if(pos==4){
            ListView IvMain1 = (ListView) findViewById(R.id.lvMain);
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Greenland);
            IvMain1.setAdapter(adapter);
        }
        if(pos==5){
            ListView IvMain1 = (ListView) findViewById(R.id.lvMain);
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,SouthAmerica);
            IvMain1.setAdapter(adapter);
        }
        if(pos==6){
            ListView IvMain1 = (ListView) findViewById(R.id.lvMain);
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,NorthAmerica);
            IvMain1.setAdapter(adapter);
        }
        if(pos==7){
            ListView IvMain1 = (ListView) findViewById(R.id.lvMain);
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Beach);
            IvMain1.setAdapter(adapter);
        }
        if(pos==8){
            ListView IvMain1 = (ListView) findViewById(R.id.lvMain);
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Sights);
            IvMain1.setAdapter(adapter);
        }
    }
    public void saver(int pos){
        if(current==0){
            saveText(EU[pos]);
        }
        if(current==1){
            saveText(Asia[pos]);
        }
        if(current==2){
            saveText(Africa[pos]);
        }
        if(current==3){
            saveText(Oceania[pos]);
        }
        if(current==4){
            saveText(Greenland[pos]);
        }
        if(current==5){
            saveText(SouthAmerica[pos]);
        }
        if(current==6){
            saveText(NorthAmerica[pos]);
        }
        if(current==7){
            saveText(Beach[pos]);
        }
        if(current==8){
            saveText(Sights[pos]);
        }


    }

    @Override
    public void onBackPressed() {
        Intent intentback=new Intent(DialogMain.this,MainActivity.class);
        startActivity(intentback);
        super.onBackPressed();
    }


    public void Clickable(View view){
        Intent intent=new Intent(DialogMain.this,Dialog.class);
        startActivity(intent);
    }

    String base;

    //Методы обработки текстовых файлов
    public String openText(){

        FileInputStream fin = null;
        try {
            fin = openFileInput(FILE_NAME);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            return text;
        }
        catch(IOException ex) {

            boolean kostil=true;
            return FILE_NAME;
        }
        finally{

            try{
                if(fin!=null)
                    fin.close();
            }
            catch(IOException ex){

                boolean kostil=true;
            }
        }
    }
    public void saveText(String obmen){
        FileOutputStream fos = null;
        try {
            String text = "";
            if (openText() != "content.txt") {
                text = openText() + obmen + " ";
            }
            else text =" "+ obmen + " ";


            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(text.getBytes());
        }
        catch(IOException ex) {
            boolean kostil=true;
        }
        finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){
                boolean kostil=true;
            }
        }
    }
    String[] Parameters = {"Европа", "Азия", "Африка", "Океания", "Гренландия", "Южная Америка", "Северная Америка", "Пляжный Отдых", "Музеи Древности"};
    String[] Names={"Йоханнесбург","Берлин","Торонто","Мумбаи","Мюнхен","Мадрид","Дублин","Лос-Анджелес","Майами","Прага","Вена","Тайбэй","Осака","Амстердам","Гонконг","Бангкок","Лондон"};
    String[] EU={"Париж","Венеция","Будапешт","Прага","Флоренция","Сан-Марино","Берн","Барселона","Болонья","Стамбул","Брюссель","Лондон","Рим","Москва","Чехия","Прага","Ватикан","Варшава","Флоренция"};
    String[] Asia={"Пекин","Шанхай","Гонконг","Ханой","Бангкок","Сингапур","Убуд","Катманду","Мумбаи","Пхукет","Токио","Бали","Куала-Лумпур","Пемутеран","Тайчжун","Стамбул"};
    String[] Africa={"Кейптаун", "Найроби","Либревиль","Тунис","Виндхук","Алжир","Асмэра","Хараре","Кумаси","Аккра"};
    String[] Oceania={"Oceania1"};
    String[] Greenland={"Гренландия"};
    String[] SouthAmerica={"Сан-Паулу","Лима","Богота","Рио-де-Жанейро","Сантьяго","Медельин","Каракас","Салвадор"};
    String[] NorthAmerica={"Нью-Йорк","Лос-Анджелес","Беверли-Хиллз","Майами","Сан-Франциско","Вашингтон","Лас-Вегас","Гавайи","Чикаго","Хьюстон"};
    String[] Beach={"Beach1"};
    String[] Sights={"Ancients1"};
}
