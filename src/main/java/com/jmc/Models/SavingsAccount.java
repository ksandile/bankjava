package com.jmc.Models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class SavingsAccount extends Account {

    private final DoubleProperty withdrawalLimit;

    public SavingsAccount( String owner, String accountNumber, Double balance, Double withdrawalLimit) {
        super(owner, accountNumber, balance);
        this.withdrawalLimit = new SimpleDoubleProperty(this, "withdrawalLimit", withdrawalLimit);
    }

    public DoubleProperty withdrawalLimitProperty() {return withdrawalLimit;}
}
