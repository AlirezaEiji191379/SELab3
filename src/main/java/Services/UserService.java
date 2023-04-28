package Services;

import DAL.Abstractions.IUserRepository;
import DAL.UserRepository;
import Models.User;
import Utils.Abstractions.IMemoCache;
import Utils.Abstractions.IResourceUtils;
import Utils.MemoCache;
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
    private IMemoCache _memoCache;

    private UserService() {
        _resourceUtils = new ResourceUtils();
        _userRepository = new UserRepository();
        _memoCache = new MemoCache();
    }
    public User GetUserByIdWithoutCache(int id) throws IOException {
        var userPath = GenerateFilePathFromUserId(id);
        return _userRepository.GetUserByIdFromJsonFile(userPath);
    }

    public User GetUserByIdWithCache(int id) throws IOException {
        var cachedUser =  _memoCache.TryGetUserFromCache(id);
        return cachedUser == null ? GetUserByIdWithoutCache(id) : cachedUser;
    }

    private String GenerateFilePathFromUserId(int userId){
        var fileName = userId + ".json";
        return _resourceUtils.GetResourcePath(fileName);
    }

}
