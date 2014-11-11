package edu.esprit.entities;

import java.sql.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author malzak
 */
public class Mail {
    
    
   
    private String mailAddressSender ;
    private String mailAddressRecipient ; 
    private String mailObject ;
    private String mailSubject ;
    private Date date;
    private String piecejointe ;

    
    
      public String getPiecejointe() {
        return piecejointe;
    }

    public void setPiecejointe(String piecejointe) {
        this.piecejointe = piecejointe;
    }
    
    
    
    public String getMailAddressSender() {
        return mailAddressSender;
    }

    public void setMailAddressSender(String mailAddressSender) {
        this.mailAddressSender = mailAddressSender;
    }

   

    public String getMailAddressRecipient() {
        return mailAddressRecipient;
    }

    public void setMailAddressRecipient(String mailAddressRecipient) {
        this.mailAddressRecipient = mailAddressRecipient;
    }

    public String getMailObject() {
        return mailObject;
    }

    public void setMailObject(String mailObject) {
        this.mailObject = mailObject;
    }

    public String getMailSubject() {
        return mailSubject;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }
   
  public Date getDate(){
      return date;
  }
    
  public void setDate(Date date){
      this.date=date;
  }

    
    
}
