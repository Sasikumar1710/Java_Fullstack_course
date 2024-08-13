package Sasi;

class employee {
    
     String name;
     String jobTitle;
     double salary;

    
    public employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    
    double calculateAnnualSalary() {
        return salary * 12;
    }

    
    void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    
    String getName() {
        return name;
    }

    String getJobTitle() {
        return jobTitle;
    }

    double getSalary() {
        return salary;
    }

   
    void displayemployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }

    
    public static void main(String[] args) {
       
        employee emp = new employee("John Doe", "Software Engineer", 5000);


        emp.displayemployeeDetails();

        
        emp.updateSalary(5500);

        
        System.out.println("\nAfter Salary Update:");
        emp.displayemployeeDetails();
    }
}

