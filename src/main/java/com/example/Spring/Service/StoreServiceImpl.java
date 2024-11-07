package com.example.Spring.Service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class StoreServiceImpl implements StoreService {
    public final List<Integer> itemId = new ArrayList<>();

    @Override
    public List<Integer> add(String id) {
        String[] listId = StringUtils.split(id, ", ");
        for (String item : listId) {
            itemId.add(Integer.parseInt(item));
        }
        return itemId;
    }

    @Override
    public List<Integer> getItemId() {
        return itemId;
    }
}
