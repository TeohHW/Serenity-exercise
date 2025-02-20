package project.modules.deposit;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class DepositPageActions {
    public static Performable selectAccount(String state) {
        return Task.where("{0} selects account '" + state + "'",
                SelectFromOptions.byVisibleText(state).from(DepositPageObjects.ACCOUNT_TYPE)
        );
    }
    public static Performable enterAmount(String amount) {
        return Task.where("{0} input amount $'" + amount + "'",
                Enter.theValue(amount).into(DepositPageObjects.AMOUNT)
        );
    }
    public static Performable clickDeposit() {
        return Task.where("{0} clicks Deposit button",
                Click.on(DepositPageObjects.DEPOSIT_BTN)
        );
    }
}
