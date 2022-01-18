public class CheckPassword {
    int sign_pass;
     long sign_card;
     int login_pass;
     long login_card;
     
 boolean execute() {

     return (sign_pass == login_pass && sign_card == login_card);
    }
}
