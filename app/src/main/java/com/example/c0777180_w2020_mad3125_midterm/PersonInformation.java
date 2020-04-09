package com.example.c0777180_w2020_mad3125_midterm;

import android.os.Parcel;
import android.os.Parcelable;

public class PersonInformation implements Parcelable {
    private String sin;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private double grossIncome;
    private double RRSPContributed;
    private String fullName;
    private int age;
    private String taxFilingDate;
    private double federalTax;
    private double provincialTax;
    private double CPP;
    private double EI;
    private double carryForwardRRSP;
    private double totalTaxableIncome;
    private double totalTaxPayed;

    public String getSin() {
        return sin;
    }

    public void setSin(String sin) {
        this.sin = sin;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(float grossIncome) {
        this.grossIncome = grossIncome;
    }

    public double getRRSPContributed() {
        return RRSPContributed;
    }

    public void setRRSPContributed(float RRSPContributed) {
        this.RRSPContributed = RRSPContributed;
    }

    public String getFullName() {
        return lastName.toUpperCase()+", "+firstName.toLowerCase();
    }

    public int getAge() {
        return age;
    }

    public String getTaxFilingDate() {
        return taxFilingDate;
    }

    public double getCPP() {
        if (getGrossIncome()>57400){
            return 2927.40;
        }
        else{
            return (getGrossIncome()*0.051);
        }
    }
    public double getEI() {
        if (getGrossIncome()>53100){
            return 860.22;
        }
        else {
            return (getGrossIncome()*0.0162);
        }

    }

    public double getFederalTax() {
        return federalTax;
    }

    public double getProvincialTax() {
        return provincialTax;
    }

    public double getCarryForwardRRSP() {
        return carryForwardRRSP;
    }

    public double getTotalTaxableIncome() {
        return totalTaxableIncome;
    }

    public double getTotalTaxPayed() {
        return totalTaxPayed;
    }

    public PersonInformation(String sin, String firstName, String lastName, String dateOfBirth, String gender, float grossIncome, float RRSPContributed,int age) {
        this.sin = sin;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.grossIncome = grossIncome;
        this.RRSPContributed = RRSPContributed;
        this.fullName = getFullName();
        this.age = age;
        this.CPP = getCPP();
    }


    protected PersonInformation(Parcel in) {
        sin = in.readString();
        firstName = in.readString();
        lastName = in.readString();
        dateOfBirth = in.readString();
        gender = in.readString();
        grossIncome = in.readFloat();
        RRSPContributed = in.readFloat();
        fullName = in.readString();
        age = in.readInt();
        taxFilingDate = in.readString();
        federalTax = in.readFloat();
        provincialTax = in.readFloat();
        CPP = in.readFloat();
        EI = in.readFloat();
        carryForwardRRSP = in.readFloat();
        totalTaxableIncome = in.readFloat();
        totalTaxPayed = in.readFloat();
    }

    public static final Creator<PersonInformation> CREATOR = new Creator<PersonInformation>() {
        @Override
        public PersonInformation createFromParcel(Parcel in) {
            return new PersonInformation(in);
        }

        @Override
        public PersonInformation[] newArray(int size) {
            return new PersonInformation[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(sin);
        dest.writeString(firstName);
        dest.writeString(lastName);
        dest.writeString(dateOfBirth);
        dest.writeString(gender);
        dest.writeDouble(grossIncome);
        dest.writeDouble(RRSPContributed);
        dest.writeString(fullName);
        dest.writeInt(age);
        dest.writeString(taxFilingDate);
        dest.writeDouble(federalTax);
        dest.writeDouble(provincialTax);
        dest.writeDouble(CPP);
        dest.writeDouble(EI);
        dest.writeDouble(carryForwardRRSP);
        dest.writeDouble(totalTaxableIncome);
        dest.writeDouble(totalTaxPayed);
    }
}
