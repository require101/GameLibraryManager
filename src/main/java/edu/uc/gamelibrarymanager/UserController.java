package edu.uc.gamelibrarymanager;

import edu.uc.gamelibrarymanager.dto.UserDTO;
import edu.uc.gamelibrarymanager.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    ResponseEntity getUserById(@PathVariable("id") String userId){
        try {
            Assert.notNull(userService, "User service is null -- please check DI container");
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(userService.getById(userId));
        } catch (Exception e){
            //do not expose error to end user because of security stuff
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while trying to retrieve the user");
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    ResponseEntity create(@RequestBody @Valid UserDTO user){
        try {
            Assert.notNull(userService, "User service is null -- please check DI container");

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(userService.create(user));
        } catch (Exception e) {
            //do not expose error to end user because of security stuff
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while trying to create the user");
        }
    }



}
