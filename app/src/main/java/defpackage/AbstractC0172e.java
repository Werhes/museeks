package defpackage;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؑۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0172e {
    public static final String ad = vip(24, "video/hevc");
    public static final String vip = vip(24, "video/x-vnd.on2.vp9");
    public static final String metrica = vip(29, "audio/opus");
    public static final String license = vip(33, "video/dolby-vision");
    public static final String appmetrica = vip(34, "video/av01");
    public static final String purchase = vip(36, "video/apv");
    public static final C5363e billing = new C5363e(new C0996e(18));
    public static final C5363e yandex = new C5363e(new C0996e(19));
    public static final C5363e startapp = new C5363e(new C0996e(20));

    public static C11019e ad() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = linkedHashMap.get(0);
        if (obj == null) {
            obj = new LinkedHashMap();
            linkedHashMap.put(0, obj);
        }
        new C13572e(0, (Map) obj, 6).applovin(AbstractC6874e.adcel(license), (List) yandex.getValue());
        Unit unit = Unit.INSTANCE;
        return new C11019e(linkedHashMap);
    }

    public static String vip(int i, String str) {
        if (Build.VERSION.SDK_INT >= i) {
            return str;
        }
        return null;
    }
}
