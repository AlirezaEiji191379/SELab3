package Utils.Abstractions;


import Models.User;

public interface IMemoCache {
    void AddUserToCache(User user);

    User TryGetUserFromCache(int userId);
}
