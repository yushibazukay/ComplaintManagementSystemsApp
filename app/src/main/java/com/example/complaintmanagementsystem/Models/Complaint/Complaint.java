package com.example.complaintmanagementsystem.Models.Complaint;


import com.example.complaintmanagementsystem.utils.Helper;

import java.util.Random;

public class Complaint {
    enum Status {
        Pending,
        Reviewed,
        Completed
    }

    private String complaintType;
    private String date;
    private String details;
    private Status status;
    private boolean isOpen;
    private String pushId;
    private int positiveFeedback;

    public Complaint(){}
    public Complaint(String complaintType, String details) {
        this.complaintType = complaintType;
        this.date = Helper.getTodaysDate();
        this.details = details;
        this.status = Status.Pending;
        this.isOpen = true;
        Random random = new Random();
        this.positiveFeedback = random.nextInt(1 - 0 + 1);
    }

    public void complaintReviewed()
    {
        this.status = Status.Reviewed;
        return;
    }

    public void complaintCompleted(){
        this.status = Status.Completed;
        return;
    }

    public void complaintClosed(){
        this.isOpen = false;
        return;
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }

    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public int getPositiveFeedback() {
        return positiveFeedback;
    }

    public void setPositiveFeedback(int positiveFeedback) {
        this.positiveFeedback = positiveFeedback;
    }
}
