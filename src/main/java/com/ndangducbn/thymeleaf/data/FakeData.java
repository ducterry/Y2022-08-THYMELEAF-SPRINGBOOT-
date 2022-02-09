package com.ndangducbn.thymeleaf.data;

import com.ndangducbn.thymeleaf.bean.Account;

import java.util.Arrays;
import java.util.List;

public class FakeData {
    public static List<Account> data = Arrays.asList(
            new Account("KangKang", "KangKang", "e10adc3949ba59abbe56e", "Type1", "125-407-123"),
            new Account("Mike", "Mike", "e10adc3949ba59abbe56e", "Type1", "225-407-123"),
            new Account("Jane", "Jane", "e10adc3949ba59abbe56e", "Type1", "165-497-123"),
            new Account("Maria", "Maria", "e10adc3949ba59abbe56e", "Type1", "185-107-123")
    );
}
