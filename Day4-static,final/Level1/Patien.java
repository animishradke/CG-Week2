public class Patient {
    static String hospitalName = "City Health Hospital";
    private static int totalPatients = 0;
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name : " + hospitalName);
            System.out.println("Patient ID : " + patientID);
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Ailment : " + ailment);
        } else {
            System.out.println("Not a valid Patient instance.");
        }
    }
}
