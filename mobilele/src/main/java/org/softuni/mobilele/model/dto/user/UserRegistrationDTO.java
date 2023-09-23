package org.softuni.mobilele.model.dto.user;

public record UserRegistrationDTO(String firstName,
                                  String lastName,
                                  String email,
                                  String password,
                                  String confirmPassword) {
}
