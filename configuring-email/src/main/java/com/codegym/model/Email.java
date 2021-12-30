
package com.codegym.model;
public class Email {
    private String language;
    private int pageSize;

    public Email() {
    }

    public Email(String language, int pageSize) {
        this.language = language;
        this.pageSize = pageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
