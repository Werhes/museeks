package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: eٕؑ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0368e {
    public static final Map yandex;
    public final C13342e ad;
    public final String appmetrica;
    public final C11226e billing;
    public final int license;
    public final int metrica;
    public final int purchase;
    public final int vip;

    static {
        HashMap hashMap = new HashMap();
        Ctry ctry = InterfaceC0760e.ad;
        hashMap.put(1, new C0368e(10, ctry));
        hashMap.put(2, new C0368e(16, ctry));
        hashMap.put(3, new C0368e(20, ctry));
        Ctry ctry2 = InterfaceC0760e.metrica;
        hashMap.put(4, new C0368e(10, ctry2));
        hashMap.put(5, new C0368e(16, ctry2));
        hashMap.put(6, new C0368e(20, ctry2));
        Ctry ctry3 = InterfaceC0760e.mopub;
        hashMap.put(7, new C0368e(10, ctry3));
        hashMap.put(8, new C0368e(16, ctry3));
        hashMap.put(9, new C0368e(20, ctry3));
        Ctry ctry4 = InterfaceC0760e.advert;
        hashMap.put(10, new C0368e(10, ctry4));
        hashMap.put(11, new C0368e(16, ctry4));
        hashMap.put(12, new C0368e(20, ctry4));
        yandex = DesugarCollections.unmodifiableMap(hashMap);
    }

    public C0368e(int i, InterfaceC0293e interfaceC0293e) {
        this(i, AbstractC7171e.vip(interfaceC0293e.getAlgorithmName()));
    }

    public C0368e(int i, Ctry ctry) {
        if (i < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (ctry == null) {
            throw new NullPointerException("digest == null");
        }
        this.vip = i;
        int i2 = 2;
        while (true) {
            int i3 = this.vip;
            if (i2 > i3) {
                throw new IllegalStateException("should never happen...");
            }
            if ((i3 - i2) % 2 == 0) {
                this.metrica = i2;
                String str = (String) AbstractC7171e.vip.get(ctry);
                if (str == null) {
                    throw new IllegalArgumentException(AbstractC4653e.inmobi("unrecognized digest oid: ", ctry));
                }
                this.appmetrica = str;
                C11226e c11226e = new C11226e(ctry);
                this.billing = c11226e;
                int i4 = c11226e.vip;
                this.purchase = i4;
                int i5 = c11226e.metrica;
                this.license = i5;
                this.ad = (C13342e) C13342e.metrica.get(C13342e.ad(str, i4, i5, c11226e.license, i));
                return;
            }
            i2++;
        }
    }
}
