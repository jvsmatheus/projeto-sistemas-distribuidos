package edu.sistemasdistribuidos.projeto.utils;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordSecurity {
    public static String generateHash(String pass) {
        return BCrypt.hashpw(pass, BCrypt.gensalt());
    }

    public static boolean checkPassword(String pass, String hashedPass) {
        return BCrypt.checkpw(pass, hashedPass);
    }
}
