package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؔ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2907e implements InterfaceC0929e {
    public final InterfaceC18435e ad;
    public Integer license;
    public C7558e metrica;
    public final InterfaceC2869e vip;

    public C2907e(InterfaceC18435e interfaceC18435e, InterfaceC2869e interfaceC2869e) {
        this.ad = interfaceC18435e;
        this.vip = interfaceC2869e;
    }

    @Override // defpackage.InterfaceC0929e
    public final /* synthetic */ int ad(InterfaceC0732e interfaceC0732e, List list, int i) {
        return AbstractC5087e.amazon(this, interfaceC0732e, (ArrayList) list, i);
    }

    @Override // defpackage.InterfaceC0929e
    public final /* synthetic */ int appmetrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        return AbstractC5087e.Signature(this, interfaceC0732e, (ArrayList) list, i);
    }

    @Override // defpackage.InterfaceC0929e
    public final /* synthetic */ int license(InterfaceC0732e interfaceC0732e, List list, int i) {
        return AbstractC5087e.advert(this, interfaceC0732e, (ArrayList) list, i);
    }

    @Override // defpackage.InterfaceC0929e
    public final /* synthetic */ int metrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        return AbstractC5087e.subscription(this, interfaceC0732e, (ArrayList) list, i);
    }

    @Override // defpackage.InterfaceC0929e
    public final InterfaceC17242e vip(InterfaceC13158e interfaceC13158e, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        C2907e c2907e;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        int i = 1;
        List list3 = (List) arrayList.get(1);
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(((InterfaceC16719e) list2.get(i2)).admob(j));
        }
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(0);
            int i3 = ((AbstractC2832e) obj).f6806e;
            int billing = AbstractC6874e.billing(arrayList2);
            if (1 <= billing) {
                int i4 = 1;
                while (true) {
                    Object obj4 = arrayList2.get(i4);
                    int i5 = ((AbstractC2832e) obj4).f6806e;
                    if (i3 < i5) {
                        obj = obj4;
                        i3 = i5;
                    }
                    if (i4 == billing) {
                        break;
                    }
                    i4++;
                }
            }
        }
        AbstractC2832e abstractC2832e = (AbstractC2832e) obj;
        int i6 = abstractC2832e != null ? abstractC2832e.f6806e : 0;
        ArrayList arrayList3 = new ArrayList(list3.size());
        int size2 = list3.size();
        for (int i7 = 0; i7 < size2; i7++) {
            arrayList3.add(((InterfaceC16719e) list3.get(i7)).admob(j));
        }
        if (arrayList3.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList3.get(0);
            int i8 = ((AbstractC2832e) obj2).f6806e;
            int billing2 = AbstractC6874e.billing(arrayList3);
            if (1 <= billing2) {
                int i9 = 1;
                while (true) {
                    Object obj5 = arrayList3.get(i9);
                    int i10 = ((AbstractC2832e) obj5).f6806e;
                    if (i8 < i10) {
                        obj2 = obj5;
                        i8 = i10;
                    }
                    if (i9 == billing2) {
                        break;
                    }
                    i9++;
                }
            }
        }
        AbstractC2832e abstractC2832e2 = (AbstractC2832e) obj2;
        Integer valueOf = abstractC2832e2 != null ? Integer.valueOf(abstractC2832e2.f6806e) : null;
        if (arrayList3.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList3.get(0);
            int i11 = ((AbstractC2832e) obj3).f6804e;
            int billing3 = AbstractC6874e.billing(arrayList3);
            if (1 <= billing3) {
                while (true) {
                    Object obj6 = arrayList3.get(i);
                    int i12 = ((AbstractC2832e) obj6).f6804e;
                    if (i11 < i12) {
                        obj3 = obj6;
                        i11 = i12;
                    }
                    if (i == billing3) {
                        break;
                    }
                    i++;
                }
            }
        }
        AbstractC2832e abstractC2832e3 = (AbstractC2832e) obj3;
        int i13 = abstractC2832e3 != null ? abstractC2832e3.f6804e : 0;
        float f = C10102e.metrica;
        int max = Math.max(interfaceC13158e.mo493e(f), i6);
        float f2 = AbstractC7260e.ad;
        int intValue = (valueOf != null ? valueOf.intValue() : 0) + interfaceC13158e.mo493e(f2) + max;
        int i14 = i6 == 0 ? (-(interfaceC13158e.mo493e(f2) + interfaceC13158e.mo493e(f))) / 2 : 0;
        Integer num = this.license;
        if (num == null) {
            this.license = Integer.valueOf(i14);
        } else {
            C7558e c7558e = this.metrica;
            if (c7558e == null) {
                c7558e = new C7558e(num, AbstractC9546e.vip, null, 12);
                this.metrica = c7558e;
            }
            if (((Number) c7558e.appmetrica.getValue()).intValue() != i14) {
                int i15 = i14;
                i14 = i15;
                c2907e = this;
                AbstractC5336e.purchase(c2907e.ad, null, 0, new C1086e(c7558e, i15, this, (InterfaceC5083e) null, 4), 3);
                int i16 = i13;
                return interfaceC13158e.ads(intValue, i16, C9139e.f18290e, new C2633e(arrayList2, c2907e, i14, arrayList3, i16));
            }
        }
        c2907e = this;
        int i162 = i13;
        return interfaceC13158e.ads(intValue, i162, C9139e.f18290e, new C2633e(arrayList2, c2907e, i14, arrayList3, i162));
    }
}
