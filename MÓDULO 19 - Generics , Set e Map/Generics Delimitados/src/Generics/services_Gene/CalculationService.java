package Generics.services_Gene;

import java.util.List;

public class CalculationService<TypeGen> {

  public static <TypeGen extends Comparable <TypeGen> > TypeGen max(List<TypeGen> list) { // <TypeGen extends Comparable <TypeGen> > TypeGen max(List<TypeGen> list) {
    if (list.isEmpty()) { // Se a lista estiver vazia, retorna null
      throw new IllegalStateException(
        "List can't be empty || A lista não pode estar vazia"
      );
    }
    TypeGen max = list.get(0);
    for (TypeGen item : list) {
      if (item.compareTo(max) > 0) {
        max = item;
      }
    }
    return max;
  }
}
