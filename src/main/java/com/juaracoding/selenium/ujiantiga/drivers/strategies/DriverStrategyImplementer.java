package com.juaracoding.selenium.ujiantiga.drivers.strategies;

import com.juaracoding.selenium.ujiantiga.drivers.strategies.Chrome;
import com.juaracoding.selenium.ujiantiga.drivers.strategies.DriverStrategy;
import com.juaracoding.selenium.ujiantiga.drivers.strategies.Firefox;
import com.juaracoding.selenium.ujiantiga.utils.Constants;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy) {
        switch (strategy) {
            case Constants.CHROME:
                return new Chrome();

            case Constants.FIREFOX:
                return new Firefox();

            default:
                return null;
        }
    }
}
