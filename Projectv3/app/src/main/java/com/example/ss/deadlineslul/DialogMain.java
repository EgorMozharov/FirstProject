package com.example.ss.deadlineslul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class DialogMain extends AppCompatActivity {


    private final static String FILE_NAME = "content.txt";
    private final static String FILE_NAME2= "content2.txt";
    final String LOG_TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dialog_main);
        add1();
        ArrayAdapter<String> adapter;
        String[] Parameters = {"Европа", "Азия", "Африка", "Океания", "Гренландия", "Южная Америка", "Северная Америка", "Пляжный Отдых", "Музеи Древности"};

        ListView IvMain1 = (ListView) findViewById(R.id.lvParameters);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, Parameters);
        IvMain1.setAdapter(adapter);


        IvMain1.setOnScrollListener(new AbsListView.OnScrollListener() {
        public void onScrollStateChanged(AbsListView view, int scrollState) {
               Log.d(LOG_TAG, "scrollState = " + scrollState);
            }

            public void onScroll(AbsListView view, int firstVisibleItem,
                                 int visibleItemCount, int totalItemCount) {
               }
        });


        setContentView(R.layout.activity_dialog_main);
        add();
        String[] Names={"Йоханнесбург","Берлин","Торонто","Мумбаи","Мюнхен","Мадрид","Дублин","Лос-Анджелес","Майами","Прага","Вена","Тайбэй","Осака","Амстердам","Гонконг","Бангкок","Лондон"};

        ListView IvMain = (ListView) findViewById(R.id.lvOk);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, Names);
        IvMain.setAdapter(adapter);

        IvMain.setOnScrollListener(new AbsListView.OnScrollListener() {
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                Log.d(LOG_TAG, "scrollState = " + scrollState);
            }

            public void onScroll(AbsListView view, int firstVisibleItem,
                                 int visibleItemCount, int totalItemCount) {
            }
        });
    }

    //mainList
    List<String> x=new ArrayList<>();

    public void add() {
        x.add("Йоханнесбург");
        x.add("Берлин");
        x.add("Торонто");
        x.add("Мумбаи");
        x.add("Мюнхен");
        x.add("Мадрид");
        x.add("Дублин");
        x.add("Лос-Анджелес");
        x.add("Майами");
        x.add("Прага");
        x.add("Вена");
        x.add("Тайбэй");
        x.add("Осака");
        x.add("Амстердам");
        x.add("Гонконг");
        x.add("Бангкок");
        x.add("Лондон");
    }

    List<String> x1=new ArrayList<>();

    public void add1() {
        x1.add("Европа");
        x1.add("Азия");
        x1.add("Африка");
        x1.add("Океания");
        x1.add("Гренландия");
        x1.add("Южная Америка");
        x1.add("Северная Америка");
        x1.add("Пляжный Отдых");
        x1.add("Музеи Древности");
    }

    @Override
    public void onBackPressed() {
        Intent intentback=new Intent(DialogMain.this,Dialog.class);
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

            String text = openText()+obmen;
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

}
