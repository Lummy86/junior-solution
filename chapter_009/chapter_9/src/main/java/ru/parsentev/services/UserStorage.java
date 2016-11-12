package ru.parsentev.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import ru.parsentev.models.Comment;
import ru.parsentev.models.Item;
import ru.parsentev.models.User;

import java.sql.Timestamp;
import java.util.List;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 17.05.2016
 */
public class UserStorage {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure() // configures settings from hibernate.cfg.xml
                .buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

//        Item item = new Item();
//        item.setDesc("test");
//        item.setCreated(new Timestamp(System.currentTimeMillis()));
//        item.setAuthor(new User(19));
//
//        session.save(item);

        Item item = session.get(Item.class, 6);
        System.out.println(item);


        session.getTransaction().commit();
        session.close();
        factory.close();
    }
}
