package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۡۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9822e implements InterfaceC0929e {
    public final /* synthetic */ float ad;
    public final /* synthetic */ C17521e license;
    public final /* synthetic */ int metrica;
    public final /* synthetic */ C16646e vip;

    public C9822e(float f, C16646e c16646e, int i, C17521e c17521e) {
        this.ad = f;
        this.vip = c16646e;
        this.metrica = i;
        this.license = c17521e;
    }

    @Override // defpackage.InterfaceC0929e
    public final int ad(InterfaceC0732e interfaceC0732e, List list, int i) {
        return AbstractC5087e.amazon(this, interfaceC0732e, (ArrayList) list, i);
    }

    @Override // defpackage.InterfaceC0929e
    public final int appmetrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        return AbstractC5087e.Signature(this, interfaceC0732e, (ArrayList) list, i);
    }

    @Override // defpackage.InterfaceC0929e
    public final int license(InterfaceC0732e interfaceC0732e, List list, int i) {
        return AbstractC5087e.advert(this, interfaceC0732e, (ArrayList) list, i);
    }

    @Override // defpackage.InterfaceC0929e
    public final int metrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        return AbstractC5087e.subscription(this, interfaceC0732e, (ArrayList) list, i);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, eٔۦْ] */
    @Override // defpackage.InterfaceC0929e
    public final InterfaceC17242e vip(final InterfaceC13158e interfaceC13158e, List list, long j) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        float f = this.ad;
        final int mo493e = interfaceC13158e.mo493e(f);
        int size = list2.size();
        int mo493e2 = interfaceC13158e.mo493e(AbstractC14924e.ad);
        Integer num = 0;
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((InterfaceC16719e) list2.get(i)).metrica(Alert.DURATION_SHOW_INDEFINITELY)));
        }
        final int intValue = num.intValue();
        int i2 = mo493e * 2;
        long ad = C5602e.ad(mo493e2, 0, intValue, intValue, 2, j);
        ?? obj = new Object();
        obj.f29883e = f;
        final ArrayList arrayList2 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            arrayList2.add(((InterfaceC16719e) list2.get(i3)).admob(ad));
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            C15765e c15765e = new C15765e(AbstractC14924e.ad);
            C15765e c15765e2 = new C15765e(interfaceC13158e.mo496final(((AbstractC2832e) arrayList2.get(i4)).f6806e));
            if (c15765e.compareTo(c15765e2) < 0) {
                c15765e = c15765e2;
            }
            float f2 = c15765e.f31051e;
            i2 += interfaceC13158e.mo493e(f2);
            C15765e c15765e3 = new C15765e(f2 - (AbstractC14924e.metrica * 2));
            C15765e c15765e4 = new C15765e(24);
            if (c15765e3.compareTo(c15765e4) < 0) {
                c15765e3 = c15765e4;
            }
            float f3 = obj.f29883e;
            C15357e c15357e = new C15357e(f3, f2, c15765e3.f31051e);
            obj.f29883e = f3 + f2;
            arrayList3.add(c15357e);
        }
        this.vip.ad.setValue(arrayList3);
        final ArrayList arrayList4 = new ArrayList(list3.size());
        int i5 = 0;
        C15096e c15096e = obj;
        for (int size4 = list3.size(); i5 < size4; size4 = size4) {
            C15096e c15096e2 = c15096e;
            int i6 = i2;
            arrayList4.add(((InterfaceC16719e) list3.get(i5)).admob(C5602e.ad(i6, i2, 0, 0, 8, j)));
            i5++;
            c15096e = c15096e2;
            i2 = i6;
            list3 = list3;
        }
        final C15096e c15096e3 = c15096e;
        int i7 = i2;
        final ArrayList arrayList5 = new ArrayList(list4.size());
        int size5 = list4.size();
        int i8 = 0;
        while (i8 < size5) {
            InterfaceC16719e interfaceC16719e = (InterfaceC16719e) list4.get(i8);
            int mo493e3 = interfaceC13158e.mo493e(((C15357e) arrayList3.get(this.metrica)).vip);
            if (mo493e3 < 0 || intValue < 0) {
                AbstractC15805e.ad("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
            }
            List list5 = list4;
            ArrayList arrayList6 = arrayList3;
            arrayList5.add(interfaceC16719e.admob(AbstractC2278e.yandex(0, mo493e3, 0, intValue)));
            i8++;
            list4 = list5;
            arrayList3 = arrayList6;
        }
        final ArrayList arrayList7 = arrayList3;
        final float f4 = this.ad;
        final C17521e c17521e = this.license;
        final int i9 = this.metrica;
        return interfaceC13158e.ads(i7, intValue, C9139e.f18290e, new Function1() { // from class: eٍؘْ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i10;
                ArrayList arrayList8;
                int i11;
                AbstractC3698e abstractC3698e = (AbstractC3698e) obj2;
                C15096e c15096e4 = C15096e.this;
                c15096e4.f29883e = f4;
                ArrayList arrayList9 = arrayList4;
                int size6 = arrayList9.size();
                int i12 = 0;
                while (true) {
                    i10 = intValue;
                    if (i12 >= size6) {
                        break;
                    }
                    AbstractC2832e abstractC2832e = (AbstractC2832e) arrayList9.get(i12);
                    AbstractC3698e.advert(abstractC3698e, abstractC2832e, 0, i10 - abstractC2832e.f6804e);
                    i12++;
                }
                ArrayList arrayList10 = arrayList5;
                int size7 = arrayList10.size();
                int i13 = 0;
                while (true) {
                    arrayList8 = arrayList7;
                    i11 = i9;
                    if (i13 >= size7) {
                        break;
                    }
                    AbstractC2832e abstractC2832e2 = (AbstractC2832e) arrayList10.get(i13);
                    AbstractC3698e.advert(abstractC3698e, abstractC2832e2, Math.max(0, (AbstractC4653e.ad(abstractC3698e, ((C15357e) arrayList8.get(i11)).vip) - abstractC2832e2.f6806e) / 2), i10 - abstractC2832e2.f6804e);
                    i13++;
                }
                ArrayList arrayList11 = arrayList2;
                int size8 = arrayList11.size();
                for (int i14 = 0; i14 < size8; i14++) {
                    AbstractC3698e.advert(abstractC3698e, (AbstractC2832e) arrayList11.get(i14), AbstractC4653e.ad(abstractC3698e, c15096e4.f29883e), 0);
                    c15096e4.f29883e += ((C15357e) arrayList8.get(i14)).vip;
                }
                C17521e c17521e2 = c17521e;
                C9137e c9137e = c17521e2.ad;
                Integer num2 = c17521e2.metrica;
                if (num2 == null || num2.intValue() != i11) {
                    c17521e2.metrica = Integer.valueOf(i11);
                    C15357e c15357e2 = (C15357e) AbstractC13480e.m3592native(i11, arrayList8);
                    if (c15357e2 != null) {
                        C15357e c15357e3 = (C15357e) AbstractC13480e.m3570break(arrayList8);
                        float f5 = c15357e3.ad + c15357e3.vip;
                        InterfaceC13158e interfaceC13158e2 = interfaceC13158e;
                        int mo493e4 = interfaceC13158e2.mo493e(f5) + mo493e;
                        int purchase = mo493e4 - c9137e.appmetrica.purchase();
                        int mo493e5 = interfaceC13158e2.mo493e(c15357e2.ad) - ((purchase / 2) - (interfaceC13158e2.mo493e(c15357e2.vip) / 2));
                        int i15 = mo493e4 - purchase;
                        if (i15 < 0) {
                            i15 = 0;
                        }
                        int metrica = AbstractC3062e.metrica(mo493e5, 0, i15);
                        if (c9137e.ad.purchase() != metrica) {
                            AbstractC5336e.purchase(c17521e2.vip, null, 0, new C11143e(c17521e2, metrica, (InterfaceC5083e) null, 5), 3);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        });
    }
}
