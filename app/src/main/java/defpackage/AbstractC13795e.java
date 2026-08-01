package defpackage;

import java.io.FilterInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؗ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13795e implements InterfaceC8572e {
    public static final C7936e metrica;
    public final boolean ad;
    public final HashMap vip = new HashMap();

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        metrica = new C7936e(2);
    }

    public AbstractC13795e(ArrayList arrayList, boolean z) {
        this.ad = z;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                InterfaceC8572e interfaceC8572e = (InterfaceC8572e) ((Class) it.next()).newInstance();
                for (C7056e c7056e : interfaceC8572e.ad()) {
                    this.vip.put(c7056e, interfaceC8572e);
                }
            } catch (IllegalAccessException | InstantiationException unused) {
                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                metrica.getClass();
                int i = C1724e.ad;
            }
        }
    }

    @Override // defpackage.InterfaceC8572e
    /* renamed from: license, reason: merged with bridge method [inline-methods] */
    public final AbstractC8578e vip(C7056e c7056e, FilterInputStream filterInputStream, long j) {
        long j2;
        C1548e vip;
        C2527e c2527e = new C2527e(filterInputStream, 1);
        if (!Arrays.asList(ad()).contains(c7056e)) {
            throw new IllegalArgumentException("provided GUID is not supported by this reader.");
        }
        AbstractC8578e metrica2 = metrica(j, AbstractC12394e.metrica(c2527e), c2527e);
        synchronized (c2527e) {
            j2 = c2527e.f6375e;
        }
        long j3 = j2 + j + 16;
        HashSet hashSet = new HashSet();
        while (j3 < metrica2.ad.longValue() + metrica2.metrica) {
            C7056e license = AbstractC12394e.license(c2527e);
            boolean z = this.ad && !(this.vip.containsKey(license) && hashSet.add(license));
            if (z || !this.vip.containsKey(license)) {
                vip = C5332e.vip.vip(license, c2527e, j3);
            } else {
                ((InterfaceC8572e) this.vip.get(license)).getClass();
                vip = ((InterfaceC8572e) this.vip.get(license)).vip(license, c2527e, j3);
            }
            if (vip == null) {
                c2527e.reset();
            } else {
                C7056e c7056e2 = vip.vip;
                if (!z) {
                    Hashtable hashtable = metrica2.license;
                    List list = (List) hashtable.get(c7056e2);
                    if (list == null) {
                        list = new ArrayList();
                        hashtable.put(c7056e2, list);
                    }
                    if (!list.isEmpty() && !AbstractC8578e.appmetrica.contains(c7056e2)) {
                        throw new IllegalArgumentException("The GUID of the given chunk indicates, that there is no more instance allowed.");
                    }
                    list.add(vip);
                }
                j3 = vip.ad.longValue() + vip.metrica;
            }
        }
        return metrica2;
    }

    public abstract AbstractC8578e metrica(long j, BigInteger bigInteger, C2527e c2527e);
}
