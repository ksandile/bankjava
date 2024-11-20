package com.jmc.Models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class CheckAccount extends Account {
    private final IntegerProperty transactionLimit;

    public CheckAccount(String owner, String accountNumber, Double balance, int tLimit) {
        super(owner, accountNumber, balance);
        this.transactionLimit = new SimpleIntegerProperty(this, "transactionLimit", tLimit);
    }

    public IntegerProperty transactionLimitProperty() {return transactionLimit;}
}
