package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegistrationPostPojo {
    /*
    {
  "activated": true,
  "authorities": [
    "string"
  ],
  "createdBy": "string",
  "createdDate": "2023-02-23T19:29:41.427Z",
  "email": "string",
  "firstName": "string",
  "id": 0,
  "imageUrl": "string",
  "langKey": "string",
  "lastModifiedBy": "string",
  "lastModifiedDate": "2023-02-23T19:29:41.428Z",
  "lastName": "string",
  "login": "string",
  "password": "string",
  "ssn": "string"
}
     */
    private boolean activated;
    private ArrayList<String> authorities;
    private String createdBy;
    private String createdDate;
    private String email;
    private String firstName;
    private String imageUrl;
    private String langKey;
    private String lastModifiedBy;
    private String langModifiedDate;
    private String lastName;
    private String login;
    private String password;
    private String ssn;

    public RegistrationPostPojo() {
    }

    public RegistrationPostPojo(boolean activated, ArrayList<String> authorities, String createdBy, String createdDate, String email, String firstName, String imageUrl, String langKey, String lastModifiedBy, String langModifiedDate, String lastName, String login, String password, String ssn) {
        this.activated = activated;
        this.authorities = authorities;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.email = email;
        this.firstName = firstName;
        this.imageUrl = imageUrl;
        this.langKey = langKey;
        this.lastModifiedBy = lastModifiedBy;
        this.langModifiedDate = langModifiedDate;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.ssn = ssn;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public ArrayList<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(ArrayList<String> authorities) {
        this.authorities = authorities;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLangKey() {
        return langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getLangModifiedDate() {
        return langModifiedDate;
    }

    public void setLangModifiedDate(String langModifiedDate) {
        this.langModifiedDate = langModifiedDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "RegistrationPostPojo{" +
                "activated=" + activated +
                ", authorities=" + authorities +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", langKey='" + langKey + '\'' +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", langModifiedDate='" + langModifiedDate + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}