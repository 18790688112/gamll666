package com.lit.gmall.bean;/*
@author Mr.Ding
@date 2019/11/18 - 16:44
*/

import com.lit.gmall.bean.PmsBaseCatalog2;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

public class PmsBaseCatalog1 implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private String name;

    @Transient
    private List<PmsBaseCatalog2> catalog2s;

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
}