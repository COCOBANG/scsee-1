package com.scuse.mapper;

import com.scuse.entity.Room;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Room record);

    int insertSelective(Room record);

    Room selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);

    List<Room> getAll();
}