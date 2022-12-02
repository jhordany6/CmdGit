package ui.kiire;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MarkeplaceUI {

    public static final Target CARD_MINIDATAFONO = Target.the("Conoce mas del producto Mini datafono").located(By.xpath("/html/body/app-root/main/app-home/section/div[2]/app-product-card[1]"));
    public static final Target CARD_MINIPRO = Target.the("Conoce mas del producto Minipro").located(By.xpath("/html/body/app-root/main/app-home/section/div[2]/app-product-card[2]"));
    public static final Target CARD_CODIGOQR = Target.the("Conoce mas del producto Codigos QR").located(By.xpath("/html/body/app-root/main/app-home/section/div[2]/app-product-card[3]"));
    public static final Target CARD_LINKPAGOS = Target.the("Conoce mas del producto link de pagos").located(By.xpath("/html/body/app-root/main/app-home/section/div[2]/app-product-card[4]"));
}
