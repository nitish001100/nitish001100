package sparkStreaming;

import java.io.Serializable;

public class Employee implements Serializable {
    private String empName;
    private int empAge;
    private String empCity;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", empCity='" + empCity + '\'' +
                '}';
    }
}
