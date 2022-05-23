/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author melda_000
 */
public class Issued {
    private String Id;
    private String CallNo;
    private String SId;
    private String SName;
    private String SContact;
    private String IssueDate;
    private String ReturnDate;

    public Issued(String Id, String CallNo, String SId, String SName, String SContact, String IssueDate, String ReturnDate) {
        this.Id = Id;
        this.CallNo = CallNo;
        this.SId = SId;
        this.SName = SName;
        this.SContact = SContact;
        this.IssueDate = IssueDate;
        this.ReturnDate = ReturnDate;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getCallNo() {
        return CallNo;
    }

    public void setCallNo(String CallNo) {
        this.CallNo = CallNo;
    }

    public String getSId() {
        return SId;
    }

    public void setSId(String SId) {
        this.SId = SId;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getSContact() {
        return SContact;
    }

    public void setSContact(String SContact) {
        this.SContact = SContact;
    }

    public String getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    public String getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(String ReturnDate) {
        this.ReturnDate = ReturnDate;
    }

    public Issued() {
    }
    
}
