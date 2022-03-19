package Scheduler.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Costumers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column
    private Date birthDate;

    @Column(length = 10)
    private String number;

    @Column(length = 100)
    private String street;

    @Column(length = 8)
    private String cep;

    @Column(length = 60)
    private String district;

    @Column(length = 60)
    private String city;

    @Column(length = 11)
    private String cpf;

    @Column(length = 1)
    private String sex;

    @Column(length = 2)
    private String uf;

    @Column
    private Integer guardianBirthDate;

    @Column(length = 10)
    private String guardianNumber;

    @Column(length = 30)
    private String guardianName;

    @Column(length = 150)
    private String obs;

}
