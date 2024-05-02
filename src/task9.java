class CookingRecipe {
    public void prepareRecipe() {
        boilWater();
        addIngredients();
        cook();
        serve();
    }

    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected void addIngredients() {
        System.out.println("Adding ingredients");
    }

    protected void cook() {
        System.out.println("Cooking");
    }

    protected void serve() {
        System.out.println("Serving");
    }
}

class PastaRecipe extends CookingRecipe {
    @Override
    public void addIngredients() {
        System.out.println("Adding pasta");
    }

    @Override
    public void cook() {
        System.out.println("Cooking pasta");
    }
}

class CakeRecipe extends CookingRecipe {
    @Override
    public void addIngredients() {
        System.out.println("Adding flour, sugar, eggs, etc.");
    }

    @Override
    public void cook() {
        System.out.println("Baking the cake in the oven");
    }
}
