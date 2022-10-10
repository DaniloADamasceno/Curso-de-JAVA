package Sem_Generics.services;

import java.util.List;

import Generics.entities.Product;

public class CalculationService {
 
      public static Product max(List<Product> list) {

        if (list.isEmpty()) {// Se a lista estiver vazia, retorna null
          throw new IllegalStateException("List can't be empty || A lista não pode estar vazia");
        }
        Product max = list.get(0);
        for (Product item : list) {
          if (item.compareTo(max) > 0) {
            max = item;
          }
        }
        return max;
      }
}