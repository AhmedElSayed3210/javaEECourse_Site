/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import modle.DB;

/**
 *
 * @author ahmed
 */
@ManagedBean
public class addcoursebean {
    
    
    private String cname;
    private String cdetails;
    private Date cdate;
    private String chour;
    private String cteacher;
    private String clocation;
    private String msg;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCdetails() {
        return cdetails;
    }

    public void setCdetails(String cdetails) {
        this.cdetails = cdetails;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public String getChour() {
        return chour;
    }

    public void setChour(String chour) {
        this.chour = chour;
    }

    public String getCteacher() {
        return cteacher;
    }

    public void setCteacher(String cteacher) {
        this.cteacher = cteacher;
    }

    public String getClocation() {
        return clocation;
    }

    public void setClocation(String clocation) {
        this.clocation = clocation;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public void addcourse(){
    
        DB db=new DB();
        DateFormat d=new SimpleDateFormat("yyyy-mm-dd");
        String format = d.format(cdate);
        boolean f = db.addcourse(cname, cdetails, format, chour, cteacher, clocation);
        
         if(f==true){
           
        msg="Course added successfully";
        }else{
        msg=" not added";
        
        }
    
    }
    
    
}
