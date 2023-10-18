package ConfigFiles.Convertors;

import ConfigFiles.enums.DeviceName;
import ConfigFiles.enums.MobilePlatformType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToDeviceNameConvertor implements Converter<DeviceName> {

    @Override
    public DeviceName convert(Method method, String deviceName) {
        Map<String, DeviceName> stringDeviceNameMap = Map.
                of("Pixel3a",DeviceName.Pixel3a,
                        "Google_Pixel_6",DeviceName.Google_Pixel_6);
        return stringDeviceNameMap.getOrDefault(deviceName,DeviceName.Pixel3a);
    }
}
