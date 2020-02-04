public class Cafe {

    public static int beansStock;
    public static int milkStock;

    public void restockBeans(int moreBeans){
        beansStock += moreBeans;
    }

    public Coffee Brew(CoffeeType coffeeType){

        Coffee coffee = new Coffee();
        switch (coffeeType){
            case Espresso:{

            }
            case Latte:{

            }
            case Milk:{

            }
            default:{

            }
        }

        return coffee;
    }

}
