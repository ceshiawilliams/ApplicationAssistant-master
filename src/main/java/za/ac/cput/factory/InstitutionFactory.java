package za.ac.cput.factory;

import za.ac.cput.entity.Institution;


public class InstitutionFactory {

    public static Institution createInstitution(String institutionName, int institutionCode) {

        Institution verification = new Institution.Builder()
                .setInstitutionName(institutionName)
                .setInstitutionCode(institutionCode)
                .build();
        return verification;

    }

}
