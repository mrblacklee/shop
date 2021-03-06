package com.example.demo.domain;

import java.util.Date;

public class TUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.id
     *
     * @mbg.generated
     */
    private Integer id;


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.gender
     *
     * @mbg.generated
     */
    private Integer gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.created_user
     *
     * @mbg.generated
     */
    private String createdUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.created_time
     *
     * @mbg.generated
     */
    private Date createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.modified_user
     *
     * @mbg.generated
     */
    private String modifiedUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.modified_time
     *
     * @mbg.generated
     */
    private Date modifiedTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.id
     *
     * @return the value of t_user.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.id
     *
     * @param id the value for t_user.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.username
     *
     * @return the value of t_user.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.username
     *
     * @param username the value for t_user.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.password
     *
     * @return the value of t_user.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.password
     *
     * @param password the value for t_user.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.phone
     *
     * @return the value of t_user.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.phone
     *
     * @param phone the value for t_user.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.email
     *
     * @return the value of t_user.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.email
     *
     * @param email the value for t_user.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.gender
     *
     * @return the value of t_user.gender
     *
     * @mbg.generated
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.gender
     *
     * @param gender the value for t_user.gender
     *
     * @mbg.generated
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.created_user
     *
     * @return the value of t_user.created_user
     *
     * @mbg.generated
     */
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.created_user
     *
     * @param createdUser the value for t_user.created_user
     *
     * @mbg.generated
     */
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser == null ? null : createdUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.created_time
     *
     * @return the value of t_user.created_time
     *
     * @mbg.generated
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.created_time
     *
     * @param createdTime the value for t_user.created_time
     *
     * @mbg.generated
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.modified_user
     *
     * @return the value of t_user.modified_user
     *
     * @mbg.generated
     */
    public String getModifiedUser() {
        return modifiedUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.modified_user
     *
     * @param modifiedUser the value for t_user.modified_user
     *
     * @mbg.generated
     */
    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser == null ? null : modifiedUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.modified_time
     *
     * @return the value of t_user.modified_time
     *
     * @mbg.generated
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.modified_time
     *
     * @param modifiedTime the value for t_user.modified_time
     *
     * @mbg.generated
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}