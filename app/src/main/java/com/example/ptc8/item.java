package com.example.ptc8;

public class item {
    String Nombre;
    String Email;
    int Image;

    public item(String nombre, String email, int image) {
        Nombre = nombre;
        Email = email;
        Image = image;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }


}
