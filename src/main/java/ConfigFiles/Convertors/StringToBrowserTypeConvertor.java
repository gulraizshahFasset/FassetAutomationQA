package ConfigFiles.Convertors;

import ConfigFiles.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToBrowserTypeConvertor implements Converter<BrowserType> {
    @Override
    public BrowserType convert(Method method, String browserName) {
        Map<String, BrowserType> stringBrowserTypeMap = Map.
                of("CHROME",BrowserType.CHROME,
                        "FIREFOX",BrowserType.FIREFOX);
        return stringBrowserTypeMap.getOrDefault(browserName.toUpperCase(),BrowserType.CHROME);
    }
}