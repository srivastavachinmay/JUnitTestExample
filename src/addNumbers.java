import static org.junit.Assert.assertEquals;

class addNumbers {

    @org.junit.jupiter.api.Test
    void addNumbers() {
        jUnitTesting addNum = new jUnitTesting();
        int result = addNum.addNumbers(100, 200);
        assertEquals (300,result);
        result = addNum.addNumbers(150, 200);
        assertEquals (300, result);
    }
}