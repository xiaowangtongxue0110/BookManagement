package gentleman.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class reader_info {
    private Integer readerId;

    private String name;

    private String sex;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;

    private String address;

    private String telcode;

    public Integer getReaderId() {
        return readerId;
    }

    public void setReaderId(Integer readerId) {
        this.readerId = readerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTelcode() {
        return telcode;
    }

    public void setTelcode(String telcode) {
        this.telcode = telcode == null ? null : telcode.trim();

    }

    public reader_info(String name, String sex, Date birth, String address, String telcode) {
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
        this.telcode = telcode;
    }

    public reader_info() {

    }
}