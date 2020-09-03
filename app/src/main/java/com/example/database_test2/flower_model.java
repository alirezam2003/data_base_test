package com.example.database_test2;

public class flower_model {

    public static final String key_id = "id";
    public static final String key_name = "name";
    public static final String key_pic = "picture";


    int id;
    String name;
    String pic;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }


}
