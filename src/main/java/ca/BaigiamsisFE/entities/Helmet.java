package ca.BaigiamsisFE.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Helmet {

    @NonNull
    private int id;

    @NonNull
    private String manufacturer;

    @NonNull
    private String model;

    @NonNull
    private String size;

    @NonNull
    private String type;

    @NonNull
    private String status;

    @NonNull
    private String color;

    @NonNull
    private String itemDescription;

    @NonNull
    private int price;

}
