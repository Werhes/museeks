package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٝؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8825e {
    public static final Set ad;
    public static final LinkedHashSet license;
    public static final HashMap metrica;
    public static final HashMap vip;

    static {
        EnumC10683e[] values = EnumC10683e.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (EnumC10683e enumC10683e : values) {
            arrayList.add(enumC10683e.f21043e);
        }
        ad = AbstractC13480e.m3582e(arrayList);
        EnumC10804e[] values2 = EnumC10804e.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (EnumC10804e enumC10804e : values2) {
            arrayList2.add(enumC10804e.f21423e);
        }
        AbstractC13480e.m3582e(arrayList2);
        vip = new HashMap();
        metrica = new HashMap();
        AbstractC10064e.startapp(new HashMap(AbstractC10064e.appmetrica(4)), new C6571e[]{new C6571e(EnumC10804e.UBYTEARRAY, C0520e.appmetrica("ubyteArrayOf")), new C6571e(EnumC10804e.USHORTARRAY, C0520e.appmetrica("ushortArrayOf")), new C6571e(EnumC10804e.UINTARRAY, C0520e.appmetrica("uintArrayOf")), new C6571e(EnumC10804e.ULONGARRAY, C0520e.appmetrica("ulongArrayOf"))});
        EnumC10683e[] values3 = EnumC10683e.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC10683e enumC10683e2 : values3) {
            linkedHashSet.add(enumC10683e2.f21042e.purchase());
        }
        license = linkedHashSet;
        for (EnumC10683e enumC10683e3 : EnumC10683e.values()) {
            HashMap hashMap = vip;
            C11709e c11709e = enumC10683e3.f21042e;
            C11709e c11709e2 = enumC10683e3.f21044e;
            hashMap.put(c11709e, c11709e2);
            metrica.put(c11709e2, enumC10683e3.f21042e);
        }
    }

    public static final boolean ad(AbstractC1186e abstractC1186e) {
        InterfaceC4077e advert;
        if (AbstractC11957e.advert(abstractC1186e) || (advert = abstractC1186e.loadAd().advert()) == null) {
            return false;
        }
        InterfaceC15498e mo1351switch = advert.mo1351switch();
        return (mo1351switch instanceof InterfaceC9646e) && AbstractC7890e.billing(((AbstractC14941e) ((InterfaceC9646e) mo1351switch)).f29618e, AbstractC4972e.mopub) && ad.contains(advert.getName());
    }
}
