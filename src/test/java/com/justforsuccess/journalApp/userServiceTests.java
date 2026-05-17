package com.justforsuccess.journalApp;

import com.justforsuccess.journalApp.entity.User;
import com.justforsuccess.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
@SpringBootTest
public class userServiceTests {

    @Autowired
    UserRepository userRepository;


    @Test
    public void loadByUsername() {
        User user = userRepository.findByUsername("Zeeshan");
        assertTrue(!user.getJournalEntries().isEmpty());
    }

    @ParameterizedTest
    @CsvSource({
            "1,2,3",
            "2,2,4",
    })
    public void test(int a, int b, int expected) {
        assertEquals(expected, a + b);
    }
}
