package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10116e implements InterfaceC0929e {
    public static int billing(InterfaceC0732e interfaceC0732e, ArrayList arrayList, int i, Function2 function2) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        InterfaceC16719e interfaceC16719e = (InterfaceC16719e) AbstractC13480e.m3604this(list4);
        int intValue = interfaceC16719e != null ? ((Number) function2.invoke(interfaceC16719e, Integer.valueOf(i))).intValue() : 0;
        InterfaceC16719e interfaceC16719e2 = (InterfaceC16719e) AbstractC13480e.m3604this(list5);
        int intValue2 = interfaceC16719e2 != null ? ((Number) function2.invoke(interfaceC16719e2, Integer.valueOf(i))).intValue() : 0;
        InterfaceC16719e interfaceC16719e3 = (InterfaceC16719e) AbstractC13480e.m3604this(list);
        int intValue3 = interfaceC16719e3 != null ? ((Number) function2.invoke(interfaceC16719e3, Integer.valueOf(i))).intValue() : 0;
        InterfaceC16719e interfaceC16719e4 = (InterfaceC16719e) AbstractC13480e.m3604this(list2);
        int intValue4 = interfaceC16719e4 != null ? ((Number) function2.invoke(interfaceC16719e4, Integer.valueOf(i))).intValue() : 0;
        InterfaceC16719e interfaceC16719e5 = (InterfaceC16719e) AbstractC13480e.m3604this(list3);
        int intValue5 = interfaceC16719e5 != null ? ((Number) function2.invoke(interfaceC16719e5, Integer.valueOf(i))).intValue() : 0;
        int mo493e = interfaceC0732e.mo493e(AbstractC16429e.metrica + AbstractC16429e.license);
        long vip = AbstractC2278e.vip(0, 0, 0, 0, 15);
        return C5602e.license(vip) ? C5602e.yandex(vip) : AbstractC8703e.crashlytics(mo493e, intValue, Math.max(intValue3, Math.max(intValue4, intValue5)), intValue2);
    }

    public static int purchase(InterfaceC0732e interfaceC0732e, ArrayList arrayList, int i, Function2 function2) {
        int i2;
        int i3;
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        int advert = AbstractC4107e.advert(i, interfaceC0732e.mo493e(AbstractC16429e.metrica + AbstractC16429e.license));
        InterfaceC16719e interfaceC16719e = (InterfaceC16719e) AbstractC13480e.m3604this(list4);
        if (interfaceC16719e != null) {
            i2 = ((Number) function2.invoke(interfaceC16719e, Integer.valueOf(advert))).intValue();
            advert = AbstractC4107e.advert(advert, interfaceC16719e.loadAd(Alert.DURATION_SHOW_INDEFINITELY));
        } else {
            i2 = 0;
        }
        InterfaceC16719e interfaceC16719e2 = (InterfaceC16719e) AbstractC13480e.m3604this(list5);
        if (interfaceC16719e2 != null) {
            i3 = ((Number) function2.invoke(interfaceC16719e2, Integer.valueOf(advert))).intValue();
            advert = AbstractC4107e.advert(advert, interfaceC16719e2.loadAd(Alert.DURATION_SHOW_INDEFINITELY));
        } else {
            i3 = 0;
        }
        InterfaceC16719e interfaceC16719e3 = (InterfaceC16719e) AbstractC13480e.m3604this(list2);
        int intValue = interfaceC16719e3 != null ? ((Number) function2.invoke(interfaceC16719e3, Integer.valueOf(advert))).intValue() : 0;
        InterfaceC16719e interfaceC16719e4 = (InterfaceC16719e) AbstractC13480e.m3604this(list);
        int intValue2 = interfaceC16719e4 != null ? ((Number) function2.invoke(interfaceC16719e4, Integer.valueOf(advert))).intValue() : 0;
        InterfaceC16719e interfaceC16719e5 = (InterfaceC16719e) AbstractC13480e.m3604this(list3);
        int intValue3 = interfaceC16719e5 != null ? ((Number) function2.invoke(interfaceC16719e5, Integer.valueOf(advert))).intValue() : 0;
        boolean z = intValue3 > interfaceC0732e.mo491const(AbstractC13362e.startapp(30));
        boolean z2 = intValue > 0;
        boolean z3 = intValue3 > 0;
        int i4 = ((z2 && z3) || z) ? 3 : (z2 || z3) ? 2 : 1;
        return AbstractC16429e.license(interfaceC0732e, i2, i3, intValue2, intValue, intValue3, i4, interfaceC0732e.mo493e((i4 == 3 ? AbstractC16429e.vip : AbstractC16429e.ad) * 2), AbstractC2278e.vip(0, 0, 0, 0, 15));
    }

    @Override // defpackage.InterfaceC0929e
    public final int ad(InterfaceC0732e interfaceC0732e, List list, int i) {
        return billing(interfaceC0732e, (ArrayList) list, i, C0354e.f2390e);
    }

    @Override // defpackage.InterfaceC0929e
    public final int appmetrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        return purchase(interfaceC0732e, (ArrayList) list, i, C7532e.f15361e);
    }

    @Override // defpackage.InterfaceC0929e
    public final int license(InterfaceC0732e interfaceC0732e, List list, int i) {
        return purchase(interfaceC0732e, (ArrayList) list, i, C6695e.f13820e);
    }

    @Override // defpackage.InterfaceC0929e
    public final int metrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        return billing(interfaceC0732e, (ArrayList) list, i, C3799e.f8412e);
    }

    @Override // defpackage.InterfaceC0929e
    public final InterfaceC17242e vip(InterfaceC13158e interfaceC13158e, List list, long j) {
        List list2;
        List list3;
        AbstractC2832e abstractC2832e;
        int i;
        AbstractC2832e abstractC2832e2;
        float f;
        AbstractC2832e abstractC2832e3;
        int i2;
        int i3;
        ArrayList arrayList = (ArrayList) list;
        List list4 = (List) arrayList.get(0);
        List list5 = (List) arrayList.get(1);
        List list6 = (List) arrayList.get(2);
        List list7 = (List) arrayList.get(3);
        List list8 = (List) arrayList.get(4);
        long ad = C5602e.ad(0, 0, 0, 0, 10, j);
        float f2 = AbstractC16429e.metrica;
        float f3 = AbstractC16429e.license;
        int mo493e = interfaceC13158e.mo493e(f2 + f3);
        InterfaceC16719e interfaceC16719e = (InterfaceC16719e) AbstractC13480e.m3604this(list7);
        int smaato = interfaceC16719e != null ? interfaceC16719e.smaato(C5602e.billing(j)) : 0;
        InterfaceC16719e interfaceC16719e2 = (InterfaceC16719e) AbstractC13480e.m3604this(list8);
        int advert = AbstractC4107e.advert(C5602e.yandex(ad), smaato + (interfaceC16719e2 != null ? interfaceC16719e2.smaato(C5602e.billing(j)) : 0) + mo493e);
        InterfaceC16719e interfaceC16719e3 = (InterfaceC16719e) AbstractC13480e.m3604this(list6);
        float f4 = (((AbstractC13480e.m3604this(list5) != null) && (AbstractC13480e.m3604this(list6) != null)) || ((interfaceC16719e3 != null ? interfaceC16719e3.mo2529while(advert) : 0) > interfaceC13158e.mo491const(AbstractC13362e.startapp(30)))) ? AbstractC16429e.vip : AbstractC16429e.ad;
        float f5 = 2;
        long startapp = AbstractC2278e.startapp(-mo493e, ad, -interfaceC13158e.mo493e(f4 * f5));
        InterfaceC16719e interfaceC16719e4 = (InterfaceC16719e) AbstractC13480e.m3604this(list7);
        AbstractC2832e admob = interfaceC16719e4 != null ? interfaceC16719e4.admob(startapp) : null;
        int i4 = admob != null ? admob.f6806e : 0;
        InterfaceC16719e interfaceC16719e5 = (InterfaceC16719e) AbstractC13480e.m3604this(list8);
        if (interfaceC16719e5 != null) {
            list2 = list4;
            list3 = list5;
            abstractC2832e = interfaceC16719e5.admob(AbstractC2278e.adcel(-i4, 0, 2, startapp));
        } else {
            list2 = list4;
            list3 = list5;
            abstractC2832e = null;
        }
        int i5 = i4 + (abstractC2832e != null ? abstractC2832e.f6806e : 0);
        InterfaceC16719e interfaceC16719e6 = (InterfaceC16719e) AbstractC13480e.m3604this(list2);
        if (interfaceC16719e6 != null) {
            i = 2;
            abstractC2832e2 = interfaceC16719e6.admob(AbstractC2278e.adcel(-i5, 0, 2, startapp));
        } else {
            i = 2;
            abstractC2832e2 = null;
        }
        int i6 = abstractC2832e2 != null ? abstractC2832e2.f6804e : 0;
        InterfaceC16719e interfaceC16719e7 = (InterfaceC16719e) AbstractC13480e.m3604this(list6);
        if (interfaceC16719e7 != null) {
            f = f5;
            abstractC2832e3 = interfaceC16719e7.admob(AbstractC2278e.startapp(-i5, startapp, -i6));
        } else {
            f = f5;
            abstractC2832e3 = null;
        }
        int i7 = i6 + (abstractC2832e3 != null ? abstractC2832e3.f6804e : 0);
        boolean z = (abstractC2832e3 == null || abstractC2832e3.mo393try(AbstractC14806e.ad) == abstractC2832e3.mo393try(AbstractC14806e.vip)) ? false : true;
        InterfaceC16719e interfaceC16719e8 = (InterfaceC16719e) AbstractC13480e.m3604this(list3);
        AbstractC2832e admob2 = interfaceC16719e8 != null ? interfaceC16719e8.admob(AbstractC2278e.startapp(-i5, startapp, -i7)) : null;
        boolean z2 = admob2 != null;
        boolean z3 = abstractC2832e3 != null;
        if ((z2 && z3) || z) {
            i3 = 3;
            i2 = 3;
        } else if (z2 || z3) {
            i2 = i;
            i3 = 3;
        } else {
            i3 = 3;
            i2 = 1;
        }
        float f6 = i2 == i3 ? AbstractC16429e.vip : AbstractC16429e.ad;
        float f7 = f6 * f;
        int i8 = i2;
        final int yandex = C5602e.license(j) ? C5602e.yandex(j) : AbstractC8703e.crashlytics(mo493e, admob != null ? admob.f6806e : 0, Math.max(abstractC2832e2 != null ? abstractC2832e2.f6806e : 0, Math.max(admob2 != null ? admob2.f6806e : 0, abstractC2832e3 != null ? abstractC2832e3.f6806e : 0)), abstractC2832e != null ? abstractC2832e.f6806e : 0);
        final AbstractC2832e abstractC2832e4 = abstractC2832e2;
        final AbstractC2832e abstractC2832e5 = admob2;
        final int license = AbstractC16429e.license(interfaceC13158e, admob != null ? admob.f6804e : 0, abstractC2832e != null ? abstractC2832e.f6804e : 0, abstractC2832e2 != null ? abstractC2832e2.f6804e : 0, admob2 != null ? admob2.f6804e : 0, abstractC2832e3 != null ? abstractC2832e3.f6804e : 0, i8, interfaceC13158e.mo493e(f7), j);
        final boolean z4 = i8 == 3;
        final int mo493e2 = interfaceC13158e.mo493e(f2);
        final int mo493e3 = interfaceC13158e.mo493e(f3);
        final int mo493e4 = interfaceC13158e.mo493e(f6);
        final AbstractC2832e abstractC2832e6 = abstractC2832e3;
        final AbstractC2832e abstractC2832e7 = admob;
        final AbstractC2832e abstractC2832e8 = abstractC2832e;
        return interfaceC13158e.ads(yandex, license, C9139e.f18290e, new Function1() { // from class: eٌٖٚ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int advert2;
                AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
                AbstractC2832e abstractC2832e9 = AbstractC2832e.this;
                int i9 = mo493e2;
                boolean z5 = z4;
                int i10 = mo493e4;
                int i11 = license;
                if (abstractC2832e9 != null) {
                    AbstractC3698e.advert(abstractC3698e, abstractC2832e9, i9, z5 ? i10 : AbstractC8703e.advert(1, 0.0f, (i11 - abstractC2832e9.f6804e) / 2.0f));
                }
                int i12 = i9 + (abstractC2832e9 != null ? abstractC2832e9.f6806e : 0);
                AbstractC2832e abstractC2832e10 = abstractC2832e4;
                AbstractC2832e abstractC2832e11 = abstractC2832e5;
                AbstractC2832e abstractC2832e12 = abstractC2832e6;
                if (z5) {
                    advert2 = i10;
                } else {
                    advert2 = AbstractC8703e.advert(1, 0.0f, (i11 - (((abstractC2832e10 != null ? abstractC2832e10.f6804e : 0) + (abstractC2832e11 != null ? abstractC2832e11.f6804e : 0)) + (abstractC2832e12 != null ? abstractC2832e12.f6804e : 0))) / 2.0f);
                }
                if (abstractC2832e11 != null) {
                    AbstractC3698e.advert(abstractC3698e, abstractC2832e11, i12, advert2);
                }
                int i13 = advert2 + (abstractC2832e11 != null ? abstractC2832e11.f6804e : 0);
                if (abstractC2832e10 != null) {
                    AbstractC3698e.advert(abstractC3698e, abstractC2832e10, i12, i13);
                }
                int i14 = i13 + (abstractC2832e10 != null ? abstractC2832e10.f6804e : 0);
                if (abstractC2832e12 != null) {
                    AbstractC3698e.advert(abstractC3698e, abstractC2832e12, i12, i14);
                }
                AbstractC2832e abstractC2832e13 = abstractC2832e8;
                if (abstractC2832e13 != null) {
                    int i15 = (yandex - mo493e3) - abstractC2832e13.f6806e;
                    if (!z5) {
                        i10 = AbstractC8703e.advert(1, 0.0f, (i11 - abstractC2832e13.f6804e) / 2.0f);
                    }
                    AbstractC3698e.advert(abstractC3698e, abstractC2832e13, i15, i10);
                }
                return Unit.INSTANCE;
            }
        });
    }
}
