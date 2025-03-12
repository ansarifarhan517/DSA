package HospitalManagement;

import java.util.ArrayList;
import java.util.Scanner;

import HospitalManagement.Appointment;

import HospitalManagement.Doctor;

public class Hospital {

    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {

        // Patient
        // Patient Jhon = new Patient();
        // Jhon.setName("Jhon");
        // Jhon.setAge(18);

        // // Staff
        // Staff doctor = new Staff();
        // doctor.setName("Edward");
        // doctor.setRole("Doctor");

        // Staff nurse = new Staff();
        // nurse.setName("Jessica");
        // nurse.setRole("nurse");

        // Staff receptionist = new Staff();
        // receptionist.setName("Monica");
        // receptionist.setRole("receptionist");

        // System.out.println( "Doctors :" + doctor.getName() );
        // System.out.println( "nurse :" + nurse.getName() );
        // System.out.println( "Patient :" + Jhon.getName() );
    }

    public void startMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nHospital Management System");
        System.out.println("1. Add Patient");
        System.out.println("2. Add Doctor");
        System.out.println("3. Create Appointment");
        System.out.println("4. View Patients");
        System.out.println("5. View Doctors");
        System.out.println("6. View Appointments");
        System.out.println("0. Exit");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                addPatients(sc);
                break;

            default:
                break;
        }
    }

    private void addPatients(Scanner sc) {

        // System.out.println("Enter Patient ID:");
        String patientId = patients.length + 1;
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.println("Enter Gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter Address:");
        String address = scanner.nextLine();

        Patient patient = new Patient(name, gender, address, age);
        patients.add(patient);
        System.out.println("Patient added successfully!");
    }

    private void addStaff(Scanner sc) {
        
        String doctorId = doctors.length + 1;
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Specialization:");
        String specialization = scanner.nextLine();

        Doctor doctor = new Doctor(doctorId, name, specialization);
        doctors.add(doctor);
        System.out.println("Doctor added successfully!");
    }

    public void createAppointment(Scanner scanner) {

        String appointmentId = appointments.length + 1;
        System.out.println("Enter Patient ID:");
        String patientId = scanner.nextLine();
        System.out.println("Enter Doctor ID:");
        String doctorId = scanner.nextLine();
        System.out.println("Enter Appointment Date (YYYY-MM-DD):");
        String date = scanner.nextLine();

        Appointment appointment = new Appointment(appointmentId, patientId, doctorId, date);
        appointments.add(appointment);
        System.out.println("Appointment created successfully!");
    }
}
