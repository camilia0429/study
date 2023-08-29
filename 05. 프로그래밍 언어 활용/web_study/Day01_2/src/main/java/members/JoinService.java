package members;

public class JoinService {
//    public boolean join() {
//        return false;
//    }
private JoinValidator joinValidator;
public JoinService(JoinValidator joinValidator){
    this.joinValidator = joinValidator;
}
    public void join(Users user) {
        joinValidator.check(user);

    }
}
