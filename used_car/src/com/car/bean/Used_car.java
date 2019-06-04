package com.car.bean;

/**
 * @author zth
 * @Date 2019-06-04 15:40
 */
public class Used_car {
    private String color;
    private int year;
    private int eng_year;
    private String changshang;
    private int  posun;
    private String kucun_area;
    private int   weixiu_price;
    private int   chusou_price;
    private int   number;
    private int   distenct;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEng_year() {
        return eng_year;
    }

    public void setEng_year(int eng_year) {
        this.eng_year = eng_year;
    }

    public String getChangshang() {
        return changshang;
    }

    public void setChangshang(String changshang) {
        this.changshang = changshang;
    }

    public int getPosun() {
        return posun;
    }

    public void setPosun(int posun) {
        this.posun = posun;
    }

    public String getKucun_area() {
        return kucun_area;
    }

    public void setKucun_area(String kucun_area) {
        this.kucun_area = kucun_area;
    }

    public int getWeixiu_price() {
        return weixiu_price;
    }

    public void setWeixiu_price(int weixiu_price) {
        this.weixiu_price = weixiu_price;
    }

    public int getChusou_price() {
        return chusou_price;
    }

    public void setChusou_price(int chusou_price) {
        this.chusou_price = chusou_price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDistenct() {
        return distenct;
    }

    public void setDistenct(int distenct) {
        this.distenct = distenct;
    }

    @Override
    public String toString() {
        return "Used_car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", eng_year=" + eng_year +
                ", changshang='" + changshang + '\'' +
                ", posun=" + posun +
                ", kucun_area='" + kucun_area + '\'' +
                ", weixiu_price=" + weixiu_price +
                ", chusou_price=" + chusou_price +
                ", number=" + number +
                ", distenct=" + distenct +
                '}';
    }
}
