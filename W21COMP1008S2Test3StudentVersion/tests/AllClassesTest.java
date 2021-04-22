import models.InventoryItem;
import models.Skis;
import models.SportStore;
import models.TennisRacquet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AllClassesTest {
    private TennisRacquet tennisRacquet1, tennisRacquet2, tennisRacquet3;
    private Skis skis1, skis2, skis3;
    private SportStore store;
    private ArrayList<InventoryItem> inventory;

    @BeforeEach
    void setUp() {
        tennisRacquet1 = new TennisRacquet("Head","Challenge Lite",240,"midsize",21.87,89.99,20);
        tennisRacquet2 = new TennisRacquet("Head","Ti S6",250,"midPlus",42.15,189.99,15);
        tennisRacquet3 = new TennisRacquet("Wilson","Blade 98S V7.0",310,"oversize",50.99,201.99,12);

        skis1 = new Skis("Rossignol","Hero Elite ST",165,310,899.76,10);
        skis2 = new Skis("Rossignol","Hero Elite ST",155,310,899.76,10);
        skis3 = new Skis("Volkl","RaceTiger SC Yellow",160,389.99,1099.76,4);

        inventory = new ArrayList<>();
//        inventory.add(tennisRacquet1);
//        inventory.add(tennisRacquet2);
//        inventory.add(tennisRacquet3);
//        inventory.add(skis1);
//        inventory.add(skis2);
//        inventory.add(skis3);

        store = new SportStore("123 Happy St", inventory);
    }

    /**************************************************************************
     * Uncomment these lines of code once you connect the TennisRacquet class to
     * the InventoryItem class
     *************************************************************************/
    @Test
    void setTRSuperClass() {
        assertTrue(tennisRacquet1 instanceof InventoryItem);
    }

    @Test
    void setIIQuantityInStockConstructor() {
        assertEquals(20, tennisRacquet1.getQuantityInStock());
    }

    @Test
    void setIIQuantityInStock() {
        tennisRacquet1.setQuantityInStock(30);
        assertEquals(30, tennisRacquet1.getQuantityInStock());
    }

    @Test
    void setIIQuantityInStockInvalidLowConstructor() {
        assertThrows(IllegalArgumentException.class, ()->
                new TennisRacquet("Head","Challenge Lite",239,"midsize",21.87,89.99,-1));
    }

    @Test
    void setIIQuantityInStockInvalidLow() {
        assertThrows(IllegalArgumentException.class, ()->
                tennisRacquet1.setQuantityInStock(-1));
    }

    @Test
    void setIIQuantitySold() {
        tennisRacquet1.setQuantitySold(5);
        assertEquals(15, tennisRacquet1.getQuantityInStock());
        assertEquals(5, tennisRacquet1.getQuantitySold());
    }

    @Test
    void setIIQuantitySoldAsAReturn() {
        tennisRacquet1.setQuantitySold(5);
        tennisRacquet1.setQuantitySold(-3);  //customer returns 3
        assertEquals(18, tennisRacquet1.getQuantityInStock());
        assertEquals(2, tennisRacquet1.getQuantitySold());
    }

    @Test
    void setIIQuantitySoldNotEnoughInventory() {
        assertThrows(IllegalArgumentException.class, ()->
                tennisRacquet1.setQuantitySold(30));
    }

    @Test
    void setIIPurchasePriceConstructor() {
        assertEquals(21.87, tennisRacquet1.getPurchasePrice());
    }

    @Test
    void setIIPurchasePrice() {
        tennisRacquet1.setPurchasePrice(34.44);
        assertEquals(34.44, tennisRacquet1.getPurchasePrice());
    }

    @Test
    void setIIPurchasePriceInvalidConstructor() {
        assertThrows(IllegalArgumentException.class, ()->
                new TennisRacquet("Head","Challenge Lite",240,"midsize",-0.01,89.99,20));
    }

    @Test
    void setIIPurchasePriceInvalid() {
        assertThrows(IllegalArgumentException.class, ()->
                tennisRacquet1.setPurchasePrice(-0.01));
    }

    @Test
    void setIISellingPriceConstructor() {
        assertEquals(89.99, tennisRacquet1.getSellingPrice());
    }

    @Test
    void setIISellingPrice() {
        tennisRacquet1.setSellingPrice(100.00);
        assertEquals(100.00, tennisRacquet1.getSellingPrice());
    }

    @Test
    void setIISellingPriceInvalidConstructor() {
        assertThrows(IllegalArgumentException.class, ()->
                new TennisRacquet("Head","Challenge Lite",240,"midsize",100.00,89.99,20));
    }

    @Test
    void setIISellingPriceInvalid() {
        assertThrows(IllegalArgumentException.class, ()->
                tennisRacquet1.setSellingPrice(20));
    }

    @Test
    void setIIgetProfit() {
        tennisRacquet1.setQuantitySold(5);
        //quantity sold * (sellingPrice - purchasePrice) = 5*(89.99-21.87)=340.60
        assertEquals(340.60, tennisRacquet1.getProfit(), 0.001);
    }



    /***************************************************************************
     * all the tests that start with "setTR" are TennisRacquet tests           *
     ***************************************************************************/


    @Test
    void setTRWeightConstuctor() {
        assertEquals(240, tennisRacquet1.getWeight());
    }

    @Test
    void setTRWeightConstuctor2() {
        assertEquals(250, tennisRacquet2.getWeight());
    }

    @Test
    void setTRWeightConstuctor3() {
        assertEquals(310, tennisRacquet3.getWeight());
    }

    @Test
    void setTRWeightConstructorInvalidLow() {
        assertThrows(IllegalArgumentException.class, ()->
                new TennisRacquet("Head","Challenge Lite",239,"midsize",21.87,89.99,20));
    }

    @Test
    void setTRWeightConstructorInvalidHigh() {
        assertThrows(IllegalArgumentException.class, ()->
                new TennisRacquet("Head","Challenge Lite",311,"midsize",21.87,89.99,20));
    }

    @Test
    void setTRWeightValid() {
        tennisRacquet2.setWeight(310);
        assertEquals(310, tennisRacquet2.getWeight());
    }

    @Test
    void setTRWeightInvalidLow() {
        assertThrows(IllegalArgumentException.class, ()->
                tennisRacquet2.setWeight(239));
    }

    @Test
    void setTRWeightInvalidHigh() {
        assertThrows(IllegalArgumentException.class, ()->
                tennisRacquet2.setWeight(311));
    }

    @Test
    void setTRHeadSizeMidsizeConstructor() {
        assertEquals("midsize",tennisRacquet1.getHeadSize());
    }

    @Test
    void setTRHeadSizeMidplusConstructor()
    {
        assertEquals("midplus",tennisRacquet2.getHeadSize());
    }

    @Test
    void setTRHeadSizeOversizeConstructor()
    {
        assertEquals("oversize",tennisRacquet3.getHeadSize());
    }

    @Test
    void setTRHeadSizeSuperOversize()
    {
        tennisRacquet1.setHeadSize("SUPER oversize");
        assertEquals("super oversize",tennisRacquet1.getHeadSize());
    }

    @Test
    void setTRHeadInvalid() {
        assertThrows(IllegalArgumentException.class, ()->
                tennisRacquet1.setHeadSize("big"));
    }

    @Test
    void setTRHeadInvalidConstructor() {
        assertThrows(IllegalArgumentException.class, ()->
                new TennisRacquet("Head","Challenge Lite",240,"big",21.87,89.99,20));
    }

    @Test
    void setTRBrandConstructor1() {
        assertEquals("Head",tennisRacquet1.getBrand());
    }

    @Test
    void setTRBrandConstructor2() {
        assertEquals("Wilson",tennisRacquet3.getBrand());
    }

    @Test
    void setTRBrandBabolat() {
        tennisRacquet3.setBrand("Babolat");
        assertEquals("Babolat",tennisRacquet3.getBrand());
    }

    @Test
    void setTRBrandDunlop() {
        tennisRacquet3.setBrand("Dunlop");
        assertEquals("Dunlop",tennisRacquet3.getBrand());
    }

    @Test
    void setTRBrandInvalidConstructor() {
        assertThrows(IllegalArgumentException.class, ()->
                new TennisRacquet("JDub","Challenge Lite",240,"midsize",21.87,89.99,20));
    }

    @Test
    void setTRBrandInvalid() {
        assertThrows(IllegalArgumentException.class, ()->
                tennisRacquet3.setBrand("Jdub"));
    }

    @Test
    void setTRModelConstructor() {
        assertEquals("Challenge Lite", tennisRacquet1.getModel());
    }

    @Test
    void setTRModelConstructor2() {
        assertEquals("Ti S6", tennisRacquet2.getModel());
    }

    @Test
    void setTRModelConstructor3() {
        assertEquals("Blade 98S V7.0", tennisRacquet3.getModel());
    }

    @Test
    void setTRModel() {
        tennisRacquet3.setModel("Pro Staff 25 Junior");
        assertEquals("Pro Staff 25 Junior", tennisRacquet3.getModel());
    }

    @Test
    void setTRModelInvalid() {
        assertThrows(IllegalArgumentException.class, ()->
                tennisRacquet3.setModel("Jdub"));
    }

    @Test
    void setTRModelInvalidConstructor() {
        assertThrows(IllegalArgumentException.class, ()->
                new TennisRacquet("Wilson","Boom",310,"midplus",50.99,201.99,12));
    }

    /***************************************************************************
     * all the tests that start with "setSki" are Skis tests                   *
     ***************************************************************************/
//    @Test
//    void setSkiSuperClass(){
//        assertTrue(skis1 instanceof InventoryItem);
//    }

    @Test
    void setSkiBrandRossignolConstructor() {
        assertEquals("Rossignol",skis1.getBrand());
    }

    @Test
    void setSkiBrandVolklConstructor() {
        assertEquals("Volkl",skis3.getBrand());
    }

    @Test
    void setSkiBrand() {
        skis2.setBrand("Atomic");
        assertEquals("Atomic",skis2.getBrand());
    }

    @Test
    void setSkiBrandConstructorInvalid() {
        assertThrows(IllegalArgumentException.class, ()->
                new Skis("Giant","Hero Elite ST",155,310,899.76,10));
    }

    @Test
    void setSkiBrandInvalid() {
        assertThrows(IllegalArgumentException.class, ()->
                skis2.setBrand("Giant"));
    }

    @Test
    void setSkiModelConstructor() {
        assertEquals("Hero Elite ST", skis1.getModel());
    }

    @Test
    void setSkiModel() {
        skis1.setModel("Hero Athlete SL Pro");
        assertEquals("Hero Athlete SL Pro", skis1.getModel());
    }

    @Test
    void setSkiModelConstructorInvalid() {
        assertThrows(IllegalArgumentException.class, ()->
                new Skis("Atomic","Hero Elite ST",155,310,899.76,10));
    }

    @Test
    void setSkiModelInvalid() {
        assertThrows(IllegalArgumentException.class, ()->
                skis2.setModel("Jdub"));
    }

    @Test
    void setSkiLengthConstructor() {
        assertEquals(165, skis1.getLength());
    }

    @Test
    void setSkiLengthConstructor2() {
        assertEquals(155, skis2.getLength());
    }

    @Test
    void setSkiLengthConstructor3() {
        assertEquals(160, skis3.getLength());
    }

    @Test
    void setSkiLengthValidLow() {
        skis3.setLength(60);
        assertEquals(60, skis3.getLength());
    }

    @Test
    void setSkiLengthValidHigh() {
        skis3.setLength(220);
        assertEquals(220, skis3.getLength());
    }

    @Test
    void setSkiLengthConstructorInvalidLow() {
        assertThrows(IllegalArgumentException.class, ()->
                new Skis("Rossignol","Hero Elite ST",59,310,899.76,10));
    }

    @Test
    void setSkiLengthConstructorInvalidHigh() {
        assertThrows(IllegalArgumentException.class, ()->
                new Skis("Rossignol","Hero Elite ST",221,310,899.76,10));
    }

    /***************************************************************************
     * the following tests exercise the SportStore class                       *
     ***************************************************************************/
    @Test
    void setAddressConstructor() {
        assertEquals("123 Happy St",store.getAddress());
    }

    @Test
    void setAddress() {
        store.setAddress("87 Excited Ave");
        assertEquals("87 Excited Ave",store.getAddress());
    }

    @Test
    void setAddressConstructorInvalid() {
        assertThrows(IllegalArgumentException.class, ()->
                new SportStore("  1    ", inventory));
    }

//    @Test
//    void sellItem() {
//        store.sellItem(tennisRacquet1, 7);
//        assertEquals(13, tennisRacquet1.getQuantityInStock());
//    }
//
//    @Test
//    void calculateProfit1()
//    {
//        store.sellItem(tennisRacquet1, 7);
//        //calculation for TR   = 7 * (89.99-21.87) = 476.84
//        assertEquals(476.84, store.calculateProfit(), 0.001);
//    }
//
//
//    @Test
//    void calculateProfit2()
//    {
//        store.sellItem(tennisRacquet1, 7);
//        store.sellItem(skis1, 2);
//        //calculation for TR   = 7 * (89.99-21.87) = 476.84
//        //calculation for skis = 2 * (899.76-310) = 1179.52
//        //total = 1656.36
//        assertEquals(1656.36, store.calculateProfit(), 0.001);
//    }

}