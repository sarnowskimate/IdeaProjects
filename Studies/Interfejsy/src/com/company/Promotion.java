package com.company;

public class Promotion implements DataList {
    String promotiomInfo;
    Item[] items;

    public Promotion(String promotiomInfo, Item[] items) {
        this.promotiomInfo = promotiomInfo;
        this.items = items;
    }

    @Override
    public String title() {
        return promotiomInfo;
    }

    @Override
    public String[] listView() {
        String[] list = new String[items.length];
        for (int i = 0; i < list.length; i++) {
            list[i] = items[i].toString();
        }
        return list;
    }

    @Override
    public String additionalInfo() {
        double baseSum = 0, promotionSum = 0, avgDiscount = 0;
        for (int i = 0; i < items.length; i++) {
            baseSum += items[i].getBasePrice();
            promotionSum += items[i].getPromotionPrice();
        }

        avgDiscount = 100 * (baseSum - promotionSum) / baseSum;
        return String.format("Avarage discount: %16.2f %%", avgDiscount);
    }

}
