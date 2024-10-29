import java.util.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
//Main class
public class HospitalManagementSystem {
 private static Admin admin;
 static String bgred="\u001b[101;1m";
 static String bggreen="\u001b[102;1m";
 static String bgyellow="\u001b[103;1m";
 static String bgblue="\u001b[104;1m";
 static String bgpurple="\u001b[105;1m";
 static String bgskyblue="\u001b[106;1m";
 static String blink="\u001B[5m";
 public static final String bold = "\u001B[1m";
 static String reset="\u001b[0;1m";
 static String red="\u001B[31;1m";
 static String green="\u001B[32m";
 static String yellow="\u001b[33;1m";
 static String blue="\u001b[34;1m";
 static String purple="\u001b[35;1m";
 static String skyblue="\u001b[36;1m";
 static String orange="\u001B[38;5;208m";
 static String violet="\u001B[38;5;129m";
 public static final String redb = "\u001B[38;5;196m";  // Bright Red
 public static final String orangeb = "\u001B[38;5;202m";  // Bright Orange
 public static final String greenb = "\u001B[38;5;82m";    // Bright Green
 public static final String blueb = "\u001B[38;5;27m";    // Bright Blue
 public static final String purpleb = "\u001B[38;5;93m";    // Bright Purple
 public static final String cyanb = "\u001B[38;5;87m";    // Bright Cyan
 public static final String yellowb = "\u001B[38;5;226m";  // Bright Yellow
 public static final String whiteb = "\u001B[38;5;15m";    // Bright White
 public static final String BG_CUSTOM = "\u001B[48;2;105;105;105m";  // Dim Gray
 public static final String bgRedb = "\u001B[48;5;196m";  // Bright Red
 public static final String bgOrangeb = "\u001B[48;5;202m";  // Bright Orange
 public static final String bggreenb= "\u001B[48;5;82m";    // Bright Green
 public static final String bgblueb = "\u001B[48;5;27m";    // Bright Blue
 public static final String bgpurpleb = "\u001B[48;5;93m";    // Bright Purple
 public static final String bgcyanb = "\u001B[48;5;87m";    // Bright Cyan
 public static final String bgyellowb = "\u001B[48;5;226m";  // Bright Yellow
 public static final String bgwhiteb = "\u001B[48;5;15m";    // Bright White
 static Scanner scanner = new Scanner(System.in);
 public static void main(String[] args) {
     admin = new Admin("Admin", "Admin@123", "Admin");
     Scanner scanner = new Scanner(System.in);
	 System.out.println("             "+blink+green+bold+"+..........Welcome to the Hospital Management System!..........+"+reset+"              ");
     while (true){
         System.out.println("           "+bgyellow+red+"           ..........Please Choose Your Login..........             "+reset);
         System.out.println(blue+"1. Admin Login    2. Doctor Login    3. Receptionist Login     4. Patient Login     5. Exit "+reset);
         /*System.out.println("2. Doctor Login");
         System.out.println("3. Receptionist Login");
         System.out.println("4. Patient Login");
         System.out.println("5. Exit");*/
         System.out.println();
         int choice = scanner.nextInt();
         scanner.nextLine(); // Consume newline
         System.out.println();
         if(backMenu())
         {
	         switch (choice) 
	         {
	             case 1:
			            		 adminLogin(scanner);
			            		 break;
	             case 2:
				                 doctorLogin(scanner);
				                 break;
	             case 3:
				                 receptionistLogin(scanner);
				                 break;
	             case 4:
				                 patientLogin(scanner);
				                 break;
	             case 5:
			                 System.out.println(orangeb+"                           Thank you for using the Hospital Management System!"+reset);
			                 return;
	             default:
	                 		System.out.println(red+"                           Invalid choice, please try again."+reset);
	         }
         }
     }
 }

 private static void adminLogin(Scanner scanner) {
	 System.out.println("                    ----------------------------------------------------------------");
     System.out.print("                          "+BG_CUSTOM + "Enter Admin ID : " + reset);
     String id = scanner.nextLine();
     System.out.println();
     System.out.print("                          "+BG_CUSTOM + "Enter Admin Password : " + reset);
     String password = scanner.nextLine();
     System.out.println();
     System.out.print("                              "+BG_CUSTOM +" ok "+reset);
     System.out.print("            ");
     System.out.print("                          "+BG_CUSTOM +" cancel "+reset);
     System.out.println();
	 while(true)
	 {
		 String choice=scanner.next();
		 if("ok".equals(choice))
		 {
			 
		     //LoadingBar.bar();
			 System.out.println("                    ----------------------------------------------------------------");
		     if (id.equals(admin.getId()) && password.equals(admin.getPassword())) {
		         System.out.println("                                          "+green+"Admin login successful!"+reset);
		         System.out.println();
		         adminMenu(scanner);
		     } else {
		         System.out.println("                                          "+blink+red+"Invalid credentials"+reset);
		         System.out.println();
		     }
		     break;
		 }
		 else if("cancel".equals(choice))
		 {
			 System.out.println("                    ----------------------------------------------------------------");
			 return;
		 }
		 else
		 {
			 System.out.println("                                          "+blink+red+"Invalid Choice"+reset);
		 }
	 }
 }
 private static void adminMenu(Scanner scanner) {
     while (true) {
         System.out.println("                                                  "+blue+"Admin Menu:"+reset);
         System.out.println(orange+"        1. Add Doctor"+purple+"             5. Add Receptionist"+skyblue+"              9. Add Patient"+violet+"         13. View Payments    "+redb+"14. Logout");
         System.out.println(orange+"        2. Edit Doctor"+purple+"            6. Edit Receptionist"+skyblue+"             10. Edit Patient");
         System.out.println(orange+"        3. List Doctors"+purple+"           7.List Receptionists"+skyblue+"             11. List Patients");
         System.out.println(orange+"        4. Delete Doctor"+purple+"          8.Delete Receptionist"+skyblue+"            12. Delete Patient"+reset);
         /*System.out.println("5. Add Receptionist");
         System.out.println("6. Edit Receptionist");
         System.out.println("7. List Receptionists");
         System.out.println("8. Delete Receptionist");
         System.out.println("9. Add Patient");
         System.out.println("10. Edit Patient");
         System.out.println("11. List Patients");
         System.out.println("12. Delete Patient");
         System.out.println("13. View Payments");
         System.out.println("14. Logout");*/
         System.out.println();
         System.out.print("                           "+bgyellow+greenb+"Enter Your choice :"+reset);
         int choice = scanner.nextInt();
         System.out.println();
         scanner.nextLine(); // Consume newline
         if(backMenu())
         {
	         switch (choice) {
	             case 1:
	                 addDoctor(scanner);
	                 break;
	             case 2:
	                 editDoctor(scanner);
	                 break;
	             case 3:
	                 admin.listDoctors();
	                 break;
	             case 4:
	            	 deleteDoctor(scanner);
	                 break;
	             case 5:
	            	 addReceptionist(scanner);
	                 break;
	             case 6:
	                 editReceptionist(scanner);
	                 break;
	             case 7:
	                 admin.listReceptionists();
	                 break;
	             case 8:
	            	 deleteReceptionist(scanner);
	                 break;
	                 
	             case 9:
	                 addPatient(scanner);
	                 break;
	             case 10:
	                 editPatient(scanner);
	                 break;
	             case 11:
	                 admin.listPatients();
	                 break;
	             case 12:
	            	 deletePatient(scanner);
	            	 break;
	             case 13:
	            	 admin.listAllPayments();
	            	 break;
	             case 14:
	            	 return;
	                 
	             default:
	                 System.out.println(red+blink+"                           Invalid choice!, please try again."+reset);
	         }
         }
     }
 }
 static boolean backMenu()
 {
	 System.out.print("                           "+bgblue+" continue "+reset+"                    "+bgblue+" back "+reset);
	 System.out.println();
	 while(true)
	 {
		 String choice =scanner.next();
		 System.out.println();
		 if("continue".equals(choice))
		 {
			 return true;
		 }
		 else if("back".equals(choice))
		 {
			 return false;
		 }
		 else
		 {
			 System.out.println("                                    "+blink+red+"Invalid Choice"+reset);
		 }
	 }
 }
 private static void addDoctor(Scanner scanner) {

	     System.out.print(blueb+"                           Enter Doctor ID: "+reset);
	     String id = scanner.nextLine();
	     System.out.print(blueb+"                           Enter Doctor Password: "+reset);
	     String password = scanner.nextLine();
	     while(!validatePassword(password))
	     {
	         System.out.print(blueb+"                       Enter Doctor Password: "+reset);
	         password = scanner.nextLine();    	 
	     }
	     System.out.print(blueb+"                           Enter Doctor Name: "+reset);
	     String name = scanner.nextLine().trim();
	     while(!validateName(name,"name"))
	     {
	    	 System.out.print(blueb+"                       Enter Doctor Name: "+reset);
	    	 name = scanner.nextLine().trim();
	     }
	     System.out.print(blueb+"                           Enter Doctor specialization: "+reset);
	     String specialization = scanner.nextLine().trim();
	     while(!validateName(specialization,"specialization"+reset))
	     {
	         System.out.print(blueb+"                       Enter Doctor specialization: "+reset);
	         specialization = scanner.nextLine().trim();
	     }
	     Doctor doctor = new Doctor(id, password, name,specialization);
	     admin.addDoctor(doctor);

 }
 private static boolean validateName(String name,String str)
 {
	 name=name.toUpperCase();
	 name=name.replace(" ","");
	 int n=name.length();
	 if(n==0)
	 {
	     System.out.println("                           "+red+"Invalid "+str+" Enter Valid "+str+reset);
	     return false;
	 }
	 for(int i=0;i<n;i++)
	 {
		 char ch=name.charAt(i);
		 if(!(ch>='A' && ch<='Z'))
		 {
			 System.out.println("                           "+red+"Invalid "+str+" Enter Valid "+str+reset);
			 return false;
		 }
	 }
	 return true;
 }
 private static boolean validatePassword(String password)
	{
	    int n=password.length();
	    if(n<8 || n>12)
	    {
	        System.out.println("                           "+red+"Invalid Password \n                           "+whiteb+"Password must contains 8 - 12 characters \n                            -atleast one Captial Letter \n                            -atleast one Small Letter \n                            -atleast one Number \n                            -atleast one Special Character"+reset);
	        return false;
	    }
	    else
	    {
	        String check="";
	        for(int i=0;i<n;i++)
	        {
	            char ch=password.charAt(i);
	            if(!((ch>='A'&& ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&&ch<='9') || ch==' '))
	            {
	            	check=check+"@";
	            }
	            if(ch>='A'&& ch<='Z')
	            {
	                check=check+"A";
	            }
	            else if(ch>='a'&&ch<='z') 
	            {
	                check=check+"a";
	            }
	            else if(ch>='0'&&ch<='9')
	            {
	                check=check+"0";
	            }
	            else if(ch==' ')
	            {
	            	check=check+" ";
	            }
	        }
	        if(check.contains("A") && check.contains("a") && check.contains("0") && check.contains("@"))
	        {
	                return true;
	        }
	        else
	        {
	            System.out.println("                           "+orangeb+"Weak Password \n                           "+"Password must contains 8 - 12 characters \n                            -atleast one Captial Letter \n                            -atleast one Small Letter \n                            -atleast one Number \n                            -atleast one Special Character");
	            return false;
	        }
	    }
	}

 private static void editDoctor(Scanner scanner) {

	     System.out.print(blueb+"                           Enter Doctor ID to edit: "+reset);
	     String id = scanner.nextLine();
	     boolean b=false;
	     for (Doctor doctor : admin.doctors) {
	         if (doctor.getId().equals(id)) {
	        	 b=true;
	         }
	     }
	     if(b)
	     {
		     System.out.print(blueb+"                           Enter new Doctor Name: "+reset);
		     String name = scanner.nextLine().trim();
		     while(!validateName(name,"name"))
		     {
		    	 System.out.print(blueb+"                           Enter new Doctor Name: "+reset);
		    	 name = scanner.nextLine().trim();
		     }
		     System.out.print(blueb+"                           Enter new Doctor Password: "+reset);
		     String password = scanner.nextLine();
		     while(!validatePassword(password))
		     {
		         System.out.print(blueb+"                           Enter new Doctor Password: "+reset);
		         password = scanner.nextLine();    	 
		     }
		     System.out.print(blueb+"                           Enter new Doctor specialization: "+reset);
		     String specialization = scanner.nextLine().trim();
		     while(!validateName(specialization,"specialization"))
		     {
		    	 System.out.print(blueb+"                           Enter new Doctor specialization: "+reset);
		    	 specialization = scanner.nextLine().trim();
		     }
		     
		
		     admin.editDoctor(id, name, password, specialization );
	     }
	     else
	     {
	    	 System.out.println(red+"                                  Doctor not found!"+reset);
	     }

 }
 private static void deleteDoctor(Scanner scanner)
 {

		 System.out.print(blueb+"                           Enter Doctor ID to delete: "+reset);
	     String doctorId = scanner.next();
	     admin.deleteDoctor(doctorId);

 }
 private static void addReceptionist(Scanner scanner) {

	     System.out.print(violet+"                           Enter Receptionist ID: "+reset);
	     String id = scanner.nextLine();
	     System.out.print(violet+"                           Enter Receptionist Password: "+reset);
	     String password = scanner.nextLine();
	     while(!validatePassword(password))
	     {
	         System.out.print(violet+"                           Enter Receptionist Password: "+reset);
	         password = scanner.nextLine();    	 
	     }
	     System.out.print(violet+"                           Enter Receptionist Name: "+reset);
	     String name = scanner.nextLine().trim();
	     while(!validateName(name,"name"))
	     {
	         System.out.print(violet+"                           Enter Receptionist Name: "+reset);
	    	 name = scanner.nextLine().trim();
	     }
	     Receptionist receptionist = new Receptionist(id, password, name);
	     admin.addReceptionist(receptionist);

		 
 }

 private static void editReceptionist(Scanner scanner) {

	     System.out.print(violet+"                           Enter Receptionist ID to edit: "+reset);
	     String id = scanner.nextLine();
	     boolean b=false;
	     for (Receptionist receptionist : admin.receptionists) {
	         if (receptionist.getId().equals(id)) {
	        	 b=true;
	         }
	     }
	     if(b)
	     {
		     System.out.print(violet+"                           Enter new Receptionist Name: "+reset);
		     String name = scanner.nextLine().trim();
		     while(!validateName(name,"name"))
		     {
		         System.out.print(violet+"                           Enter new Receptionist Name: "+reset);
		    	 name = scanner.nextLine().trim();
		     }
		     System.out.print(violet+"                           Enter new Receptionist Password: "+reset);
		     String password = scanner.nextLine();
		     while(!validatePassword(password))
		     {
		         System.out.print(violet+"                           Enter new Receptionist Password: "+reset);
		         password = scanner.nextLine();    	 
		     }
		     admin.editReceptionist(id, name, password);
	     }
	     else
	     {
	    	 System.out.print(red+"                                    Receptionist Id not Found"+reset);
	     }

 }
 private static void deleteReceptionist(Scanner scanner)
 {

		 System.out.print(violet+"                           Enter Receptionist ID to delete: "+reset);
	     String receptionistId = scanner.next();
	     admin.deleteReceptionist(receptionistId);
	 
 }

 private static void addPatient(Scanner scanner) {

	     System.out.print(orangeb+"                           Enter Patient ID: "+reset);
	     String id = scanner.nextLine();
	     System.out.print(orangeb+"                           Enter Patient Password: "+reset);
	     String password = scanner.nextLine();
	     while(!validatePassword(password))
	     {
	         System.out.print(orangeb+"                           Enter Patient Password: "+reset);
	         password = scanner.nextLine();    	 
	     }
	     System.out.print(orange+"                           Enter Patient Name: "+reset);
	     String name = scanner.nextLine().trim();
	     while(!validateName(name,"name"))
	     {
	         System.out.print(orangeb+"                           Enter Patient Name: "+reset);
	    	 name = scanner.nextLine().trim();
	     }
	     System.out.print(orangeb+"                           Enter Patient disease: "+reset);
	     String disease=scanner.nextLine().trim();
	     while(!validateName(disease,"disease"))
	     {
	         System.out.print(orangeb+"                           Enter Patient disease: "+reset);
	         disease = scanner.nextLine().trim();
	     }
	     System.out.print(orangeb+"                           Enter Patient age: "+reset);
	     String age=scanner.next();
	     while(!validateAge(age))
	     {
	         System.out.print(orangeb+"                           Enter Patient age: "+reset);
	         age=scanner.next();
	     }
	     Patient patient = new Patient(id, password, name, age, disease);
	     admin.addPatient(patient);
	 
 }
private static boolean validateAge(String age) {
	int n=age.length();
	if(n>3||n==0)
	{
		System.out.println(red+"                           Invalid age Enter valid age"+reset);
		return false;
	}
	else
	{
		for(int i=0;i<n;i++)
		{
			char ch=age.charAt(i);
			if(ch>=0 && ch<=9)
			{
				System.out.println(red+"                                  Invalid age Enter valid age"+reset);
				return false;
			}
		}
		int ag = Integer.parseInt(age);
		if(ag>0 && ag <= 120)
			return true;
		else {
			System.out.println(red+"                                  Invalid age Enter valid age"+reset);
			return false;
		}
	}
}
 private static void editPatient(Scanner scanner) {

		 System.out.print(orangeb+"                           Enter Patient ID to edit: "+reset);
	     String id = scanner.nextLine();
	     boolean b=false;
	     for (Patient patient : admin.patients) {
	         if (patient.getId().equals(id))
	         {
	        	 b=true;
	         }
	     }
	     if(b)
	     {
		     System.out.print(orangeb+"                           Enter new Patient Name: "+reset);
		     String name = scanner.nextLine().trim();
		     while(!validateName(name,"name"))
		     {
		    	 System.out.print(orangeb+"                           Enter new Patient Name: "+reset);
		    	 name = scanner.nextLine().trim();
		     }
		     System.out.print(orangeb+"                           Enter new Patient Password: "+reset);
		     String password = scanner.nextLine();
		     while(!validatePassword(password))
		     {
		         System.out.print(orangeb+"                           Enter new Patient Password: "+reset);
		         password = scanner.nextLine();    	 
		     }
		     System.out.print(orangeb+"                           Enter new Patient Age: "+reset);
		     String age = scanner.next();
		     System.out.print(orangeb+"                           Enter new Patient disease: "+reset);
		     scanner.nextLine();
		     String disease=scanner.nextLine();
		     System.out.println();
		     admin.editPatient(id, name, password, age, disease);
	     }
	     else
	    	 System.out.println(red+"                           Patient Not Found"+reset);

 }
 private static void deletePatient(Scanner scanner)
 {
		 System.out.print(orangeb+"                           Enter patient ID to delete: "+reset);
	     String patientId = scanner.next();
	     admin.deletePatient(patientId);
	     return;
 }
 private static void doctorLogin(Scanner scanner) {
	 System.out.print("                          "+BG_CUSTOM + "Enter Doctor ID: " + reset);
     String id = scanner.nextLine();
     System.out.println();
     System.out.print("                          "+BG_CUSTOM + "Enter Doctor Password: " + reset);
     String password = scanner.nextLine();
     System.out.println();
     System.out.print("                              "+BG_CUSTOM +" ok "+reset);
     System.out.print("            ");
     System.out.print("                          "+BG_CUSTOM +" cancel "+reset);
     System.out.println();
	 while(true)
	 {
		 String choice=scanner.next();
		 if("ok".equals(choice))
		 {
			 
		     //LoadingBar.bar();
			 System.out.println("                    ----------------------------------------------------------------");
		     for (Doctor doctor : admin.doctors) {
		         if (doctor.getId().equals(id) && doctor.getPassword().equals(password)) {
		             System.out.println(green+"                           Doctor login successful!"+reset);
		             System.out.print("                           ");
			     LoadingBar.bar();
			     System.out.println();
		             doctorMenu(scanner, doctor);
		             return;
		         }
		     }
		         System.out.println("                                          "+blink+red+"Invalid credentials"+reset);
		         System.out.println();
		         break;
		 }
		 else if("cancel".equals(choice))
		 {
			 System.out.println("                    ----------------------------------------------------------------");
			 return;
		 }
		 else
		 {
			 System.out.println("                                          "+blink+red+"Invalid Choice"+reset);
		 }
	 }
 }


 private static void doctorMenu(Scanner scanner, Doctor doctor) {
     while (true) {
         System.out.println(whiteb+"                                            "+bgred+"Doctor Menu:"+reset);
         System.out.println(greenb+"            1. List Appointments           2. Add Description to Appointment                     3. Logout");
         System.out.println();
         System.out.print("                           "+bgyellow+greenb+"Enter Your choice :"+reset);         
         int choice = scanner.nextInt();
         scanner.nextLine(); // Consume newline
         System.out.println();
         if(backMenu())
         {
	         switch (choice) {
	             case 1:
	                 doctor.listAppointments();
	                 break;
	             case 2:
	                 addDescription(scanner, doctor);
	                 break;
	             case 3:
	                 return;
	             default:
	                 System.out.println(red+"                           Invalid choice, please try again."+reset);
	         }
         }
     }
 }

 private static void addDescription(Scanner scanner, Doctor doctor) {
     System.out.print(blueb+"                           Enter Patient ID: "+reset);
     String patientId = scanner.nextLine();
     System.out.print(blueb+"                           Enter Date: "+reset);
     String date = scanner.nextLine();
     System.out.print(blueb+"                           Enter Description: "+reset);
     String description = scanner.nextLine();
     doctor.addDescription(patientId, description,date);
 }

 private static void receptionistLogin(Scanner scanner) {
	 System.out.print("                          "+BG_CUSTOM + "Enter Receptionist ID: " + reset);
     String id = scanner.nextLine();
     System.out.println();
     System.out.print("                          "+BG_CUSTOM + "Enter Receptionist Password: " + reset);
     String password = scanner.nextLine();
     System.out.println();
     System.out.print("                              "+BG_CUSTOM +" ok "+reset);
     System.out.print("            ");
     System.out.print("                          "+BG_CUSTOM +" cancel "+reset);
     System.out.println();
	 while(true)
	 {
		 String choice=scanner.next();
		 if("ok".equals(choice))
		 {
			 
		     //LoadingBar.bar();
			 System.out.println("                    ----------------------------------------------------------------");
			 for (Receptionist receptionist : admin.receptionists) {
		         if (receptionist.getId().equals(id) && receptionist.getPassword().equals(password)) {
		             System.out.println(green+"                           Receptionist login successful!"+reset);
			     System.out.print("                           ");
			     LoadingBar.bar();
			     System.out.println();
		             receptionistMenu(scanner, receptionist);
		             return;
		         }
		     }
		         System.out.println("                                          "+blink+red+"Invalid credentials"+reset);
		         System.out.println();
		         break;
		 }
		 else if("cancel".equals(choice))
		 {
			 System.out.println("                    ----------------------------------------------------------------");
			 return;
		 }
		 else
		 {
			 System.out.println("                                          "+blink+red+"Invalid Choice"+reset);
		 }
	 }
     
 }

 private static void receptionistMenu(Scanner scanner, Receptionist receptionist) {
     while (true) {
         System.out.println("                                  "+bgpurple+"Receptionist Menu:"+reset);
         System.out.println(violet+"            1. Add Patient                        4. Update Payment Status");
         System.out.println();
         System.out.println(violet+"            2. Book Appointment                   5. View Payments"+reset);
         System.out.println();
         System.out.println(violet+"            3. Generate Payment                   6. Logout"+reset);
         /*System.out.println("4. Update Payment Status");
         System.out.println("5. View Payments");
         System.out.println("6. Logout");*/
         System.out.println(reset);
         System.out.println();
         System.out.print("                           "+bgyellow+greenb+"Enter Your choice :"+reset);         
         int choice = scanner.nextInt();
         scanner.nextLine(); // Consume newline
         System.out.println();
         if(backMenu())
         {	         
        	 switch (choice) {
	             case 1:
	                 addPatient(scanner);
	                 break;
	             case 2:
	                 bookAppointment(scanner, receptionist);
	                 break;
	             case 3:
	                 generatePayment(scanner, receptionist);
	                 break;
	             case 4:
	                 updatePaymentStatus(scanner, receptionist,admin);
	                 break;
	             case 5:
	            	 admin.listAllPayments();
	            	 break;
	             case 6:
	                 return;
	             default:
	                 System.out.println("\033[0;31mInvalid choice, please try again.\033[0m");
	         }
         }
     }
 }

 private static void bookAppointment(Scanner scanner, Receptionist receptionist) {
	 admin.listDoctors();
     System.out.print(blue+"                           Enter Doctor ID: "+reset);
     String doctorId = scanner.nextLine();
     System.out.print(blue+"                           Enter Patient ID: "+reset);
     String patientId = scanner.nextLine();
     //System.out.print("Enter Appointment Date: ");
     String date = validateAppointment(scanner);
	     int n=0,m=0;
	     for (Patient patient1 : admin.patients){
	    	 if(patient1.getId().equals(patientId))
			 {
		             n+=1;
		     }
	    }
	     for (Doctor doctor : admin.doctors)
		{
	        	 if (doctor.getId().equals(doctorId)) 
		         {
	        		 m+=1;
	        		 if(n>0)
	        		 {
						 Appointment appointment = new Appointment(patientId, date);
						 receptionist.bookAppointment(doctorId, appointment, doctor);
			             return;
	        		 }
				 }
				 
		 }
	     if(n==0)
	    	 System.out.println(red+"                           Patient not found!"+reset);
	     if(m==0)
	    	 System.out.println(red+"                           Doctor not found!"+reset);
			 

 }
 private static String validateAppointment(Scanner scanner)
 {
	 DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	 String input;
     while (true) {
         System.out.print(blueb+"                           Enter an appointment date (dd-MM-yyyy): ");
         input = scanner.nextLine();
         
         try {
             LocalDate appointmentDate = LocalDate.parse(input, dateFormatter);
             
             // Check if the date is in the past
             if (appointmentDate.isBefore(LocalDate.now())) {
                 System.out.println(red+"                 The appointment date cannot be in the past. Please enter a future date."+reset);
                 continue;
             }
             
             // Check if the date is on a weekend
             DayOfWeek dayOfWeek = appointmentDate.getDayOfWeek();
             if (dayOfWeek == DayOfWeek.SUNDAY) {
                 System.out.println(red+"                 The appointment date cannot be on a weekend. Please enter a weekday."+reset);
                 continue;
             }
             
             break; // Exit the loop if the date is valid
             
         } catch (DateTimeParseException e) {
             System.out.println(red+blink+"                           Invalid date format. Please try again."+reset);
         }
     }
     return input;
 }
 private static void generatePayment(Scanner scanner, Receptionist receptionist) {
	    System.out.print(blue+"                           Enter Patient ID: "+reset);
	    String patientId = scanner.nextLine();
	    Patient patient = findPatient(patientId);
	    if (patient != null) {
		    System.out.print(blue+"                           Enter Payment Amount: "+reset);
		    double amount = scanner.nextDouble();
		    receptionist.createBill(patient, amount);
		    return; 
	    }
	    System.out.println(red+"                           Patient not found."+reset);
	    
	}
 public static Patient findPatient(String patientId) {
     for (Patient patient : admin.patients) {
         if (patient.getId().equals(patientId)) {
             return patient;
         }
     }
     return null;
 }

	private static void updatePaymentStatus(Scanner scanner, Receptionist receptionist, Admin admin) {
	    System.out.print(blue+"                           Enter Patient ID to update payment status: "+reset);
	    String patientId = scanner.nextLine();
	    receptionist.updatePaymentStatus(patientId, true, admin);
	}
 private static void patientLogin(Scanner scanner) {
	 System.out.print("                          "+BG_CUSTOM + "Enter Patient ID: " + reset);
     String id = scanner.nextLine();
     System.out.println();
     System.out.print("                          "+BG_CUSTOM + "Enter Patient Password: " + reset);
     String password = scanner.nextLine();
     System.out.println();
     System.out.print("                              "+BG_CUSTOM +" ok "+reset);
     System.out.print("            ");
     System.out.print("                          "+BG_CUSTOM +" cancel "+reset);
     System.out.println();
	 while(true)
	 {
		 String choice=scanner.next();
		 if("ok".equals(choice))
		 {
			 
		     
			 System.out.println("                    ----------------------------------------------------------------");
			 for (Patient patient : admin.patients) {
		         if (patient.getId().equals(id) && patient.getPassword().equals(password)) {
		             System.out.println(green+"                           Patient login successful!"+reset);
			     System.out.print("                           ");
			     LoadingBar.bar();
			     System.out.println();
		             patientMenu(scanner, patient,id);
		             return;
		         }
		     }
		         System.out.println("                                          "+blink+red+"Invalid credentials"+reset);
		         System.out.println();
		         break;
		 }
		 else if("cancel".equals(choice))
		 {
			 System.out.println("                    ----------------------------------------------------------------");
			 return;
		 }
		 else
		 {
			 System.out.println("                                          "+blink+red+"Invalid Choice"+reset);
		 }
	 } 
 }

 protected static void patientMenu(Scanner scanner, Patient patient,String id) 
{
	System.out.println();
     while (true) {
         System.out.println("                           "+bggreen+"Patient Menu:"+reset);
         System.out.println(orangeb+"            1. Book Appointment     2. View Description       3. List Appointments"+reset);
         System.out.println();
         System.out.println(orangeb+"            4. Make Payment         5. View Payments          6. Logout"+reset);
	 System.out.println();
	 System.out.print("                           "+bgyellow+greenb+"Enter Your choice :"+reset);
         int choice = scanner.nextInt();
	 System.out.println();
         scanner.nextLine(); // Consume newline
         if(backMenu())
         {
	         switch (choice) {
	             case 1:
	                 bookAppointment(scanner, patient,id);
	                 break;
	             case 2:
	                 patient.viewDescription();
	                 break;
	             case 3:
	                 patient.listAppointments(id);
	                 break;
	             case 4:
	                 makePayment(scanner, patient);
	                 break;
	             case 5:
	                 patient.viewPayments();
	                 break;
	             case 6:
	                 return;
	             default:
	                 System.out.println(red+"                           Invalid choice, please try again."+reset);
	         }
         }
         
     }
 }

 private static void bookAppointment(Scanner scanner, Patient patient, String id){ 
	 admin.listDoctors();
	 System.out.print(blue+"                           Enter Doctor ID: "+reset);
     String doctorId = scanner.nextLine();
     System.out.print(blue+"Enter Patient ID: "+reset);
     String patientId = scanner.nextLine();
     //System.out.print("Enter Appointment Date: ");
     String date = validateAppointment(scanner);
     if(patientId.equals(id))
     {
	    int n=0,m=0;
	    for (Patient patient1 : admin.patients){
	    	 if(patient1.getId().equals(patientId))
			 {
		             n+=1;
		     }
	    }
	    for(Doctor doctor : admin.doctors)
	    {
	        	 if (doctor.getId().equals(doctorId)) 
		         {
	        		 m+=1;
	        		 if(n>0)
	        		 {
						 Appointment appointment = new Appointment(patientId, date);
						 patient.bookAppointment(doctorId, appointment, doctor,id);
			             return;
	        		 }
				 } 
		 }
	     if(n==0)
	     {
	    	 System.out.println(red+"                           Patient not found!"+reset);
	     }
	     if(m==0)
	     {
	    	 System.out.println(red+"                           Doctor not found!"+reset);
	     }
			 
	 }
 	  else
 	  {
	 		System.out.println(red+"                           Patient Id not matched"+reset);
 	  }
 	}
 private static void makePayment(Scanner scanner, Patient patient) {
	    System.out.print(violet+"                           Enter Payment Amount: "+reset);
	    double amount = scanner.nextDouble();
	    scanner.nextLine(); // Consume newline
	    patient.makePayment(patient ,amount);
	}

}
//Admin class

class Admin extends User {
 public ArrayList<Doctor> doctors;
 public ArrayList<Receptionist> receptionists;
 public ArrayList<Patient> patients;

 public Admin(String id, String password, String name) {
     super(id, password, name);
     doctors = new ArrayList<>();
     receptionists = new ArrayList<>();
     patients = new ArrayList<>();
 }
 public void addDoctor(Doctor doctorAdd) {
	for (Doctor doctor : doctors) {
         if (doctor.getId().equals(doctorAdd.id)) {
		System.out.println("\u001B[31;1m"+"                           Doctor Id Exist Enter New Unique Id\033[0m");
		return;
		}
	}
	 doctors.add(doctorAdd);
     System.out.println("\u001B[32m"+"                           Doctor added successfully!\033[0m");
 }

 public void editDoctor(String doctorId, String newName, String newPassword,String newspecialization) {
     for (Doctor doctor : doctors) {
         if (doctor.getId().equals(doctorId)) {
             doctor.name = newName;
             doctor.password = newPassword;
		doctor.specialization=newspecialization;
             System.out.println("\u001B[32m"+"                           Doctor details updated successfully!"+"\u001b[0;1m");
             return;
         }
     }
     System.out.println("\u001B[31;1m"+"                           Doctor not found!"+"\u001b[0;1m");
 }

 public void listDoctors() {
     System.out.println("                                   "+"\u001b[104;1m"+"Doctors List:"+"\u001b[0;1m");
     for (Doctor doctor : doctors) {
         System.out.println("             [Doctor Id: " + doctor.id + ", Name: " + doctor.name +  ", specialization: " + doctor.specialization + "]");
     }
 }
 public void deleteDoctor(String id) {
     for (Doctor doctor : doctors) {
         if (doctor.getId().equals(id)) {
        	 doctors.remove(doctor);
             System.out.println("\u001B[32m"+"                           Doctor deleted successfully."+"\u001b[0;1m");
             return;
         }
     }
     System.out.println("\u001B[31;1m"+"                           Doctor not found."+"\u001b[0;1m");
 }
 public void addReceptionist(Receptionist receptionistAdd) {
     for (Receptionist receptionist : receptionists) {
         if (receptionist.getId().equals(receptionistAdd.id)) {
		System.out.println("\u001B[31;1m"+"                       Receptionist Id Exist Enter New Unique Id"+"\u001b[0;1m");
		return;
		}
	}

     receptionists.add(receptionistAdd);
     System.out.println("\u001B[32m"+"                           Receptionist added successfully!"+"\u001b[0;1m");
 }

 public void editReceptionist(String receptionistId, String newName, String newPassword) {
     for (Receptionist receptionist : receptionists) {
         if (receptionist.getId().equals(receptionistId)) {
             receptionist.name = newName;
             receptionist.password = newPassword;
             System.out.println("\u001B[32m"+"                           Receptionist details updated successfully!"+"\u001b[0;1m");
             return;
         }
     }
     System.out.println("\u001B[31;1m"+"                           Receptionist not found!"+"\u001b[0;1m");
 }

 public void listReceptionists() {
     System.out.println("                                   "+"\u001B[38;5;202m"+"Receptionists List:"+"\u001b[0;1m");
     for (Receptionist receptionist : receptionists) {
         System.out.println("                           "+receptionist);
     }
 }
 public void deleteReceptionist(String id) {
     for (Receptionist receptionist : receptionists) {
         if (receptionist.getId().equals(id)) {
        	 receptionists.remove(receptionist);
             System.out.println("\u001B[32m"+"                           receptionist deleted successfully."+"\u001b[0;1m");
             return;
         }
     }
     System.out.println("\u001B[31;1m"+"                           Receptionist not found."+"\u001b[0;1m");
 }

 public void addPatient(Patient patientAdd) {
     for (Patient patient : patients) {
         if (patient.getId().equals(patientAdd.id)) {
	    	System.out.println("\u001B[31;1m"+"                           Patient Id Exist Enter New Unique Id"+"\u001b[0;1m");
		return;
		}
	}
     patients.add(patientAdd);
     System.out.println("\u001B[32m"+"                           Patient added successfully!"+"\u001b[0;1m");
 }

 public void editPatient(String patientId, String newName, String newPassword ,String age,String newdisease) {
     for (Patient patient : patients) {
         if (patient.getId().equals(patientId)) {
             patient.name = newName;
             patient.password = newPassword;
             patient.age = age;
             patient.disease = newdisease;
             System.out.println("\u001B[32m"+"                           Patient details updated successfully!"+"\u001b[0;1m");
             return;
         }	
     }
     System.out.println("\u001B[31;1m"+"                           Patient not found!"+"\u001b[0;1m");
 }

 public void listPatients() {
     System.out.println("                                   "+"\u001b[105;1m"+"Patients List:"+"\u001b[0;1m");
     for (Patient patient : patients) {
         System.out.println("                           "+patient);
     }
 }
 public void deletePatient(String id) {
     for (Patient patient : patients) {
         if (patient.getId().equals(id)) {
             patients.remove(patient);
             System.out.println("\u001B[32m"+"                           Patient deleted successfully."+"\u001b[0;1m");
             return;
         }
     }
     System.out.println("\u001B[31;1m"+"                           Patient not found."+"\u001b[0;1m");
 }
 public void listAllPayments() {
     System.out.println("                           "+"\u001B[38;5;226m"+"All Payments:"+"\u001b[0;1m");
     for (Patient patient : patients) {
         patient.viewPayments();
     }
 }

}
//Doctor class
class Doctor extends User {
 private ArrayList<Appointment> appointments;

 public Doctor(String id, String password, String name,String specialization) {
     super(id, password, name, specialization);
     appointments = new ArrayList<>();
 }
 

 public void addAppointment(Appointment appointment) {
     appointments.add(appointment);
     System.out.println("\u001B[32m"+"                           Appointment added!"+"\u001b[0;1m");
 }

 public void listAppointments() {
     System.out.println("                           "+"\u001B[48;5;202m"+"Appointments for today:"+"\u001b[0;1m");
     for (Appointment appointment : appointments) {
         System.out.println(appointment);
     }
 }

 public void addDescription(String patientId, String description,String date) {
     for (Appointment appointment : appointments) {
         if (appointment.getPatientId().equals(patientId) && appointment.getDate().equals(date)) {
             appointment.setDescription(description);
             Patient.description=description;
             System.out.println("\u001B[32m"+"                           Description added!"+"\u001b[0;1m");
             return;
         }
     }
     System.out.println("\u001B[31;1m"+"                           "+"Description Not added!\n -Invalid Patient Id or Date"+"\u001b[0;1m");
 }

 @Override
 public String toString() {
     return "Doctor [id=" + id + ", name=" + name + "]";
 }
}
//Receptionist class
class Receptionist extends User {
 private ArrayList<Patient> patients;
 public Receptionist(String id, String password, String name) {
     super(id, password, name);
     patients = new ArrayList<>();
 }

 public void addPatient(Patient patientAdd) {
     for (Patient patient : patients) {
         if (patient.getId().equals(patientAdd.id)) {
	    	System.out.println("                           "+"\u001B[31;1m"+"Patient Id Exist Enter New Unique Id"+"\u001b[0;1m");
		return;
		}
	}
     patients.add(patientAdd);
     System.out.println("                           "+"\u001B[32m"+"Patient added successfully!"+"\u001b[0;1m");
	}
	
 public void bookAppointment(String doctorId, Appointment appointment, Doctor doctor) {
	
     doctor.addAppointment(appointment);
     Patient.appointments.add(appointment);
     System.out.println("                           "+"\u001B[32m"+"Appointment booked successfully!"+"\u001b[0;1m");
 }

 /*public void generatePayment(String patientId, double amount) {
     for (Patient patient : patients) {
         if (patient.getId().equals(patientId)) {
             patient.addPayment(amount);
             System.out.println("\033[0;32mPayment generated successfully!\033[0m");
             return;
         }
     }
     System.out.println("\033[0;31mPatient not found!\033[0m");
 }*/
 public void createBill(Patient patient, double amount) {
     Payment payment = new Payment(patient.getId(), amount);
     patient.addPayment(payment);
     System.out.println("                           "+"\u001B[32m"+"Bill created for Patient ID: " +"\u001b[0;1m"+ patient.getId() + "\u001B[32m"+" with amount " +"\u001b[0;1m"+ amount);
 }

 public void updatePaymentStatus(String patientId, boolean status, Admin admin) {
     for (Patient patient : admin.patients) {
         if (patient.getId().equals(patientId)) {
             for (Payment payment : patient.payments) {
                 if (!payment.isPaid() && status) {
                     payment.markAsPaid();
                     System.out.println("                           "+"\u001B[32m"+"Payment status updated to Paid for Patient ID: "+"\u001b[0;1m" + patientId);
                     return;
                 }
             }
             System.out.println("                           "+"\u001B[31;1m"+"No outstanding payments found for Patient ID: " +"\u001b[0;1m" + patientId);
             return;
         }
     }
     System.out.println("                           "+"\u001B[31;1m"+"Patient not found."+"\u001b[0;1m");
 }

 @Override
 public String toString() {
     return "Receptionist [id=" + id + ", name=" + name + "]";
 }
}
//Patient class
class Patient extends User {
 static Scanner scanner=new Scanner(System.in);
 public String age;
 public String disease;
 static String bgblue="\u001b[104;1m";
 static String reset="\u001b[0;1m";
 static String blink="\u001B[5m"; 
 static String red="\u001B[31;1m";
 static ArrayList<Appointment> appointments;
 protected ArrayList<Payment> payments;
 static String description;
 String patId;

 public Patient(String id, String password, String name, String age, String disease) {
     super(id, password, name, age, disease);
     this.patId=id;
     this.age = age;
     this.disease = disease;
     appointments = new ArrayList<>();
     this.payments = new ArrayList<>();
 }

 public void addPayment(Payment payment) {
     payments.add(payment);
 }
 public void makePayment(Patient patient,double amount) {
     for (Payment payment : payments) {
         if (!payment.isPaid() && amount >= payment.getAmount()) {
		if(backMenu())
		{
        	 	if(Payment.selectPayment(patient, amount))
			{
				payment.markAsPaid();
				return;
			}
			else
			{
				System.out.println("                                    "+blink+red+"Payment Failed"+reset);
				return;
			}
		}
		else
		{
			return;
		}   
         }
     }
     System.out.println("                           "+"\u001B[31;1m"+"No outstanding payments or insufficient amount."+"\u001b[0;1m");
 }
static boolean backMenu()
 	{
	 System.out.print("                           "+bgblue+" continue "+reset+"                    "+bgblue+" back "+reset);
	 System.out.println();
	 while(true)
	 {
		 String choice =scanner.next();
		 System.out.println();
		 if("continue".equals(choice))
		 {
			 return true;
		 }
		 else if("back".equals(choice))
		 {
			 return false;
		 }
		 else
		 {
			 System.out.println("                                    "+blink+red+"Invalid Choice"+reset);
		 }
	 }
 }

 public void viewPayments() {
     System.out.print("\u001b[105;1m"+"Payments for Patient ID: "+ "\u001b[0;1m" + getId() );
     for (Payment payment : payments) {
         System.out.println("                                    "+payment);
     }
 }
 public void viewDescription() {
	 for (Appointment appointment : appointments) {
		 if(appointment.patientId.equals(id))
		 {
			 System.out.println("\u001B[38;5;129m"+"Description: "+ "\u001b[0;1m" + appointment.description );
		 }
	 }
 }

 public void setDescription(String description) {
     Patient.description = description;
 }

	public void bookAppointment(String doctorId, Appointment appointment, Doctor doctor, String id) {
     
	doctor.addAppointment(appointment);
	appointments.add(appointment);
     System.out.println("\u001B[32m"+"                           Appointment booked successfully!"+"\u001b[0;1m");
 }
	public void addAppointment(Appointment appointment) {
	     appointments.add(appointment);
	     System.out.println("\u001B[32m"+"                           Appointment added!"+"\u001b[0;1m");
	 }
 public void listAppointments(String id) {
     System.out.println("                           "+"\u001b[105;1m"+"Appointments"+"\u001b[0;1m");
     for (Appointment appointment : appointments) {
    	 if(appointment.patientId.equals(id))
    		 System.out.println("                           "+appointment);
     }
 }



 @Override
 public String toString() {
     return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", disease=" + disease + "]";
 }
}
//Base class User
abstract class User {
 protected String id;
 protected String password;
 protected String name;
 protected String specialization;
 protected String age;
 protected String disease;

 public User(String id, String password, String name) {
     this.id = id;
     this.password = password;
     this.name = name;
	
 }
 public User(String id, String password, String name,String specialization) {
     this.id = id;
     this.password = password;
     this.name = name;
	this.specialization=specialization;
 }

 public User(String id, String password, String name, String age, String disease) {
     this.id = id;
     this.password = password;
     this.name = name;
     this.age = age;
     this.disease = disease;
}
public String getId() {
	
     return id;
 }

 public String getPassword() {
     return password;
 }

/*public String getName() {
     return name;
 }
 public String getspecialization() {
     return specialization;
 }
*/
 
 @Override
 public String toString() {
     	return "ID: " + id + ", Name: " + name;
	
 }
	
}
//Appointment class
class Appointment {
 String patientId;
 String date;
 String description;

 public Appointment(String patientId, String date) {
     this.patientId = patientId;
     this.date = date;
     this.description = "";
 }

 public String getPatientId() {
     return patientId;
 }

 public String getDate() {
     return date;
 }

 public String getDescription() {
     return description;
 }

 public void setDescription(String description) {
     this.description = description;
 }

 @Override
 public String toString() {
     return "Appointment [patientId=" + patientId + ", date=" + date + ", description=" + description + "]";
 }
}
class Payment {
	static Scanner scanner=new Scanner(System.in);
    private String patientId;
    private double amount;
    private boolean isPaid;
    static String reset = "\u001B[0m";
    static final String blink = "\u001b[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";
    static String cyan = "\u001B[36m";
    static Patient patient;
    static double price = 0.0;
    public Payment(String patientId, double amount) {
        this.patientId = patientId;
        this.amount = amount;
        this.isPaid = false;
    }
    static boolean selectPayment(Patient patient1,double price) {
        patient = patient1;
        Payment.price = price;
		while(true)
        	{
	    		System.out.println(yellow + "Choose 1. Debit/Credit Card 2. PhonePe 3. Google Pay 4. Paytm " + reset);
            		int choice = scanner.nextInt();
	        	switch (choice) {
	        	case 1:
	            		if(Card())
	            			return true;
				else
					return false;
	        	case 2:
	            		if(Upi())
	            			return true;
				else
					return false;
	        	case 3:
	            		if(Upi())
	            			return true;
				else
					return false;
	        	case 4:
	            		if(Upi())
	            			return true;
				else
					return false;
	        	default:
	            		System.out.println(red+"                           Oops!!,please Choose a Payment method "+reset);
	        	}
	    	}
	
        
    }
	
    static boolean Card() {
    	while(true)
	{
	        System.out.print(blue+"               Enter your 16 digits Credit Card/Debit Card Number here: "+reset);
	        long num =scanner.nextLong();
		System.out.println();
	        if (checkDigits(num) == 16) {
	            if(Exp())
	            	return true;
		    else
			return false;
	        }
	        else
	        {
	        	System.out.println(red+"                           Invalid Card Number"+reset);
	        	
	        }
	}
	        
    	
    }
    static boolean Exp() {
        while(true)
        {
	    	System.out.print(blue+"               Enter your card Expiry as MMYY here: "+reset);
	        int exp =scanner.nextInt();
		System.out.println();
	        if (checkDigits(exp) == 4) {
	            if(Cvv())
	            	return true;
		    else
			return false;
	        } 
	        System.out.println(red+"                           Invalid Expiry"+reset);
	        System.out.print(blue+"               Enter your card Expiry as MMYY here: "+reset);
	            
	        
        }
    }
    static int checkDigits(long n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }


    static boolean Cvv() {
    	while(true)
        {
	        System.out.print(blue+"               Enter your 3-Digits CVV here: "+reset);
	        int cvv =scanner.nextInt();
		System.out.println();
	        if (checkDigits(cvv) == 3) {
	            System.out.println(yellow+"               An OTP is sent to the mobile number associated with your bank"+reset);
	            if(otp1())
	            	return true;
		    else
			return false;
	        }
	        System.out.println(red+"                           Invalid CVV"+reset);
        }
    }
    static boolean otp1() {
        int c=0;
        while(true)
        {
		c++;
		if(c>=4)
		{
			System.out.println(red+"                           Payment Failed otp Generation exceeds 3 times"+reset);
			return false;
		}
        	int otp = (int) (Math.random() * 1000000);
	        System.out.println(purple+"               Generated ONE TIME PASSWORD: " +reset+ otp);
	        System.out.print(skblue+"               Please enter the one-time password sent to the phone number associated with the card: "+reset);
	        int checkotp =scanner.nextInt();
	        if (checkotp == otp) {
	            verifyOtp2();
	            return true;
	        }
	        System.out.println();
	        System.out.println(red+"                           Invalid OTP"+reset);
		if(c<=3)
		{
			System.out.print(yellow+"               A new OTP is sent to your mobile number");

		}
	        
            
        }
    }
    static void verifyOtp2() {
        System.out.print(cyan+"               OTP verification successful. Proceeding with payment...");
        process();
        System.out.print(reset);
        //patient.addPayment(new Payment(patient.patId,price));
        System.out.println(green);
        System.out.println("               Your payment of " + price + " is successful");
        System.out.print("                           Thank you for choosing our services");
        System.out.println(reset);
        return;
    }

    static boolean Upi() {
	while(true)
    	{
    		System.out.print(blue+"               Enter your UPI Mobile Number:"+reset);
    		long mobile =scanner.nextLong();
		System.out.println();
    		if (checkDigits(mobile) == 10) {
		        System.out.print(blue+"               Enter your UPI PIN:"+reset);	
		        int pin =scanner.nextInt();
			System.out.println();
		        if (pin >= 1111 && pin <= 9999) {
		            verifyOtp1();
		            System.out.println(green);
		            System.out.println("                            Your payment of " + price + " is successful");
		            System.out.print("                                  Thank you for choosing our services");
		            System.out.println(reset);
		            //patient.addPayment(new Payment(patient.patId,price));
		            return true;
		        }
			
			System.out.println(red+"                              Invalid Pin"+reset);
			return false;

    		}
    		else
    		{	
	    		System.out.println(red+"               Please enter correct UPI Number"+reset);
	    		
    		}
	}
  }
    static void process()
    {
    	for(int i=0; i<=3; i++) {
    		try{
    			Thread.sleep(1300);
    			System.out.print(".");
    		}
    		catch(InterruptedException e){
    		}
    	}
    	System.out.println();
    }

    static void verifyOtp1() {
	    
	    	System.out.print(cyan+"		               verifying UPI pin"+reset);
	    	process();
	    	System.out.print(yellow+"               OTP verification successful. Proceeding with payment...");
	    	process();
	    	System.out.print(reset);
	    	System.out.println(green+"               			Transaction Successful"			+reset);
	    	return;
    }


    
    public String getPatientId() {
        return patientId;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void markAsPaid() {
        this.isPaid = true;
    }

    public void updateAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment [Patient ID: " + patientId + ", Amount: " + amount + ", Paid: " + (isPaid ? "Yes" : "No") + "]";
    }
}
  class LoadingBar {
    // ANSI escape codes for text color, background color, and resetting color
    private static final String GREEN_BACKGROUND = "\033[42m"; // Green background
    private static final String BLACK_TEXT = "\033[30m"; // Black text
    private static final String RESET = "\033[0m"; // Reset to default color
    static void bar()
    {
        int total = 100; // total number of iterations
        int width = 30; // width of the loading bar

        String[] frames = {"|", "/", "-", "\\"}; // animation frames

        for (int i = 0; i <= total; i++) {
            printLoadingBar(i, total, width, frames[i % frames.length]);
            try {
                Thread.sleep(10); // simulate some work being done
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    static void printLoadingBar(int progress, int total, int width, String frame) {
        int percentage = (int) (((double) progress / total) * 100);
        int filledLength = (int) ((double) progress / total * width);

        StringBuilder bar = new StringBuilder("[");
        for (int i = 0; i < filledLength; i++) {
            bar.append(GREEN_BACKGROUND).append(BLACK_TEXT).append(" ").append(RESET); // Green background for filled segment
        }
        for (int i = filledLength; i < width; i++) {
            bar.append(" "); // No color for empty segment
        }
        bar.append("] ").append(String.format("%3d", percentage)).append("% ").append(frame);

        System.out.print("\r" + bar.toString());
    }
}


