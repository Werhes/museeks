package defpackage;

import j$.util.DesugarCollections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: eٌۡ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9045e {
    public static final Map ad;
    public static final C0679e license;
    public static final Map metrica;
    public static final Map vip;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.AbstractMap, eؑۤۥ, java.util.HashMap] */
    static {
        HashMap hashMap = new HashMap();
        hashMap.put("nistp256", InterfaceC14612e.f28825goto);
        hashMap.put("nistp384", InterfaceC14612e.ads);
        hashMap.put("nistp521", InterfaceC14612e.premium);
        hashMap.put("nistk163", InterfaceC14612e.vip);
        hashMap.put("nistp192", InterfaceC14612e.f28827interface);
        hashMap.put("nistp224", InterfaceC14612e.applovin);
        hashMap.put("nistk233", InterfaceC14612e.remoteconfig);
        hashMap.put("nistb233", InterfaceC14612e.pro);
        hashMap.put("nistk283", InterfaceC14612e.smaato);
        hashMap.put("nistk409", InterfaceC14612e.subs);
        hashMap.put("nistb409", InterfaceC14612e.crashlytics);
        hashMap.put("nistt571", InterfaceC14612e.firebase);
        vip = DesugarCollections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        String[][] strArr = {new String[]{"secp256r1", "nistp256"}, new String[]{"secp384r1", "nistp384"}, new String[]{"secp521r1", "nistp521"}, new String[]{"sect163k1", "nistk163"}, new String[]{"secp192r1", "nistp192"}, new String[]{"secp224r1", "nistp224"}, new String[]{"sect233k1", "nistk233"}, new String[]{"sect233r1", "nistb233"}, new String[]{"sect283k1", "nistk283"}, new String[]{"sect409k1", "nistk409"}, new String[]{"sect409r1", "nistb409"}, new String[]{"sect571k1", "nistt571"}};
        for (int i = 0; i != 12; i++) {
            String[] strArr2 = strArr[i];
            hashMap2.put(strArr2[0], strArr2[1]);
        }
        metrica = DesugarCollections.unmodifiableMap(hashMap2);
        ?? hashMap3 = new HashMap();
        Enumeration elements = AbstractC11301e.appmetrica.elements();
        while (elements.hasMoreElements()) {
            String str = (String) elements.nextElement();
            hashMap3.put(((AbstractC4068e) AbstractC11301e.ad.get(AbstractC1433e.license(str))).metrica(), str);
        }
        license = hashMap3;
        HashMap hashMap4 = new HashMap();
        for (String str2 : vip.keySet()) {
            hashMap4.put(vip.get(str2), str2);
        }
        ad = DesugarCollections.unmodifiableMap(hashMap4);
    }
}
