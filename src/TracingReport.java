import java.util.ArrayList;
import java.util.Scanner;

public class TracingReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContactTracing tracing = new ContactTracing();

        ArrayList<String> allSymptoms = new ArrayList<>();


        allSymptoms.add("Shortness of breath or difficulty breathing");
        allSymptoms.add("Tiredness");
        allSymptoms.add("Aches");
        allSymptoms.add("Chills");
        allSymptoms.add("Sore Throats");
        allSymptoms.add("Loss of smell");


        System.out.println("Contact Tracing Program");
        System.out.println("Enter a newly infected peron's information");
        System.out.println("What is the patient name? ");
        String textPersonName = input.nextLine();
        tracing.setPersonName(textPersonName);
        System.out.println("What is the patient's phone number? ");
        String textPhoneNum = input.nextLine();
        tracing.setPersonPhoneNum(textPhoneNum);
        System.out.println("What is the patient's email? ");
        String textPersonEmail = input.nextLine();
        tracing.setPersonEmail(textPersonEmail);
        System.out.println("What city does the patient live in ");
        String textPersonCity = input.nextLine();
        tracing.setPersonCityName(textPersonCity);
        System.out.println("What state does a patient live in? ");
        String personState = input.nextLine();
        tracing.setPersonStateName(personState);
        System.out.println("Does " + tracing.getPersonName() + " " + "have any symptom for Fever? (y/n) ");
        String prompt = input.nextLine();
        if (prompt.equalsIgnoreCase("y")) {
            allSymptoms.add("Fever");
            System.out.println("How long has " + tracing.getPersonName() + "had this symptom for? (how many days?) ");
            int numSymptomDays = input.nextInt();

        } else if (personSymptom.equalsIgnoreCase("n"))
            System.out.println("Does " + tracing.getPersonName() + " have any symptom for Cough? (y/n) ");
        String
    }
}
