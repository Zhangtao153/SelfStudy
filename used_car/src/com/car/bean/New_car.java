package com.car.bean;

import java.math.BigDecimal;

/**
 * @author zth
 * @Date 2019-05-28 14:29
 */
public class New_car {
    private int id;
    private BigDecimal price;
    private String  area;
    private int  year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
