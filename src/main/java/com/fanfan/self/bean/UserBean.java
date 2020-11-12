package com.fanfan.self.bean;



import java.util.Date;

public class UserBean {
    private int id;
    public String name;
    private String sex;
    private String pass_word;
    private String number;
    private Date create_date;
    private Date finish_date;
    private float  weight;
    private double length;
    private int class_id;

    public UserBean(){

    }
    public UserBean(String name, String pass_word){
        this.name=name;
        this.pass_word=pass_word;
    }
    public UserBean(int id, String name, String sex,String pass_word,String number){
        this.number=number;
        this.id=id;
        this.name=name;
        this.sex=sex;
        this.pass_word=pass_word;
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id =id;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number){
        this.number =number;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public String getPass_word(){
        return pass_word;
    }
    public void setPass_word(String pass_word){
        this.pass_word=pass_word;
    }


    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getFinish_date() {
        return finish_date;
    }

    public void setFinish_date(Date finish_date) {
        this.finish_date = finish_date;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }
}
