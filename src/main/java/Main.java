import Services.UserService;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        int id = 1;
        // sampling 100 request for user with id 1!
        for(var i =0; i < 100 ; i++){
            var user = UserService.GetInstance().GetUserById(1);
            System.out.println(user);
        }
    }

}
