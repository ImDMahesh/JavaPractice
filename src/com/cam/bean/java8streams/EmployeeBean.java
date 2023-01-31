package com.cam.bean.java8streams;

public class EmployeeBean {
    public long eId;
    public String eName;
    EmployeeBean(){
    }
    EmployeeBean(long eId, String eName){
        this.eId = eId;
        this.eName = eName;
    }

    public String toString(){
        return eId+":"+eName;
    }
}
