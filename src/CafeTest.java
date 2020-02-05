import org.junit.Assert;
import org.junit.Test;

public class CafeTest {

    @Test
    public void canBrewEspresso(){

        //given
        Cafe cafe = new Cafe();
        cafe.restockBeans(Cafe.ESPRESSO_BEANS_SINGLE_SHOT);

        //when
        Coffee coffee = cafe.Brew(CoffeeType.Espresso);

        //then
        Assert.assertEquals(0, coffee.getMilk());
        Assert.assertEquals(Cafe.ESPRESSO_BEANS_SINGLE_SHOT, coffee.getBeans());
        Assert.assertEquals(CoffeeType.Espresso, coffee.getType());
    }

    @Test
    public void brewingEspressoConsumesBeans(){

        //given
        Cafe cafe = new Cafe();
        cafe.restockBeans(Cafe.ESPRESSO_BEANS_SINGLE_SHOT);

        //when
        Coffee coffee = cafe.Brew(CoffeeType.Espresso);

        //then
        Assert.assertEquals(0, cafe.beansStock);
    }

    //then
    @Test(expected = IllegalStateException.class)
    public void latteRequiresMilk(){

        //given
        Cafe cafe = new Cafe();
        cafe.restockBeans(Cafe.ESPRESSO_BEANS_SINGLE_SHOT);
        //cafe.restockMilk(7);

        //when
        Coffee coffee = cafe.Brew(CoffeeType.Latte);


    }



}
