import Services.UserService;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner scanner = new Scanner(System.in);
        // bayad 1 dade shavad
        int fakeId = scanner.nextInt();
        // sampling 10000 request for user with id 1!
        for(var i =0; i < 100000 ; i++){
            //var user = UserService.GetInstance().GetUserByIdWithoutCache(1);
            var user = UserService.GetInstance().GetUserByIdWithCache(1);
            System.out.println( i + ": " + user);
        }
    }

}
