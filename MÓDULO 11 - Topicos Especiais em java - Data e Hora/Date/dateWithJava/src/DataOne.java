//import java.net.CacheRequest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
//import java.util.spi.CalendarDataProvider;

public class DataOne {

    public static void main(String[] args) throws ParseException {
    /*
        para armazenar a data e hora atual no formato UTC
              Formato: yyyy - MM  ddTHH:mm:ssZ
              yyyy ---> Ano
              MM ---> Mês
              ddTHH:mm:ssZ ---> dia, hora, minuto e segundo
                                        //!     Exemplo :   2020-05-31T10:29:59Z"
        
         */

        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.ENGLISH);

        //---------------------------
        //||      Criando os formatos de Data e Hora
        //---------------------------

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");             //---------- para ter somente a data
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");    //----- Para ter a data com a hora
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");    //----- Para ter a data com a hora
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));                              //------------------ Para ter a
        // data com a hora no formato GMT

        //-----------------------
        //||      Criando uma Data
        //-----------------------

        //------ Tem que importar a biblioteca do DATE
        Date DateOne = sdf1.parse("30/05/2020");                // ----- Data
        Date DateTwo = sdf2.parse("15/05/2022 15:50:56");       //----- Data com a hora
        Date DateTree = Date.from(Instant.parse("2022-05-15T15:50:56Z")); //----- Data com a hora

        System.out.println("Date One: " + DateOne);
        System.out.println("Date Two: " + DateTwo);
        System.out.println("DAte Tree: " + DateTree);

        System.out.println();
        System.out.println("-------------------------------------------------");
        //-----------------------
        //||      Imprimir nos Formatos Selecionados
        //-----------------------

        System.out.println("Date Two Formato Selecionado: " + sdf2.format(DateTwo));
        System.out.println("Date One Formato Selecionado: " + sdf1.format(DateOne));

        System.out.println();
        System.out.println("-------------------------------------------------");
        //-----------------------
        //||      Criando no formato Atual
        //-----------------------

        Date DateAtual = new Date();                    //------- Cria a Data no formato atual

        System.out.println("Data Atual sem Formatação: " + DateAtual);

        //--------------------------
        //||      Manipulando Data com Calendar
        //--------------------------
        SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date DateCalendar = Date.from(Instant.parse("2021-01-01T10:11:22Z"));

        Calendar cal = Calendar.getInstance();

        cal.setTime(DateCalendar);
        cal.set(Calendar.HOUR_OF_DAY, -5);              // para adicionar  5 horas a data atual
        DateCalendar = cal.getTime();                   // para pegar a data atual com as 5 horas adicionadas
        System.out.println("Data Atual com 5 horas adicionadas: " + sdf4.format(DateCalendar));

        System.out.println("-------------------------------------------------");
        //--------------------------
        //||      Para obter o valor desejado em uma data
        //--------------------------

        int Minutes = cal.get(Calendar.MINUTE);         // para obter o valor do minuto da variável Cal
        int Mes = 1 + cal.get(Calendar.MONTH);          // para obter o valor do mes da variável Calendar
        int Ano = cal.get(Calendar.YEAR);               // para obter o valor do ano da variável Calendar
        int Dia = cal.get(Calendar.DAY_OF_MONTH);       // para obter o valor do dia da variável Calendar
        int DiaSemana = cal.get(Calendar.DAY_OF_WEEK);  // para obter o valor do dia da semana da variável Calendar
        System.out.println("Minutos: " + Minutes);
        System.out.println("Mes: " + Mes);
        System.out.println("Ano: " + Ano);
        System.out.println("Dia: " + Dia);
        System.out.println("Dia da Semana: " + DiaSemana);
        System.out.println();
        in.close();
    }
}
