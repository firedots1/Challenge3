import java.util.Scanner;

public class ContactTracing extends TracingReport {


    private String personName;
    private String personEmail;
    private String personPhoneNum;
    private String personStateName;
    private String personCityName;
    private String personSymptomsName;
    private int personSymptomsNumberOfDays;
    private String personSymptomsDesc;
    private String locationOfContact;

    private String contactPersonName;
    private String contactPersonEmail;
    private String contactPersonPhoneNum;
    private String contactPersonState;
    private String contactPersonCity;
    private String contactPersonSymptoms;
    private String contactLastLocationState;
    private String contactLastLocationCity;
    private String contactLastDate;


    public ContactTracing(String personName, String personEmail, String personPhoneNum, String personStateName, String personCityName, String personSymptomsName, int personSymptomsNumberOfDays, String personSymptomsDesc, String locationOfContact, String contactPersonName, String contactPersonEmail, String contactPersonPhoneNum, String contactPersonState, String contactPersonCity, String contactPersonSymptoms, String contactLastLocationState, String contactLastLocationCity, String contactLastDate) {
        this.personName = personName;
        this.personEmail = personEmail;
        this.personPhoneNum = personPhoneNum;
        this.personStateName = personStateName;
        this.personCityName = personCityName;
        this.personSymptomsName = personSymptomsName;
        this.personSymptomsNumberOfDays = personSymptomsNumberOfDays;
        this.personSymptomsDesc = personSymptomsDesc;
        this.locationOfContact = locationOfContact;
        this.contactPersonName = contactPersonName;
        this.contactPersonEmail = contactPersonEmail;
        this.contactPersonPhoneNum = contactPersonPhoneNum;
        this.contactPersonState = contactPersonState;
        this.contactPersonCity = contactPersonCity;
        this.contactPersonSymptoms = contactPersonSymptoms;
        this.contactLastLocationState = contactLastLocationState;
        this.contactLastLocationCity = contactLastLocationCity;
        this.contactLastDate = contactLastDate;

    }

    public ContactTracing() {
    }


    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public String getPersonPhoneNum() {
        return personPhoneNum;
    }

    public void setPersonPhoneNum(String personPhoneNum) {
        this.personPhoneNum = personPhoneNum;
    }

    public String getPersonStateName() {
        return personStateName;
    }

    public void setPersonStateName(String personStateName) {
        this.personStateName = personStateName;
    }

    public String getPersonCityName() {
        return personCityName;
    }

    public void setPersonCityName(String personCityName) {
        this.personCityName = personCityName;
    }

    public String getPersonSymptomsName() {
        return personSymptomsName;
    }

    public void setPersonSymptomsName(String personSymptomsName) {
        this.personSymptomsName = personSymptomsName;
    }

    public int getPersonSymptomsNumberOfDays() {
        return personSymptomsNumberOfDays;
    }

    public void setPersonSymptomsNumberOfDays(int personSymptomsNumberOfDays) {
        this.personSymptomsNumberOfDays = personSymptomsNumberOfDays;
    }

    public String getPersonSymptomsDesc() {
        return personSymptomsDesc;
    }

    public void setPersonSymptomsDesc(String personSymptomsDesc) {
        this.personSymptomsDesc = personSymptomsDesc;
    }

    public String getLocationOfContact() {
        return locationOfContact;
    }

    public void setLocationOfContact(String locationOfContact) {
        this.locationOfContact = locationOfContact;
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public String getContactPersonEmail() {
        return contactPersonEmail;
    }

    public void setContactPersonEmail(String contactPersonEmail) {
        this.contactPersonEmail = contactPersonEmail;
    }

    public String getContactPersonPhoneNum() {
        return contactPersonPhoneNum;
    }

    public void setContactPersonPhoneNum(String contactPersonPhoneNum) {
        this.contactPersonPhoneNum = contactPersonPhoneNum;
    }

    public String getContactPersonState() {
        return contactPersonState;
    }

    public void setContactPersonState(String contactPersonState) {
        this.contactPersonState = contactPersonState;
    }

    public String getContactPersonCity() {
        return contactPersonCity;
    }

    public void setContactPersonCity(String contactPersonCity) {
        this.contactPersonCity = contactPersonCity;
    }

    public String getContactPersonSymptoms() {
        return contactPersonSymptoms;
    }

    public void setContactPersonSymptoms(String contactPersonSymptoms) {
        this.contactPersonSymptoms = contactPersonSymptoms;
    }

    public String getContactLastLocationState() {
        return contactLastLocationState;
    }

    public void setContactLastLocationState(String contactLastLocationState) {
        this.contactLastLocationState = contactLastLocationState;
    }

    public String getContactLastLocationCity() {
        return contactLastLocationCity;
    }

    public void setContactLastLocationCity(String contactLastLocationCity) {
        this.contactLastLocationCity = contactLastLocationCity;
    }

    public String getContactLastDate() {
        return contactLastDate;
    }

    public void setContactLastDate(String contactLastDate) {
        this.contactLastDate = contactLastDate;
    }

    public String getReport() {
        return "Name: " + getPersonName() + "\n" + "Phone: " + getPersonPhoneNum() + "\n" + "Email: " + getPersonEmail() + "\n" + "City: " + getPersonCityName() + "\n " + "State: " + getPersonStateName() + "Symptoms: " + getPersonSymptomsName() + " " + getPersonSymptomsDesc() + " " + getPersonSymptomsNumberOfDays() + "\n " + "**  Contacts: " + getContactPersonName() + "\n " + "Phone: " + getContactPersonPhoneNum() + "\n " + "Email: " + getContactPersonEmail() + "\n " + "City: " + getContactPersonCity() + "\n " + "State: " + getContactPersonState() + "\n" + "Contacted Location: " + getContactLastLocationCity() + ", " + getContactLastLocationState() + "\n " + "Contacted Date: " + getContactLastDate();

    }

    public Object setPersonName() {
        return setPersonName();
    }
}
