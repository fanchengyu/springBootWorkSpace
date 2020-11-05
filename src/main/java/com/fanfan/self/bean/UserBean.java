package com.fanfan.self.bean;

public class UserBean {
    private int id;
    private String name;
    private String sex;
    private String pass_word;

    public UserBean(){

    }
    public UserBean(int id, String name, String sex,String pass_word){
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

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", pass_word='" + pass_word + '\'' +
                '}';
    }

}
