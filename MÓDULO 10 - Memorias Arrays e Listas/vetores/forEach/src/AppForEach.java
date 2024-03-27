public class AppForEach {
    public static void main(String[] args) throws Exception {
        /*
        Leitura do Código :
         */
        String[] vector = new String[] {"Elemento A:", "Elemento B:", "Elemento C:"};


        //%%     Forma Convencional
        System.out.println("//---------------------------FOR CONVENCIONAL-----------------------------------");
        for(int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

        //%%     Forma com FOR EACH
        System.out.println("//--------------------------   FOR EACH   ------------------------------------");
        for(String termoASerUsado : vector) {
            // String => Tipo do objeto   || termoASerUsado => Valor a ser desenvolvido em cada objeto  || vector
            // o que ser percorrido
            System.out.println(termoASerUsado);
        }
        System.out.println();
    }
}
