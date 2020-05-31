package com.mediumSiteCodes.graphProblems;

public class ReferenceClasses {

    static class Employee {
        int deptId;
        String empName;

        public int getDeptId() {
            return deptId;
        }

        public String getEmpName() {
            return empName;
        }

        public Employee(int deptId, String empName) {
            this.deptId = deptId;
            this.empName = empName;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "deptId=" + deptId +
                    ", empName='" + empName + '\'' +
                    '}';
        }
    }
}
