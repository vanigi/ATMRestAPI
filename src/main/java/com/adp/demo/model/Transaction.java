package com.adp.demo.model;

public class Transaction {
    public Coin[] coinChange;
    public int[] coinCount;
    public String status;

    public Coin[] getCoinChange() {
        return coinChange;
    }

    public void setCoinChange(Coin[] coinChange) {
        this.coinChange = coinChange;
    }

    public int[] getCoinCount() {
        return coinCount;
    }

    public void setCoinCount(int[] coinCount) {
        this.coinCount = coinCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
