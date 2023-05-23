package org.sid.billingservice.entities;

import jakarta.persistence.Entity;

import java.util.Collection;
import java.util.Date;
@Entity
public class Bill {
    private Long id;
    private Date billingDate;
    private Collection<ProductItem> productItems;
}
