package com.lei.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Lei on 2017/9/29.
 */
@Entity
@Table(name = "formula")
public class Formula extends Identity{
    @Column(name = "fk_product_id")
    private Integer productId;
    @Column(name = "dc_type")
    private Integer type;
    @Column(name = "vc_value")
    private String value;
    @Column(name = "vc_formula")
    private String formula;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }
}
