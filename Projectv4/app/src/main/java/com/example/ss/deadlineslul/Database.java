package com.example.ss.deadlineslul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Database extends AppCompatActivity {
    List<String> a=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);
        pull();


        ListView lvMain = findViewById(R.id.lvMain);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,a );
        lvMain.setAdapter(adapter);

        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                delete(position);
            }});
    }

    void pull(){
        String str=openText();
        String buf="";
        char[] chArray=str.toCharArray();
        for(int i=0;i<chArray.length;i++){
            if(chArray[i]!=' ') {
                buf += chArray[i];
            }
            else {
                a.add(buf);
                buf="";
            }
        }
    }
    void delete(int position){
        String str = openText();
        String buf="";
        String buf2="";
        char[] chArray = str.toCharArray();
        int count=0;
        for(int i=0;i<chArray.length;i++){
            if(chArray[i]==' '){
                count++;
                if (count==position+1){
                    i--;
                    while(chArray[i]!=' '){
                        i--;
                    }
                    for(int j=0;j<=i;j++){
                        buf+=chArray[j];
                    }
                    i++;
                    while(chArray[i]!=' '){
                        i++;
                    }
                    for(int j=i+1;j<chArray.length;j++){
                        buf2+=chArray[j];
                    }
                    saveText(buf+buf2);
                    break;
                }
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
