package curiositygame;

import java.util.Scanner;

public class CuriosityGame {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int risposta;
        char continua;

        System.out.println("ciao! questo e' il gioco delle curiosita' casuali.");

        do {

            do {
                System.out.println("scegli l'argomento per generare una curiosita' casuale:");
                System.out.println("1 arte");
                System.out.println("2 storia");
                System.out.println("3 scienza");
                System.out.println("4 film");
                System.out.println("5 sport");
                System.out.println("6 geografia");
                System.out.println(" ");

                risposta = in.nextInt();

            } while (risposta < 1 || risposta > 6);

            String arte[] = new String[10];
            String storia[] = new String[10];
            String scienza[] = new String[10];
            String film[] = new String[10];
            String sport[] = new String[10];
            String geografia[] = new String[10];

            arte[0] = "Il Codice da Vinci e' stato respinto per anni: Leonardo da Vinci dipinse il celebre dipinto \"La Gioconda\" tra il 1503 e il 1506,"
                    + " ma mori' senza mai considerarlo finito. Il dipinto divenne famoso dopo la sua morte.";
            arte[1] = "Il dipinto piu' grande del mondo non e' un dipinto: L'opera d'arte piu' grande al mondo e' \"Wrapped Coast\" di Christo e Jeanne-Claude,"
                    + " che copriva 1,5 chilometri di costa australiana nel 1969.";
            arte[2] = "Un misterioso sorriso su Mona Lisa: Il sorriso enigmatico di Mona Lisa e' stato soggetto a numerose teorie nel corso degli anni."
                    + " Alcuni credono che il sorriso sia dovuto a una malattia dentale, mentre altri pensano che Leonardo abbia dipinto un sorriso sottile per rendere il volto piu' misterioso.";
            arte[3] = "Un quadro che cambia la percezione del tempo: \"La persistenza della memoria\" di Salvador Dali', comunemente nota come \"i quadri degli orologi sciolti\","
                    + " e' stata creata nel 1931 ed e' diventata un'icona del surrealismo.";
            arte[4] = "La Monna Lisa e' stata rubata una volta: Nel 1911, la Monna Lisa e' stata rubata dal Louvre. E' stata recuperata due anni dopo,"
                    + " quando il ladro ha cercato di venderla a un collezionista italiano.";
            arte[5] = "La tecnica della sfumatura: La tecnica della sfumatura, chiamata \"sfumato\", e' stata inventata da Leonardo da Vinci."
                    + " Questo metodo consiste nell'applicare uno strato di vernice trasparente per creare una transizione morbida tra i colori.";
            arte[6] = "Il primo artista a dipingere se stesso: Albrecht Durer e' stato il primo artista ad autoritrarsi"
                    + " con la sua opera \"Autoritratto a tredici anni\" nel 1484.";
            arte[7] = "Il quadro piu' costoso mai venduto: \"Interchange\" di Willem de Kooning,"
                    + " e' stato venduto privatamente nel 2015 per circa 300 milioni di dollari.";
            arte[8] = "Il quadro piu' grande del mondo: Il dipinto piu' grande del mondo e' \"Crossroads\" di Atena Tarsouli,"
                    + " che misura 45.493 metri quadrati ed e' stato realizzato nel 2017.\n";
            arte[9] = "Arte astratta casuale: L'artista Jackson Pollock e' famoso per la sua tecnica di \"dripping\", che consiste nel far gocciolare la vernice su tela."
                    + " Molti ritengono che le sue opere siano solo \"sprechi\" casuali di colore, ma c'e' molto di piu' sotto la superficie.";

            storia[0] = "La Biblioteca di Alessandria: Fondata nel III secolo a.C. ad Alessandria d'Egitto, la Biblioteca di Alessandria e' stata uno dei piu' grandi centri di apprendimento dell'antichita',"
                    + " con una vasta collezione di testi provenienti da tutto il mondo mediterraneo.";
            storia[1] = "Il Codice di Hammurabi: Il Codice di Hammurabi, scritto intorno al 1754 a.C., e' uno dei primi codici di legge conosciuti al mondo."
                    + " Contiene una serie di leggi e pene, con l'idea di \"occhio per occhio, dente per dente\".";
            storia[2] = "L'eta' dei pirati: L'eta' dei pirati, comunemente associata al XVII e XVIII secolo, e' stata caratterizzata da una proliferazione di pirati nell'oceano Atlantico,"
                    + " nel Mar dei Caraibi e in altre regioni. Pirati famosi come Barbanera e Capitan Kidd hanno terrorizzato i mari.";
            storia[3] = "La peste nera: La peste nera, una pandemia di peste bubbonica, ha devastato l'Europa nel XIV secolo, uccidendo tra il 30% e il 60% della popolazione europea."
                    + " Ha avuto un impatto significativo sulla societa', sull'economia e sulla cultura dell'epoca.\n";
            storia[4] = "La costruzione della Grande Muraglia Cinese: La costruzione della Grande Muraglia Cinese e' iniziata nel III secolo a.C. e si e' estesa per oltre 2.300 chilometri."
                    + " E' una delle piu' grandi opere difensive mai realizzate ed e' visibile anche dallo spazio.\n";
            storia[5] = "L'età dell'esplorazione: Nel XV e XVI secolo, i paesi europei hanno intrapreso grandi viaggi di esplorazione in tutto il mondo. Esploratori come Cristoforo Colombo,"
                    + " Vasco da Gama e Ferdinando Magellano hanno contribuito a mappare il mondo e a stabilire legami commerciali globali.\n";
            storia[6] = "La Rivoluzione Industriale: La Rivoluzione Industriale, iniziata nel Regno Unito nel XVIII secolo, ha segnato il passaggio dalla produzione artigianale alla produzione meccanizzata."
                    + " Ha portato a cambiamenti radicali nella societa', nell'economia e nella vita quotidiana.\n";
            storia[7] = "La guerra fredda: Dopo la seconda guerra mondiale, e' emerso un periodo di tensione geopolitica tra gli Stati Uniti e l'Unione Sovietica, noto come guerra fredda. "
                    + "Questo periodo ha visto una competizione per l'influenza globale, con minacce di conflitto nucleare.";
            storia[8] = "La caduta del Muro di Berlino: Il 9 novembre 1989, il Muro di Berlino e' stato abbattuto, segnando la fine della divisione"
                    + " tra Berlino Est e Berlino Ovest e il simbolo più visibile della caduta del comunismo in Europa orientale.";
            storia[9] = "Il primo uomo sulla Luna: Il 20 luglio 1969, l'astronauta statunitense Neil Armstrong e' diventato il primo uomo a camminare sulla Luna,"
                    + " pronunciando la celebre frase \"Un piccolo passo per un uomo, un balzo da gigante per l'umanita'\".\n";

            scienza[0] = "La teoria dell'evoluzione di Darwin: Charles Darwin ha pubblicato \"L'origine delle specie\" nel 1859,"
                    + " proponendo la teoria dell'evoluzione per spiegare la diversita' delle forme di vita sulla Terra.";
            scienza[1] = "La scoperta dei raggi X: Nel 1895, il fisico tedesco Wilhelm Conrad Rontgen ha scoperto i raggi X mentre sperimentava con tubi catodici. "
                    + "Questa scoperta ha rivoluzionato la medicina e la diagnosi radiografica.";
            scienza[2] = "La struttura del DNA: Nel 1953, James Watson e Francis Crick hanno scoperto la struttura a doppia elica del DNA, "
                    + "portando a una maggiore comprensione della genetica e della biologia molecolare.";
            scienza[3] = "La teoria della relativita' di Einstein: Nel 1905, Albert Einstein ha formulato la teoria della relativita' ristretta, che descrive il comportamento di oggetti in movimento ad alte velocita'."
                    + " Nel 1915, ha sviluppato la teoria della relativita' generale, che rivoluziono' la nostra comprensione dello spazio, del tempo e della gravita'.";
            scienza[4] = "La scoperta dei neutrini: Nel 1956, i fisici Clyde Cowan e Frederick Reines hanno confermato l'esistenza dei neutrini,"
                    + " particelle subatomiche estremamente sfuggenti, aprendo la strada a nuove ricerche sulla fisica delle particelle.";
            scienza[5] = "Il primo trapianto di cuore umano: Nel 1967, il chirurgo sudafricano Christiaan Barnard ha eseguito il primo trapianto di cuore umano riuscito su un paziente."
                    + " Questo evento ha segnato un importante progresso nella chirurgia cardiovascolare.";
            scienza[6] = "La scoperta dei buchi neri: Nel 1971, i fisici Stephen Hawking e Roger Penrose hanno dimostrato matematicamente l'esistenza dei buchi neri,"
                    + " regioni dello spazio in cui la gravita' e' cosi' intensa da impedire persino alla luce di sfuggire.";
            scienza[7] = "La decifrazione del codice genetico: Nel 1961, il biologo molecolare Marshall Nirenberg e il biochimico Heinrich Matthaei hanno scoperto come l'RNA traduca le istruzioni del DNA in proteine,"
                    + " aprendo la strada alla comprensione del codice genetico.";
            scienza[8] = "Il sequenziamento del genoma umano: Nel 2003, il Progetto Genoma Umano ha completato con successo il sequenziamento del genoma umano,"
                    + " un importante traguardo nella ricerca biomedica che ha fornito nuove informazioni sulla nostra biologia e sulla malattia.";
            scienza[9] = "La scoperta dell'antibiotico penicillina: Nel 1928, lo scienziato britannico Alexander Fleming ha scoperto casualmente l'antibiotico penicillina mentre studiava batteri. "
                    + " Questa scoperta ha rivoluzionato il trattamento delle infezioni batteriche e ha salvato milioni di vite.";

            film[0] = "Il film piu' redditizio di sempre: \"Avatar\" di James Cameron, uscito nel 2009, ha incassato oltre 2,7 miliardi di dollari in tutto il mondo, rendendolo il film piu' redditizio di sempre.";

            film[1] = "Il film piu' premiato agli Oscar: \"Il Signore degli Anelli - Il ritorno del re\" ha vinto 11 premi Oscar su 11 nomination nel 2004, incluso il premio per il Miglior Film.";

            film[2] = "Il cameo piu' famoso: Alfred Hitchcock e' noto per i suoi cameo nei suoi film. Ha fatto brevi apparizioni in 39 dei suoi 52 film, spesso in modo molto discreto.";

            film[3] = "La prima proiezione cinematografica pubblica: La prima proiezione cinematografica pubblica della storia e' avvenuta il 28 dicembre 1895 al Salon Indien du Grand Cafe' di Parigi. "
                    + "I film proiettati includevano \"L'arrivo di un treno alla stazione\" dei fratelli Lumiere.";
            film[4] = "Il film piu'lungo della storia: \"Logistics\" è un film sperimentale svedese del 2012, diretto da Erika Magnusson e Daniel Andersson, con una durata di 857 ore (circa 35 giorni).";

            film[5] = "La piu' grande collezione di film: Nel 2016, il Guinness World Records ha riconosciuto la collezione di film di un italiano, Bob Iannucci, come la più grande al mondo, con oltre 250.000 pezzi.";

            film[6] = "Il film con piu' incassi al botteghino in un giorno: \"Avengers: Endgame\" ha incassato 157,5 milioni di dollari nel suo primo giorno di uscita negli Stati Uniti, stabilendo un nuovo record nel 2019.";

            film[7] = "Il film piu' costoso di sempre: \"Pirati dei Caraibi: ai confini del mondo\" (2007) detiene il record per il film piu' costoso mai realizzato, con un budget di produzione stimato di oltre 300 milioni di dollari.";

            film[8] = "Il film con piu' effetti speciali: \"King Kong\" (2005) di Peter Jackson ha impiegato piu' di 3.000 effetti speciali visivi, rendendolo uno dei film con piu' effetti speciali della storia del cinema.";

            film[9] = "La piu' lunga sequenza di combattimento: Il film coreano \"Oldboy\" (2003) contiene una sequenza di combattimento in singolo piano di quasi tre minuti, "
                    + "che e' stata girata senza interruzioni ed e' considerata una delle piu' lunghe mai realizzate.";

            sport[0] = "La piu' antica competizione sportiva ancora in corso: Le Olimpiadi moderne, che risalgono alla Grecia antica, sono la più antica competizione sportiva ancora in corso, con una storia di oltre 2.700 anni.";

            sport[1] = "Il primo sport olimpico: Il lotta e' stato uno dei primi sport olimpici, facendo parte del programma delle Olimpiadi antiche gia' dal 708 a.C.";

            sport[2] = "La corsa piu' lunga del mondo: La Marathon des Sables, una gara di corsa in auto-sufficienza attraverso il deserto del Sahara in Marocco,"
                    + " e' considerata la corsa piu' lunga del mondo, con una distanza totale di circa 250 chilometri.";
            sport[3] = "Il calcio e le sue origini: Il calcio moderno ha le sue radici in Inghilterra nel Medioevo, ma antiche culture come gli antichi cinesi, i greci e i romani hanno praticato giochi simili.";

            sport[4] = "Il record di gol in una singola partita di calcio: Il record mondiale per il maggior numero di gol segnati da un singolo giocatore in una partita ufficiale e' di 16 gol,"
                    + " stabilito da Stephan Stanis del Racing Club de Lens durante una partita del campionato francese del 1942.";
            sport[5] = "Il piu' vecchio vincitore di un torneo del Grande Slam: Nel 1972, il tennista australiano Ken Rosewall ha vinto l'Open d'Australia all'eta' di 37 anni, facendone il più vecchio vincitore di un torneo del Grande Slam.";

            sport[6] = "Il piu' giovane medagliato olimpico: Dimitrios Loundras, un ginnasta greco, ha vinto la medaglia di bronzo alle Olimpiadi di Atene del 1896 all'eta'di 10 anni e 218 giorni, rendendolo il piu' giovane medagliato olimpico nella storia.";

            sport[7] = "Il piu' lungo incontro di tennis: Il match di tennis più lungo della storia si e' svolto durante il primo turno del torneo di Wimbledon del 2010, quando John Isner ha sconfitto Nicolas Mahut in un incontro che e' durato 11 ore e 5 minuti,"
                    + " distribuito su tre giorni.";
            sport[8] = "Il record del mondo nei 100 metri piani: Usain Bolt detiene il record mondiale nei 100 metri piani con un tempo di 9,58 secondi, stabilito durante i Campionati del Mondo di Atletica Leggera del 2009 a Berlino.";

            sport[9] = "Il piu' alto salto in alto: Il record mondiale per il salto in alto all'aperto e' detenuto dal cubano Javier Sotomayor, che ha saltato 2,45 metri il 27 luglio 1993 a Salamanca, in Spagna.";

            geografia[0] = "Il Monte Everest e' in continua crescita: L'Everest, la montagna piu' alta del mondo, cresce di circa 4 millimetri ogni anno a causa dell'attività tettonica.";

            geografia[1] = "Il confine tra Canada e Stati Uniti e' il piu' lungo al mondo: Il confine terrestre tra Canada e Stati Uniti e' il piu' lungo al mondo, estendendosi per oltre 8.800 chilometri.";

            geografia[2] = "Il punto piu' basso sulla terra non e' il Polo Sud: Il punto più basso sulla terra e' la Fossa delle Marianne nell'Oceano Pacifico, che raggiunge una profondità di circa 11 chilometri sotto il livello del mare.";

            geografia[3] = "Il lago piu' profondo del mondo: Il Lago Baikal in Siberia e' il lago più profondo del mondo, con una profondità massima di circa 1.642 metri.";

            geografia[4] = "Il confine tra Norvegia e Russia e' il piu' orientale d'Europa: Il punto piu' orientale dell'Europa si trova lungo il confine tra Norvegia e Russia, nella penisola di Kola.";

            geografia[5] = "La pioggia di pesci: Ogni anno, nella citta' di Yoro, in Honduras, cade una pioggia di pesci durante la stagione delle piogge. Si ritiene che i pesci vengano trasportati dalle nuvole dai venti provenienti dal lago vicino.";

            geografia[6] = "Il punto piu' caldo sulla Terra: Il punto piu' caldo sulla Terra e' il deserto di Lut, in Iran, dove la temperatura del terreno e' stata registrata fino a 70,7^C.";

            geografia[7] = "Il punto piu' freddo sulla Terra: Il punto piu' freddo sulla Terra e' nella Base Antartica Vostok, dove la temperatura è scesa fino a -89,2^C.";

            geografia[8] = "Il luogo piu' umido sulla Terra: Mawsynram, un villaggio nell'India nord-orientale, e' considerato il luogo piu' umido sulla Terra, con una media annuale di oltre 11 metri di pioggia.";

            geografia[9] = "Il Paese piu' piccolo del mondo: Il Vaticano e' il Paese piu' piccolo del mondo, con una superficie di appena 44 ettari. E' anche l'unico stato al mondo interamente situato all'interno di un'altra nazione, cioe' l'Italia.";

            switch (risposta) {

                case 1:
                    int num1 = (int) (Math.random() * 10);
                    System.out.println(arte[num1]);
                    break;
                case 2:
                    int num2 = (int) (Math.random() * 10);
                    System.out.println(storia[num2]);
                    break;
                case 3:
                    int num3 = (int) (Math.random() * 10);
                    System.out.println(scienza[num3]);
                    break;
                case 4:
                    int num4 = (int) (Math.random() * 10);
                    System.out.println(film[num4]);
                    break;
                case 5:
                    int num5 = (int) (Math.random() * 10);
                    System.out.println(sport[num5]);
                    break;
                case 6:
                    int num6 = (int) (Math.random() * 10);
                    System.out.println(geografia[num6]);
                    break;
            }
            System.out.println("\n");
            System.out.println("vuoi generare delle nuove curiosita'? (s/n)");
            continua = in.next().charAt(0);

        } while (continua == 's' || continua == 'S');
        in.close();

    }

}
