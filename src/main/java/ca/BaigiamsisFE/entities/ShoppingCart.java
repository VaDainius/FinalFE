package ca.BaigiamsisFE.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class ShoppingCart {

    @NonNull
    private int id;

    @NonNull
    LocalDateTime addedAt;

    @NonNull
    private Set<Helmet> helmets = new HashSet<>();
}
