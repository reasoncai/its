package com.jiuair.its.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class OrderFlightEntity implements Serializable {
    private String seqNo;

    private String orderId;

    private String carrier;

    private String flightNo;

    private String operatorCarrier;

    private String operatorFlgihtNo;

    private Date dateDeparture;

    private String availability;

    private String oriAirport;

    private String destAirport;

    private Date dateArrival;

    private String oriTerminal;

    private String destTerminal;

    private Short stops;

    private String meal;

    private String aircaftType;

    private Date dateCreated;

    private String whoCreated;

    private Date dateModified;

    private String whoModified;

    private String dcsFlightId;

    private String traveldirect;

    private String restatus;

    private String servicetype;

    private String farebasis;

    private String tourcode;

    private String productcode;

    private String stopair;

    private Date dateStopDep;

    private Date dateStopArr;

    private String stopTerminal;

    private Short baggageweifth;

    private String pnr;

    private String pnrOrderId;

    private String oldPnrs;

    private String oldPnrOrderIds;

    private static final long serialVersionUID = 1L;

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getOperatorCarrier() {
        return operatorCarrier;
    }

    public void setOperatorCarrier(String operatorCarrier) {
        this.operatorCarrier = operatorCarrier;
    }

    public String getOperatorFlgihtNo() {
        return operatorFlgihtNo;
    }

    public void setOperatorFlgihtNo(String operatorFlgihtNo) {
        this.operatorFlgihtNo = operatorFlgihtNo;
    }

    public Date getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(Date dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getOriAirport() {
        return oriAirport;
    }

    public void setOriAirport(String oriAirport) {
        this.oriAirport = oriAirport;
    }

    public String getDestAirport() {
        return destAirport;
    }

    public void setDestAirport(String destAirport) {
        this.destAirport = destAirport;
    }

    public Date getDateArrival() {
        return dateArrival;
    }

    public void setDateArrival(Date dateArrival) {
        this.dateArrival = dateArrival;
    }

    public String getOriTerminal() {
        return oriTerminal;
    }

    public void setOriTerminal(String oriTerminal) {
        this.oriTerminal = oriTerminal;
    }

    public String getDestTerminal() {
        return destTerminal;
    }

    public void setDestTerminal(String destTerminal) {
        this.destTerminal = destTerminal;
    }

    public Short getStops() {
        return stops;
    }

    public void setStops(Short stops) {
        this.stops = stops;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getAircaftType() {
        return aircaftType;
    }

    public void setAircaftType(String aircaftType) {
        this.aircaftType = aircaftType;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getWhoCreated() {
        return whoCreated;
    }

    public void setWhoCreated(String whoCreated) {
        this.whoCreated = whoCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getWhoModified() {
        return whoModified;
    }

    public void setWhoModified(String whoModified) {
        this.whoModified = whoModified;
    }

    public String getDcsFlightId() {
        return dcsFlightId;
    }

    public void setDcsFlightId(String dcsFlightId) {
        this.dcsFlightId = dcsFlightId;
    }

    public String getTraveldirect() {
        return traveldirect;
    }

    public void setTraveldirect(String traveldirect) {
        this.traveldirect = traveldirect;
    }

    public String getRestatus() {
        return restatus;
    }

    public void setRestatus(String restatus) {
        this.restatus = restatus;
    }

    public String getServicetype() {
        return servicetype;
    }

    public void setServicetype(String servicetype) {
        this.servicetype = servicetype;
    }

    public String getFarebasis() {
        return farebasis;
    }

    public void setFarebasis(String farebasis) {
        this.farebasis = farebasis;
    }

    public String getTourcode() {
        return tourcode;
    }

    public void setTourcode(String tourcode) {
        this.tourcode = tourcode;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getStopair() {
        return stopair;
    }

    public void setStopair(String stopair) {
        this.stopair = stopair;
    }

    public Date getDateStopDep() {
        return dateStopDep;
    }

    public void setDateStopDep(Date dateStopDep) {
        this.dateStopDep = dateStopDep;
    }

    public Date getDateStopArr() {
        return dateStopArr;
    }

    public void setDateStopArr(Date dateStopArr) {
        this.dateStopArr = dateStopArr;
    }

    public String getStopTerminal() {
        return stopTerminal;
    }

    public void setStopTerminal(String stopTerminal) {
        this.stopTerminal = stopTerminal;
    }

    public Short getBaggageweifth() {
        return baggageweifth;
    }

    public void setBaggageweifth(Short baggageweifth) {
        this.baggageweifth = baggageweifth;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getPnrOrderId() {
        return pnrOrderId;
    }

    public void setPnrOrderId(String pnrOrderId) {
        this.pnrOrderId = pnrOrderId;
    }

    public String getOldPnrs() {
        return oldPnrs;
    }

    public void setOldPnrs(String oldPnrs) {
        this.oldPnrs = oldPnrs;
    }

    public String getOldPnrOrderIds() {
        return oldPnrOrderIds;
    }

    public void setOldPnrOrderIds(String oldPnrOrderIds) {
        this.oldPnrOrderIds = oldPnrOrderIds;
    }
}