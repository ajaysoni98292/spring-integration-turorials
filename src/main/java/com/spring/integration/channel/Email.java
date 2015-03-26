package com.spring.integration.channel;

/**
 *
 * @author ajay
 */
public class Email {

    private final String name;
    private final String employeeId;

    public Email(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}
