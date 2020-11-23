package main.java;

public class Cow extends AnimalImpl {   
    public Cow(String name) {
        super(name);
        this.cost = AnimalConstants.COW_COST;
        this.animalType = "Cow";
        this.productType = AnimalConstants.COW_PRODUCT;
        this.productLimit = AnimalConstants.COW_PRODUCT_LIMIT;
    }
    
    public Cow(String name, int age) {
        super(name, age);
        this.cost = AnimalConstants.COW_COST;
        this.animalType = "Cow";
        this.productType = AnimalConstants.COW_PRODUCT;
        this.productLimit = AnimalConstants.COW_PRODUCT_LIMIT;
    }   
}
