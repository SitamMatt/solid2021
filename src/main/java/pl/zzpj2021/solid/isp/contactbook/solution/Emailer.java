package pl.zzpj2021.solid.isp.contactbook.solution;

public class Emailer {
    public void sendMessage(IEmailable emailable, String subject, String body) {

        String emailAddress = emailable.getEmailAddress();

        sendEmail(emailAddress, subject, body);
    }


    private void sendEmail(String emailAddress, String subject, String body) {
        // TODO Auto-generated method stub

    }
}
