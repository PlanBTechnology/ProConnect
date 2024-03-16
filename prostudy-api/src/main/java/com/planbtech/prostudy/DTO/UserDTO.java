package com.planbtech.prostudy.DTO;

import com.planbtech.prostudy.entities.model.User;

public class UserDTO {

    private Long userId;
    private String userName;
    private String password;
    private String email;

    UserDTO(User entity) {
        this.userId = entity.getUserId();
        this.userName = entity.getUserName();
        this.password = entity.getUserPassword();
        this.email = entity.getUserEmail();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserDTO userDTO)) return false;

        if (!getUserId().equals(userDTO.getUserId())) return false;
        if (!getUserName().equals(userDTO.getUserName())) return false;
        if (!getPassword().equals(userDTO.getPassword())) return false;
        return getEmail().equals(userDTO.getEmail());
    }

    @Override
    public int hashCode() {
        int result = getUserId().hashCode();
        result = 31 * result + getUserName().hashCode();
        result = 31 * result + getPassword().hashCode();
        result = 31 * result + getEmail().hashCode();
        return result;
    }
}
