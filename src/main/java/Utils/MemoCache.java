package Utils;

import Models.User;
import Utils.Abstractions.IMemoCache;

import java.util.HashMap;

public class MemoCache implements IMemoCache {

    private HashMap<Integer,User> _userByUserIdCache;

    public MemoCache(){
        _userByUserIdCache = new HashMap<Integer,User>();
    }

    @Override
    public void AddUserToCache(User user){
        _userByUserIdCache.put(user.getId(),user);
    }

    @Override
    public User TryGetUserFromCache(int userId) {
        return _userByUserIdCache.get(userId);
    }
}
