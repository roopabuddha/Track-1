package com.threads.normal;

public class MainDepartment {
    public static void main(String[] args) {
        Department hr = new Department("hr");
        Department hr2 = new Department("hr2");
        Department hr3 = new Department("hr3");

        hr.setName("Human resources");
        hr2.setName("it");
        hr3.setName("logistics");

        hr.start();
        hr2.start();
        hr3.start();

        System.out.println(hr.getName());
        System.out.println(hr2.getName());
        System.out.println(hr3.getName());
    }
}
