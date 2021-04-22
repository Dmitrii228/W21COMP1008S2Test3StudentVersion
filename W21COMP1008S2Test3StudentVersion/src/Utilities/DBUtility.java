package Utilities;

import models.InventoryItem;
import models.Skis;
import models.TennisRacquet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class DBUtility {

    public static List<String> getTennisRacquetHeadSizes()
    {
        return Arrays.asList("midsize","midplus","oversize","super oversize");
    }

    public static ArrayList<String> tennisEquipmentBrands()
    {
        ArrayList<String> tennisBrands = new ArrayList<>();
        tennisBrands.addAll(tennisRacquets().keySet());
        return tennisBrands;
    }

    public static ArrayList<String> tennisRacquetModelsByBrand(String brand)
    {
        ArrayList<String> models = new ArrayList<>();
        models.addAll(tennisRacquets().get(brand));
        return models;
    }

    public static TreeMap<String, List<String>> tennisRacquets()
    {
        TreeMap<String, List<String>> racquets = new TreeMap<>();
        racquets.put("Head", Arrays.asList("Challenge Lite","Ti S6","Graphene 360+ Instinct"));
        racquets.put("Babolat", Arrays.asList("Boost Aero","Pure Strike","Pure Drive Junior"));
        racquets.put("Dunlop", Arrays.asList("Black Zone 260","Srixon SX 300 Tour"));
        racquets.put("Wilson", Arrays.asList("Blade 98S V7.0","Pro Staff 25 Junior"));
        return racquets;
    }

    public static TreeMap<String, List<String>> getSkiInfo()
    {
        TreeMap<String, List<String>> skis = new TreeMap<>();
        skis.put("Atomic",Arrays.asList("Redster G9","Redster S9","Redster S7"));
        skis.put("Rossignol", Arrays.asList("Hero Athlete SL Pro", "Hero Elite ST","Hero Athlete FIS"));
        skis.put("Volkl", Arrays.asList("RaceTiger RC Red","RaceTiger SC Black", "RaceTiger SC Yellow"));
        return skis;
    }

    public static List<String> getSkiBrands()
    {
        ArrayList<String> brands = new ArrayList<>();
        brands.addAll(getSkiInfo().keySet());
        return brands;
    }

    public static ArrayList<String> getSkiModelByBrand(String brand) {
        ArrayList<String> models = new ArrayList<>();
        models.addAll(getSkiInfo().get(brand));
        return models;
    }
}
