package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: eٟٓؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13719e {
    public static final Map appmetrica;
    public final C14983e ad;
    public final int license;
    public final int metrica;
    public final C0368e vip;

    static {
        HashMap hashMap = new HashMap();
        Ctry ctry = InterfaceC0760e.ad;
        hashMap.put(1, new C13719e(20, 2, ctry));
        AbstractC1414e.amazon(20, 4, ctry, hashMap, 2);
        AbstractC1414e.amazon(40, 2, ctry, hashMap, 3);
        AbstractC1414e.amazon(40, 4, ctry, hashMap, 4);
        AbstractC1414e.amazon(40, 8, ctry, hashMap, 5);
        AbstractC1414e.amazon(60, 3, ctry, hashMap, 6);
        AbstractC1414e.amazon(60, 6, ctry, hashMap, 7);
        AbstractC1414e.amazon(60, 12, ctry, hashMap, 8);
        Ctry ctry2 = InterfaceC0760e.metrica;
        hashMap.put(9, new C13719e(20, 2, ctry2));
        AbstractC1414e.amazon(20, 4, ctry2, hashMap, 10);
        AbstractC1414e.amazon(40, 2, ctry2, hashMap, 11);
        AbstractC1414e.amazon(40, 4, ctry2, hashMap, 12);
        AbstractC1414e.amazon(40, 8, ctry2, hashMap, 13);
        AbstractC1414e.amazon(60, 3, ctry2, hashMap, 14);
        AbstractC1414e.amazon(60, 6, ctry2, hashMap, 15);
        AbstractC1414e.amazon(60, 12, ctry2, hashMap, 16);
        Ctry ctry3 = InterfaceC0760e.mopub;
        hashMap.put(17, new C13719e(20, 2, ctry3));
        AbstractC1414e.amazon(20, 4, ctry3, hashMap, 18);
        AbstractC1414e.amazon(40, 2, ctry3, hashMap, 19);
        AbstractC1414e.amazon(40, 4, ctry3, hashMap, 20);
        AbstractC1414e.amazon(40, 8, ctry3, hashMap, 21);
        AbstractC1414e.amazon(60, 3, ctry3, hashMap, 22);
        AbstractC1414e.amazon(60, 6, ctry3, hashMap, 23);
        AbstractC1414e.amazon(60, 12, ctry3, hashMap, 24);
        Ctry ctry4 = InterfaceC0760e.advert;
        hashMap.put(25, new C13719e(20, 2, ctry4));
        AbstractC1414e.amazon(20, 4, ctry4, hashMap, 26);
        AbstractC1414e.amazon(40, 2, ctry4, hashMap, 27);
        AbstractC1414e.amazon(40, 4, ctry4, hashMap, 28);
        AbstractC1414e.amazon(40, 8, ctry4, hashMap, 29);
        AbstractC1414e.amazon(60, 3, ctry4, hashMap, 30);
        AbstractC1414e.amazon(60, 6, ctry4, hashMap, 31);
        AbstractC1414e.amazon(60, 12, ctry4, hashMap, 32);
        appmetrica = DesugarCollections.unmodifiableMap(hashMap);
    }

    public C13719e(int i, int i2, InterfaceC0293e interfaceC0293e) {
        this(i, i2, AbstractC7171e.vip(interfaceC0293e.getAlgorithmName()));
    }

    public C13719e(int i, int i2, Ctry ctry) {
        this.metrica = i;
        this.license = i2;
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (i % i2 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        int i3 = i / i2;
        if (i3 == 1) {
            throw new IllegalArgumentException("height / layers must be greater than 1");
        }
        C0368e c0368e = new C0368e(i3, ctry);
        this.vip = c0368e;
        int i4 = c0368e.billing.license;
        String str = c0368e.appmetrica;
        if (str != null) {
            this.ad = (C14983e) C14983e.metrica.get(C14983e.ad(c0368e.purchase, c0368e.license, i4, i, i2, str));
        } else {
            Map map = C14983e.metrica;
            throw new NullPointerException("algorithmName == null");
        }
    }
}
