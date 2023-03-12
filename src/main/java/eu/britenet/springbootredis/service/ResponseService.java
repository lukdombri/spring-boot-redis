package eu.britenet.springbootredis.service;

import eu.britenet.springbootredis.dto.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ResponseService {

    @Cacheable("response")
    public ResponseDTO cacheableService(String input){
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            log.error("Thread not went sleep");
        }

        return new ResponseDTO("Response on request with : " + input);
    }
}
