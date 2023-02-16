package com.example.hellofx;
public class Email {
    private String To;
    private String Cc;
    private String Bcc;
    private String Subject;
    private String Content;

    public Email(String To, String Cc, String Bcc, String Subject, String Content){
        this.To = To;
        this.Cc = Cc;
        this.Bcc = Bcc;
        this.Subject = Subject;
        this.Content = Content;
    }
}

