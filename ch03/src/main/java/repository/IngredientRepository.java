package repository;

import domain.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}
