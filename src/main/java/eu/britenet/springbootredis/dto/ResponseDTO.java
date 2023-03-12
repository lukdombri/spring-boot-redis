package eu.britenet.springbootredis.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class ResponseDTO implements Serializable {
    private final  String message;
}
