package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9672e {
    public static final C12870e ad = AbstractC12696e.yandex(250, 2, AbstractC5616e.ad);

    public static final void ad(final int i, final InterfaceC12864e interfaceC12864e, final long j, long j2, final float f, final float f2, final float f3, final C2892e c2892e, final C2892e c2892e2, C13770e c13770e, final int i2) {
        final long j3;
        int i3;
        long appmetrica;
        c13770e.m3671package(-1510879887);
        int i4 = i2 | (c13770e.license(i) ? 4 : 2) | (c13770e.purchase(interfaceC12864e) ? 32 : 16) | 1024;
        if (c13770e.m3673protected(i4 & 1, (38347923 & i4) != 38347922)) {
            c13770e.m3655case();
            if ((i2 & 1) == 0 || c13770e.isPro()) {
                int i5 = C2867e.ad;
                i3 = i4 & (-7169);
                appmetrica = AbstractC7893e.appmetrica(c13770e, AbstractC11550e.metrica);
            } else {
                c13770e.m3659default();
                i3 = i4 & (-7169);
                appmetrica = j2;
            }
            c13770e.admob();
            long j4 = appmetrica;
            AbstractC12121e.ad(interfaceC12864e, null, j, j4, 0.0f, 0.0f, null, AbstractC16653e.license(-1119692426, new Function2() { // from class: eٍۨ۟
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C13770e c13770e2 = (C13770e) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                        C9137e appmetrica2 = AbstractC5967e.appmetrica(c13770e2);
                        Object m3681throw = c13770e2.m3681throw();
                        Object obj3 = C2987e.ad;
                        if (m3681throw == obj3) {
                            m3681throw = AbstractC17680e.startapp(c13770e2);
                            c13770e2.m3682throws(m3681throw);
                        }
                        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) m3681throw;
                        boolean purchase = c13770e2.purchase(appmetrica2) | c13770e2.purchase(interfaceC18435e);
                        Object m3681throw2 = c13770e2.m3681throw();
                        if (purchase || m3681throw2 == obj3) {
                            m3681throw2 = new C5488e(appmetrica2, interfaceC18435e);
                            c13770e2.m3682throws(m3681throw2);
                        }
                        final C5488e c5488e = (C5488e) m3681throw2;
                        InterfaceC12864e metrica = AbstractC12447e.metrica(AbstractC1147e.ad(AbstractC5967e.purchase(AbstractC18007e.Signature(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), C5438e.f11666e), appmetrica2, false), false, new C7983e(8)));
                        final float f4 = f;
                        boolean metrica2 = c13770e2.metrica(f4);
                        final C2892e c2892e3 = c2892e2;
                        boolean purchase2 = metrica2 | c13770e2.purchase(c2892e3);
                        final float f5 = f2;
                        boolean metrica3 = purchase2 | c13770e2.metrica(f5);
                        final float f6 = f3;
                        boolean metrica4 = metrica3 | c13770e2.metrica(f6);
                        final C2892e c2892e4 = c2892e;
                        boolean purchase3 = metrica4 | c13770e2.purchase(c2892e4) | c13770e2.yandex(c5488e);
                        final int i6 = i;
                        boolean license = purchase3 | c13770e2.license(i6);
                        Object m3681throw3 = c13770e2.m3681throw();
                        if (license || m3681throw3 == obj3) {
                            Object obj4 = new Function2() { // from class: eؘٓٝ
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj5, Object obj6) {
                                    final InterfaceC7183e interfaceC7183e = (InterfaceC7183e) obj5;
                                    C5602e c5602e = (C5602e) obj6;
                                    final int mo493e = interfaceC7183e.mo493e(f4);
                                    List subscription = interfaceC7183e.subscription(EnumC0526e.f2674e, c2892e3);
                                    Iterator it = subscription.iterator();
                                    int i7 = 0;
                                    while (it.hasNext()) {
                                        i7 = Math.max(i7, ((InterfaceC16719e) it.next()).metrica(Alert.DURATION_SHOW_INDEFINITELY));
                                    }
                                    long ad2 = C5602e.ad(0, 0, i7, 0, 11, c5602e.ad);
                                    final ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(subscription, 10));
                                    Iterator it2 = subscription.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(((InterfaceC16719e) it2.next()).admob(ad2));
                                    }
                                    int i8 = mo493e * 2;
                                    Iterator it3 = arrayList.iterator();
                                    while (true) {
                                        boolean hasNext = it3.hasNext();
                                        final int i9 = i7;
                                        final float f7 = f5;
                                        if (!hasNext) {
                                            final int mo493e2 = interfaceC7183e.mo493e(f6) + i8;
                                            final C5488e c5488e2 = c5488e;
                                            final int i10 = i6;
                                            final C2892e c2892e5 = c2892e4;
                                            return interfaceC7183e.ads(mo493e2, i9, C9139e.f18290e, new Function1() { // from class: eٌؚۘ
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj7) {
                                                    AbstractC3698e abstractC3698e = (AbstractC3698e) obj7;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    ArrayList arrayList3 = arrayList;
                                                    Iterator it4 = arrayList3.iterator();
                                                    int i11 = mo493e;
                                                    int i12 = i11;
                                                    while (it4.hasNext()) {
                                                        AbstractC2832e abstractC2832e = (AbstractC2832e) it4.next();
                                                        arrayList2.add(new C13002e(abstractC3698e.mo496final(i12), abstractC3698e.mo496final(abstractC2832e.f6806e)));
                                                        i12 += AbstractC4653e.ad(abstractC3698e, f7) + abstractC2832e.f6806e;
                                                    }
                                                    C2892e c2892e6 = new C2892e(-1486999506, true, new C17785e(c2892e5, arrayList2, 9));
                                                    InterfaceC7183e interfaceC7183e2 = interfaceC7183e;
                                                    for (InterfaceC16719e interfaceC16719e : interfaceC7183e2.subscription(EnumC0526e.f2673e, c2892e6)) {
                                                        int i13 = mo493e2;
                                                        boolean z = i13 >= 0;
                                                        int i14 = i9;
                                                        if (!(z & (i14 >= 0))) {
                                                            AbstractC15805e.ad("width and height must be >= 0");
                                                        }
                                                        AbstractC3698e.advert(abstractC3698e, interfaceC16719e.admob(AbstractC2278e.yandex(i13, i13, i14, i14)), 0, 0);
                                                    }
                                                    Iterator it5 = arrayList3.iterator();
                                                    int i15 = 0;
                                                    while (it5.hasNext()) {
                                                        Object next = it5.next();
                                                        int i16 = i15 + 1;
                                                        if (i15 < 0) {
                                                            AbstractC6874e.Signature();
                                                            throw null;
                                                        }
                                                        AbstractC3698e.advert(abstractC3698e, (AbstractC2832e) next, AbstractC4653e.ad(abstractC3698e, ((C13002e) arrayList2.get(i15)).ad), 0);
                                                        i15 = i16;
                                                    }
                                                    C5488e c5488e3 = c5488e2;
                                                    C9137e c9137e = c5488e3.ad;
                                                    Integer num = c5488e3.metrica;
                                                    int i17 = i10;
                                                    if (num == null || num.intValue() != i17) {
                                                        c5488e3.metrica = Integer.valueOf(i17);
                                                        C13002e c13002e = (C13002e) AbstractC13480e.m3592native(i17, arrayList2);
                                                        if (c13002e != null) {
                                                            C13002e c13002e2 = (C13002e) AbstractC13480e.m3570break(arrayList2);
                                                            int mo493e3 = interfaceC7183e2.mo493e(c13002e2.ad + c13002e2.vip) + i11;
                                                            int purchase4 = mo493e3 - c9137e.appmetrica.purchase();
                                                            int mo493e4 = interfaceC7183e2.mo493e(c13002e.ad) - ((purchase4 / 2) - (interfaceC7183e2.mo493e(c13002e.vip) / 2));
                                                            int i18 = mo493e3 - purchase4;
                                                            if (i18 < 0) {
                                                                i18 = 0;
                                                            }
                                                            int metrica5 = AbstractC3062e.metrica(mo493e4, 0, i18);
                                                            if (c9137e.ad.purchase() != metrica5) {
                                                                AbstractC5336e.purchase(c5488e3.vip, null, 0, new C11143e(c5488e3, metrica5, (InterfaceC5083e) null, 6), 3);
                                                            }
                                                        }
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            });
                                        }
                                        i8 = i8 + ((AbstractC2832e) it3.next()).f6806e + interfaceC7183e.mo493e(f7);
                                        i7 = i9;
                                    }
                                }
                            };
                            c13770e2.m3682throws(obj4);
                            m3681throw3 = obj4;
                        }
                        AbstractC9464e.metrica(metrica, (Function2) m3681throw3, c13770e2, 0, 0);
                    } else {
                        c13770e2.m3659default();
                    }
                    return Unit.INSTANCE;
                }
            }, c13770e), c13770e, ((i3 >> 3) & 14) | 12583296, 114);
            j3 = j4;
        } else {
            c13770e.m3659default();
            j3 = j2;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(i, interfaceC12864e, j, j3, f, f2, f3, c2892e, c2892e2, i2) { // from class: eؓٓ۟

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ float f4872e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ long f4873e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f4874e;

                /* renamed from: eٌٍٚ, reason: contains not printable characters */
                public final /* synthetic */ C2892e f4875e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ long f4876e;

                /* renamed from: eّٕۜ, reason: contains not printable characters */
                public final /* synthetic */ C2892e f4877e;

                /* renamed from: eّٖۦ, reason: contains not printable characters */
                public final /* synthetic */ int f4878e;

                /* renamed from: eؘَٗ, reason: contains not printable characters */
                public final /* synthetic */ float f4879e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ float f4880e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(115040641);
                    AbstractC9672e.ad(this.f4878e, this.f4874e, this.f4873e, this.f4876e, this.f4872e, this.f4880e, this.f4879e, this.f4875e, this.f4877e, (C13770e) obj, advert);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
