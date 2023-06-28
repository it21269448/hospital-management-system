
package com.drchanneling.bean;


public class AppointmentBean {
    private String doctorID;
    private String channelingDate;
    private String patientNIC;
    private int appointmentNo;

    public AppointmentBean(String doctorID, String channelingDate, String patientNIC, int appointmentNo) {
        this.doctorID = doctorID;
        this.channelingDate = channelingDate;
        this.patientNIC = patientNIC;
        this.appointmentNo = appointmentNo;
    }

    public AppointmentBean(String doctorID, String channelingDate, String patientNIC) {
        this.doctorID = doctorID;
        this.channelingDate = channelingDate;
        this.patientNIC = patientNIC;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getChannelingDate() {
        return channelingDate;
    }

    public void setChannelingDate(String channelingDate) {
        this.channelingDate = channelingDate;
    }

    public String getPatientNIC() {
        return patientNIC;
    }

    public void setPatientNIC(String patientNIC) {
        this.patientNIC = patientNIC;
    }

    public int getAppointmentNo() {
        return appointmentNo;
    }

    public void setAppointmentNo(int appointmentNo) {
        this.appointmentNo = appointmentNo;
    }

    
    
    
    
}
