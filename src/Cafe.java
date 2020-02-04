public class Cafe {

    public static int beansStock;
    public void restockBeans(int moreBeans){
        beansStock += moreBeans;
    }

    public Coffee Brew(CoffeeType coffeeType){
        Coffee coffee = new Coffee();
        switch (coffeeType){
            case Espresso:{
            beansStock -=7;
            Coffee.beansUsed =7;
            Coffee.coffeeType = CoffeeType.Espresso;
            break;
            }
            case Latte:{
            beansStock-=7;
            Coffee.beansUsed = 7;
            Coffee.milkUsed = 7;
            Coffee.coffeeType = CoffeeType.Latte;
            break;
            }
            case Milk:{
            Coffee.milkUsed = 7;
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
