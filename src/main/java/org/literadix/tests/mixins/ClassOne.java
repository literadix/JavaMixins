package org.literadix.tests.mixins;

/**
 * Implementation part one. Password is set by spring, service should be referenced from annotation.
 */
public class ClassOne implements InterfaceOne {

    private NewService service;
    private String password;

    public String getPassword() {
        return password;
    }
    public void setPassword(final String password) {
        this.password = password;
    }

    public NewService getService() {
        return service;
    }
    public void setService(NewService service) {
        this.service = service;
    }

    public String helloOne() {
        return "hello from one ";
    }
}
