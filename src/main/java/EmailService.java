public class EmailService {
    public String sendEmail(String mail) {
        System.out.println("Email sent to " + mail);
        return "Email sent to " + mail;
    }
    public String getMail(){
        System.out.println("Mail received");
        return "Mail received";
    }
}
