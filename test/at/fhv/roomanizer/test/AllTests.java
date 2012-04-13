package at.fhv.roomanizer.test;

import at.fhv.roomanizer.test.reservation.*;
import at.fhv.roomanizer.test.room.*;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ HabitationTest.class, ReservationTest.class, CategoryTest.class })
public class AllTests {

}
