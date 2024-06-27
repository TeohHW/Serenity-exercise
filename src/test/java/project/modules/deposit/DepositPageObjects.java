package project.modules.deposit;

import net.serenitybdd.screenplay.targets.Target;

class DepositPageObjects {
    public static Target ACCOUNT_TYPE = Target.the("Account").locatedBy("#accountType");
    public static Target AMOUNT = Target.the("Amount").locatedBy("amount");
    public static Target DEPOSIT_BTN = Target.the("Amount").locatedBy("/html/body/div[2]/div/div/form/button");
}
