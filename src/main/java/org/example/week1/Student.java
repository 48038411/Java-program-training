package org.example.week1;

import java.io.Serializable;

/**
 * 描述:
 * Student实体类
 *
 * @author：Guorc
 * @create 2020-01-15 21:41
 */
public class Student implements Serializable {
    private String name;
    private String sex;
    private Integer age;
    private String address;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
