package de.itconsultingimhoff.testprojects.springbootbackend.user;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "user")
public class User {

    @Id
    private ObjectId id;

    @Indexed(unique = true)
    private String name;

    private String password;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }
}
