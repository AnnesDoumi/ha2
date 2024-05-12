package htw.berlin.wi.prog2.domain;

import java.util.List;
import htw.berlin.wi.prog2.domain.Ingredient;

public interface InputParser {
    List<Ingredient> ingredientsFromInput(String inputLine);


}
