package com.soprasteria.fms.model;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class Flight {

    @Id
    private BigInteger flightNo;
    private String carrierName;
    private String flightModel;
    private int seatCapacity;

    public Flight() {

    }

    public Flight(BigInteger flightNo, String carrierName, String flightModel, int seatCapacity) {
        super();
        this.flightNo = flightNo;
        this.carrierName = carrierName;
        this.flightModel = flightModel;
        this.seatCapacity = seatCapacity;
    }

    public void setFlightNo(BigInteger flightNo) {
        this.flightNo = flightNo;
    }

    public BigInteger getFlightNo() {
        return flightNo;
    }

    public void setCarrierName(String carreirName) {
        this.carrierName = carreirName;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setFlightModel(String flightModel) {
        this.flightModel = flightModel;
    }

    public String getFlightModel() {
        return flightModel;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public int getSeatCapacity(){
        return seatCapacity;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNo=" + flightNo +
                ", carrierName='" + carrierName + '\'' +
                ", flightModel='" + flightModel + '\'' +
                ", seatCapacity=" + seatCapacity +
                '}';
    }

    /*@Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }*/
}
