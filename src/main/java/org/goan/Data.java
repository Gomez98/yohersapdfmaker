package org.goan;

import java.util.List;

public class Data {

    String series;
    int number;
    String clientDocumentNumber;
    String clientDenomination;
    String clientAddress;
    String issueDate;
    String expiredDate;
    int currency;
    double total;
    double totalIgv;
    double totalGrav;
    List<Item> itemList;

    public Data() {
    }

    public Data(String series, int number, String clientDocumentNumber, String clientDenomination, String clientAddress, String issueDate, String expiredDate, int currency, double total, double totalIgv, double totalGrav, List<Item> itemList) {
        this.series = series;
        this.number = number;
        this.clientDocumentNumber = clientDocumentNumber;
        this.clientDenomination = clientDenomination;
        this.clientAddress = clientAddress;
        this.issueDate = issueDate;
        this.expiredDate = expiredDate;
        this.currency = currency;
        this.total = total;
        this.totalIgv = totalIgv;
        this.totalGrav = totalGrav;
        this.itemList = itemList;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClientDocumentNumber() {
        return clientDocumentNumber;
    }

    public void setClientDocumentNumber(String clientDocumentNumber) {
        this.clientDocumentNumber = clientDocumentNumber;
    }

    public String getClientDenomination() {
        return clientDenomination;
    }

    public void setClientDenomination(String clientDenomination) {
        this.clientDenomination = clientDenomination;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalIgv() {
        return totalIgv;
    }

    public void setTotalIgv(double totalIgv) {
        this.totalIgv = totalIgv;
    }

    public double getTotalGrav() {
        return totalGrav;
    }

    public void setTotalGrav(double totalGrav) {
        this.totalGrav = totalGrav;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
