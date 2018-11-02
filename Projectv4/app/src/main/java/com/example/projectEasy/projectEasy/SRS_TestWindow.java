package com.example.projectEasy.projectEasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.projectEasy.projectEasy.R;

import java.util.ArrayList;
import java.util.List;

public class SRS_TestWindow extends AppCompatActivity {

    String[] empty={""};

    ListView choiceList1;
    ListView choiceList2;
    ListView choiceList3;
    ListView choiceList4;

    String[] TypeOfPlace={"Города","ПаркРазвлечений","Горы","Каньоны","Водопад","Озеро", "Остров"};
    String[] Continent={"Африка","Европа","СевернаяАмерика","ЮжнаяАмерика", "Австралия"};
    String[] Country={
            "Австрия","Бельгия","Великобритания","Германия","Ирландия","Лихтенштейн","Люксембург","Монако","Нидерланды", "Франция","Швейцария","Белоруссия","Болгария","Венгрия","Молдавия","Польша","Россия","Румыния","Словакия","Украина", "Чехия","Дания","Исландия","Норвегия","Латвия","Литва","Финляндия","Швеция","Эстония","Албания","Ватикан","Греция","Испания","Италия","Македония","Мальта","Португалия","Сербия","Словения","Хорватия","Черногория",
            "Азербайджан","Армения","Грузия","Израиль","Иордания", "Ирак","Иран","Кипр","Ливан","ОбъединённыеАрабскиеЭмираты","СаудовскаяАравия","Сирия","Турция","Казахстан","Киргизия","Таджикистан","Туркмения","Узбекистан","Афганистан","Бангладеш","Индия","Мальдивы","Пакистан","Шри-Ланка","Китай","СевернаяКорея","ЮжнаяКорея","Монголия","Япония","Вьетнам","Индонезия","Камбоджа","Малайзия","Сингапур","Таиланд","Филиппины", "Палестина","Абхазия","Тайвань",
            "Алжир","Ангола","Ботсвана","Габон","Бурунди","Гана","Гвинея","Египет","Замбия","Зимбабве","Кения","КанарскиеОстрова","Конго", "Либерия","Лесото","Ливия","Мавритания","Мадагаскар","Малави","Мали","Марокко","Намибия","Нигер","Нигерия","Руанда","СахарскаяАрабскаяДемократическаяРеспублика","Сенегал","Свазиленд","Сомали","Судан","Танзания","Того","Тунис","Уганда","ЦАР", "Чад","Эритрея","Эфиопия","Южно-АфриканскаяРеспублика","ЮжныйСудан",
            "Австралия",
            "Аргентина","Боливия","Бразилия","Венесуэла","Гайана","Колумбия","Парагвай","Перу","Суринам","Уругвай","Чили","Эквадор",
            "БагамскиеОстрова", "Барбадос","Белиз","Гаити","Гватемала","Гондурас", "Гренада","Доминика","ДоминиканскаяРеспублика","Канада","Коста-Рика","Куба","Мексика","Никарагуа","Панама","Сальвадор","Сент-Люсия", "Сент-ВинсентГренадины","Сент-КитсНевис","СоединённыеШтатыАмерики","Ямайка","ТринидадТобаго"
    };
    String[] TypeOfRest={"Развлекательный","Пляжный","Экскурсионный","Экстремальный","НочныеКлубы","Горный","Экзотический","универсальный"};

    public String[] Names={
            "SixFlagsMagicMountain","ПортАвентура","Эверлэнд","БлэкпулПлежеБич","Леголенд","ДиснейлендПариж","ДиснейлендКалифорния","Европа-парк","Диснейуорлд","МирБетоКарреро","ДиснейлендСША","ДискавериКов",
            "НиагарскийВодопад","ВодопадГюдльфосс","ВодопадыДюден","ВодопадУчан-Су","водопадыИгуасу","Анхель","ВодопадКхон","ВодопадДжог","ВодопадШифен","ВодопадВиктория","Лангфоссен","ВеликиСлапВодопад","ГоктаВодопад","ВодопадРайхенбах","ВодопадДэтянь","МардалсфоссенВодопад","Сент-КлерВодопад","ГлоткаБаатарыВодопад","ВодопадЙосемити","РейнскийВодопад","ВодопадЭраван","ВодопадТугела",
            "ЧарынскийКаньон","КаньонВаймеа","КаньонКолка","КаньонРекиБлайд","ГленКаньон","КаньонАнтилопы","Гранд-Каньон",
            "Маттерхорн","ВулканОрисаба","Эльбрус","АйлендПик","Аконкагуа","Котопахи","Рейнир","Монблан","Килиманджаро","Кала-Патхар","Тибет","Аннапурна","Канченджанга","НангаПарбат","Монблан","Маттерхорн","Эйгер","БроудПик","Гашербрум","Эверест",
            "Мадейра","Майорка","Канары","Кабо-Верде","Мадагаскар","Мальдивы","Шри-Ланка","Самун","Пхукет","Ко-Чанг","Самет","Бали","Борнео","КомодскиеОстрова","Джерба","Фиджи","Бора-Бора","Доминикана","Вануату","Гавайи","Багамы","Мариета","Сейшелы","Маврикий","Куба","Ямайка","Мальта","Кипр","Сардиния","Крит","ОстровПасхи",
            "Байкал","Комо","Тахо","Тегернзее","Иссык-Куль","Вольфгангзее","Балатон","ЖеневскоеОзеро","Лох-Несс","Гарда","Лугано","Пяйянне",
            "Вена","Брюссель","Лондон","Берлин","Дублин","Вадуц","Люксембург","Монако","Амстердам","Париж","Берн","Минск","София","Будапешт","Кишинёв","Варшава","Москва","Бухарест","Братислава","Киев","Прага","Копенгаген","Рейкьявик","Осло","Рига","Вильнюс","Хельсинки","Стокгольм","Таллин","Тирана","Андорра-ла-Велья","Сараево","Ватикан","Афины","Мадрид","Рим","Скопье","Валлетта","Лиссабон","Сан-Марино","Белград","Любляна","Загреб","Подгорица",
            "Баку","Ереван","Манама","Тбилиси","Иерусалим","Амман","Багдад","Тегеран","Сана","Доха","Никосия","Эль-Кувейт","Бейрут","Абу-Даби","Маскат","Эр-Рияд","Дамаск","Анкара","Астана","Бишкек","Душанбе","Ашхабад", "Ташкент","Кабул","Дакка","Тхимпху","Нью-Дели","Мале","Катманду","Исламабад","Шри-Джаяварденепура-Котте","Пекин","Пхеньян","Сеул","Улан-Батор","Токио","Москва","Бандар-Сери-Бегаван","Ханой","Джакарта","Пномпень","Вьентьян","Куала-Лумпур","Нейпьидо", "Сингапур","Бангкок","Дили","Манила",
            "Алжир","Луанда","Порто-Ново","Котону","Габороне","Уагадугу","Бужумбура","Либревиль","Банжул","Аккра","Конакри","Бисау","Джибути","Каир","Лусака","Хараре","Прая","Яунде", "Лас-ПальмасДеГран-Канария","Санта-КрузДеТенерифе","Найроби","Морони","Киншаса","Браззавиль","Ямусукро","Абиджан","Масеру","Монровия","Триполи","Порт-Луи","Нуакшот","Антананариву","Фуншал","Мамудзу","Лилонгве","Бамако","Рабат","Мапуту","Виндхук","Ниамей", "Абуджа","Сен-Дени","Кигали","Сан-Томе","Эль-Аюн","Тифарити","Мбабане","Лобамба","Джеймстаун","Виктория","Дакар","Сеута","Могадишо","Харгейса","Хартум","Фритаун","Дар-эс-Салам","Додома","Ломе","Тунис","Кампала","Банги", "Нджамена","Малабо","Асмэра","Аддис-Абеба","Кейптаун","Претория","Блумфонтейн","Джуба",
            "Буэнос-Айрес","Ла-Пас","Сукре","Бразилиа","Каракас","Джорджтаун","Санта-Фе-Де-Богота","Асунсьон","Лима","Парамарибо","Монтевидео","Сантьяго","Кито",
            "Сент-Джонс","Нассау","Бриджтаун","Бельмопан","Порт-о-Пренс","Гватемала","Тегусигальпа","Сент-Джорджес","Розо","Санто-Доминго","Оттава","Сан-Хосе","Гавана","Мехико","Манагуа","Панама","Сан-Сальвадор","Кастри","Кингстаун","Бастер","Вашингтон","Порт-оф-Спейн","Кингстон",
            "Австралия"
    };

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srs__test_window);
        Defolt();
        ListView list = findViewById(R.id.listView1);
        setListViewHeightBasedOnChildren(list);
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
    }


    public List<List<String> > Characters= new ArrayList<>();


    public void Defolt(){
        //Парки развлечений
        Characters.add(getList("ПаркРазвлечений","Африка","Гана","Развлекательный"));
        Characters.add(getList("ПаркРазвлечений","Африка","Лихтенштейн","Развлекательный"));
        Characters.add(getList("ПаркРазвлечений","Европа","Гана","Развлекательный"));
        Characters.add(getList("ПаркРазвлечений","ЮжнаяАмерика","Литва","Развлекательный"));
        Characters.add(getList("ПаркРазвлечений","Азия","Эстония","Развлекательный"));
        Characters.add(getList("ПаркРазвлечений","ЮжнаяАмерика","Китай","Развлекательный"));
        Characters.add(getList("ПаркРазвлечений","Европа","Латвия","Развлекательный"));
        Characters.add(getList("ПаркРазвлечений","Азия","Уагадугу","Развлекательный"));
        Characters.add(getList("ПаркРазвлечений","Европа","Таиланд","Развлекательный"));
        Characters.add(getList("ПаркРазвлечений","Европа","Уагадугу","Развлекательный"));
        Characters.add(getList("ПаркРазвлечений","Азия","Австрия","Развлекательный"));
        Characters.add(getList("ПаркРазвлечений","Азия","Уагадугу","Развлекательный"));
        //Водопады
        Characters.add(getList("Водопад","Африка","Бразилия","Экзотический"));
        Characters.add(getList("Водопад","Африка","Монако","Экзотический"));
        Characters.add(getList("Водопад","Африка","Монако","Экзотический"));
        Characters.add(getList("Водопад","ЮжнаяАмерика","","Экзотический"));
        Characters.add(getList("Водопад","Африка","Алжир","Экзотический"));
        Characters.add(getList("Водопад","ЮжнаяАмерика","Алжир","Экзотический"));
        Characters.add(getList("Водопад","Африка","Занбавбе","Экзотический"));
        Characters.add(getList("Водопад","ЮжнаяАмерика","Зимбабве","Экзотический"));
        Characters.add(getList("Водопад","Африка","Чили","Экзотический"));
        Characters.add(getList("Водопад","ЮжнаяАмерика","Самали","Экзотический"));
        Characters.add(getList("Водопад","Африка","Чад","Экзотический"));
        Characters.add(getList("Водопад","ЮжнаяАмерика","Венгрия","Экзотический"));
        Characters.add(getList("Водопад","Африка","Монако","Экзотический"));
        Characters.add(getList("Водопад","Африка","Монако","Экзотический"));
        Characters.add(getList("Водопад","Африка","Чили","Экзотический"));
        Characters.add(getList("Водопад","ЮжнаяАмерика","Чад","Экзотический"));
        Characters.add(getList("Водопад","Африка","Египет","Экзотический"));
        Characters.add(getList("Водопад","Африка","Тунис","Экзотический"));
        Characters.add(getList("Водопад","Африка","Испания","Экзотический"));
        Characters.add(getList("Водопад","ЮжнаяАмерика","","Экзотический"));
        Characters.add(getList("Водопад","ЮжнаяАмерика","Ватика","Экзотический"));
        Characters.add(getList("Водопад","ЮжнаяАмерика","","Экзотический"));
        Characters.add(getList("Водопад","Африка","Греция","Экзотический"));
        //Каньоны
        Characters.add(getList("Каньоны","Африка","Аргентина","Экзотический"));
        Characters.add(getList("Каньоны","Африка","Македония","Экзотический"));
        Characters.add(getList("Каньоны","Африка","Греция","Экзотический"));
        Characters.add(getList("Каньоны","ЮжнаяАмерика","Франция","Экзотический"));
        Characters.add(getList("Каньоны","Африка","Тунис","Экзотический"));
        Characters.add(getList("Каньоны","ЮжнаяАмерика","Болгария","Экзотический"));
        //Горы
        Characters.add(getList("Горы","Африка","Болгария","Горный"));
        Characters.add(getList("Горы","ЮжнаяАмерика","Румыния","Горный"));
        Characters.add(getList("Горы","ЮжнаяАмерика","Греция","Горный"));
        Characters.add(getList("Горы","ЮжнаяАмерика","Германия","Горный"));
        Characters.add(getList("Горы","Африка","Канада","Горный"));
        Characters.add(getList("Горы","ЮжнаяАмерика","Автрия","Горный"));
        Characters.add(getList("Горы","Африка","Перу","Горный"));
        Characters.add(getList("Горы","ЮжнаяАмерика","Испания","Горный"));
        Characters.add(getList("Горы","ЮжнаяАмерика","Франция","Горный"));
        Characters.add(getList("Горы","Африка","Конго","Горный"));
        Characters.add(getList("Горы","ЮжнаяАмерика","Китай","Горный"));
        Characters.add(getList("Горы","ЮжнаяАмерика","ПОльша","Горный"));
        Characters.add(getList("Горы","Африка","Дания","Горный"));
        Characters.add(getList("Горы","ЮжнаяАмерика","Филипинны","Горный"));
        Characters.add(getList("Горы","Африка","Исландия","Горный"));
        Characters.add(getList("Горы","ЮжнаяАмерика","Самали","Горный"));
        Characters.add(getList("Горы","Африка","Казахстан","Горный"));
        Characters.add(getList("Горы","ЮжнаяАмерика","Монголия","Горный"));
        Characters.add(getList("Горы","Африка","Зимбабве","Горный"));
        Characters.add(getList("Горы","Африка","Иран","Горный"));
        Characters.add(getList("Горы","Африка","Сирия","Горный"));
        Characters.add(getList("Горы","Африка","Ирак","Горный"));
        Characters.add(getList("Горы","ЮжнаяАмерика","Сирия","Горный"));
        //Острова
        Characters.add(getList("Остров","ЮжнаяАмерика","","Экзотический"));
        Characters.add(getList("Остров","Африка","ЮАР","Экзотический"));
        Characters.add(getList("Остров","ЮжнаяАмерика","Канада","Экзотический"));
        Characters.add(getList("Остров","Австралия","Мексика","Экзотический"));
        Characters.add(getList("Остров","ЮжнаяАмерика","испания","Экзотический"));
        Characters.add(getList("Остров","Африка","Латвия","Экзотический"));
        Characters.add(getList("Остров","ЮжнаяАмерика","Автстрия","Экзотический"));
        Characters.add(getList("Остров","Африка","Литва","Экзотический"));
        Characters.add(getList("Остров","ЮжнаяАмерика","Дания","Экзотический"));
        Characters.add(getList("Остров","Африка","Египет","Экзотический"));
        Characters.add(getList("Остров","Африка","Польша","Экзотический"));
        Characters.add(getList("Остров","ЮжнаяАмерика","Индонезия","Экзотический"));
        Characters.add(getList("Остров","Африка","Чехия","Экзотический"));
        Characters.add(getList("Остров","Африка","Гаваи","Экзотический"));
        Characters.add(getList("Остров","Африка","Ватикан","Экзотический"));
        Characters.add(getList("Остров","Австралия","Мексика","Экзотический"));
        Characters.add(getList("Остров","Африка","Аргентина","Экзотический"));
        Characters.add(getList("Остров","Африка","Ямайка","Экзотический"));
        Characters.add(getList("Остров","Австралия","Автсралия","Экзотический"));
        //Озёра
        Characters.add(getList("Озеро","Африка","Мексика","Пляжный"));
        Characters.add(getList("Озеро","Африка","Самали","Пляжный"));
        Characters.add(getList("Озеро","Африка","Алжир","Пляжный"));
        Characters.add(getList("Озеро","Африка","СаудовскаяАравия","Пляжный"));
        Characters.add(getList("Озеро","Африка","Австралия","Пляжный"));
        Characters.add(getList("Озеро","Африка","Швеция","Пляжный"));
        Characters.add(getList("Озеро","ЮжнаяАмерика","Норвегия","Пляжный"));
        Characters.add(getList("Озеро","ЮжнаяАмерика","Канада","Пляжный"));
        Characters.add(getList("Озеро","ЮжнаяАмерика","Венессуэла","Пляжный"));
        Characters.add(getList("Озеро","ЮжнаяАмерика","ЮАР","Пляжный"));
        Characters.add(getList("Озеро","ЮжнаяАмерика","Дания","Пляжный"));
        Characters.add(getList("Озеро","Австралия","Германия","Пляжный"));
        Characters.add(getList("Озеро","ЮжнаяАмерика","Норвегия","Пляжный"));
        //Столицы Европы
        Characters.add(getList("Города","Европа","Дания","универсальный"));
        Characters.add(getList("Города","Европа","Исландия","НочныеКлубы"));
        Characters.add(getList("Города","Европа","Норвегия","НочныеКлубы"));
        Characters.add(getList("Города","Европа","Латвия","универсальный"));
        Characters.add(getList("Города","Европа","Литва","универсальный"));
        Characters.add(getList("Города","Европа","Финляндия","универсальный"));
        Characters.add(getList("Города","Европа","Швеция","универсальный"));
        Characters.add(getList("Города","Европа","Эстония","НочныеКлубы"));
        Characters.add(getList("Города","Европа","Албания","НочныеКлубы"));
        Characters.add(getList("Города","Европа","Андорра","НочныеКлубы"));
        Characters.add(getList("Города","Европа","БоснияиГерцеговина","универсальный"));
        Characters.add(getList("Города","Европа","Ватикан","универсальный"));
        Characters.add(getList("Города","Европа","Греция","Экскурсионный"));
        Characters.add(getList("Города","Европа","Испания","Экскурсионный"));
        Characters.add(getList("Города","Европа","Италия","универсальный"));
        Characters.add(getList("Города","Европа","Македония","Экскурсионный"));
        Characters.add(getList("Города","Европа","Мальта","Экскурсионный"));
        Characters.add(getList("Города","Европа","Португалия","Экскурсионный"));
        Characters.add(getList("Города","Европа","Сан-Марино","универсальный"));
        Characters.add(getList("Города","Европа","Сербия","универсальный"));
        Characters.add(getList("Города","Европа","Словения","Экскурсионный"));
        Characters.add(getList("Города","Европа","Хорватия","универсальный"));
        Characters.add(getList("Города","Европа","Черногория","универсальный"));
        //Столицы Азии
        Characters.add(getList("Города","Африка","Алжир","пляжный"));
        Characters.add(getList("Города","Африка","Ангола","Экскурсионный"));
        Characters.add(getList("Города","Африка","Бенин","Экскурсионный"));
        Characters.add(getList("Города","Африка","Бенин","Экскурсионный"));
        Characters.add(getList("Города","Африка","Буркина-Фасо","Экскурсионный"));
        Characters.add(getList("Города","Африка","Бурунди","Экскурсионный"));
        Characters.add(getList("Города","Африка","Габон","Развлекательный"));
        Characters.add(getList("Города","Африка","Гамбия","Развлекательный"));
        Characters.add(getList("Города","Африка","Гана","Экскурсионный"));
        Characters.add(getList("Города","Африка","Гвинея","Экскурсионный"));
        Characters.add(getList("Города","Африка","Гвинея-Бисау","Экскурсионный"));
        Characters.add(getList("Города","Африка","Джибути","Экскурсионный"));
        Characters.add(getList("Города","Африка","Египет","универсальный"));
        Characters.add(getList("Города","Африка","Замбия","Экскурсионный"));
        Characters.add(getList("Города","Африка","Зимбабве","Развлекательный"));
        Characters.add(getList("Города","Африка","Кабо-Верде","Развлекательный"));
        Characters.add(getList("Города","Африка","Камерун","Экскурсионный"));
        Characters.add(getList("Города","Африка","КанарскиеОстрова","Развлекательный"));
        Characters.add(getList("Города","Африка","КанарскиеОстрова","Развлекательный"));
        Characters.add(getList("Города","Африка","Кения","Развлекательный"));
        Characters.add(getList("Города","Африка","Кения","Экскурсионный"));
        Characters.add(getList("Города","Африка","КоморскиеОстрова","Экскурсионный"));
        Characters.add(getList("Города","Африка","ДемократическаяРеспубликаКонго",""));
        Characters.add(getList("Города","Африка","РеспубликаКонго","универсальный"));
        Characters.add(getList("Города","Африка","Кот-д’Ивуар ","универсальный"));
        Characters.add(getList("Города","Африка","Кот-д’Ивуар ","Экскурсионный"));
        Characters.add(getList("Города","Африка","Лесото","универсальный"));
        Characters.add(getList("Города","Африка","Либерия","универсальный"));
        Characters.add(getList("Города","Африка","Ливия","универсальный"));
        Characters.add(getList("Города","Африка","Маврикий","Экскурсионный"));
        Characters.add(getList("Города","Африка","Мавритания","Экскурсионный"));
        Characters.add(getList("Города","Африка","Мадагаскар","Экскурсионный"));
        Characters.add(getList("Города","Африка","Мадейра","Экскурсионный"));
        Characters.add(getList("Города","Африка","Майотта","Экскурсионный"));
        Characters.add(getList("Города","Африка","Малави","Экскурсионный"));
        Characters.add(getList("Города","Африка","Мали","Экскурсионный"));
        Characters.add(getList("Города","Африка","Марокко","Экскурсионный"));
        Characters.add(getList("Города","Африка","Мозамбик","Экскурсионный"));
        Characters.add(getList("Города","Африка","Намибия","Экскурсионный"));
        Characters.add(getList("Города","Африка","Нигер","Экскурсионный"));
        Characters.add(getList("Города","Африка","Нигерия","Экскурсионный"));
        Characters.add(getList("Города","Африка","Руанда","Экскурсионный"));
        Characters.add(getList("Города","Африка","Сан-ТомеИПринсипи",""));
        Characters.add(getList("Города","Африка","СахарскаяАрабскаяДемократическаяРеспублика",""));
        Characters.add(getList("Города","Африка","СахарскаяАрабскаяДемократическаяРеспублика",""));
        Characters.add(getList("Города","Африка","Свазиленд ","Экскурсионный"));
        Characters.add(getList("Города","Африка","СейшельскиеОстрова","универсальный"));
        Characters.add(getList("Города","Африка","Сенегал","Экскурсионный"));
        Characters.add(getList("Города","Африка","Сеута","Экскурсионный"));
        Characters.add(getList("Города","Африка","ОстроваСвятойЕлены","Развлекательный"));
        //Столицы Африки
        //Столицы Южной Америки
        Characters.add(getList("Города","ЮжнаяАмерика","Аргентина","универсальный"));
        Characters.add(getList("Города","ЮжнаяАмерика","Боливия","Развлекательный"));
        Characters.add(getList("Города","ЮжнаяАмерика","Бразилия","Развлекательный"));
        Characters.add(getList("Города","ЮжнаяАмерика","Венесуэла","Развлекательный"));
        Characters.add(getList("Города","ЮжнаяАмерика","Гайана","универсальный"));
        Characters.add(getList("Города","ЮжнаяАмерика","Колумбия","Экскурсионный"));
        Characters.add(getList("Города","ЮжнаяАмерика","Парагвай","Развлекательный"));
        Characters.add(getList("Города","ЮжнаяАмерика","Перу","универсальный"));
        Characters.add(getList("Города","ЮжнаяАмерика","Суринам","пляжный"));
        Characters.add(getList("Города","ЮжнаяАмерика","Уругвай","универсальный"));
        Characters.add(getList("Города","ЮжнаяАмерика","Чили","универсальный"));
        Characters.add(getList("Города","ЮжнаяАмерика","Эквадор","пляжный"));
        //Столицы Северной Америки
        Characters.add(getList("Города","СевернаяАмерика","АнтигуаИБарбуда","пляжный"));
        Characters.add(getList("Города","СевернаяАмерика","БагамскиеОстрова","пляжный"));
        Characters.add(getList("Города","СевернаяАмерика","Барбадос","пляжный"));
        Characters.add(getList("Города","СевернаяАмерика","Барбадос","универсальный"));
        Characters.add(getList("Города","СевернаяАмерика","Гаити","универсальный"));
        Characters.add(getList("Города","СевернаяАмерика","Гватемала","Развлекательный"));
        Characters.add(getList("Города","СевернаяАмерика","Гондурас","Развлекательный"));
        Characters.add(getList("Города","СевернаяАмерика","Гренада","Развлекательный"));
        Characters.add(getList("Города","СевернаяАмерика","Доминика","универсальный"));
        Characters.add(getList("Города","СевернаяАмерика","ДоминиканскаяРеспублика",""));
        Characters.add(getList("Города","СевернаяАмерика","Канада","универсальный"));
        Characters.add(getList("Города","СевернаяАмерика","Коста-Рика","НочныеКлубы"));
        Characters.add(getList("Города","СевернаяАмерика","Куба","НочныеКлубы"));
        Characters.add(getList("Города","СевернаяАмерика","Мексика","НочныеКлубы"));
        Characters.add(getList("Города","СевернаяАмерика","Никарагуа","НочныеКлубы"));
        Characters.add(getList("Города","СевернаяАмерика","Панама","пляжный"));
        Characters.add(getList("Города","СевернаяАмерика","Сальвадор","пляжный"));
        Characters.add(getList("Города","СевернаяАмерика","Сент-Люсия","пляжный"));
        Characters.add(getList("Города","СевернаяАмерика","Сент-ВинсентиГренадины","пляжный"));
        Characters.add(getList("Города","СевернаяАмерика","СоединённыеШтатыАмерики","пляжный"));
        Characters.add(getList("Города","СевернаяАмерика","ТринидадиТобаго","Экскурсионный"));
        Characters.add(getList("Города","СевернаяАмерика","Ямайка","пляжный"));
        //Австралия
        Characters.add(getList("Города","Австралия","Австралия","универсальный")); }


    public List<String> getList(String typeofplace, String continent, String country,String typeofrest){
        List<String> gtl=new ArrayList<>();
        gtl.clear();
        gtl.add(typeofplace);
        gtl.add(continent);
        gtl.add(country);
        gtl.add(typeofrest);
        return gtl;
    }


    public void SRS(View view){
        // Объект SparseBooleanArray содержит массив значений, к которым можно получить доступ
        // через valueAt(index) и keyAt(index)
        List<String> first=new ArrayList<>();
        List<String> second=new ArrayList<>();
        List<String> third=new ArrayList<>();
        List<String> forth=new ArrayList<>();

        SparseBooleanArray chosen = choiceList1.getCheckedItemPositions();
        for (int i = 0; i < chosen.size(); i++) {
            if (chosen.valueAt(i)) {
                first.add(TypeOfPlace[chosen.keyAt(i)]);
            }
        }
        chosen = choiceList2.getCheckedItemPositions();
        for (int i = 0; i < chosen.size(); i++) {
            if (chosen.valueAt(i)) {
                second.add(Continent[i]);
            }
        }
        chosen = choiceList3.getCheckedItemPositions();
        for (int i = 0; i < chosen.size(); i++) {
            if (chosen.valueAt(i)) {
                third.add(Country[i]);
            }
        }
        chosen = choiceList4.getCheckedItemPositions();
        for (int i = 0; i < chosen.size(); i++) {
            if (chosen.valueAt(i)) {
                forth.add(TypeOfRest[i]);
            }
        }

        finals.clear();
        List<String> year=new ArrayList<>();
        for(int i=0;i<first.size();i++){
            for(int j=0;j<second.size();j++){
                for(int k=0;k<third.size();k++){
                    for(int q=0;q<forth.size();q++){
                        year=Search(first.get(i),second.get(j),third.get(k),forth.get(q));
                        for(int t=0;t<year.size();t++){
                            finals.addAll(year);
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


    public List<String> Search(String chr1,String chr2,String chr3,String chr4){
        List<String> answer=new ArrayList<>();
        List<String> search = new ArrayList<>();
        search.add(chr1);
        search.add(chr2);
        search.add(chr3);
        search.add(chr4);
        List<String> search2=new ArrayList<>();

        int counter=0;
        for(int i=0;i<Characters.size();i++){
            search2.clear();
            search2.add(Characters.get(i).get(0));
            search2.add(Characters.get(i).get(1));
            search2.add(Characters.get(i).get(2));
            search2.add(Characters.get(i).get(3));
            counter=0;
            for(int j=0;j<4;j++){
                if(search.get(j)==search2.get(j))
                    counter++;
            }
            if(counter>2){
                answer.add(Names[i]);
            }
        }
        return answer;

    }
    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) return;

        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), View.MeasureSpec.UNSPECIFIED);
        int totalHeight = 0;
        View view = null;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            view = listAdapter.getView(i, view, listView);
            if (i == 0)
                view.setLayoutParams(new ViewGroup.LayoutParams(desiredWidth, ViewGroup.LayoutParams.WRAP_CONTENT));

            view.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
            totalHeight += view.getMeasuredHeight();
        }
        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
    }
}