package com.hirupos.demo.service;

import com.hirupos.demo.dto.UserDTO;
import com.hirupos.demo.entity.hiru_inventory;
import com.hirupos.demo.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo  userRepo;
    @Autowired
    private ModelMapper modelMapper;

    public  List<UserDTO> getDataByCategory(String category){
        List<hiru_inventory> user = userRepo.getDataByCategory(category);
        return user.stream()
                        .map(user1->modelMapper.map(user1,UserDTO.class))
                                .collect(Collectors.toList());

    }

}
