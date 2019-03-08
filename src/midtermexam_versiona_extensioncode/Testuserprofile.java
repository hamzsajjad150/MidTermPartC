/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author khanh
 */
public class Testuserprofile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UserProfile profile1 = new UserProfile();
        System.out.println("Enter a user ID:");
        String userID = input.next();
        System.out.println("Enter Genre from the following:");
        for (String genre : profile1.genres) {
            System.out.println(genre);
        }

        String userGenre = input.next();
        profile1.setUserID(userID);
        profile1.setGenre(userGenre);
        System.out.println(profile1.toString());
    }

}
