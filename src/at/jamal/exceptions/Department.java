package at.jamal.exceptions;

public class Department {
    String name = "";
    Department [] subDepartments;
    int countOfSubDepartments = 0;

    public Department(String name, int countOfSubDepartments) {
        this.name = name;
        this.subDepartments = new Department [countOfSubDepartments];
    }

    public void addSubDepartment (Department department) throws SameDepartmentException, TooManyDepartmentsException {

        //FOLLOWING LINE NEEDS EXPLANATION
        if(department == this){
            throw new SameDepartmentException("Department " + this.name + " cannot have a sub-department of itself." );
        }

        //FOLLOWING LINE NEEDS EXPLANATION
        if(countOfSubDepartments == subDepartments.length){
            throw new TooManyDepartmentsException("There are too many sub-departments for " + this.name);
        }
        subDepartments[countOfSubDepartments] = department;
        countOfSubDepartments++;


    }
}
