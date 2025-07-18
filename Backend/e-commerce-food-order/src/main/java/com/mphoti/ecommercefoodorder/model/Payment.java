package com.mphoti.ecommercefoodorder.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amountPaid;
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Orderr order;


    public Payment() {
    }

    public Payment(Long id, Double amountPaid, Orderr order) {
        this.amountPaid = amountPaid;
        this.order = order;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmountPaid() {
        return this.amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Orderr getOrder() {
        return this.order;
    }

    public void setOrder(Orderr order) {
        this.order = order;
    }



}
