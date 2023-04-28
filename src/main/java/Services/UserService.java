package Services;

import DAL.Abstractions.IUserRepository;
import DAL.UserRepository;
import Models.User;
import Utils.Abstractions.IResourceUtils;
import Utils.ResourceUtils;

import java.io.IOException;

public class UserService {

    private static UserService Instance;
    public static UserService GetInstance(){
        if(Instance == null){
            Instance = new UserService();
        }
        return Instance;
    }
    private IResourceUtils _resourceUtils;
    private IUserRepository _userRepository;
    private UserService() {
        _resourceUtils = new ResourceUtils();
        _userRepository = new UserRepository();
    }
    public User GetUserById(int id) throws IOException {
        var userPath = GenerateFilePathFromUserId(id);
        return _userRepository.GetUserByIdFromJsonFile(userPath);
    }



    private String GenerateFilePathFromUserId(int userId){
        var fileName = userId + ".json";
        return _resourceUtils.GetResourcePath(fileName);
    }

}
