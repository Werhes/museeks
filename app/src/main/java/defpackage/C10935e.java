package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُُُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10935e implements InterfaceC2747e {
    public final InterfaceC8079e ad;
    public final boolean vip;

    public C10935e(InterfaceC8079e interfaceC8079e, boolean z) {
        this.ad = interfaceC8079e;
        this.vip = z;
    }

    @Override // defpackage.InterfaceC2747e
    public final /* synthetic */ int ad(InterfaceC0732e interfaceC0732e, List list, int i) {
        return AbstractC5087e.smaato(this, interfaceC0732e, list, i);
    }

    @Override // defpackage.InterfaceC2747e
    public final /* synthetic */ int appmetrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        return AbstractC5087e.loadAd(this, interfaceC0732e, list, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10935e)) {
            return false;
        }
        C10935e c10935e = (C10935e) obj;
        return AbstractC7890e.billing(this.ad, c10935e.ad) && this.vip == c10935e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + (this.vip ? 1231 : 1237);
    }

    @Override // defpackage.InterfaceC2747e
    public final /* synthetic */ int license(InterfaceC0732e interfaceC0732e, List list, int i) {
        return AbstractC5087e.mopub(this, interfaceC0732e, list, i);
    }

    @Override // defpackage.InterfaceC2747e
    public final /* synthetic */ int metrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        return AbstractC5087e.admob(this, interfaceC0732e, list, i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.ad);
        sb.append(", propagateMinConstraints=");
        return AbstractC1786e.isVip(sb, this.vip, ')');
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [eؚؖٞ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [eؚؖٞ, java.lang.Object] */
    @Override // defpackage.InterfaceC2747e
    public final InterfaceC17242e vip(InterfaceC13158e interfaceC13158e, List list, long j) {
        int adcel;
        int startapp;
        AbstractC2832e admob;
        boolean isEmpty = list.isEmpty();
        C9139e c9139e = C9139e.f18290e;
        if (isEmpty) {
            return interfaceC13158e.ads(C5602e.adcel(j), C5602e.startapp(j), c9139e, new C17014e(19));
        }
        long j2 = this.vip ? j : j & (-8589934589L);
        if (list.size() == 1) {
            InterfaceC16719e interfaceC16719e = (InterfaceC16719e) list.get(0);
            Object signatures = interfaceC16719e.signatures();
            C9588e c9588e = signatures instanceof C9588e ? (C9588e) signatures : null;
            if (c9588e != null ? c9588e.f19022e : false) {
                adcel = C5602e.adcel(j);
                startapp = C5602e.startapp(j);
                int adcel2 = C5602e.adcel(j);
                int startapp2 = C5602e.startapp(j);
                if (!((startapp2 >= 0) & (adcel2 >= 0))) {
                    AbstractC15805e.ad("width and height must be >= 0");
                }
                admob = interfaceC16719e.admob(AbstractC2278e.yandex(adcel2, adcel2, startapp2, startapp2));
            } else {
                admob = interfaceC16719e.admob(j2);
                adcel = Math.max(C5602e.adcel(j), admob.f6806e);
                startapp = Math.max(C5602e.startapp(j), admob.f6804e);
            }
            int i = startapp;
            int i2 = adcel;
            return interfaceC13158e.ads(i2, i, c9139e, new C10505e(admob, interfaceC16719e, interfaceC13158e, i2, i, this));
        }
        AbstractC2832e[] abstractC2832eArr = new AbstractC2832e[list.size()];
        ?? obj = new Object();
        obj.f8852e = C5602e.adcel(j);
        ?? obj2 = new Object();
        obj2.f8852e = C5602e.startapp(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC16719e interfaceC16719e2 = (InterfaceC16719e) list.get(i3);
            Object signatures2 = interfaceC16719e2.signatures();
            C9588e c9588e2 = signatures2 instanceof C9588e ? (C9588e) signatures2 : null;
            if (c9588e2 != null ? c9588e2.f19022e : false) {
                z = true;
            } else {
                AbstractC2832e admob2 = interfaceC16719e2.admob(j2);
                abstractC2832eArr[i3] = admob2;
                obj.f8852e = Math.max(obj.f8852e, admob2.f6806e);
                obj2.f8852e = Math.max(obj2.f8852e, admob2.f6804e);
            }
        }
        if (z) {
            int i4 = obj.f8852e;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = obj2.f8852e;
            long ad = AbstractC2278e.ad(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                InterfaceC16719e interfaceC16719e3 = (InterfaceC16719e) list.get(i7);
                Object signatures3 = interfaceC16719e3.signatures();
                C9588e c9588e3 = signatures3 instanceof C9588e ? (C9588e) signatures3 : null;
                if (c9588e3 != null ? c9588e3.f19022e : false) {
                    abstractC2832eArr[i7] = interfaceC16719e3.admob(ad);
                }
            }
        }
        return interfaceC13158e.ads(obj.f8852e, obj2.f8852e, c9139e, new C3025e(abstractC2832eArr, list, interfaceC13158e, (Object) obj, (Object) obj2, this, 2));
    }
}
