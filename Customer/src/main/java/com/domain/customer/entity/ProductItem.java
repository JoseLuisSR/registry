package com.domain.customer.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "product_items")
public class ProductItem {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "expedition_date")
    @NotNull
    private Date expeditionDate;

    @Column(name = "expiration_date")
    @NotNull
    private Date expirationDate;

    @ManyToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id")
    private Product product;

    @Column(name = "id_order")
    private Integer idOrder;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setExpeditionDate(Date expeditionDate) {
        this.expeditionDate = expeditionDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getId() {
        return id;
    }

    public Date getExpeditionDate() {
        return expeditionDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getIdOrder() {
        return idOrder;
    }
}
