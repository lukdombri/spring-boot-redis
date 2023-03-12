package eu.britenet.springbootredis.entity;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("User")
@Getter
@RequiredArgsConstructor
public class User implements Serializable {
    private String id;
    private String login;
}
