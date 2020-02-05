public class Cafe {

    public static int beansStock;
    public static int milkStock;
    static final int MILK_SINGLE_SHOT = 7;
    static final int ESPRESSO_BEANS_SINGLE_SHOT = 7;
    public void restockBeans(int moreBeans){
        beansStock += moreBeans;
    }
    public void restockMilk(int moreMilk){milkStock += moreMilk;}

    public Coffee Brew(CoffeeType coffeeType){
        Coffee coffee = new Coffee();
        switch (coffeeType){
            case Espresso:{
            beansStock -= ESPRESSO_BEANS_SINGLE_SHOT;
            Coffee.beansUsed =ESPRESSO_BEANS_SINGLE_SHOT;
            Coffee.coffeeType = CoffeeType.Espresso;
            break;
            }
            case Latte:{
                if(milkStock <7 || beansStock <ESPRESSO_BEANS_SINGLE_SHOT){
                   throw new IllegalStateException("Not enough beans or milk");
                }
                else{
                    beansStock -=ESPRESSO_BEANS_SINGLE_SHOT;
                    milkStock -=ESPRESSO_BEANS_SINGLE_SHOT;
                    Coffee.beansUsed = ESPRESSO_BEANS_SINGLE_SHOT;
                    Coffee.milkUsed = MILK_SINGLE_SHOT;
                    Coffee.coffeeType = CoffeeType.Latte;
                }
            break;
            }
            case Milk:{
            Coffee.milkUsed = MILK_SINGLE_SHOT;
            Coffee.coffeeType = CoffeeType.Milk;
            break;
            }
            default:{
            System.out.println("invalid selection");
            break;
            }
        }
        return coffee;
    }

}
