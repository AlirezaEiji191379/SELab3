package DAL.Abstractions;

import Models.User;

import java.io.IOException;

public interface IUserRepository {
    User GetUserByIdFromJsonFile(String filePath) throws IOException;
}
