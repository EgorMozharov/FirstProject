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
        if(cur.contains("SixFlagsMagicMountain")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ПортАвентура")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Эверлэнд")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("БлэкпулПлежеБич")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Леголенд")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ДиснейлендПариж")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ДиснейлендКалифорния")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Европа-парк")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Диснейуорлд")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("МирБетоКарреро")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ДиснейлендСША")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ДискавериКов")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }



        if(cur.contains("НиагарскийВодопад")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ВодопадГюдльфосс")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ВодопадыДюден")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ВодопадУчан-Су")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("водопадыИгуасу")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Анхель")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ВодопадКхон")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ВодопадДжог")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ВодопадШифен")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ВодопадВиктория")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Лангфоссен")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ВеликиСлапВодопад")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ГоктаВодопад")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ВодопадРайхенбах")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ВодопадДэтянь")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("МардалсфоссенВодопад")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Сент-КлерВодопад")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ГлоткаБаатарыВодопад")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ВодопадЙосемити")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("РейнскийВодопад")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ВодопадЭраван")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ВодопадТугела")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ЧарынскийКаньон")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("КаньонВаймеа")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("КаньонКолка")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("КаньонРекиБлайд")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ГленКаньон")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("КаньонАнтилопы")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Гранд-Каньон")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }



        if(cur.contains("Маттерхорн")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ВулканОрисаба")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Эльбрус")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("АйлендПик")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Аконкагуа")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Котопахи")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Рейнир")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Монблан")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Килиманджаро")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Кала-Патхар")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Тибет")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Аннапурна")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Канченджанга")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("НангаПарбат")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Монблан")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Маттерхорн")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Эйгер")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Броуд Пик")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Гашербрум")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Эверест")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }



        if(cur.contains("Мадейра")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Майорка")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Канары")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Кабо-Верде")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Мадагаскар")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Мальдивы")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Шри-Ланка")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Самун")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Пхукет")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Ко-Чанг")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Самет")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Бали")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Борнео")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("КомодскиеОстрова")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Джерба")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Фиджи")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Бора-Бора")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Доминикана")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Вануату")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Гавайи")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Багамы")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Мариета")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Сейшелы")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Маврикий")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }if(cur.contains("Куба")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Ямайка")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Мальта")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Кипр")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Сардиния")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Крит")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("ОстровПасхи")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }



        if(cur.contains("Байкал")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Комо")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Тахо")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Тегернзее")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("Иссык-Куль")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText(cur);
        }
        if(cur.contains("")) {
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
