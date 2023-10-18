package com.projectRaj.Todo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Todo {
    @Id
    private Integer id;
    @NotBlank
    private String title;
    @NotNull
    private String description;
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Date must be in yyyy-MM-dd format")
    private String date;

    @Pattern(regexp = "\\d{2}:\\d{2}:\\d{2}", message = "Time must be in HH:mm:ss format")
    private String creationTime;

    @Enumerated(EnumType.STRING)
    private Status status;
}
