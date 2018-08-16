import db.DBHelper;
import db.DBManager;
import models.Administrator;
import models.Manager;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Manager managerBob = new Manager(23675, 45000, 120000, "handbags");
        DBHelper.save(managerBob);

        Manager managerSooz = new Manager(87636, 50000, 300000, "cars");
        DBHelper.save(managerSooz);


        Administrator administratorGrant = new Administrator(78493, 20000,  managerBob);
        DBHelper.save(administratorGrant);

        Administrator administratorBetty = new Administrator(89532, 21000, managerSooz);
        DBHelper.save(administratorBetty);


        DBManager.addAdministratorToManager(administratorGrant, managerSooz);


        List<Administrator> managerAdministratorsBob = DBManager.getAdministratorsManager(managerBob);
        List<Administrator> managerAdministratorsSooz = DBManager.getAdministratorsManager(managerSooz);













    }
}
