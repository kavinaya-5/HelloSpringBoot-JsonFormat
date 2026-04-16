package com.editor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FriendsController {
     @Autowired
    Friends friends;
    @RequestMapping("/getlist")
    public List<String> getFriends()
    {
        return friends.getAllFriends();

    }

    @RequestMapping("/getcount")
    public int getCount()
    {
        return friends.getAllFriendsCount();
    }

    @RequestMapping("/name/{names}")
    public List<String> add(@PathVariable String names)
    {
        friends.addFriends(names);
        return friends.getAllFriends();
    }
}
