package com.jmc.Models;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class Client {
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty payeeAddress;
    private final ObjectProperty<Account> checkAccount;
    private final ObjectProperty<Account> savingsAccount;
    private final ObjectProperty<LocalDate> dateCreated;

    public Client(String fName, String lName, String pAddress, Account cAccount, Account sAccount, LocalDate date) {
        this.firstName = new SimpleStringProperty(this, "firstName", fName);
        this.lastName = new SimpleStringProperty(this, "lastName", lName);
        this.payeeAddress = new SimpleStringProperty(this, "payeeAddress", pAddress);
        this.checkAccount = new SimpleObjectProperty<>(this, "checkAccount", cAccount);
        this.savingsAccount = new SimpleObjectProperty<>(this, "savingsAccount", sAccount);
        this.dateCreated = new SimpleObjectProperty<>(this, "Date", date);
    }
    public StringProperty firstName() {return firstName;}
    public StringProperty lastName() {return lastName;}
    public StringProperty payeeAddress() {return payeeAddress;}
    public ObjectProperty<Account> checkAccount() {return checkAccount;}
    public ObjectProperty<Account> savingsAccount() {return savingsAccount;}
    public ObjectProperty<LocalDate> dateCreated() {return dateCreated;}
}
