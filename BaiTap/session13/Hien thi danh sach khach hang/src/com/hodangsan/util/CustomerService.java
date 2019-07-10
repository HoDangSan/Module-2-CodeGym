package com.hodangsan.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService {
    private static Map<Integer, Customer> customerMap;

    static {
        customerMap = new HashMap<>();
        customerMap.put(1, new Customer("Mai Văn Hoàng", "10-10-1999", "Hà Nội", "maivanhoang.jpg"));
        customerMap.put(2, new Customer("Mai Văn Hoàng", "10-10-1999", "Hà Nội", "maivanhoang.jpg"));
        customerMap.put(3, new Customer("Mai Văn Hoàng", "10-10-1999", "Hà Nội", "maivanhoang.jpg"));
        customerMap.put(4, new Customer("Mai Văn Hoàng", "10-10-1999", "Hà Nội", "maivanhoang.jpg"));
        customerMap.put(5, new Customer("Mai Văn Hoàng", "10-10-1999", "Hà Nội", "maivanhoang.jpg"));
    }

    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }
}
