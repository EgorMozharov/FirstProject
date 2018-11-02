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

    String[] TypeOfPlace={"Город","Столица","ПаркРазвлечений","Горы","Каньоны","Водопад","Озеро","Река","Остров"};

    String[] Continent={"Азия","Антарктида","Африка","Европа","СевернаяАмерика","ЮжнаяАмерика", "Австралия"};

    String[] Country={"Австрия","Бельгия","Великобритания","Германия","Ирландия","Лихтенштейн","Люксембург","Монако","Нидерланды",
            "Франция","Швейцария","Белоруссия","Болгария","Венгрия","Молдавия","Польша","Россия","Румыния","Словакия","Украина",
            "Чехия","Дания","Исландия","Норвегия","Латвия","Литва","Финляндия","Швеция","Эстония","Албания","Ватикан","Греция","Испания"
            ,"Италия","Македония","Мальта","Португалия","Сербия","Словения","Хорватия","Черногория","Азербайджан","Армения","Грузия","Израиль","Иордания",
            "Ирак","Иран","Кипр","Ливан","ОбъединённыеАрабскиеЭмираты","СаудовскаяАравия","Сирия","Турция","Казахстан","Киргизия","Таджикистан","Туркмения",
            "Узбекистан","Афганистан","Бангладеш","Индия","Мальдивы","Пакистан","Шри-Ланка","Китай","СевернаяКорея","ЮжнаяКорея","Монголия"
            ,"Япония","Вьетнам","Индонезия","Камбоджа","Малайзия","Сингапур","Таиланд","Филиппины","Палестина","Абхазия","Тайвань",
            "Алжир","Ангола","Ботсвана","Габон","Бурунди","Гана","Гвинея","Египет","Замбия","Зимбабве","Кения","КанарскиеОстрова","Конго",
            "Либерия","Лесото","Ливия","Мавритания","Мадагаскар","Малави","Мали","Марокко","Намибия","Нигер","Нигерия","Руанда"
            ,"СахарскаяАрабскаяДемократическаяРеспублика","Сенегал","Свазиленд","Сомали","Судан","Танзания","Того","Тунис","Уганда","ЦАР",
            "Чад","Эритрея","Эфиопия","Южно-АфриканскаяРеспублика","ЮжныйСудан","Австралия","Аргентина","Боливия","Бразилия","Венесуэла",
            "Гайана","Колумбия","Парагвай","Перу","Суринам","Уругвай","Чили","Эквадор","БагамскиеОстрова",
            "Барбадос","Белиз","Гаити","Гватемала","Гондурас", "Гренада","Доминика"
            ,"ДоминиканскаяРеспублика","Канада","Коста-Рика","Куба","Мексика","Никарагуа","Панама","Сальвадор","Сент-Люсия",
            "Сент-ВинсентГренадины","Сент-КитсНевис","СоединённыеШтатыАмерики","Ямайка","ТринидадТобаго"};

    String[] TypeOfRest={"Семейный","Пляжный","Экскурсионный","Шопинг","Экстремальный","НочныеКлубы","Лечебный","Горнолыжный","Водный",""};

    String[] AverageTripCost={"1","2","3","4"};


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
                android.R.layout.simple_list_item_multiple_choice, TypeOfPlace);
        choiceList1.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        choiceList1.setAdapter(ItsSoSad1);

        choiceList2 = (ListView) findViewById(R.id.listView2);
        ArrayAdapter<String> ItsSoSad2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, Continent);
        choiceList2.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        choiceList2.setAdapter(ItsSoSad2);

        choiceList3 = (ListView) findViewById(R.id.listView3);
        ArrayAdapter<String> ItsSoSad3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, Country);
        choiceList3.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        choiceList3.setAdapter(ItsSoSad3);

        choiceList4 = (ListView) findViewById(R.id.listView4);
        ArrayAdapter<String> ItsSoSad4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, TypeOfRest);
        choiceList4.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        choiceList4.setAdapter(ItsSoSad4);

        choiceList5 = (ListView) findViewById(R.id.listView5);
        ArrayAdapter<String> ItsSoSad5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, AverageTripCost);
        choiceList5.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        choiceList5.setAdapter(ItsSoSad5);
    }


    public String[] Names={
            "SixFlagsMagicMountain","ПортАвентура","Эверлэнд","БлэкпулПлежеБич","Леголенд","ДиснейлендПариж","ДиснейлендКалифорния","Европа-парк","Диснейуорлд","МирБетоКарреро","ДиснейлендСША","ДискавериКов",
            "НиагарскийВодопад","ВодопадГюдльфосс","ВодопадыДюден","ВодопадУчан-Су","водопадыИгуасу","Анхель","ВодопадКхон","ВодопадДжог","ВодопадШифен","ВодопадВиктория","Лангфоссен","ВеликиСлапВодопад","ГоктаВодопад","ВодопадРайхенбах","ВодопадДэтянь","МардалсфоссенВодопад","Сент-КлерВодопад","ГлоткаБаатарыВодопад","ВодопадЙосемити","РейнскийВодопад","ВодопадЭраван","Водопад Тугела",
            "ЧарынскийКаньон","КаньонВаймеа","КаньонКолка","КаньонРекиБлайд","ГленКаньон","КаньонАнтилопы","Гранд-Каньон",
            "Маттерхорн","ВулканОрисаба","Эльбрус","АйлендПик","Аконкагуа","Котопахи","Рейнир","Монблан","Килиманджаро","Кала-Патхар","Тибет","Аннапурна","Канченджанга","НангаПарбат","Монблан","Маттерхорн","Эйгер","Броуд Пик","Гашербрум","Эверест",
            "Мадейра","Майорка","Канары","Кабо-Верде","Мадагаскар","Мальдивы","Шри-Ланка","Самун","Пхукет","Ко-Чанг","Самет","Бали","Борнео","КомодскиеОстрова","Джерба","Фиджи","Бора-Бора","Доминикана","Вануату","Гавайи","Багамы","Мариета","Сейшелы","Маврикий","Куба","Ямайка","Мальта","Кипр","Сардиния","Крит","ОстровПасхи",
            "Байкал","Комо","Тахо","Тегернзее","Иссык-Куль","Вольфгангзее","Балатон","ЖеневскоеОзеро","Лох-Несс","Гарда","Лугано","Пяйянне",
            "Франклин","Терек","Китой","Пис","Чулышман","Замбези","Тумча","Колорадо","Прут","Снежная","Нил","Арагви","Футалеуфу","Кору","Алсек","Ганг","Непал","Ноче","Пакуаре","Янцзы","Брахмапутра","Кутсайоки","Катунь","ЮжныйБуг","Карпаты",
            "","","","","","","","","","","","","","","","","","","","","","",
            "","","","","","","","","","","","","","","","","","","","","","",
            "","","","","","","","","","","","","","","","","","","","","","",
            "","","","","","","","","","","","","","","","","","","","","","",
            "","","","","","","","","","","","","","","","","","","","","","",
            "","","","","","","","","","","","","","","","","","","","","","",
            "","","","","","","","","","","","","","","","","","","","","","",
            "","","","","","","","","","","","","","","","","","","","","","",
            "","","","","","","","","","","","","","","","","","","","","","",
            "","","","","","","","","","","","","","","","","","","","","","",
            "","","","","","","","","","","","","","","","","","","","","","",
            "","","","","","","","","","","","","","","","","","","","","","",
            "","","","","","","","","","","","","","","","","","","","","","",
            "","","","","","","","","","","","","","","","","","","","","","",

    };


    public List<List<String> > Characters= new ArrayList<>();


    public void Defolt(){
        //Парки развлечений
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        //Водопады
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        //Каньоны
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        //Горы
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        //Острова
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        //Озёра
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        //Реки(сплав)
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        //
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));
        Characters.add(getList("","","","",""));





    }


    public List<String> getList(String chrfi, String chrse, String chrth,String chfou,String chfif){
        List<String> gtl=new ArrayList<>();
        gtl.clear();
        gtl.add(chrfi);
        gtl.add(chrse);
        gtl.add(chrth);
        gtl.add(chfou);
        gtl.add(chfif);
        return gtl;
    }


    public void SRS(View view){
        // Объект SparseBooleanArray содержит массив значений, к которым можно получить доступ
        // через valueAt(index) и keyAt(index)
        List<String> first=new ArrayList<>();
        List<String> second=new ArrayList<>();
        List<String> third=new ArrayList<>();
        List<String> forth=new ArrayList<>();
        List<String> fifth=new ArrayList<>();
        SparseBooleanArray chosen =  choiceList1.getCheckedItemPositions();
        for (int i = 0; i < chosen.size(); i++) {
            if (chosen.valueAt(i)) {
                first.add(TypeOfPlace[chosen.keyAt(i)]);
            }
        }
        chosen =  choiceList2.getCheckedItemPositions();
        for (int i = 0; i < chosen.size(); i++) {
            if (chosen.valueAt(i)) {
                second.add(Continent[i]);
            }
        }
        chosen =  choiceList3.getCheckedItemPositions();
        for (int i = 0; i < chosen.size(); i++) {
            if (chosen.valueAt(i)) {
                third.add(Country[i]);
            }
        }
        chosen =  choiceList4.getCheckedItemPositions();
        for (int i = 0; i < chosen.size(); i++) {
            if (chosen.valueAt(i)) {
                forth.add(TypeOfRest[i]);
            }
        }
        chosen =  choiceList5.getCheckedItemPositions();
        for (int i = 0; i < chosen.size(); i++) {
            if (chosen.valueAt(i)) {
                fifth.add(AverageTripCost[i]);
            }
        }

        finals.clear();
        List<String> year=new ArrayList<>();
        for(int i=0;i<first.size();i++){
            for(int j=0;j<second.size();j++){
                for(int k=0;k<third.size();k++){
                    for(int q=0;q<forth.size();q++){
                        for(int w=0;w<fifth.size();w++){
                            year=Search(TypeOfPlace[i],Continent[j],Country[k],TypeOfRest[q],AverageTripCost[w]);
                            for(int t=0;t<year.size();t++){
                                finals.addAll(year);
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


    public List<String> Search(String chr1,String chr2,String chr3,String chr4,String chr5){
        List<String> answer=new ArrayList<>();
        List<String> search = new ArrayList<>();
        search.add(chr1);
        search.add(chr2);
        search.add(chr3);
        search.add(chr4);
        search.add(chr5);
        List<String> search2=new ArrayList<>();

        int counter=0;
        for(int i=0;i<Characters.size();i++){
            search2.clear();
            search2.add(Characters.get(i).get(0));
            search2.add(Characters.get(i).get(1));
            search2.add(Characters.get(i).get(2));
            search2.add(Characters.get(i).get(3));
            search2.add(Characters.get(i).get(4));
            //search2.add(Characters.get(i).get(5));
            //search2.add(Characters.get(i).get(6));
            counter=0;
            for(int j=0;j<5;j++){
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
