package com.company;

public class Item {
    private final String name;
    private final double basePrice;
    private final double promotionPrice;

    public Item(String name, double basePrice, double promotionPrice) {
        this.name = name;
        this.basePrice = basePrice;
        this.promotionPrice = promotionPrice;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getPromotionPrice() {
        return promotionPrice;
    }

    @Override
    public String toString() {
        return String.format("%-10s %10.2f %10.2f", name, basePrice, promotionPrice);
    }
}
