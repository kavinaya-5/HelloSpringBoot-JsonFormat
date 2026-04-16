package com.editor;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
@Component
public class Friends {

    List<String> name;

    public Friends()
    {
        this.name=new ArrayList<>();
    }

    @PostConstruct
    public void init()
    {
        name.add("nagarajan");
        name.add("vvn");
        name.add("MAlai");
    }
    public int getAllFriendsCount()
    {
        return name.size();
    }

    public List<String> getAllFriends()
    {
        return name;
    }

    public void addFriends(String names)
    {
        name.add(names);
    }
}
