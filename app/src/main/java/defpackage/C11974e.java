package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۚٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11974e {
    public final C18234e ad;
    public final String metrica;
    public final List vip;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, eٓؐٛ] */
    public C11974e(C18234e c18234e, List list) {
        Object obj;
        EnumC11043e enumC11043e;
        InterfaceC15313e c14107e;
        this.ad = c18234e;
        this.vip = list;
        this.metrica = c18234e.ad;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16427e c16427e = (C16427e) it.next();
            int i = c16427e.license;
            boolean z = c16427e.startapp;
            int i2 = c16427e.metrica;
            switch (AbstractC8703e.m2467class(i2)) {
                case 0:
                    enumC11043e = EnumC11043e.f21878e;
                    break;
                case 1:
                    enumC11043e = EnumC11043e.f21881e;
                    break;
                case 2:
                    enumC11043e = EnumC11043e.f21884e;
                    break;
                case 3:
                    enumC11043e = EnumC11043e.f21875e;
                    break;
                case 4:
                    enumC11043e = EnumC11043e.f21876e;
                    break;
                case 5:
                    enumC11043e = EnumC11043e.f21879e;
                    break;
                case 6:
                    enumC11043e = EnumC11043e.f21886e;
                    break;
                case 7:
                    enumC11043e = EnumC11043e.f21882e;
                    break;
                case 8:
                    enumC11043e = EnumC11043e.f21887e;
                    break;
                case 9:
                    enumC11043e = EnumC11043e.f21887e;
                    break;
                case 10:
                    enumC11043e = EnumC11043e.f21885e;
                    break;
                case 11:
                    enumC11043e = EnumC11043e.f21883e;
                    break;
                case 12:
                    enumC11043e = EnumC11043e.f21877e;
                    break;
                default:
                    throw new IllegalStateException("Unknown storage type: ".concat(AbstractC1634e.applovin(i2)).toString());
            }
            EnumC11043e enumC11043e2 = enumC11043e;
            int m2467class = AbstractC8703e.m2467class(i);
            if (m2467class == 0) {
                c14107e = new C14107e(enumC11043e2, c16427e.startapp, c16427e.adcel, c16427e.mopub, c16427e.advert);
            } else if (m2467class == 1) {
                c14107e = new C4339e(enumC11043e2, z, c16427e.smaato);
            } else if (m2467class == 2) {
                c14107e = new C5526e(enumC11043e2, z);
            } else {
                if (m2467class != 3) {
                    throw new IllegalStateException("Unsupported type ".concat(AbstractC13501e.applovin(i)).toString());
                }
                c14107e = new C17623e(enumC11043e2, z);
            }
            String str = c16427e.ad;
            ?? obj2 = new Object();
            obj2.ad = str;
            obj2.vip = c14107e;
            if (!(c14107e instanceof C14107e) && !(c14107e instanceof C4339e) && !(c14107e instanceof C5526e) && !(c14107e instanceof C17623e)) {
                throw new C14803e(10);
            }
            arrayList.add(obj2);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                InterfaceC15313e interfaceC15313e = ((C13681e) obj).vip;
                if (!(interfaceC15313e instanceof C14107e) || !((C14107e) interfaceC15313e).metrica) {
                }
            } else {
                obj = null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11974e)) {
            return false;
        }
        C11974e c11974e = (C11974e) obj;
        return AbstractC7890e.billing(this.ad, c11974e.ad) && AbstractC7890e.billing(this.vip, c11974e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "RealmClassImpl(cinteropClass=" + this.ad + ", cinteropProperties=" + this.vip + ")";
    }
}
