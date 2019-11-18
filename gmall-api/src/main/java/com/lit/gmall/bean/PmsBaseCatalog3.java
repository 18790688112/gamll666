package com.lit.gmall.bean;/*
@author Mr.Ding
@date 2019/11/18 - 16:49
*/

import java.io.Serializable;

public class PmsBaseCatalog3 implements Serializable {

    private String id;
    private String name;
    private String catalog2Id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatalog2Id() {
        return catalog2Id;
    }

    public void setCatalog2Id(String catalog2Id) {
        this.catalog2Id = catalog2Id;
    }
}
