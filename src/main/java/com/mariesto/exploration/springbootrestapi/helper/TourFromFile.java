package com.mariesto.exploration.springbootrestapi.helper;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class TourFromFile {
    public String packageType, title, description, price, length, keywords,  difficulty, region;

    public static List<TourFromFile> importTourData() throws IOException{
        return new ObjectMapper().setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
                .readValue(TourFromFile.class.getResourceAsStream("/TourData.json"), new TypeReference<List<TourFromFile>>() {});
    }
}
