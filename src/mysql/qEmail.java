/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;

/**
 *
 * @author chinmay
 */
public class qEmail {
    public static void main(){
        System.out.println("Entry");
        GmailClient g = new GmailClient();
        g.sendGmail(g.senderUserName,"chinmayn96@yahoo.co.in","test","ABCDEFGH");
        System.out.println("Done");
    }
}
