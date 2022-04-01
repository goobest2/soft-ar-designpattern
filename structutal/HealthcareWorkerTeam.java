package edu.parinya.softarchdesign.structural;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class HealthcareWorkerTeam implements HealthcareServiceable{

    private Set<HealthcareServiceable> members = new LinkedHashSet<>();

    public HealthcareWorkerTeam() {
    }

    public void addMember(HealthcareServiceable worker) {
        this.members.add(worker);
    }

    public void removeMember(HealthcareServiceable worker){
        this.members.remove(worker);
    }

    public double getPrice() {
        double totalPrice = 0.0;

        for (HealthcareServiceable member : members){
            totalPrice += member.getPrice();
        }

        return totalPrice;
    }

    public void service() {
        for (HealthcareServiceable member: members){
            member.service();
        }
    }


}
