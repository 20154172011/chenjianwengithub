package com.test.demo.entity;
import  lombok.Data;
import javax.persistence.Entity;
import java.util.Date;


@Data
@Entity
public class User {
    @Id
    private Integer id;
    private String name;
    private Date birthday;

}
