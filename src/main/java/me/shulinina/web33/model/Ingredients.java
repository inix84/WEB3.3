package me.shulinina.web33.model;
        import lombok.Data;
@Data
public class Ingredients {
    private final String nameIngredient;
    private final int  amountOfIngredient;     //ингредиенты
    private final String UnitOfMeasurement;    //Единица измерения
    public Ingredients(String nameIngredient, int numberOfIngredient, String unitOfMeasurement) {
        this.nameIngredient = nameIngredient;
        this.amountOfIngredient = numberOfIngredient;
        UnitOfMeasurement = unitOfMeasurement;
    }
    @Override
    public String toString() {
        return nameIngredient + amountOfIngredient + UnitOfMeasurement;
    }
    public String getNameIngredient() {
        return nameIngredient;
    }
    public int getNumberOfIngredient() {
        return amountOfIngredient;
    }
    public String getUnitOfMeasurement() {
        return UnitOfMeasurement;
    }
}