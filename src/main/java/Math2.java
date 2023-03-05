public class Math2 {

    EmailService emailService;

    public int sum(int a, int b) {

        emailService.sendEmail("mmert.suerkan@gmail.com");

        if(a < 0){
            return b;
        }

        return a + b;
    }
}
