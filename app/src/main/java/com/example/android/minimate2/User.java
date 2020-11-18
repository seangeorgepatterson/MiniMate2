package com.example.android.minimate2;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    private int userID;
    private String firstname;
    private String surname;
    private String email;
    private String password;
    private String site;

    public User(int id, String fn, String sn, String pwd, String site){
        this.userID = id;
        this.firstname = fn;
        this.surname = sn;
        this.password = pwd;
        this.site = site;

        setEmail();
    }

    private void setEmail(){
        String ext = "@test.com";
        email = firstname + "." + surname + ext;
    }

    public String getFullName(){
        return firstname + " " + surname;
    }

    //parcelable methods
    protected User(Parcel in) {
        userID = in.readInt();
        firstname = in.readString();
        surname = in.readString();
        email = in.readString();
        password = in.readString();
        site = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(userID);
        dest.writeString(firstname);
        dest.writeString(surname);
        dest.writeString(email);
        dest.writeString(password);
        dest.writeString(site);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
