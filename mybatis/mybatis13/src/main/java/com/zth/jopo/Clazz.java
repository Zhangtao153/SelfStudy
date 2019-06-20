package com.zth.jopo;

import java.util.ArrayList;
import java.util.List;

public class Clazz {
  private int	 id;
  private String name;
  
  List<Stu> stus = new ArrayList<Stu>();

  /*getter setter toString*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Stu> getStus() {
        return stus;
    }

    public void setStus(List<Stu> stus) {
        this.stus = stus;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stus=" + stus +
                '}';
    }
}
