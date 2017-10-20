package hibernatepractise;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import hibernatepractise.Student;

public class AddStudent {
    private static SessionFactory sessionFactory;

    public static void main(String args[]) throws Exception {
        // begin if
                                                                    // A
            String name = "Jayesh Vyas";
            String degree = "B.tech Completed";
            String phone = "9421345678";

            System.out.println("Name: " + name);
            System.out.println("Degree: " + degree);
            System.out.println("Phone: " + phone);

            if ((name.equals("") || degree.equals("") || phone.equals(""))) {
                System.out.println("All informations are Required");
            } else {

                try {// begin try
                    sessionFactory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
                    // sessionFactory1 = new
                    // Configuration().configure("com\\xml\\student1.cfg.xml").buildSessionFactory();
                } catch (Exception e) {
                    System.out.println("mathan");
                    System.out.println(e.getMessage());
                    System.err.println("Initial SessionFactory creation failed."+ e);

                }
                Session s = sessionFactory.openSession();
                // Session s1 =sessionFactory1.openSession();
                // Transaction tx1= s1.beginTransaction();
                Transaction tx = s.beginTransaction();
                Student stu = new Student();
                stu.setName(name);
                stu.setDegree(degree);
                stu.setPhone(phone);
                s.save(stu);
                tx.commit();
                System.out.println("Added to oracle Database");
                if (s != null)
                    s.close();

                // Student1 stu1=new Student1();
                // stu1.setName(name1);
                // s1.save(stu1);
                // tx1.commit();
                // System.out.println("Added to mysql Database");
                // if (s1 != null)
                // s1.close();
            }
       // }// end of if A
    }// end of method
}// end of class
