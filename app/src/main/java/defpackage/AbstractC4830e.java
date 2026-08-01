package defpackage;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؗۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4830e {
    public static final CopyOnWriteArraySet ad = new CopyOnWriteArraySet();
    public static final Map vip;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = C1343e.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C1343e.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(AbstractC17432e.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C14899e.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        vip = AbstractC10064e.advert(linkedHashMap);
    }

    public static void ad(String str, int i, String str2, Throwable th) {
        int min;
        String str3 = (String) vip.get(str);
        if (str3 == null) {
            str3 = AbstractC5304e.m1860finally(23, str);
        }
        if (Log.isLoggable(str3, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int m1865interface = AbstractC5304e.m1865interface(str2, '\n', i2, 4);
                if (m1865interface == -1) {
                    m1865interface = length;
                }
                while (true) {
                    min = Math.min(m1865interface, i2 + 4000);
                    Log.println(i, str3, str2.substring(i2, min));
                    if (min >= m1865interface) {
                        break;
                    } else {
                        i2 = min;
                    }
                }
                i2 = min + 1;
            }
        }
    }

    public static void vip(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (ad.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(C2147e.ad);
        }
    }
}
