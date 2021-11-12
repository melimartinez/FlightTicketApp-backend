package com.revature.services;

import com.revature.models.Vendor;
import com.revature.repositories.VendorRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(classes = com.revature.Project2BackEnd.Project2BackEndApplication.class)
public class VendorServiceTests {
    @Autowired
    VendorServices vs;

    @MockBean
    VendorRepo vr;

    Vendor v = new Vendor(0,"Galatic", "gtic", "gpassword", "g@gmail.com", 9090, "Hey Everyone");

    @Test
    void addVendor(){
        Mockito.when(vr.save(v)).thenReturn(new Vendor(1, v.getCompanyName(), v.getVendorUsername(), v.getVendorPassword(), v.getEmail(), v.getPhoneNumber(), v.getSlogan()));
        v = vs.addVendor(v);

        Assertions.assertEquals(1, v.getVendor_id());
        Assertions.assertEquals("gtic", v.getVendorUsername());

    }
}
