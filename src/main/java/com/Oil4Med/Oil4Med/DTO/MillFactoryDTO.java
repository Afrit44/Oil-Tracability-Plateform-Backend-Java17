//package com.Oil4Med.Oil4Med.DTO;
//
//import com.Oil4Med.Oil4Med.Model.Consumer;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.experimental.SuperBuilder;
//
//@SuperBuilder
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class MillFactoryDTO {
//
//
//
//    public static MillFactoryDTO fromEntity(Consumer consumer) {
//
//        if (consumer == null) {
//            //TODO throw an exception
//        }
//
//        return MillFactoryDTO.builder()
//                .firstName(consumer.getFirstName())
//                .lastName(consumer.getLastName())
//                .email(consumer.getEmail())
//                .build();
//    }
//
//    public static Consumer toEntity(MillFactoryDTO consumerDTO) {
//
//        if (consumerDTO == null) {
//            //TODO throw an exception
//        }
//
//        Consumer consumer = new Consumer();
//        consumer.setFirstName(consumerDTO.getFirstName());
//        consumer.setLastName(consumerDTO.getLastName());
//        consumer.setEmail(consumerDTO.getEmail());
//        return consumer;
//    }
//}
