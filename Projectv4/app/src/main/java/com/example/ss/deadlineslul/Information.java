package com.example.ss.deadlineslul;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Information extends AppCompatActivity {

    String cur;
    String currency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        checkFirstStart();
        Intent intent=getIntent();
        TextView TextName = findViewById(R.id.TextView);
        ImageView ImageMain = findViewById(R.id.ImageMid);
        Button ButtonTop = findViewById(R.id.ButtonTop);
        Button ButtonBottom = findViewById(R.id.ButtonBottom);
        String search=openText();

        cur=intent.getStringExtra("Name");
        if(search.contains(cur)){
            ButtonTop.setVisibility(View.GONE);
        }
        currency=intent.getStringExtra("Currency");
        if(currency.contains("Mine")){
            ButtonTop.setVisibility(View.GONE);
            ButtonBottom.setVisibility(View.GONE);
        }
        if(cur.contains("Город 1")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }


    }

    private void checkFirstStart() {

        SharedPreferences sp = getSharedPreferences("hasVisited",
                Context.MODE_PRIVATE);
        // проверяем, первый ли раз открывается программа (Если вход первый то вернет false)
        boolean hasVisited = sp.getBoolean("hasVisited", false);

        if (!hasVisited) {
            // Сработает если Вход первый
            saveText("");
            //Ставим метку что вход уже был
            SharedPreferences.Editor e = sp.edit();
            e.putBoolean("hasVisited", true);
            e.commit(); //После этого hasVisited будет уже true и будет означать, что вход уже был
            //Ниже запускаем активность которая нужна при первом входе
        } else {
            //Сработает если вход в приложение уже был
            //Ниже запускаем активность которая нужна при последующих входах
        }
    }


    public void Save(View view){
        String DB=openText();
        DB+="("+cur+")";
        saveText(DB);
        Button ButtonTop = findViewById(R.id.ButtonTop);
        Intent intent = new Intent(Information.this, Database.class);
        startActivity(intent);
    }

    public void OpenMenu(View view) {
        Intent intent = new Intent(Information.this, MainActivity.class);
        startActivity(intent);
    }


    public void OpenTravel(View view) {
        Intent intent1 = new Intent(Information.this, Database.class);
        startActivity(intent1);
    }

    private final static String FILE_NAME = "content4.txt";

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

            String text =obmen;
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
