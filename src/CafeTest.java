import org.junit.Assert;
import org.junit.Test;

public class CafeTest {

    @Test
    public void canBrewEspresso(){

        //given
        Cafe cafe = cafeWithBeans();

        //when
        Coffee coffee = cafe.Brew(CoffeeType.Espresso);

        //then
        Assert.assertEquals("Wrong amount of milk in coffee",Cafe.NO_MILK, coffee.getMilk());
        Assert.assertEquals("Wrong amount of beans in coffee", Cafe.ESPRESSO_BEANS_SINGLE_SHOT, coffee.getBeans());
        Assert.assertEquals("Wrong type of coffee", CoffeeType.Espresso, coffee.getType());
    }

    private Cafe cafeWithBeans() {
        Cafe cafe = new Cafe();
        cafe.restockBeans(Cafe.ESPRESSO_BEANS_SINGLE_SHOT);
        return cafe;
    }

    @Test
    public void brewingEspressoConsumesBeans(){

        //given
        Cafe cafe = cafeWithBeans();

        //when
        Coffee coffee = cafe.Brew(CoffeeType.Espresso);

        //then
        Assert.assertEquals("Wrong amount of beans in stock", Cafe.NO_ESPRESSO_BEANS, cafe.beansStock);
    }

    //then
    @Test(expected = IllegalStateException.class)
    public void latteRequiresMilk(){

        //given
        Cafe cafe = cafeWithBeans();
        //cafe.restockMilk(7);

        //when
        Coffee coffee = cafe.Brew(CoffeeType.Latte);
    }



}
