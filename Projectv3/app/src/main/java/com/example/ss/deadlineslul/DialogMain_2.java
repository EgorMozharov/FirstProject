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

public class DialogMain_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_main_2);
    }

    public void intenters(){
        Intent intenters=new Intent(DialogMain_2.this,Dialog.class);
        startActivity(intenters);
    }

    public void DeleteIt(View view){
        String Deleted=openTextBUFFER();
        char[] chArrayBuf=Deleted.toCharArray();
        String WorkString=openText();
        char[] chArray=WorkString.toCharArray();
        int index=0;
        for(int i=0;i<chArray.length-1;i++){
            if(chArray[i]==chArrayBuf[0] && chArray[i+1]==chArrayBuf[1]){
                index=i;
                break;
            }
        }
        int bufindex=index;
        while(chArray[bufindex]!=';'){
            bufindex++;
        }
        String str="";
        String str2="";
        str=WorkString.substring(0,index-1);
        str2=WorkString.substring(bufindex+1);
        String otvet=str+str2;
        saveText(otvet);
        intenters();


    }
    public void ChangeIt(View view){
        String Deleted=openTextBUFFER();
        char[] chArrayBuf=Deleted.toCharArray();
        String WorkString=openText();
        char[] chArray=WorkString.toCharArray();
        int index=0;
        for(int i=0;i<chArray.length-1;i++){
            if(chArray[i]==chArrayBuf[0] && chArray[i+1]==chArrayBuf[1]){
                index=i;
                break;
            }
        }
        int bufindex=index;
        while(chArray[bufindex]!=';'){
            bufindex++;
        }
        String str="";
        String str2="";
        str=WorkString.substring(0,index-1);
        str2=WorkString.substring(bufindex+1);
        EditText editText=findViewById(R.id.editTextSub);
        String text = editText.getText().toString();
        String dbuf="!"+Deleted+"#"+text+";";
        char[] chArray2=dbuf.toCharArray();
        if(chArray2[dbuf.length()-2]=='#'){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Поле ввода пустое", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            String otvet = str + dbuf + str2;
            saveText(otvet);
            intenters();
        }
    }

    @Override
    public void onBackPressed() {
        Intent intentback=new Intent(DialogMain_2.this,Dialog.class);
        startActivity(intentback);
        super.onBackPressed();
    }


    private final static String FILE_NAMEBUFFER = "contentbuffer.txt";

    public String openTextBUFFER(){

        FileInputStream fin = null;
        TextView textView = (TextView) findViewById(R.id.textView);
        try {
            fin = openFileInput(FILE_NAMEBUFFER);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            return text;
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            String kostil="Slomalos";
            return kostil;
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
    private final static String FILE_NAME = "content.txt";

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

    public void saveText(String obmen){
        FileOutputStream fos = null;
        try {

            String text = obmen;
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
