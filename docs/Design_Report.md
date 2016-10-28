#Design Report for TicTacToe

##Hugbúnaðarfræði - Síðannarverkefni

**Hópur:**_ Ctrl+Alt+Del_ <br />
**Hópmeðlimir**:<br />
* Ásta Bergsdóttir - astab14@ru.is  <br />
* Bryndís Arna Borgþórsdóttir - bryndis15@ru.is <br />
* Carlos Ragnar Kárason - carlosk12 @ru.is  <br />
* Ólafur Albert Sævarsson - olafurs15@ru.is  <br />
* Maríus Sævarsson - marius15@ru.is  <br />
* Sandra Ösp Stefánsdóttir - sandras15@ru.is  <br />
* Sindri Örn Elvarsson - sindrie15@ru.is  <br />

##Upphafshönnun (e.Initial Design) <br />
Okkur fannst best að sýna þá upphafshönnun sem við vorum með í huga með því að búa til klasarit. 

##Forritunarreglur (e.Coding Rules) <br />

###Slaufusvigar<br />
Allir slaufusvigar eru skilgreindir strax á eftir skilgreiningu á falli eða klasa.

    public int myFunction(){
        ...
    }

###Klasar <br />
Allir slaufusvigar eru skilgreindir í nýrri línu á eftir klasanafni. <br />
Klasanöfn skulu byrja á stórum staf og alltaf fylgja Pascal casing. Klasanöfn skulu í öllum tilvikum vera lýsandi. <br />

    public class MyClass(){
        ...
    }

###Föll <br />
Fallanöfn skulu byrja á litlum staf og alltaf fylgja reglu um Camel casing. Fallanöfn skulu í öllum tilvikum vera lýsandi en þó ekki of löng. <br />
  
    public int myFunction(){
        ...
    }


###Breytur og fastar <br />
Breytur skulu byrja á litlum staf og alltaf fylgja reglu um Camel casing. Gott er að hafa breytuorð nafnorð. <br />

    int iCount = 0;


Fastar eru alltaf skrifaðir í hástöfum og ef fastinn heitir meira en einu nafni þá eru nöfnin aðskilin með niðurstriki á milli. 

    final int MAX_COUNT = 10;

###Comment <br/>
Lýsing  á virkni falls skal alltaf vera skilgreind í athugasemdi fyrir ofan fallið. <br />
Einnar línur comment byrja á "//"


##Forritunaraðferðir (Coding Method) <br />
###TDD <br />
Við notum TDD í verkefninu okkar sem er sem stendur fyrir Test Drive Development og er árangursríkt ferli um þróun á hugbúnaði. Ferlið byggir á því að skrifað er test fyrir hluta kerfisins og hann síðan fenginn til að feila. Næst er skrifaður kóði þangað til að testið gengur í gegn. Þá er hægt að commita kóðanum og einnig refactora ef þarf. 

###Branches <br />
Við ákváðum að best yrði að gera branch fyrir hvern hluta kerfisins. 

###Markdown syntax <br/ >
Til þess að útskýra verkefnið enn frekar erum við með þrjár skýrslur sem allar eru geymdar í möppu sem heitir "docs" í rótinni á verkefninu. 
Við notum _ markdown syntax_ í skýrslunum. 

###Pair programming <br />
Við studdumst að mestu leiti við pair programming í þessu verkefni. Okkur finnst það góð aðferð til þess að læra hvort af öðru og hlutirnir ganga hraðar fyrir sig. Við skiptumst á að kóða, þar sem hinn aðilinn las jafnóðum yfir kóðann og kom með athugasemdir ef þurfti. 


##Klasarit (Class Diagram)


![alt text](https://github.com/KontrolAltDelete/TicTacToe/blob/master/docs/images/Tictactoeclassdiagram.JPG)



