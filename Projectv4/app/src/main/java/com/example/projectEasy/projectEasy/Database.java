package com.example.projectEasy.projectEasy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.projectEasy.projectEasy.R;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Database extends AppCompatActivity {
    List<String> main=new ArrayList<>();

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        checkFirstStart();

        ListView lvMain=findViewById(R.id.lvMain);
        String str=openText();
        String buffer="";
        char[] chArray=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(chArray[i]=='('){
                i++;
                while(chArray[i]!=')'){
                    buffer+=chArray[i];
                    i++;
                }
                main.add(buffer);
                buffer="";
            }
        }
        ArrayAdapter<String> adapter2;
        adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,main);
        lvMain.setAdapter(adapter2);
        lvMain.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view,
                                           int position, long id) {
                String str=main.get(position);
                String all=openText();
                char[] chArray=all.toCharArray();
                int index=all.indexOf(str);
                index--;
                String buf1="";
                for(int i=0;i<index;i++){
                    buf1+=chArray[i];
                }
                String buf2="";
                while(chArray[index]!=')'){
                    index++;
                }
                index++;
                for(int i=index;i<all.length();i++){
                    buf2+=chArray[i];
                }
                String answer=buf1+buf2;
                saveText(answer);
                Intent intent=new Intent(Database.this,Database.class);
                startActivity(intent);
                finish();
                return true;
            }
        });
        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {

                Intent intent = new Intent(Database.this,Information.class);
                intent.putExtra("Name",main.get(position));
                intent.putExtra("Currency","Mine");
                startActivity(intent);
            }
        });
    }

    public void ClickMain(View view) {
        Intent intent = new Intent(Database.this, MainActivity.class);
        startActivity(intent);
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
