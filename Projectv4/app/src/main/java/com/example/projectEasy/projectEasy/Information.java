package com.example.projectEasy.projectEasy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projectEasy.projectEasy.R;

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
        TextView TextName = findViewById(R.id.TextView2);
        Button ButtonTop = findViewById(R.id.ButtonTop);
        Button ButtonBottom = findViewById(R.id.ButtonBottom);
        String search=openText();

        cur=intent.getStringExtra("Name");
        if(cur.contains("SixFlagsMagicMountain")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Расположенный к северу от Лос-Анджелеса, известен как рай для любителей экстремальных аттракционов, Six Flags Magic Mountain имеет уникальные американские горки: самые высокие и самые быстрые в мире!");
        }
        if(cur.contains("ПортАвентура")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Расположенный в провинции Таррагона, Порт Авентура считается лучшим и самым посещаемым тематическим парком в Испании. Его впечатляющие аттракционы, которые будут поднимать ваш адреналин, делают его одним из лучших парков развлечений в мире.");
        }
        if(cur.contains("Эверлэнд")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Расположенный в Кёнгидо (Южная Корея), Эверлэнд – самый посещаемый парк аттракционов в стране и третий по посещаемости в мире. Он также включает в себя зоопарк и аквапарк, которые делают его одним из лучших тематических парков в на планете");
        }
        if(cur.contains("БлэкпулПлежеБич")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Расположенный в Блэкпуле, это самый посещаемый парк развлечений в Англии. В опросе на TripAdvisor в 2014 Блэкпул Плежэ Бич был признан лучшим тематическим парком Великобритании и Европы. Он имеет 10 американских горок, в том числе Pepsi Max Big One, и несколько аквапарков.");
        }
        if(cur.contains("Леголенд")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Возвышенный как символ Дании, Леголенд в городе Биллунд является одним из лучших тематических парков в мире. В цепи парков развлечений Леголенд он первый открыл свои двери. Это отличное место для взрослых и детей.");
        }
        if(cur.contains("ДиснейлендПариж")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Диснейленд в Париже состоит из двух тематических парков — Disneyland Park и Walt Disney Studios Park. Это самый посещаемый парк развлечений в Европе и, без сомнения, один из лучших в мире, чьи сказочные аттракционы сделают путешествие незабываемым!");
        }
        if(cur.contains("ДиснейлендКалифорния")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Построен и открыт Уолтом Диснеем в 1955 году. Это был первый парк развлечений Диснея и сегодня является одним из самых знаменитых и самых посещаемых в мире. По подсчетам в 2012 году его посетили более 600 миллионов человек. Это целый мир веселья и фантазии, что делает Диснейленд одним из лучших парков развлечений в мире.");
        }
        if(cur.contains("Европа-парк")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Европа-парк в Германии был признан вторым лучшим тематическим парком в мире. Он разделен на пятнадцать различных областей, с названиями основных европейских стран. В настоящее время Европа-парк предлагает посетителям шестнадцать американских горок и в общей сложности почти 100 аттракционов, в том числе популярная горка «Голубой огонь», разгоняющая посетителей от нуля до 100 км в час за 2,5 секунды.\n" + "\n");
        }
        if(cur.contains("Диснейуорлд")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Во всех рейтингах Диснейуорлд признан как лучший парк развлечений в мире. Также он самый посещаемый и крупнейший на Земле. Диснейуорлд состоит из четырех тематических парков («Волшебное Королевство», «Epcot», «Диснеевские Голливудские Студии» и «Диснеевское Королевство Животных»), двух аквапарков и 24 тематических отелей. Это мечта как детей, так и взрослых.");
        }
        if(cur.contains("МирБетоКарреро")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Парк развлечений «Мир Бето Карреро» расположен на острове Санта-Катарна. Парк разделен на семь уникальных зон. На территории парка есть много тематических регионов со своими аттракционами. Во время «Прогулки на вертолете» открывается прекрасный вид на город Пенья.");
        }
        if(cur.contains("ДиснейлендСША")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Диснейленд в США (Калифорнии) — первый Диснейленд в мире. Он был открыт в июле 1955 года. Персонажи любимых мультфильмов гуляют по всему парку, создавая атмосферу праздника и сказки для малышей. Захватывающие дух американские горки - развлечения для детей постарше и взрослых.");
        }
        if(cur.contains("ДискавериКов")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Discovery Cove - революция в области тематических парков Флориды. «Бухта открытий» задумывался как частный остров. Его пять основных секторов расположены в красивейшей местности с водопадами, бассейнами и пещерами, связанными между собой пляжами.");
        }



        if(cur.contains("НиагарскийВодопад")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Пожалуй, самым известным в мире водопадом является знаменитый Ниагарский водопад. Территориально он расположен на границе США и Канады. Каждый год посмотреть необычайное по красоте и мощи зрелище приезжают свыше 16 миллионов туристов. Стоит отметить, что для того, чтобы полюбоваться водами Ниагарского водопада вам вовсе не нужно идти по сложным экстремальным маршрутам. Неподалеку от водопада предусмотрены удобные смотровые площадки, мостики, а также целая подвесная дорога. К услугам отдыхающих работают гостеприимные отели и вкусные рестораны.");
        }
        if(cur.contains("ВодопадГюдльфосс")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("«Золотой водопад», а именно так переводится имя еще одного крупного водопада Гюдльфосс, расположенного в Исландии. Эта место является одной из главных достопримечательностей страны и сюда охотно едет множество туристов со всего мира. На удобных смотровых площадках, расположенных неподалеку от водопада, можно не только полюбоваться его водами, но и сделать хорошие фотоснимки.");
        }
        if(cur.contains("ВодопадыДюден")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Если вы оказались в такой популярной у отечественных туристов стране, как Турция, непременно посетите красивейшие водопады Дюден. Это целый каскад необычайных по красоте водопадов. Месторасположение Дюдена – окрестности популярного курортного города Анталья, так полюбившегося российским отдыхающим.");
        }
        if(cur.contains("ВодопадУчан-Су")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Водопад Учан-Су является одной из наиболее известных достопримечательностей неподалеку от Ялты. Расположен водопад на восточном склоне Ай-Петри. Необычайно красивое зрелище открывается перед туристами, решившими посетить этот водопад. Неспроста многие известные русские поэты упоминали Учан-Су в своих произведениях.");
        }
        if(cur.contains("водопадыИгуасу")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Неспроста водопады Игуасу зачастую называют настоящим «бразильским чудом». Территория водопадов поистине огромна. Ширина составляет около трех километров, а по объему воды, которая падает с высоты водопада, Игуасу считается самым полноводным на земле.");
        }
        if(cur.contains("Анхель")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Одним из высочайших в мире водопадов считается водопад Анхель. Территориально водопад расположен в Венесуэле, в диком и труднопроходимом регионе страны. Добраться пешком до Анхеля невозможно и придется воспользоваться воздушным транспортом (вертолет) или привлекать плавсредство для путешествия по реке.");
        }
        if(cur.contains("ВодопадКхон")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Водопад Кхон расположен на реке Меконг между Лаосом и Камбоджей, каждую секунду здесь низвергается более девяти миллиардов литров воды. Его высота около 21 метра.");
        }
        if(cur.contains("ВодопадДжог")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText(" Это самый высокий водопад в Индии. Вернее серия водопадов, которые достигают высоты до 200 метров! Лучшее время для туризма в этих краях это сезон дождей, период, в который водопады Джог выглядят наиболее впечатляюще.");
        }
        if(cur.contains("ВодопадШифен")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText(" Великолепный водопад с изумрудной кристально чистой водой на реке Килунг, Тайвань. Это самый крупный водопад страны с высотой 20 метров и шириной 40 метров.");
        }
        if(cur.contains("ВодопадВиктория")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText(" Водопад Виктория внесли в список Всемирного наследия ЮНЕСКО и часто рассматривают как самый большой в мире. Его обнаружил Дэвид Ливингстон в 1855 году и назвал именем британской королевы Виктории. Хотя также распространена версия, что он назвал его именем своей покойной жены Виктории.");
        }
        if(cur.contains("Лангфоссен")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText(" Водопад Лангфоссен находится в муниципалитете Этне, в западной Норвегии и отличается простым доступом: европейский автомобильный маршрут E134 проходит прямо у подножия этого водопада, что очень удобно для туристов.");
        }
        if(cur.contains("ВеликиСлапВодопад")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText(" Он расположен в национальном парке Крка, Хорватия, и пользуется большой популярностью среди купальщиков и любителей дайвинга. Бирюзовые воды реки, бегущей с Динарских Альп, впадают в великолепный водопад Veliki Slap");
        }
        if(cur.contains("ГоктаВодопад")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Из-за ряда спорных вопросов этот водопад занимает то ли третье, то ли 14 место в мире. В любом случае Гокта один из самых высоких и величественных водопадов в мире, причём впервые был замечен сравнительно недавно лишь в 2003 году.");
        }
        if(cur.contains("ВодопадРайхенбах")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Это даже не один, а ряд водопадов, расположенных в районе Берна (Швейцария). Высота Рейхенбахского водопада достигает более 250 метров. Он примечателен ещё и тем, что именно в этом месте состоялась финальная схватка между Шерлоком Холмсом и профессором Мориарти по роману Артура Конан Дойля.");
        }
        if(cur.contains("ВодопадДэтянь")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText(" Этот самый крупный водопад в Азии расположен на реке Гуйчунь на границе Китая (провинция Гуанси) и Вьетнама, известен среди вьетнамцев как водопад Банзёк.");
        }
        if(cur.contains("МардалсфоссенВодопад")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Воды Мардалсфоссен используют для гидроэлектростанции, водопад свободно течёт лишь в летний период. Поэтому выбирая время для путешествия, чтобы созерцать водопад «в действии», ориентируйтесь на период с июня по август.");
        }
        if(cur.contains("Сент-КлерВодопад")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText(" Водопад Сент-Клер самый крупный в Шри-Ланке и его прозвали «Маленькая Ниагара». На самом деле он меньше Ниагарского водопада в 10 раз.");
        }
        if(cur.contains("ГлоткаБаатарыВодопад")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Водопад «Глотка Баатары» ниспадает с высоты боле 250 м в известняковую пещеру юрского периода «Пропасть трёх мостов» в ливанском регионе Таннурин. Его открыл французский спелеолог Анри Койфэ (Henri Coiffait) в 1952 году.");
        }
        if(cur.contains("ВодопадЙосемити")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText(" Знаменитый Ниагарский водопад отделяет Канаду и США. Будучи всемирно известным, он не перестаёт очаровывать и привлекать экстремалов, которые развлекаются, рискуя жизнями, чтобы бросить вызов мощному потоку воды.");
        }
        if(cur.contains("РейнскийВодопад")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Рейнский водопад один из самых крупных в Европе. Он простирается на 150 метров между швейцарскими городами Нойхаузен и Флурлинген, максимальная высота около 23 метров.");
        }
        if(cur.contains("ВодопадЭраван")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText(" Этот бирюзовый каскадный водопад находится в национальном парке Эраван, к нему съезжается множество туристов. В индуистской мифологии Эраван это слон с тремя головами.");
        }
        if(cur.contains("ВодопадТугела")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText(" Водопад Тугела - самый высокий в Африке и второй по высоте в мире (933 метра). Он расположен в районе Дракенсберг, Южная Африка.");
        }


        if(cur.contains("ЧарынскийКаньон")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Чарынский каньон, который еще называют местным «чудом», считается уникальным в своем роде памятником природы. Возраст осадочных пород, которые лежат в основе скал каньона достигает 12 млн лет. Поскольку внешне казахский Чарын очень напоминает американский Гранд-Каньон, местные жители в шутку его так и называют.");
        }
        if(cur.contains("КаньонВаймеа")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Следующим пунктом нашего путешествия станут Гавайские острова. Как оказалось, они могут похвастаться не только уникальными пляжами и круглосуточными вечеринками, но и настоящим каньоном, которые получил название Ваймеа.");
        }
        if(cur.contains("КаньонКолка")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Не менее грандиозное природное явление представляет из себя каньон Колка, что расположен в Перу. Он по праву считается самым глубоким в мире. Его глубина в некоторых местах достигает 3400 метров.");
        }
        if(cur.contains("КаньонРекиБлайд")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("А теперь давайте отправимся в южную часть африканского континента. Именно на территории современной ЮАР расположен еще один яркий представитель мира каньонов – каньон реки Блайд.");
        }
        if(cur.contains("ГленКаньон")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Не менее впечатляюще выглядит аризонский Глен Каньон. Именно сюда съезжаются американцы со всех уголков страны, подчеркивая, насколько популярным является это место.");
        }
        if(cur.contains("КаньонАнтилопы")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Еще одним ярким представителем «семейства» каньонов является Каньон Антилопы, который тоже расположен в Аризоне. Этот каньон вправе претендовать на звание самого необычного и красочного на планете.");
        }
        if(cur.contains("Гранд-Каньон")){
            ButtonTop.setVisibility(View.GONE);
            //TextName.setText("Гранд-Каньон представляет собой полноценный парк национального значения. Это одно из самых совершенных творений природы, рассказать о котором не хватит ни слов, ни времени. Первые упоминания о каньоне, как о туристической Мекке относятся к годам правления Т.Рузвельта, который очень любил охотиться в здешних краях и просто отдыхать.");
        }



        if(cur.contains("Маттерхорн")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("ВулканОрисаба")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Эльбрус")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("АйлендПик")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Аконкагуа")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Котопахи")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Рейнир")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Монблан")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Килиманджаро")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Кала-Патхар")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Тибет")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Аннапурна")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Канченджанга")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("НангаПарбат")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Монблан")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Маттерхорн")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Эйгер")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Броуд Пик")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Гашербрум")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Эверест")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }



        if(cur.contains("Мадейра")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Майорка")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Канары")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Кабо-Верде")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Мадагаскар")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Мальдивы")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Шри-Ланка")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Самун")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Пхукет")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Ко-Чанг")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Самет")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Бали")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Борнео")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("КомодскиеОстрова")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Джерба")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Фиджи")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Бора-Бора")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Доминикана")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Вануату")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Гавайи")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Багамы")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Мариета")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Сейшелы")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Маврикий")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }if(cur.contains("Куба")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Ямайка")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Мальта")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Кипр")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Сардиния")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Крит")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("ОстровПасхи")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }



        if(cur.contains("Байкал")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Комо")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Тахо")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Тегернзее")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Иссык-Куль")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Вольфгангзее")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Балатон")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("ЖеневскоеОзеро")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Лох-Несс")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Гарда")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Лугано")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Пяйянне")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }


        if(cur.contains("Франклин")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }if(cur.contains("Терек")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Китой")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Пис")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Чулышман")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Замбези")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Тумча")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Колорадо")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Прут")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Снежная")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Нил")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Арагви")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Футалеуфу")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Кору")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Алсек")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Ганг")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Непал")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Ноче")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Пакуаре")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Янцзы")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Брахмапутра")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Кутсайоки")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Катунь")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("ЮжныйБуг")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Карпаты")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }



        if(cur.contains("Вена")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Брюссель")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Лондон")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Берлин")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Дублин")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Вадуц")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }if(cur.contains("Люксембург")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Монако")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Амстердам")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Париж")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Берн")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Минск")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("София")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Будапешт")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Кишинёв")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Варшава")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Москва")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Бухарест")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Братислава")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Киев")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Прага")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Копенгаген")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Рейкьявик")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Осло")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Рига")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Вильнюс")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Хельсинки")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Стокгольм")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Таллин")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Тирана")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Андорра-ла-Велья")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Сараево")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Ватикан")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Афины")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Мадрид")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Рим")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }if(cur.contains("Скопье")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Валлетта")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Валлетта")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Сан-Марино")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Белград")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Любляна")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Загреб")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Подгорица")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }



        if(cur.contains("Баку")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Ереван")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Манама")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Тбилиси")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Иерусалим")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Амман")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Багдад")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Тегеран")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Сана")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Доха")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Никосия")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Эль-Кувейт")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Бейрут")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Абу-Даби")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Маскат")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Эр-Рияд")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Дамаск")) {
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Анкара")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Астана")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Бишкек")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Душанбе")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Ашхабад")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Ташкент")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Кабул")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Дакка")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Тхимпху")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Нью-Дели")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Мале")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Катманду")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Исламабад")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Шри-Джаяварденепура-Котте")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Пекин")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Пхеньян")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Сеул")) {
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Улан-Батор")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Токио")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Москва")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Бандар-Сери-Бегаван")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Ханой")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Джакарта")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Пномпень")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Вьентьян")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Куала-Лумпур")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Нейпьидо")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Сингапур")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Бангкок")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Дили")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }
        if(cur.contains("Манила")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
        }

        if(cur.contains("Австралися")){
            ButtonTop.setVisibility(View.GONE);
            TextName.setText("");
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