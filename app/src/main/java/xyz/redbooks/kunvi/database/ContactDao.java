package xyz.redbooks.kunvi.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import xyz.redbooks.kunvi.Contact;

@Dao
public interface ContactDao {

    @Query("SELECT name FROM Contact")
    List<String> getAllContactsName();

    @Query("SELECT mobileNumber FROM contact")
    List<Integer> getAllContactsNumber();

    @Query("SELECT * FROM Contact WHERE id = :id")
    Contact getContactById(int id);

    @Insert
    void insertContact(Contact contact);

    @Delete
    void Delete(Contact contact);

}
