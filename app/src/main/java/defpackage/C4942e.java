package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4942e {
    public static final C4942e Signature;
    public static final int adcel;
    public static final C4942e admob;
    public static final int advert;
    public static final C4942e amazon;
    public static final int appmetrica;
    public static final int billing;
    public static final int license;
    public static final C4942e loadAd;
    public static final C12575e metrica = new C12575e(27);
    public static final int mopub;
    public static final int purchase;
    public static final ArrayList remoteconfig;
    public static final C4942e smaato;
    public static final int startapp;
    public static final ArrayList subscription;
    public static final int yandex;
    public final List ad;
    public final int vip;

    static {
        int i = license;
        int i2 = i << 1;
        appmetrica = i;
        int i3 = i << 2;
        purchase = i2;
        int i4 = i << 3;
        billing = i3;
        int i5 = i << 4;
        yandex = i4;
        int i6 = i << 5;
        startapp = i5;
        adcel = i6;
        license = i << 7;
        int i7 = (i << 6) - 1;
        mopub = i7;
        int i8 = i | i2 | i3;
        advert = i8;
        smaato = new C4942e(i7);
        amazon = new C4942e(i5 | i6);
        new C4942e(i);
        new C4942e(i2);
        new C4942e(i3);
        loadAd = new C4942e(i8);
        new C4942e(i4);
        Signature = new C4942e(i5);
        admob = new C4942e(i6);
        new C4942e(i2 | i5 | i6);
        Field[] fields = C4942e.class.getFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            C4942e c4942e = obj instanceof C4942e ? (C4942e) obj : null;
            C5002e c5002e = c4942e != null ? new C5002e(c4942e.vip, field2.getName()) : null;
            if (c5002e != null) {
                arrayList2.add(c5002e);
            }
        }
        subscription = arrayList2;
        Field[] fields2 = C4942e.class.getFields();
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (AbstractC7890e.billing(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            int intValue = ((Integer) field4.get(null)).intValue();
            C5002e c5002e2 = intValue == ((-intValue) & intValue) ? new C5002e(intValue, field4.getName()) : null;
            if (c5002e2 != null) {
                arrayList5.add(c5002e2);
            }
        }
        remoteconfig = arrayList5;
    }

    public /* synthetic */ C4942e(int i) {
        this(i, C13664e.f27089e);
    }

    public C4942e(int i, List list) {
        this.ad = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i &= ~((AbstractC11481e) it.next()).ad();
        }
        this.vip = i;
    }

    public final boolean ad(int i) {
        return (i & this.vip) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4942e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C4942e c4942e = (C4942e) obj;
        return AbstractC7890e.billing(this.ad, c4942e.ad) && this.vip == c4942e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + this.vip;
    }

    public final String toString() {
        Object obj;
        Iterator it = subscription.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C5002e) obj).ad == this.vip) {
                break;
            }
        }
        C5002e c5002e = (C5002e) obj;
        String str = c5002e != null ? c5002e.vip : null;
        if (str == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = remoteconfig.iterator();
            while (it2.hasNext()) {
                C5002e c5002e2 = (C5002e) it2.next();
                String str2 = ad(c5002e2.ad) ? c5002e2.vip : null;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            str = AbstractC13480e.m3608try(arrayList, " | ", null, null, null, 62);
        }
        return AbstractC1786e.tapsense(AbstractC8703e.applovin("DescriptorKindFilter(", str, ", "), this.ad, ')');
    }
}
