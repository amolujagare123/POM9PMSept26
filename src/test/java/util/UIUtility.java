package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class UIUtility {

    public static boolean visibilityCheck(WebElement element)
    {

        boolean result = false;
        try {
            result = element.isDisplayed();
        } catch (Exception e) {

        }

        return result;
    }

    public static boolean enabilityCheck(WebElement element)
    {

        boolean result = false;
        try {
            result = element.isEnabled();
        } catch (Exception e) {

        }

        return result;
    }

    public static boolean selectionCheck(WebElement element)
    {

        boolean result = false;
        try {
            result = element.isSelected();
        } catch (Exception e) {

        }

        return result;
    }

    public static String spellCheck(WebElement element)
    {

        String result = "";
        try {
            result = element.getText();
        } catch (Exception e) {

        }

        return result;
    }


    public static String watermarkCheck(WebElement element)
    {

        String result = "";
        try {
            result = element.getAttribute("placeholder");
        } catch (Exception e) {

        }
        return result;
    }

    public static String styleCheck(WebElement element,String style)
    {

        String result = "";
        try {
            result = element.getCssValue(style);
        } catch (Exception e) {

        }
        return result;
    }

    public static String rgbToHex(String rgb)
    {
        return Color.fromString(rgb).asHex().toUpperCase();
    }
}
