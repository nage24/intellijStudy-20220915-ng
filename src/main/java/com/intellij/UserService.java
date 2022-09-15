package com.intellij;

public interface UserService {
    public boolean insert(User user);
    public boolean update(User user);
    public boolean select(String username);
    public boolean delete(String username);
}
