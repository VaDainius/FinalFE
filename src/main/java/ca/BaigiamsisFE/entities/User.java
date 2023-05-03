package ca.BaigiamsisFE.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User {


    @NonNull
    private int id;

    @NonNull
    private String username;

    @NonNull
    private String password;

    @NonNull
    private String role;

}
