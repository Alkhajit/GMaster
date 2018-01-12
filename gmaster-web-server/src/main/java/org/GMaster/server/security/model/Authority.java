package org.GMaster.server.security.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@Entity
@Table(name = "authorities")
@XmlRootElement
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    private String username;
    private String authority;
    @OneToMany(mappedBy = "authority")
    @JsonIgnore
    private Set<User> users;

    public Authority() {
    }

    public Authority(String username, String authority) {
        this.username = username;
        this.authority = authority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public int hashCode() {
        int hashCode = id !=null? id.hashCode():0;
        hashCode = 31*hashCode + (username!=null?username.hashCode():0);
        hashCode = 31*hashCode + (authority!=null? authority.hashCode():0);
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj==null || getClass() != obj.getClass()) return false;
        Authority auth = (Authority)obj;
        if(id!=null? !id.equals(auth) : auth.id!=null) return false;
        if(username!=null? !username.equals(auth.username): auth.username!=null) return false;
        if(authority!=null? !authority.equals(auth.authority):auth.authority!=null) return false;
        return false;
    }
}
