package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5882e {
    public final String ad;
    public final BitSet appmetrica;
    public final C2271e billing;
    public final BitSet license;
    public final C9486e metrica;
    public final C2271e purchase;
    public final boolean vip;
    public final /* synthetic */ C14092e yandex;

    /* JADX WARN: Type inference failed for: r1v4, types: [eٕ٘ؔ, eؓۨۖ] */
    /* JADX WARN: Type inference failed for: r1v5, types: [eٕ٘ؔ, eؓۨۖ] */
    public C5882e(C14092e c14092e, String str) {
        this.yandex = c14092e;
        this.ad = str;
        this.vip = true;
        this.license = new BitSet();
        this.appmetrica = new BitSet();
        this.purchase = new C17519e(0);
        this.billing = new C17519e(0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eٕ٘ؔ, eؓۨۖ] */
    public C5882e(C14092e c14092e, String str, C9486e c9486e, BitSet bitSet, BitSet bitSet2, C2271e c2271e, C2271e c2271e2) {
        this.yandex = c14092e;
        this.ad = str;
        this.license = bitSet;
        this.appmetrica = bitSet2;
        this.purchase = c2271e;
        this.billing = new C17519e(0);
        Iterator it = ((C15627e) c2271e2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c2271e2.get(num));
            this.billing.put(num, arrayList);
        }
        this.vip = false;
        this.metrica = c9486e;
    }

    public final void ad(C16457e c16457e) {
        int tapsense;
        boolean z;
        boolean ads;
        switch (c16457e.billing) {
            case 0:
                tapsense = ((C12919e) c16457e.startapp).tapsense();
                break;
            default:
                tapsense = ((C4512e) c16457e.startapp).tapsense();
                break;
        }
        if (c16457e.metrica != null) {
            this.appmetrica.set(tapsense, true);
        }
        Boolean bool = c16457e.license;
        if (bool != null) {
            this.license.set(tapsense, bool.booleanValue());
        }
        if (c16457e.appmetrica != null) {
            Integer valueOf = Integer.valueOf(tapsense);
            C2271e c2271e = this.purchase;
            Long l = (Long) c2271e.get(valueOf);
            long longValue = c16457e.appmetrica.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                c2271e.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (c16457e.purchase != null) {
            Integer valueOf2 = Integer.valueOf(tapsense);
            C2271e c2271e2 = this.billing;
            List list = (List) c2271e2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                c2271e2.put(valueOf2, list);
            }
            switch (c16457e.billing) {
                case 0:
                    z = false;
                    break;
                default:
                    z = true;
                    break;
            }
            if (z) {
                list.clear();
            }
            C15879e.ad();
            C6936e c6936e = (C6936e) this.yandex.f36443e;
            C10476e c10476e = c6936e.f14221e;
            C6973e c6973e = AbstractC17254e.f33826e;
            String str = this.ad;
            if (c10476e.m2822e(str, c6973e)) {
                switch (c16457e.billing) {
                    case 0:
                        ads = ((C12919e) c16457e.startapp).ads();
                        break;
                    default:
                        ads = false;
                        break;
                }
                if (ads) {
                    list.clear();
                }
            }
            C15879e.ad();
            if (!c6936e.f14221e.m2822e(str, c6973e)) {
                list.add(Long.valueOf(c16457e.purchase.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(c16457e.purchase.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    public final C7039e vip(int i) {
        ArrayList arrayList;
        List list;
        C1996e premium = C7039e.premium();
        premium.vip();
        ((C7039e) premium.f12709e).subs(i);
        premium.vip();
        ((C7039e) premium.f12709e).m2266class(this.vip);
        C9486e c9486e = this.metrica;
        if (c9486e != null) {
            premium.vip();
            ((C7039e) premium.f12709e).firebase(c9486e);
        }
        C9532e subs = C9486e.subs();
        ArrayList m2876e = C10686e.m2876e(this.license);
        subs.vip();
        ((C9486e) subs.f12709e).m2579interface(m2876e);
        ArrayList m2876e2 = C10686e.m2876e(this.appmetrica);
        subs.vip();
        ((C9486e) subs.f12709e).firebase(m2876e2);
        C2271e c2271e = this.purchase;
        if (c2271e == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(c2271e.f34352e);
            Iterator it = ((C15627e) c2271e.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                Long l = (Long) c2271e.get(num);
                if (l != null) {
                    C3072e isPro = C6293e.isPro();
                    isPro.vip();
                    ((C6293e) isPro.f12709e).applovin(intValue);
                    long longValue = l.longValue();
                    isPro.vip();
                    ((C6293e) isPro.f12709e).ads(longValue);
                    arrayList2.add((C6293e) isPro.appmetrica());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            subs.vip();
            ((C9486e) subs.f12709e).m2581this(arrayList);
        }
        C2271e c2271e2 = this.billing;
        if (c2271e2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(c2271e2.f34352e);
            Iterator it2 = ((C15627e) c2271e2.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                C16564e applovin = C5993e.applovin();
                int intValue2 = num2.intValue();
                applovin.vip();
                ((C5993e) applovin.f12709e).ads(intValue2);
                List list2 = (List) c2271e2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    applovin.vip();
                    ((C5993e) applovin.f12709e).premium(list2);
                }
                arrayList3.add((C5993e) applovin.appmetrica());
            }
            list = arrayList3;
        }
        subs.vip();
        ((C9486e) subs.f12709e).m2577extends(list);
        premium.vip();
        ((C7039e) premium.f12709e).crashlytics((C9486e) subs.appmetrica());
        return (C7039e) premium.appmetrica();
    }
}
