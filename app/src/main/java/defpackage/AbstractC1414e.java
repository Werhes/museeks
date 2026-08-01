package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۣؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1414e {
    public static int Signature(int i, int i2, int i3) {
        return C5633e.yandex(i) + i2 + i3;
    }

    public static /* synthetic */ int ad(Object obj) {
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (obj instanceof Double) {
            return 4;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(obj.getClass())));
    }

    public static HashMap adcel(Class cls, C3976e c3976e) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, c3976e);
        return hashMap;
    }

    public static int admob(int i, int i2, int i3, int i4) {
        return C5633e.yandex(i) + i2 + i3 + i4;
    }

    public static InterfaceC13229e advert(InterfaceC13229e interfaceC13229e) {
        int size = interfaceC13229e.size();
        return interfaceC13229e.applovin(size + size);
    }

    public static void amazon(int i, int i2, Ctry ctry, HashMap hashMap, Integer num) {
        hashMap.put(num, new C13719e(i, i2, ctry));
    }

    public static int appmetrica(int i, int i2, int i3) {
        return AbstractC13874e.subscription(i) + i2 + i3;
    }

    public static C7369e billing(int i, C18540e c18540e) {
        C3976e c3976e = new C3976e(i);
        if (((HashMap) c18540e.f36382e) == null) {
            c18540e.f36382e = new HashMap();
        }
        ((HashMap) c18540e.f36382e).put(InterfaceC3058e.class, c3976e);
        return new C7369e((String) c18540e.f36383e, ((HashMap) c18540e.f36382e) == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap((HashMap) c18540e.f36382e)));
    }

    public static int license(int i, float f, int i2) {
        return (Float.floatToIntBits(f) + i) * i2;
    }

    public static void loadAd(HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static /* synthetic */ int metrica(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case 11:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    public static C11173e mopub(HashMap hashMap, int i) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new C11173e(i);
    }

    public static /* synthetic */ String pro(int i) {
        switch (i) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case 5:
                return "NON_PLAY_MODE";
            case 6:
                return "SDK_TOO_OLD";
            case 7:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case 11:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    public static int purchase(int i, int i2, int i3, int i4) {
        return AbstractC13874e.subscription(i) + i2 + i3 + i4;
    }

    public static int remoteconfig(int i, int i2, int i3, int i4) {
        return C11177e.tapsense(i) + i2 + i3 + i4;
    }

    public static /* synthetic */ String signatures(int i) {
        return i != 1 ? i != 2 ? "null" : "End" : "Start";
    }

    public static C3976e smaato(HashMap hashMap, int i) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new C3976e(i);
    }

    public static HashMap startapp(Class cls, C11173e c11173e) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, c11173e);
        return hashMap;
    }

    public static int subscription(int i, int i2, int i3) {
        return C11177e.tapsense(i) + i2 + i3;
    }

    public static InterfaceC2268e tapsense(InterfaceC11320e interfaceC11320e, C15547e c15547e, C11467e c11467e, ArrayList arrayList) {
        String str = c15547e.f30696e;
        if (interfaceC11320e.advert(str)) {
            InterfaceC2268e billing = interfaceC11320e.billing(str);
            if (billing instanceof AbstractC10200e) {
                return ((AbstractC10200e) billing).ad(c11467e, arrayList);
            }
            throw new IllegalArgumentException(AbstractC10257e.adcel(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(AbstractC17861e.Signature("Object has no function ", str));
        }
        AbstractC8677e.mopub(1, "hasOwnProperty", arrayList);
        return interfaceC11320e.advert(((C7302e) c11467e.f23070e).purchase(c11467e, (InterfaceC2268e) arrayList.get(0)).startapp()) ? InterfaceC2268e.f5759e : InterfaceC2268e.f5753e;
    }

    public static int vip(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                switch (i) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static C15816e yandex() {
        new LinkedHashMap();
        return new C15816e(15);
    }
}
