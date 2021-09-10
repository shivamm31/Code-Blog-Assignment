package com.SRP;

public abstract class MailSender implements IEmailSender {

    @Override
    public void sendEmail(EmployeeStore employee, IEmailContent content) {
        //logic
    }
}