package me.leontss1.base.checks;

import java.util.ArrayList;

public class CheckManager {
	
    private ArrayList<Check> checks = new ArrayList<>();

    public CheckManager() {
    	//add oyur god damn checks
    }

    public ArrayList<Check> getChecks() {
        return this.checks;
    }

    public Check getCheck(String check) {
        for (Check checks : this.checks) {
            if (checks.getName().equalsIgnoreCase(check)) {
                return checks;
            } else {
                return null;
            }
        }
        return null;
    }

    public boolean doesCheckExist(Check check) {
        return this.checks.contains(check);
    }

}


