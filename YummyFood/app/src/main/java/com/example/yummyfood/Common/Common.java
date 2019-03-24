package com.example.yummyfood.Common;
import com.example.yummyfood.Model.User;

public class Common {
    public static User currentUser;

    public static User getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(User currentUser) {
        Common.currentUser = currentUser;
    }
}
