package eu.britenet.springbootredis.controller;

import eu.britenet.springbootredis.dto.ResponseDTO;
import eu.britenet.springbootredis.entity.User;
import eu.britenet.springbootredis.service.ResponseService;
import eu.britenet.springbootredis.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ResponseController {

    private final ResponseService responseService;
    private final UserService userService;

    @GetMapping("/response")
    @ResponseBody
    public ResponseDTO getResponse(@RequestParam(value = "input") String input) {
        return responseService.cacheableService(input);
    }

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.OK)
    public void saveUser(@RequestBody User user) {
        userService.save(user);
    }

    @GetMapping("/user")
    @ResponseBody
    public User getUser(@RequestParam String id) {
        return userService.get(id);
    }
}
