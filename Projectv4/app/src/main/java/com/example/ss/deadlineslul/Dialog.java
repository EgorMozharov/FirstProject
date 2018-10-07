package com.example.ss.deadlineslul;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
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


public class Dialog extends AppCompatActivity {
    private final static String FILE_NAME = "content.txt";
    private final static String FILE_NAME2= "content2.txt";
    final String LOG_TAG = "myLogs";

    AlertDialog.Builder ad;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        workpls();


        ListView lvMain = findViewById(R.id.lvMain);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_dialog,x);
        lvMain.setAdapter(adapter);


        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                String buf="";
                String[] array=x.toArray(new String[x.size()]);
                String javaisshit=array[position];
                char[] chArray=javaisshit.toCharArray();
                if(chArray[0]=='К' && chArray[1]=='а' && chArray[2]=='р'){
                    buf="01";
                }
                if(chArray[0]=='С' && chArray[1]=='в' && chArray[2]=='е'){
                    buf="02";
                }
                if(chArray[0]=='М' && chArray[1]=='о' && chArray[2]=='р'){
                    buf="03";
                }
                if(chArray[0]=='Р' && chArray[1]=='е' && chArray[2]=='д'){
                    buf="04";
                }
                if(chArray[0]=='С' && chArray[1]=='м' && chArray[2]=='о'){
                    buf="05";
                }
                if(chArray[0]=='П' && chArray[1]=='о' && chArray[2]=='м'){
                    buf="06";
                }
                if(chArray[0]=='М' && chArray[1]=='а' && chArray[2]=='л'){
                    buf="07";
                }
                if(chArray[0]=='О' && chArray[1]=='г' && chArray[2]=='у'){
                    buf="08";
                }
                if(chArray[0]=='П' && chArray[1]=='е' && chArray[2]=='р'){
                    buf="09";
                }
                if(chArray[0]=='К' && chArray[1]=='а' && chArray[2]=='п'){
                    buf="10";
                }
                if(chArray[0]=='К' && chArray[1]=='а' && chArray[2]=='б'){
                    buf="11";
                }
                if(chArray[0]=='Л' && chArray[1]=='у' && chArray[2]=='к'){
                    buf="12";
                }
                if(chArray[0]=='К' && chArray[1]=='л' && chArray[2]=='у'){
                    buf="13";
                }
                if(chArray[0]=='З' && chArray[1]=='е' && chArray[2]=='м'){
                    buf="14";
                }
                if(chArray[0]=='Я' && chArray[1]=='б' && chArray[2]=='л'){
                    buf="15";
                }
                if(chArray[0]=='С' && chArray[1]=='л' && chArray[2]=='и'){
                    buf="16";
                }
                if(chArray[0]=='Г' && chArray[1]=='р' && chArray[2]=='у'){
                    buf="17";
                }
                saveTextBuffer(buf);
                Intenter();
            }
        });


       lvMain.setOnScrollListener(new AbsListView.OnScrollListener() {
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                Log.d(LOG_TAG, "scrollState = " + scrollState);
            }

            public void onScroll(AbsListView view, int firstVisibleItem,
                                 int visibleItemCount, int totalItemCount) {
            }
        });
    }
    public void AddTravel(View view) {
        Intent intent3 = new Intent(Dialog.this, DialogMain.class);
        startActivity(intent3);
    }

    public void Intenter(){
        Intent intenter=new Intent(Dialog.this,DialogMain_2.class);
        startActivity(intenter);
    }

    public void Back(View view){
        Intent intent2 = new Intent(Dialog.this,MainActivity.class);
        startActivity(intent2);
    }

    @Override
    public void onBackPressed() {
        Intent intentback=new Intent(Dialog.this,MainActivity.class);
        startActivity(intentback);
        super.onBackPressed();
    }

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

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            return FILE_NAME;
        }
        finally{

            try{
                if(fin!=null)
                    fin.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    //Картофель номер 1 , Свекла номер 2, Морковь номер 3
    //Строка  "НомерРаст+#+КолвоМетров;
    List<String> x = new ArrayList<>();
    char cur;
    char cur2;

    public void workpls(){
        String work=openText();
        String sq="";
        String buf="";
        String sfinal="";
        char[] chArray =work.toCharArray();
        for(int i=0;i<work.length()-2;i++)
        {
            if(chArray[i]=='!')
            {
                cur=chArray[i+1];
                cur2=chArray[i+2];
                if(cur=='0' && cur2=='1')
                {
                    sfinal="Картофель     ";
                }
                if(cur=='0' && cur2=='2')
                {
                    sfinal="Свекла     ";
                }
                if(cur=='0' && cur2=='3')
                {
                    sfinal="Морковь     ";
                }
                if(cur=='0' && cur2=='4')
                {
                    sfinal="Редис     ";
                }
                if(cur=='0' && cur2=='5')
                {
                    sfinal="Смородина     ";
                }
                if(cur=='0' && cur2=='6')
                {
                    sfinal="Помидоры     ";
                }
                if(cur=='0' && cur2=='7')
                {
                    sfinal="Малина     ";
                }
                if(cur=='0' && cur2=='8')
                {
                    sfinal="Огурцы     ";
                }
                if(cur=='0' && cur2=='9')
                {
                    sfinal="Перец     ";
                }
                if(cur=='1' && cur2=='0')
                {
                    sfinal="Капуста     ";
                }
                if(cur=='1' && cur2=='1')
                {
                    sfinal="Кабачки     ";
                }
                if(cur=='1' && cur2=='2')
                {
                    sfinal="Лук     ";
                }
                if(cur=='1' && cur2=='3')
                {
                    sfinal="Клубника     ";
                }
                if(cur=='1' && cur2=='4')
                {
                    sfinal="Земляника     ";
                }
                if(cur=='1' && cur2=='5')
                {
                    sfinal="Яблоки     ";
                }
                if(cur=='1' && cur2=='6')
                {
                    sfinal="Слива     ";
                }
                if(cur=='1' && cur2=='7')
                {
                    sfinal="Груша     ";
                }

            }
            if(chArray[i]=='#') {
                i++;
                while (chArray[i] != ';') {
                    sq += chArray[i];
                    i++;
                }
                    sfinal += sq;
                if(cur=='0' && cur2=='5'){
                    sfinal+=" кустов";
                }
                else if(cur=='1' && cur2=='5' || cur=='1' && cur2=='6' || cur=='1' && cur2=='7'){
                    sfinal+=" деревьев";
                }
                else {
                    sfinal += " кв.метров";
                }
                    x.add(sfinal);
                    sfinal = "";
                    sq = "";
            }

        }


    }

    private final static String FILE_NAMEBUFFER = "contentbuffer.txt";

    public void saveTextBuffer(String obmen){
        java.io.FileOutputStream fos = null;
        try {

            String text=obmen;
            fos = openFileOutput(FILE_NAMEBUFFER, MODE_PRIVATE);
            fos.write(text.getBytes());
        }

        catch(java.io.IOException ex) {
            boolean kostil=true;
        }
        finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(java.io.IOException ex){
                boolean kostil=true;
            }
        }
    }

}


