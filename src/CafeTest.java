import org.junit.Assert;
import org.junit.Test;

public class CafeTest {

    @Test
    public void canBrewEspresso(){

        //given
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);

        //when
        Coffee coffee = cafe.Brew(CoffeeType.Espresso);

        //then
        Assert.assertEquals(0, coffee.getMilk());
        Assert.assertEquals(7, coffee.getBeans());
        Assert.assertEquals(CoffeeType.Espresso, coffee.getType());
    }

    @Test
    public void brewingEspressoConsumesBeans(){

        //given
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);

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
        cafe.restockBeans(7);
        //cafe.restockMilk(7);

        //when
        Coffee coffee = cafe.Brew(CoffeeType.Latte);


    }



}
