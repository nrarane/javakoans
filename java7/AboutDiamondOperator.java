package java7;

import com.sandwich.koan.Koan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertEquals;

public class AboutDiamondOperator {

    @Koan
    public void diamondOperator() {
        String[] animals = {"Dog", "Cat", "Tiger", "Elephant", "Zebra"};
        //Generic type of array list inferred - empty <> operator
        List<String> animalsList = new ArrayList<>(Arrays.asList(animals));
		List<String> aList = new ArrayList<>(Arrays.asList());
		aList.add("Dog");
		aList.add("Cat");
		aList.add("Tiger");
		aList.add("Elephant");
		aList.add("Zebra");
        assertEquals(animalsList, aList);
    }

    @Koan
    public void diamondOperatorInMethodCall() {
        String[] animals = {"Dog", "Cat", "Tiger", "Elephant", "Zebra"};
        //type of new ArrayList<>() inferred from method parameter
        List<String> animalsList = fill(new ArrayList<>());
        List<String> aList = new ArrayList<>(Arrays.asList());
		aList.add("Dog");
		aList.add("Cat");
		aList.add("Tiger");
		aList.add("Elephant");
		aList.add("Zebra");
        assertEquals(animalsList, aList);
    }

    private List<String> fill(List<String> list) {
        String[] animals = {"Dog", "Cat", "Tiger", "Elephant", "Zebra"};
        list.addAll(Arrays.asList(animals));
        return list;
    }

}
