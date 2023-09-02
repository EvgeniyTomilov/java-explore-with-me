package ru.practicum.statservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StatForRequest {
    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    @DateTimeFormat(pattern = DATE_FORMAT)
    @NotNull
    @PastOrPresent
    private LocalDateTime start;
    @DateTimeFormat(pattern = DATE_FORMAT)
    @NotNull
    @Future
    private LocalDateTime end;
    @NotNull
    private List<String> uris = new ArrayList<>();
    @NotNull
    private Boolean unique = false;
}
