package DAL;

import DAL.Abstractions.IUserRepository;
import Models.User;
import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UserRepository implements IUserRepository {

    @Override
    public User GetUserByIdFromJsonFile(String filePath) throws IOException {
        var path = Paths.get(new File(filePath).getPath());
        var jsonData = Files.readString(path);
        return new Gson().fromJson(jsonData,User.class);
    }
}
