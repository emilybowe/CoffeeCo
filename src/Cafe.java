public class Cafe {

    public static int beansStock;
    public static int milkStock;
    public void restockBeans(int moreBeans){
        beansStock += moreBeans;
    }
    public void restockMilk(int moreMilk){milkStock += moreMilk;}

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
                if(milkStock <7 || beansStock <7){
                   throw new IllegalStateException("Not enough beans or milk");
                }
                else{
                    beansStock -=7;
                    milkStock -=7;
                    Coffee.beansUsed = 7;
                    Coffee.milkUsed = 7;
                    Coffee.coffeeType = CoffeeType.Latte;
                }
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
