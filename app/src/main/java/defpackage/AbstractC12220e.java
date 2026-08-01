package defpackage;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؓۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12220e {
    public static Map Signature(String str, Bundle bundle) {
        Map map = (Map) bundle.getSerializable(str);
        if (map == null) {
            return C2204e.f5590e;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                hashMap.put((Integer) entry.getKey(), (Integer) entry.getValue());
            }
        }
        return DesugarCollections.unmodifiableMap(hashMap);
    }

    public static final C16005e ad(float f) {
        return new C16005e(f, f, f, f);
    }

    public static final InterfaceC12864e adcel(InterfaceC12864e interfaceC12864e, InterfaceC12123e interfaceC12123e) {
        return interfaceC12864e.premium(new C11888e(interfaceC12123e, new C4526e(15)));
    }

    public static final InterfaceC12864e advert(InterfaceC12864e interfaceC12864e, float f, float f2) {
        return interfaceC12864e.premium(new C11552e(f, f2, f, f2, new C4526e(13)));
    }

    public static final InterfaceC12864e amazon(InterfaceC12864e interfaceC12864e, float f, float f2, float f3, float f4) {
        return interfaceC12864e.premium(new C11552e(f, f2, f3, f4, new C4526e(12)));
    }

    public static C16005e appmetrica(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return new C16005e(f, f2, f3, f4);
    }

    public static final float billing(InterfaceC12123e interfaceC12123e, EnumC7792e enumC7792e) {
        return enumC7792e == EnumC7792e.f15794e ? interfaceC12123e.vip(enumC7792e) : interfaceC12123e.metrica(enumC7792e);
    }

    public static final C16005e license(float f, float f2, float f3, float f4) {
        return new C16005e(f, f2, f3, f4);
    }

    public static InterfaceC12864e loadAd(InterfaceC12864e interfaceC12864e, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return amazon(interfaceC12864e, f, f2, f3, f4);
    }

    public static C16005e metrica(float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return new C16005e(f, f2, f, f2);
    }

    public static final InterfaceC12864e mopub(InterfaceC12864e interfaceC12864e, float f) {
        return interfaceC12864e.premium(new C11552e(f, f, f, f, new C4526e(14)));
    }

    public static final float purchase(InterfaceC12123e interfaceC12123e, EnumC7792e enumC7792e) {
        return enumC7792e == EnumC7792e.f15794e ? interfaceC12123e.metrica(enumC7792e) : interfaceC12123e.vip(enumC7792e);
    }

    public static InterfaceC12864e smaato(InterfaceC12864e interfaceC12864e, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return advert(interfaceC12864e, f, f2);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, eؙٖؑ] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, eؙٖؑ] */
    public static C0333e startapp(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            ?? obj = new Object();
            new LinkedHashMap();
            obj.ad = new C18464e(C9139e.f18290e);
            return obj;
        }
        bundle.setClassLoader(C0333e.class.getClassLoader());
        C1239e c1239e = new C1239e(bundle.size());
        for (String str : bundle.keySet()) {
            c1239e.put(str, bundle.get(str));
        }
        C1239e vip = c1239e.vip();
        ?? obj2 = new Object();
        new LinkedHashMap();
        obj2.ad = new C18464e(vip);
        return obj2;
    }

    public static final C16005e vip(float f, float f2) {
        return new C16005e(f, f2, f, f2);
    }

    public static int yandex(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        throw new IllegalArgumentException(AbstractC1786e.admob(i, "Invalid rotation: "));
    }
}
