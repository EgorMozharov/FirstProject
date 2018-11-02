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
    String[] Country={
            "Австрия","Бельгия","Великобритания","Германия","Ирландия","Лихтенштейн","Люксембург","Монако","Нидерланды", "Франция","Швейцария","Белоруссия","Болгария","Венгрия","Молдавия","Польша","Россия","Румыния","Словакия","Украина", "Чехия","Дания","Исландия","Норвегия","Латвия","Литва","Финляндия","Швеция","Эстония","Албания","Ватикан","Греция","Испания","Италия","Македония","Мальта","Португалия","Сербия","Словения","Хорватия","Черногория",
            "Азербайджан","Армения","Грузия","Израиль","Иордания", "Ирак","Иран","Кипр","Ливан","ОбъединённыеАрабскиеЭмираты","СаудовскаяАравия","Сирия","Турция","Казахстан","Киргизия","Таджикистан","Туркмения","Узбекистан","Афганистан","Бангладеш","Индия","Мальдивы","Пакистан","Шри-Ланка","Китай","СевернаяКорея","ЮжнаяКорея","Монголия","Япония","Вьетнам","Индонезия","Камбоджа","Малайзия","Сингапур","Таиланд","Филиппины", "Палестина","Абхазия","Тайвань",
            "Алжир","Ангола","Ботсвана","Габон","Бурунди","Гана","Гвинея","Египет","Замбия","Зимбабве","Кения","КанарскиеОстрова","Конго", "Либерия","Лесото","Ливия","Мавритания","Мадагаскар","Малави","Мали","Марокко","Намибия","Нигер","Нигерия","Руанда","СахарскаяАрабскаяДемократическаяРеспублика","Сенегал","Свазиленд","Сомали","Судан","Танзания","Того","Тунис","Уганда","ЦАР", "Чад","Эритрея","Эфиопия","Южно-АфриканскаяРеспублика","ЮжныйСудан",
            "Австралия",
            "Аргентина","Боливия","Бразилия","Венесуэла","Гайана","Колумбия","Парагвай","Перу","Суринам","Уругвай","Чили","Эквадор",
            "БагамскиеОстрова", "Барбадос","Белиз","Гаити","Гватемала","Гондурас", "Гренада","Доминика","ДоминиканскаяРеспублика","Канада","Коста-Рика","Куба","Мексика","Никарагуа","Панама","Сальвадор","Сент-Люсия", "Сент-ВинсентГренадины","Сент-КитсНевис","СоединённыеШтатыАмерики","Ямайка","ТринидадТобаго"
    };
    String[] TypeOfRest={"Семейный","Пляжный","Экскурсионный","Шопинг","Экстремальный","НочныеКлубы","Лечебный","Горнолыжный","Водный"};
    //String[] TypeOfRest2={"Семейный","Пляжный","Экскурсионный","Шопинг","Экстремальный","НочныеКлубы","Лечебный","Горнолыжный","Водный"};
    //String[] TypeOfRest3={"Семейный","Пляжный","Экскурсионный","Шопинг","Экстремальный","НочныеКлубы","Лечебный","Горнолыжный","Водный"};
    String[] AverageTripCost={"1","2","3","4"};

    public String[] Names={
            "SixFlagsMagicMountain","ПортАвентура","Эверлэнд","БлэкпулПлежеБич","Леголенд","ДиснейлендПариж","ДиснейлендКалифорния","Европа-парк","Диснейуорлд","МирБетоКарреро","ДиснейлендСША","ДискавериКов",
            "НиагарскийВодопад","ВодопадГюдльфосс","ВодопадыДюден","ВодопадУчан-Су","водопадыИгуасу","Анхель","ВодопадКхон","ВодопадДжог","ВодопадШифен","ВодопадВиктория","Лангфоссен","ВеликиСлапВодопад","ГоктаВодопад","ВодопадРайхенбах","ВодопадДэтянь","МардалсфоссенВодопад","Сент-КлерВодопад","ГлоткаБаатарыВодопад","ВодопадЙосемити","РейнскийВодопад","ВодопадЭраван","ВодопадТугела",
            "ЧарынскийКаньон","КаньонВаймеа","КаньонКолка","КаньонРекиБлайд","ГленКаньон","КаньонАнтилопы","Гранд-Каньон",
            "Маттерхорн","ВулканОрисаба","Эльбрус","АйлендПик","Аконкагуа","Котопахи","Рейнир","Монблан","Килиманджаро","Кала-Патхар","Тибет","Аннапурна","Канченджанга","НангаПарбат","Монблан","Маттерхорн","Эйгер","БроудПик","Гашербрум","Эверест",
            "Мадейра","Майорка","Канары","Кабо-Верде","Мадагаскар","Мальдивы","Шри-Ланка","Самун","Пхукет","Ко-Чанг","Самет","Бали","Борнео","КомодскиеОстрова","Джерба","Фиджи","Бора-Бора","Доминикана","Вануату","Гавайи","Багамы","Мариета","Сейшелы","Маврикий","Куба","Ямайка","Мальта","Кипр","Сардиния","Крит","ОстровПасхи",
            "Байкал","Комо","Тахо","Тегернзее","Иссык-Куль","Вольфгангзее","Балатон","ЖеневскоеОзеро","Лох-Несс","Гарда","Лугано","Пяйянне",
            "Франклин","Терек","Китой","Пис","Чулышман","Замбези","Тумча","Колорадо","Прут","Снежная","Нил","Арагви","Футалеуфу","Кору","Алсек","Ганг","Непал","Ноче","Пакуаре","Янцзы","Брахмапутра","Кутсайоки","Катунь","ЮжныйБуг","Карпаты",
            "Вена","Брюссель","Лондон","Берлин","Дублин","Вадуц","Люксембург","Монако","Амстердам","Париж","Берн","Минск","София","Будапешт","Кишинёв","Варшава","Москва","Бухарест","Братислава","Киев","Прага","Копенгаген","Рейкьявик","Осло","Рига","Вильнюс","Хельсинки","Стокгольм","Таллин","Тирана","Андорра-ла-Велья","Сараево","Ватикан","Афины","Мадрид","Рим","Скопье","Валлетта","Лиссабон","Сан-Марино","Белград","Любляна","Загреб","Подгорица",
            "Баку","Ереван","Манама","Тбилиси","Иерусалим","Амман","Багдад","Тегеран","Сана","Доха","Никосия","Эль-Кувейт","Бейрут","Абу-Даби","Маскат","Эр-Рияд","Дамаск","Анкара","Астана","Бишкек","Душанбе","Ашхабад", "Ташкент","Кабул","Дакка","Тхимпху","Нью-Дели","Мале","Катманду","Исламабад","Шри-Джаяварденепура-Котте","Пекин","Пхеньян","Сеул","Улан-Батор","Токио","Москва","Бандар-Сери-Бегаван","Ханой","Джакарта","Пномпень","Вьентьян","Куала-Лумпур","Нейпьидо", "Сингапур","Бангкок","Дили","Манила",
            "Алжир","Луанда","Порто-Ново","Котону","Габороне","Уагадугу","Бужумбура","Либревиль","Банжул","Аккра","Конакри","Бисау","Джибути","Каир","Лусака","Хараре","Прая","Яунде", "Лас-ПальмасДеГран-Канария","Санта-КрузДеТенерифе","Найроби","Морони","Киншаса","Браззавиль","Ямусукро","Абиджан","Масеру","Монровия","Триполи","Порт-Луи","Нуакшот","Антананариву","Фуншал","Мамудзу","Лилонгве","Бамако","Рабат","Мапуту","Виндхук","Ниамей", "Абуджа","Сен-Дени","Кигали","Сан-Томе","Эль-Аюн","Тифарити","Мбабане","Лобамба","Джеймстаун","Виктория","Дакар","Сеута","Могадишо","Харгейса","Хартум","Фритаун","Дар-эс-Салам","Додома","Ломе","Тунис","Кампала","Банги", "Нджамена","Малабо","Асмэра","Аддис-Абеба","Кейптаун","Претория","Блумфонтейн","Джуба",
            "Буэнос-Айрес","Ла-Пас","Сукре","Бразилиа","Каракас","Джорджтаун","Санта-Фе-Де-Богота","Асунсьон","Лима","Парамарибо","Монтевидео","Сантьяго","Кито",
            "Сент-Джонс","Нассау","Бриджтаун","Бельмопан","Порт-о-Пренс","Гватемала","Тегусигальпа","Сент-Джорджес","Розо","Санто-Доминго","Оттава","Сан-Хосе","Гавана","Мехико","Манагуа","Панама","Сан-Сальвадор","Кастри","Кингстаун","Бастер","Вашингтон","Порт-оф-Спейн","Кингстон",
            "Австралия",
            "","","","","","","","","","","","","","","","","","","","","",
            "","","","","","","","","","","","","","","","","","","","","","",
            "","","","","","","","","","","","","","","","","","","","","","",
            "","","","","","","","","","","","","","","","","","","","","","",
            "","","","","","","","","","","","","","","","","","","","","","",
    };

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
        //Столицы Европы
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
        //Столицы Азии
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
        //Столицы Африки
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
        //Столицы Южной Америки
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
        //Столицы Северной Америки
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
        //Австралия
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

    }


    public List<String> getList(String typeofplace, String continent, String country,String typeofrest,String averagetripcost){
        List<String> gtl=new ArrayList<>();
        gtl.clear();
        gtl.add(typeofplace);
        gtl.add(continent);
        gtl.add(country);
        gtl.add(typeofrest);
        gtl.add(averagetripcost);
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
