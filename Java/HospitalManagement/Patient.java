package HospitalManagement;

import java.time.LocalDateTime;
import java.util.Date;

public class Patient extends User {

    private int height;
    private int weight;
    private LocalDateTime admitDate;
    private LocalDateTime dischargeDate;
    private String treatmentUnder;
    private String prescription;

    public Patient(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public LocalDateTime getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(LocalDateTime admitDate) {
        this.admitDate = admitDate;
    }

    public LocalDateTime getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(LocalDateTime dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void discharge() {
        this.dischargeDate = LocalDateTime.now();
    }

    public void admitDate() {
        this.admitDate = LocalDateTime.now();
    }

}
