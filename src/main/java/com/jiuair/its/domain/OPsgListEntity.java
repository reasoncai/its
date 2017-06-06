package com.jiuair.its.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class OPsgListEntity implements Serializable {
    private String oPsgSn;

    private String oPsgName;

    private String oPsgNameCode;

    private String oPsgNameE;

    private String oPsgIdNo;

    private String oPsgType;

    private String oFltCarrier;

    private String oFltNo;

    private String oFltOrgApt;

    private String oFltDstApt;

    private Date oFltOrgDate;

    private Date oFltDstData;

    private Short oFltSegNo;

    private String oEtNo;

    private String oEtSt;

    private String oSeatClass;

    private String oEtFarebasis;

    private String oIcsNo;

    private String oResNo;

    private String oPsgGrpNo;

    private BigDecimal oEtFare;

    private BigDecimal oFund;

    private BigDecimal oPuel;

    private BigDecimal oTaxe;

    private String oAgent;

    private String oPsgGender;

    private String oPsgSetNo;

    private Short oPsgBrdNo;

    private Short oBagNo;

    private Short oBagWet;

    private Short oPsgSbNo;

    private String oPsgRemark;

    private Date oCheckDate;

    private Date oCheckDateC;

    private Date oBoardDate;

    private Date oBoardDateC;

    private String oBdStop;

    private String oPsgIdType;

    private String oPsgCls;

    private String oPsgPartner;

    private Short oBagFree;

    private String oPsgSetNo1;

    private String oAircSetNo;

    private String oAircSetNo1;

    private String oPsgMobile;

    private String oCheckPid;

    private String oCheckPidC;

    private String oBoardPid;

    private String oBoardPidC;

    private Short oBagWetMax;

    private String oOrderPro;

    private String oOnplane;

    private String oOnplanePid;

    private String oOnplanePidC;

    private Date oOnplaneDate;

    private Date oOnplaneDateC;

    private String oDeplane;

    private String oDeplanePid;

    private String oDeplanePidC;

    private Date oDeplaneDate;

    private Date oDeplaneDateC;

    private String oOriTerminal;

    private String oDestTerminal;

    private String oInPsgSn;

    private String oOutPsgSn;

    private String oIsThrough;

    private String oldPsgSn;

    private static final long serialVersionUID = 1L;

    public String getoPsgSn() {
        return oPsgSn;
    }

    public void setoPsgSn(String oPsgSn) {
        this.oPsgSn = oPsgSn;
    }

    public String getoPsgName() {
        return oPsgName;
    }

    public void setoPsgName(String oPsgName) {
        this.oPsgName = oPsgName;
    }

    public String getoPsgNameCode() {
        return oPsgNameCode;
    }

    public void setoPsgNameCode(String oPsgNameCode) {
        this.oPsgNameCode = oPsgNameCode;
    }

    public String getoPsgNameE() {
        return oPsgNameE;
    }

    public void setoPsgNameE(String oPsgNameE) {
        this.oPsgNameE = oPsgNameE;
    }

    public String getoPsgIdNo() {
        return oPsgIdNo;
    }

    public void setoPsgIdNo(String oPsgIdNo) {
        this.oPsgIdNo = oPsgIdNo;
    }

    public String getoPsgType() {
        return oPsgType;
    }

    public void setoPsgType(String oPsgType) {
        this.oPsgType = oPsgType;
    }

    public String getoFltCarrier() {
        return oFltCarrier;
    }

    public void setoFltCarrier(String oFltCarrier) {
        this.oFltCarrier = oFltCarrier;
    }

    public String getoFltNo() {
        return oFltNo;
    }

    public void setoFltNo(String oFltNo) {
        this.oFltNo = oFltNo;
    }

    public String getoFltOrgApt() {
        return oFltOrgApt;
    }

    public void setoFltOrgApt(String oFltOrgApt) {
        this.oFltOrgApt = oFltOrgApt;
    }

    public String getoFltDstApt() {
        return oFltDstApt;
    }

    public void setoFltDstApt(String oFltDstApt) {
        this.oFltDstApt = oFltDstApt;
    }

    public Date getoFltOrgDate() {
        return oFltOrgDate;
    }

    public void setoFltOrgDate(Date oFltOrgDate) {
        this.oFltOrgDate = oFltOrgDate;
    }

    public Date getoFltDstData() {
        return oFltDstData;
    }

    public void setoFltDstData(Date oFltDstData) {
        this.oFltDstData = oFltDstData;
    }

    public Short getoFltSegNo() {
        return oFltSegNo;
    }

    public void setoFltSegNo(Short oFltSegNo) {
        this.oFltSegNo = oFltSegNo;
    }

    public String getoEtNo() {
        return oEtNo;
    }

    public void setoEtNo(String oEtNo) {
        this.oEtNo = oEtNo;
    }

    public String getoEtSt() {
        return oEtSt;
    }

    public void setoEtSt(String oEtSt) {
        this.oEtSt = oEtSt;
    }

    public String getoSeatClass() {
        return oSeatClass;
    }

    public void setoSeatClass(String oSeatClass) {
        this.oSeatClass = oSeatClass;
    }

    public String getoEtFarebasis() {
        return oEtFarebasis;
    }

    public void setoEtFarebasis(String oEtFarebasis) {
        this.oEtFarebasis = oEtFarebasis;
    }

    public String getoIcsNo() {
        return oIcsNo;
    }

    public void setoIcsNo(String oIcsNo) {
        this.oIcsNo = oIcsNo;
    }

    public String getoResNo() {
        return oResNo;
    }

    public void setoResNo(String oResNo) {
        this.oResNo = oResNo;
    }

    public String getoPsgGrpNo() {
        return oPsgGrpNo;
    }

    public void setoPsgGrpNo(String oPsgGrpNo) {
        this.oPsgGrpNo = oPsgGrpNo;
    }

    public BigDecimal getoEtFare() {
        return oEtFare;
    }

    public void setoEtFare(BigDecimal oEtFare) {
        this.oEtFare = oEtFare;
    }

    public BigDecimal getoFund() {
        return oFund;
    }

    public void setoFund(BigDecimal oFund) {
        this.oFund = oFund;
    }

    public BigDecimal getoPuel() {
        return oPuel;
    }

    public void setoPuel(BigDecimal oPuel) {
        this.oPuel = oPuel;
    }

    public BigDecimal getoTaxe() {
        return oTaxe;
    }

    public void setoTaxe(BigDecimal oTaxe) {
        this.oTaxe = oTaxe;
    }

    public String getoAgent() {
        return oAgent;
    }

    public void setoAgent(String oAgent) {
        this.oAgent = oAgent;
    }

    public String getoPsgGender() {
        return oPsgGender;
    }

    public void setoPsgGender(String oPsgGender) {
        this.oPsgGender = oPsgGender;
    }

    public String getoPsgSetNo() {
        return oPsgSetNo;
    }

    public void setoPsgSetNo(String oPsgSetNo) {
        this.oPsgSetNo = oPsgSetNo;
    }

    public Short getoPsgBrdNo() {
        return oPsgBrdNo;
    }

    public void setoPsgBrdNo(Short oPsgBrdNo) {
        this.oPsgBrdNo = oPsgBrdNo;
    }

    public Short getoBagNo() {
        return oBagNo;
    }

    public void setoBagNo(Short oBagNo) {
        this.oBagNo = oBagNo;
    }

    public Short getoBagWet() {
        return oBagWet;
    }

    public void setoBagWet(Short oBagWet) {
        this.oBagWet = oBagWet;
    }

    public Short getoPsgSbNo() {
        return oPsgSbNo;
    }

    public void setoPsgSbNo(Short oPsgSbNo) {
        this.oPsgSbNo = oPsgSbNo;
    }

    public String getoPsgRemark() {
        return oPsgRemark;
    }

    public void setoPsgRemark(String oPsgRemark) {
        this.oPsgRemark = oPsgRemark;
    }

    public Date getoCheckDate() {
        return oCheckDate;
    }

    public void setoCheckDate(Date oCheckDate) {
        this.oCheckDate = oCheckDate;
    }

    public Date getoCheckDateC() {
        return oCheckDateC;
    }

    public void setoCheckDateC(Date oCheckDateC) {
        this.oCheckDateC = oCheckDateC;
    }

    public Date getoBoardDate() {
        return oBoardDate;
    }

    public void setoBoardDate(Date oBoardDate) {
        this.oBoardDate = oBoardDate;
    }

    public Date getoBoardDateC() {
        return oBoardDateC;
    }

    public void setoBoardDateC(Date oBoardDateC) {
        this.oBoardDateC = oBoardDateC;
    }

    public String getoBdStop() {
        return oBdStop;
    }

    public void setoBdStop(String oBdStop) {
        this.oBdStop = oBdStop;
    }

    public String getoPsgIdType() {
        return oPsgIdType;
    }

    public void setoPsgIdType(String oPsgIdType) {
        this.oPsgIdType = oPsgIdType;
    }

    public String getoPsgCls() {
        return oPsgCls;
    }

    public void setoPsgCls(String oPsgCls) {
        this.oPsgCls = oPsgCls;
    }

    public String getoPsgPartner() {
        return oPsgPartner;
    }

    public void setoPsgPartner(String oPsgPartner) {
        this.oPsgPartner = oPsgPartner;
    }

    public Short getoBagFree() {
        return oBagFree;
    }

    public void setoBagFree(Short oBagFree) {
        this.oBagFree = oBagFree;
    }

    public String getoPsgSetNo1() {
        return oPsgSetNo1;
    }

    public void setoPsgSetNo1(String oPsgSetNo1) {
        this.oPsgSetNo1 = oPsgSetNo1;
    }

    public String getoAircSetNo() {
        return oAircSetNo;
    }

    public void setoAircSetNo(String oAircSetNo) {
        this.oAircSetNo = oAircSetNo;
    }

    public String getoAircSetNo1() {
        return oAircSetNo1;
    }

    public void setoAircSetNo1(String oAircSetNo1) {
        this.oAircSetNo1 = oAircSetNo1;
    }

    public String getoPsgMobile() {
        return oPsgMobile;
    }

    public void setoPsgMobile(String oPsgMobile) {
        this.oPsgMobile = oPsgMobile;
    }

    public String getoCheckPid() {
        return oCheckPid;
    }

    public void setoCheckPid(String oCheckPid) {
        this.oCheckPid = oCheckPid;
    }

    public String getoCheckPidC() {
        return oCheckPidC;
    }

    public void setoCheckPidC(String oCheckPidC) {
        this.oCheckPidC = oCheckPidC;
    }

    public String getoBoardPid() {
        return oBoardPid;
    }

    public void setoBoardPid(String oBoardPid) {
        this.oBoardPid = oBoardPid;
    }

    public String getoBoardPidC() {
        return oBoardPidC;
    }

    public void setoBoardPidC(String oBoardPidC) {
        this.oBoardPidC = oBoardPidC;
    }

    public Short getoBagWetMax() {
        return oBagWetMax;
    }

    public void setoBagWetMax(Short oBagWetMax) {
        this.oBagWetMax = oBagWetMax;
    }

    public String getoOrderPro() {
        return oOrderPro;
    }

    public void setoOrderPro(String oOrderPro) {
        this.oOrderPro = oOrderPro;
    }

    public String getoOnplane() {
        return oOnplane;
    }

    public void setoOnplane(String oOnplane) {
        this.oOnplane = oOnplane;
    }

    public String getoOnplanePid() {
        return oOnplanePid;
    }

    public void setoOnplanePid(String oOnplanePid) {
        this.oOnplanePid = oOnplanePid;
    }

    public String getoOnplanePidC() {
        return oOnplanePidC;
    }

    public void setoOnplanePidC(String oOnplanePidC) {
        this.oOnplanePidC = oOnplanePidC;
    }

    public Date getoOnplaneDate() {
        return oOnplaneDate;
    }

    public void setoOnplaneDate(Date oOnplaneDate) {
        this.oOnplaneDate = oOnplaneDate;
    }

    public Date getoOnplaneDateC() {
        return oOnplaneDateC;
    }

    public void setoOnplaneDateC(Date oOnplaneDateC) {
        this.oOnplaneDateC = oOnplaneDateC;
    }

    public String getoDeplane() {
        return oDeplane;
    }

    public void setoDeplane(String oDeplane) {
        this.oDeplane = oDeplane;
    }

    public String getoDeplanePid() {
        return oDeplanePid;
    }

    public void setoDeplanePid(String oDeplanePid) {
        this.oDeplanePid = oDeplanePid;
    }

    public String getoDeplanePidC() {
        return oDeplanePidC;
    }

    public void setoDeplanePidC(String oDeplanePidC) {
        this.oDeplanePidC = oDeplanePidC;
    }

    public Date getoDeplaneDate() {
        return oDeplaneDate;
    }

    public void setoDeplaneDate(Date oDeplaneDate) {
        this.oDeplaneDate = oDeplaneDate;
    }

    public Date getoDeplaneDateC() {
        return oDeplaneDateC;
    }

    public void setoDeplaneDateC(Date oDeplaneDateC) {
        this.oDeplaneDateC = oDeplaneDateC;
    }

    public String getoOriTerminal() {
        return oOriTerminal;
    }

    public void setoOriTerminal(String oOriTerminal) {
        this.oOriTerminal = oOriTerminal;
    }

    public String getoDestTerminal() {
        return oDestTerminal;
    }

    public void setoDestTerminal(String oDestTerminal) {
        this.oDestTerminal = oDestTerminal;
    }

    public String getoInPsgSn() {
        return oInPsgSn;
    }

    public void setoInPsgSn(String oInPsgSn) {
        this.oInPsgSn = oInPsgSn;
    }

    public String getoOutPsgSn() {
        return oOutPsgSn;
    }

    public void setoOutPsgSn(String oOutPsgSn) {
        this.oOutPsgSn = oOutPsgSn;
    }

    public String getoIsThrough() {
        return oIsThrough;
    }

    public void setoIsThrough(String oIsThrough) {
        this.oIsThrough = oIsThrough;
    }

    public String getOldPsgSn() {
        return oldPsgSn;
    }

    public void setOldPsgSn(String oldPsgSn) {
        this.oldPsgSn = oldPsgSn;
    }
}