/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 *POJO
 * @author Jose Lira
 */
public class Notas {
      private String titu;
    private String desc;
    private String fech;

    public Notas(String titu, String desc, String fech) {
        this.titu = titu;
        this.desc = desc;
        this.fech = fech;
    }

    public Notas() {
      
    }

    /**
     * @return the titu
     */
    public String getTitu() {
        return titu;
    }

    /**
     * @param titu the titu to set
     */
    public void setTitu(String titu) {
        this.titu = titu;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the fech
     */
    public String getFech() {
        return fech;
    }

    /**
     * @param fech the fech to set
     */
    public void setFech(String fech) {
        this.fech = fech;
    }
    
    
}
