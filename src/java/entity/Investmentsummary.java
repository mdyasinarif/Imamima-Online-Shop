package entity;
// Generated May 18, 2019 5:01:16 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Investmentsummary generated by hbm2java
 */
public class Investmentsummary  implements java.io.Serializable {


     private Integer id;
     private Date date;
     private String accountNo;
     private String projectName;
     private String projectLocation;
     private Date startDate;
     private String directorName;
     private Double totalInvestment;
     private Double totalReturn;
     private Double balance;
     private Integer projectDuration;

    public Investmentsummary() {
    }

    public Investmentsummary(Date date, String accountNo, String projectName, String projectLocation, Date startDate, String directorName, Double totalInvestment, Double totalReturn, Double balance, Integer projectDuration) {
       this.date = date;
       this.accountNo = accountNo;
       this.projectName = projectName;
       this.projectLocation = projectLocation;
       this.startDate = startDate;
       this.directorName = directorName;
       this.totalInvestment = totalInvestment;
       this.totalReturn = totalReturn;
       this.balance = balance;
       this.projectDuration = projectDuration;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public String getAccountNo() {
        return this.accountNo;
    }
    
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public String getProjectName() {
        return this.projectName;
    }
    
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getProjectLocation() {
        return this.projectLocation;
    }
    
    public void setProjectLocation(String projectLocation) {
        this.projectLocation = projectLocation;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public String getDirectorName() {
        return this.directorName;
    }
    
    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }
    public Double getTotalInvestment() {
        return this.totalInvestment;
    }
    
    public void setTotalInvestment(Double totalInvestment) {
        this.totalInvestment = totalInvestment;
    }
    public Double getTotalReturn() {
        return this.totalReturn;
    }
    
    public void setTotalReturn(Double totalReturn) {
        this.totalReturn = totalReturn;
    }
    public Double getBalance() {
        return this.balance;
    }
    
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public Integer getProjectDuration() {
        return this.projectDuration;
    }
    
    public void setProjectDuration(Integer projectDuration) {
        this.projectDuration = projectDuration;
    }




}


