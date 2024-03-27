import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

    public static void main(String[] args) throws Exception {
    /*
    !    Listas:
    
        •Lista é uma estrutura de dados:
        •Homogênea(dados do mesmo tipo)
        •Ordenada(elementos acessados por meio de posições)
        •Inicia vazia, e seus elementos são alocados sob demanda
        •Cada elemento ocupa um"nó"(ou nodo)da lista
    
    Tipo(interface):List
        •Classes que implementam:ArrayList, LinkedList, etc.
    
    !        •Vantagens:
        •Tamanho variável
        Facilidade para se realizar inserções e deleções
    
    •Desvantagens:
        •Acesso sequencial aos elementos
    
    
    !       ---|| Demostrativos ||----------
        
        •Tamanho da lista:    size()
        •Inserir elemento na lista:   add(obj),add(int,obj)
        •Remover elementos da lista:  remove(obj),remove(int),removeIf(Predicate)
        •Encontrar posição de elemento:   indexOf(obj),lastIndexOf(obj)
        
        •Filtrar lista com base em predicado:
                                               List<Integer>result=list.stream().filter(x->x>4).collect(Collectors
                                               .tolist());
        •Encontrar primeira ocorrência com base em predicado:
                                                               Integer result=list.stream().filter(x->x>4).findFirst
                                                               ().orElse(null);
                   
     */

        //%%   Declarar lista com Strings
        List <String> list_String = new ArrayList <String>();

        //-------- Adicionar itens a lista
        list_String.add("Miguel");
        list_String.add("Margoth");
        list_String.add("Nina");
        list_String.add("Manuela");
        list_String.add("Mergentina ");
        list_String.add("Snow");
        list_String.add(2, "Adicionado aqui--- Frederico"); //--- Para adicionar um elemento na posição desejada

        for(String x_String : list_String) {
            System.out.println(x_String);
        }

        System.out.println("--------------------------------------------------------------------------");

        //%%   Declarar lista com Inteiros
        List <Integer> list_Int = new ArrayList <>();

        //-------- Adicionar itens a lista
        list_Int.add(1);
        list_Int.add(5);
        list_Int.add(2);
        list_Int.add(35235);

        for(Integer x_int : list_Int) {
            System.out.println(x_int);
        }

        System.out.println("----------------------------------------------------------------");

        //%%   para saber o tamanho da lista
        System.out.println(list_Int.size());        //------------ o tamanho da lista com números inteiros
        System.out.println(list_String.size());     //------------ o tamanho da lista com strings

        //%%   Remover da lista
        list_Int.remove(2); // remove o elemento da posição desejada
        list_String.remove("Adicionado aqui--- Frederico"); // remove o elemento informado
        System.out.println(list_Int);
        System.out.println(list_String);


        //%%   Remover da lista em predicado
        list_String.removeIf(x -> x.charAt(0) == 'S'); // remove o elemento da posição desejada que começam com S

        //%%   Encontrar posição de elemento
        System.out.println("Index of NINA: " + list_String.indexOf("Nina")); // encontrar a posição da nina
        System.out.println("Index of não tem: " + list_String.indexOf("não")); // caso não tenha aparece -1

        //%%    Filtrar a lista
        // --- Filtrar a lista para que somente fique na lista os que tenham nomes começados co "M"
        List <String> result_y = list_String
                .stream()
                .filter(y -> y.charAt(0) == 'M')
                .collect(Collectors.toList());
        //System.out.println(result);

        for(String y : result_y) {
            System.out.println(y);
        }
        //---- Para retornar o primeiro elemento que começa com a letra "M".
        String name = list_String
                .stream()
                .filter(y -> y.charAt(0) == 'M')
                .findFirst()
                .orElse(null);
        System.out.println(name);

        //---- Para retornar o primeiro elemento que contenha algum caractere
        String name2 = list_String
                .stream()
                .filter(y -> y.charAt(0) == 'S')
                .findAny()
                .orElse(null);
        System.out.println(name2);
    }
}
