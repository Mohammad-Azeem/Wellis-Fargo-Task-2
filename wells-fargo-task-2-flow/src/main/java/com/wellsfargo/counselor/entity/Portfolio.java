package com.wellsfargo.counselor.entity;

import java.security.Timestamp;
import jakarta.persistence.Column; 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Portfolio {
    
    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name="clientId", referencedColumnName = "clientID" )
    private Client client;

    //@Column(nullable = false)
    //private Timestamp creationDate;

    @Column(nullable = false)
    private Date creationDate;

    protected Portfolio(){

    }

    //public Portfolio(Client client, Timestamp creationDate){
        public Portfolio(Client client, Date creationDate){
        this.client= client;
        this.creationDate=creationDate;
    }

    public long getPortfolioId(){
        return portfolioId;
    }
    
    public Client getClient(){
        return client;
    }
    /* // Use Date or timestamp for creationDate
    public Timestamp getCreationDate(){
        return creationDate;
    }
    
    public void setCreationDate(Timestamp creationDate  ){
        this.creationDate =creationDate ;
    }
    */
    public void setClient(Client client) {
        this.client = client;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
