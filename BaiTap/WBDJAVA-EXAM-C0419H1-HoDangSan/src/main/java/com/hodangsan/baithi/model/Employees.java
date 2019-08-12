package com.hodangsan.baithi.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Size(min = 2, max = 20, message = "Tên phải từ 2 đến 20 ký tự")
    @NotEmpty(message = "Tên không được để trống")
    String name;
    @NotEmpty(message = "Ngày sinh không được để trống")
    String birthdate;
    boolean sex;
    @NotEmpty(message = "Số điện thoại không được để trống")
    @Pattern(regexp = "(03|09|01[2|6|8|9])+([0-9]{8})", message = "Số bạn nhập vào không đúng định dạng")
    String phone;
    @NotEmpty(message = "Số chứng minh nhân dân không được để trống")
    @Size(min = 8, max = 11, message = "Số cmnd từ 8 đến 11 ký tự")
    String identity;
    @NotEmpty(message = "Email không được để trống")
    @Email
    String email;
    @NotEmpty(message = "Địa chỉ không được để trống")
    @Size(min = 2, max = 100, message = "Địa chỉ phải từ 2 đến 100 ký tự")
    String address;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    public Employees() {
    }

    public Employees(@NotEmpty(message = "Tên không được để trống") String name, @NotEmpty(message = "Ngày sinh không được để trống") String birthdate, boolean sex, @NotEmpty(message = "Số điện thoại không được để trống") String phone, @NotEmpty(message = "Số chứng minh nhân dân không được để trống") String identity, @NotEmpty(message = "Email không được để trống") String email, @NotEmpty(message = "Địa chỉ không được để trống") String address, Group group) {
        this.name = name;
        this.birthdate = birthdate;
        this.sex = sex;
        this.phone = phone;
        this.identity = identity;
        this.email = email;
        this.address = address;
        this.group = group;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
