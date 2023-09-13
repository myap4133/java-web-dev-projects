import org.example.Computer;
import org.example.Laptop;
import org.example.SmartPhone;
import org.junit.Test;
import org.junit.Assert;

public class TechnologyTests {

    @Test
    public void testComputer(){
        Computer computer = new Computer("16.1", "Mark Twain", "64 GB");
        org.junit.Assert.assertEquals(computer.getiOS(), "16.1");
        org.junit.Assert.assertEquals(computer.getOwner(), "Mark Twain");
        org.junit.Assert.assertEquals(computer.getRAM_Size(), "64 GB");
    }

    @Test
    public void testLaptop(){
        Laptop laptop = new Laptop("15.6", "Paul Dawson", "64 GB", 90);

        org.junit.Assert.assertEquals(laptop.getiOS(), "15.6");
        org.junit.Assert.assertEquals(laptop.getOwner(), "Paul Dawson");
        org.junit.Assert.assertEquals(laptop.getRAM_Size(), "64 GB");
        org.junit.Assert.assertEquals(laptop.getBatteryLife(), 90);
    }

    @Test
    public void testSmartPhone() {
        SmartPhone smartPhone = new SmartPhone("12.4", "Percy Jackson", "64 GB", "verizon");

        org.junit.Assert.assertEquals(smartPhone.getiOS(), "12.4");
        org.junit.Assert.assertEquals(smartPhone.getOwner(), "Percy Jackson");
        org.junit.Assert.assertEquals(smartPhone.getRAM_Size(), "64 GB");
        org.junit.Assert.assertEquals(smartPhone.getServiceProvider(), "verizon");
    }
}
