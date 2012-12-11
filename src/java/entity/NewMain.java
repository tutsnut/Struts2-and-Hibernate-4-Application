/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import org.hibernate.Session;

/**
 *
 * @author sumit sharma
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Session session=NewHibernateUtil.getSessionFactory().openSession();
    
    }
    
}
