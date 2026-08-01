package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۨٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3783e implements InterfaceC2747e {
    public final /* synthetic */ int ad;
    public static final C3783e vip = new C3783e(0);
    public static final C3783e metrica = new C3783e(1);
    public static final C3783e license = new C3783e(2);
    public static final C3783e appmetrica = new C3783e(3);
    public static final C3783e purchase = new C3783e(4);
    public static final C2163e billing = new C2163e(13);
    public static final C3783e yandex = new C3783e(5);
    public static final C3783e startapp = new C3783e(6);
    public static final C3783e adcel = new C3783e(7);
    public static final C3783e mopub = new C3783e(8);

    public /* synthetic */ C3783e(int i) {
        this.ad = i;
    }

    @Override // defpackage.InterfaceC2747e
    public final /* synthetic */ int ad(InterfaceC0732e interfaceC0732e, List list, int i) {
        int i2 = this.ad;
        return AbstractC5087e.smaato(this, interfaceC0732e, list, i);
    }

    @Override // defpackage.InterfaceC2747e
    public final /* synthetic */ int appmetrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        int i2 = this.ad;
        return AbstractC5087e.loadAd(this, interfaceC0732e, list, i);
    }

    @Override // defpackage.InterfaceC2747e
    public final /* synthetic */ int license(InterfaceC0732e interfaceC0732e, List list, int i) {
        int i2 = this.ad;
        return AbstractC5087e.mopub(this, interfaceC0732e, list, i);
    }

    @Override // defpackage.InterfaceC2747e
    public final /* synthetic */ int metrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        int i2 = this.ad;
        return AbstractC5087e.admob(this, interfaceC0732e, list, i);
    }

    @Override // defpackage.InterfaceC2747e
    public final InterfaceC17242e vip(InterfaceC13158e interfaceC13158e, List list, long j) {
        Object obj;
        Object obj2;
        int mo493e;
        int max;
        int i;
        int mo393try;
        switch (this.ad) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    AbstractC2832e admob = ((InterfaceC16719e) list.get(i4)).admob(j);
                    i2 = Math.max(i2, admob.f6806e);
                    i3 = Math.max(i3, admob.f6804e);
                    arrayList.add(admob);
                }
                if (list.isEmpty()) {
                    i2 = C5602e.adcel(j);
                    i3 = C5602e.startapp(j);
                }
                return interfaceC13158e.ads(i2, i3, C9139e.f18290e, new C9912e(0, arrayList));
            case 1:
                int size2 = list.size();
                C9139e c9139e = C9139e.f18290e;
                if (size2 == 0) {
                    return interfaceC13158e.ads(0, 0, c9139e, C5430e.f11647e);
                }
                if (size2 == 1) {
                    AbstractC2832e admob2 = ((InterfaceC16719e) list.get(0)).admob(j);
                    return interfaceC13158e.ads(admob2.f6806e, admob2.f6804e, c9139e, new C8684e(admob2, 1));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int i5 = 0;
                int i6 = 0;
                for (int i7 = 0; i7 < size3; i7++) {
                    AbstractC2832e admob3 = ((InterfaceC16719e) list.get(i7)).admob(j);
                    i5 = Math.max(i5, admob3.f6806e);
                    i6 = Math.max(i6, admob3.f6804e);
                    arrayList2.add(admob3);
                }
                return interfaceC13158e.ads(i5, i6, c9139e, new C9912e(1, arrayList2));
            case 2:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size4 = list.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    arrayList3.add(((InterfaceC16719e) list.get(i8)).admob(j));
                }
                return interfaceC13158e.ads(C5602e.yandex(j), C5602e.billing(j), C9139e.f18290e, new C2191e(0, arrayList3));
            case 3:
                return interfaceC13158e.ads(C5602e.adcel(j), C5602e.startapp(j), C9139e.f18290e, new C17014e(18));
            case 4:
                return interfaceC13158e.ads(C5602e.yandex(j), C5602e.billing(j), C9139e.f18290e, billing);
            case 5:
                return interfaceC13158e.ads(C5602e.adcel(j), C5602e.startapp(j), C9139e.f18290e, new C14407e(23));
            case 6:
                ArrayList arrayList4 = new ArrayList(list.size());
                int size5 = list.size();
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < size5; i11++) {
                    AbstractC2832e admob4 = ((InterfaceC16719e) list.get(i11)).admob(j);
                    i9 = Math.max(i9, admob4.f6806e);
                    i10 = Math.max(i10, admob4.f6804e);
                    arrayList4.add(admob4);
                }
                return interfaceC13158e.ads(i9, i10, C9139e.f18290e, new C2191e(3, arrayList4));
            case 7:
                return interfaceC13158e.ads(C5602e.purchase(j) ? C5602e.yandex(j) : 0, C5602e.appmetrica(j) ? C5602e.billing(j) : 0, C9139e.f18290e, new C7983e(27));
            case 8:
                return interfaceC13158e.ads(C5602e.adcel(j), C5602e.startapp(j), C9139e.f18290e, new C9369e(0));
            default:
                int min = Math.min(C5602e.yandex(j), interfaceC13158e.mo493e(AbstractC0839e.ad));
                int size6 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size6) {
                        obj = list.get(i12);
                        if (!AbstractC7890e.billing(AbstractC11203e.metrica((InterfaceC16719e) obj), "action")) {
                            i12++;
                        }
                    } else {
                        obj = null;
                    }
                }
                InterfaceC16719e interfaceC16719e = (InterfaceC16719e) obj;
                final AbstractC2832e admob5 = interfaceC16719e != null ? interfaceC16719e.admob(j) : null;
                int size7 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size7) {
                        obj2 = list.get(i13);
                        if (!AbstractC7890e.billing(AbstractC11203e.metrica((InterfaceC16719e) obj2), "dismissAction")) {
                            i13++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                InterfaceC16719e interfaceC16719e2 = (InterfaceC16719e) obj2;
                final AbstractC2832e admob6 = interfaceC16719e2 != null ? interfaceC16719e2.admob(j) : null;
                int i14 = admob5 != null ? admob5.f6806e : 0;
                int i15 = admob5 != null ? admob5.f6804e : 0;
                int i16 = admob6 != null ? admob6.f6806e : 0;
                int i17 = admob6 != null ? admob6.f6804e : 0;
                int mo493e2 = ((min - i14) - i16) - (i16 == 0 ? interfaceC13158e.mo493e(AbstractC0839e.purchase) : 0);
                int adcel2 = C5602e.adcel(j);
                if (mo493e2 >= adcel2) {
                    adcel2 = mo493e2;
                }
                int size8 = list.size();
                for (int i18 = 0; i18 < size8; i18++) {
                    InterfaceC16719e interfaceC16719e3 = (InterfaceC16719e) list.get(i18);
                    if (AbstractC7890e.billing(AbstractC11203e.metrica(interfaceC16719e3), "text")) {
                        int i19 = i17;
                        final AbstractC2832e admob7 = interfaceC16719e3.admob(C5602e.ad(0, adcel2, 0, 0, 9, j));
                        C4782e c4782e = AbstractC14806e.ad;
                        int mo393try2 = admob7.mo393try(c4782e);
                        int mo393try3 = admob7.mo393try(AbstractC14806e.vip);
                        boolean z = true;
                        boolean z2 = (mo393try2 == Integer.MIN_VALUE || mo393try3 == Integer.MIN_VALUE) ? false : true;
                        if (mo393try2 != mo393try3 && z2) {
                            z = false;
                        }
                        final int i20 = min - i16;
                        final int i21 = i20 - i14;
                        if (z) {
                            max = Math.max(interfaceC13158e.mo493e(AbstractC13981e.purchase), Math.max(i15, i19));
                            mo493e = (max - admob7.f6804e) / 2;
                            if (admob5 != null && (mo393try = admob5.mo393try(c4782e)) != Integer.MIN_VALUE) {
                                i = (mo393try2 + mo493e) - mo393try;
                            }
                            i = 0;
                        } else {
                            mo493e = interfaceC13158e.mo493e(AbstractC0839e.vip) - mo393try2;
                            max = Math.max(interfaceC13158e.mo493e(AbstractC13981e.billing), admob7.f6804e + mo493e);
                            if (admob5 != null) {
                                i = (max - admob5.f6804e) / 2;
                            }
                            i = 0;
                        }
                        final int i22 = mo493e;
                        final int i23 = admob6 != null ? (max - admob6.f6804e) / 2 : 0;
                        final int i24 = i;
                        return interfaceC13158e.ads(min, max, C9139e.f18290e, new Function1() { // from class: eًؙٗ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                AbstractC3698e abstractC3698e = (AbstractC3698e) obj3;
                                AbstractC3698e.advert(abstractC3698e, AbstractC2832e.this, 0, i22);
                                AbstractC2832e abstractC2832e = admob5;
                                if (abstractC2832e != null) {
                                    AbstractC3698e.advert(abstractC3698e, abstractC2832e, i21, i24);
                                }
                                AbstractC2832e abstractC2832e2 = admob6;
                                if (abstractC2832e2 != null) {
                                    AbstractC3698e.advert(abstractC3698e, abstractC2832e2, i20, i23);
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
                AbstractC17404e.vip("Collection contains no element matching the predicate.");
                throw new C14803e(9);
        }
    }
}
