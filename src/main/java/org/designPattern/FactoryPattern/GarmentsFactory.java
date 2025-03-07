package org.designPattern.FactoryPattern;

public class GarmentsFactory {
    public Garments getGarment(String garmentType,ClothSize clothSize,ClothColor clothColor,double price){
        if(garmentType == null) return null;
        else if(garmentType.equalsIgnoreCase("SHIRT")) return new ShirtCollection(clothSize,clothColor,price);
        else if(garmentType.equalsIgnoreCase("PANT")) return  new PantCollection(clothSize,clothColor,price);
        else if(garmentType.equalsIgnoreCase("JEANS")) return  new JeansCollection(clothSize,clothColor,price);
        else if(garmentType.equalsIgnoreCase("T-SHIRT")) return  new TshirtCollection(clothSize,clothColor,price);
        return null;
    }
}
