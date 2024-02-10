package com.example.model;
import lombok.AllArgsConstructor; 
import lombok.Builder;
import lombok.Data;
// import lombok.NoArgsConstructor;


import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

/**
 * A representation of a user in the system.
 *
 * @author example
 */
@Builder
@Entity
@Data
@AllArgsConstructor
// @NoArgsConstructor
@Table(name = "User",
        schema = "nitconf",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "emailId_unique",
                        columnNames = { "emailId" }
                )
})
public class User {

    /**
     * The unique identifier for the user.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userid;

    /**
     * The first name of the user.
     */
    private String firstName;

    /**
     * The last name of the user.
     */
    private String lastName;

    /**
     * The username of the user.
     */
    private String username;

    /**
     * The phone number of the user.
     */
    private String number;

    /**
     * The password of the user.
     */
    private String password;

    /**
     * The limit of papers for the user.
     */
    private Long paperlimit;

    /**
     * The list of tags for the user.
     */
    private List<String> tags;

    /**
     * Gets the unique identifier for the user.
     *
     * @return the userid
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * Sets the unique identifier for the user.
     *
     * @param userid the userid to set
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * Gets the first name of the user.
     *
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the user.
     *
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the user.
     *
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the user.
     *
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the username of the user.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username of the user.
     *
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the phone number of the user.
     *
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the phone number of the user.
     *
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Gets the password of the user.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password of the user.
     *
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the limit of papers for the user.
     *
     * @return the paperlimit
     */
    public Long getPaperlimit() {
        return paperlimit;
    }

    /**
     * Sets the limit of papers for the user.
     *
     * @param paperlimit the paperlimit to set
     */
    public void setPaperlimit(Long paperlimit) {
        this.paperlimit = paperlimit;
    }

    /**
     * Gets the list of tags for the user.
     *
     * @return the tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * Sets the list of tags for the user.
     *
     * @param tags the tags to set
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * Returns a string representation of the user.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "User [userid=" + userid + ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
                + ", number=" + number + ", password=" + password + ", paperlimit=" + paperlimit + ", tags=" + tags
                + "]";
    }

    /**
     * Instantiates a new user.
     *
     * @param userid the userid
     * @param firstName the first name
     * @param lastName the last name
     * @param emailId the email id
     * @param number the number
     * @param password the password
     * @param paperlimit the paperlimit
     * @param tags the tags
     */
    public User(Long userid, String firstName, String lastName, String emailId, String number, String password,
            Long paperlimit, List<String> tags, String username) {
        super();
        this.userid = userid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.number = number;
        this.password = password;
        this.paperlimit = paperlimit;
        this.tags = tags;
    }

    /**
     * Instantiates a new user.
     */
    public User() {
        super();
    }

}