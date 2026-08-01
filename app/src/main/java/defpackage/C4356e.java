package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۙۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4356e implements InterfaceC2747e {
    public final boolean ad;
    public final C17894e appmetrica;
    public final float billing;
    public final C17894e license;
    public final C17894e metrica;
    public final InterfaceC12123e purchase;
    public final C8651e vip;

    public C4356e(boolean z, C8651e c8651e, C17894e c17894e, C17894e c17894e2, C17894e c17894e3, InterfaceC12123e interfaceC12123e, float f) {
        this.ad = z;
        this.vip = c8651e;
        this.metrica = c17894e;
        this.license = c17894e2;
        this.appmetrica = c17894e3;
        this.purchase = interfaceC12123e;
        this.billing = f;
    }

    public static final int startapp(C4356e c4356e, int i, int i2, AbstractC2832e abstractC2832e) {
        if (!c4356e.ad) {
            return i2;
        }
        return AbstractC8703e.advert(1, 0.0f, (i - abstractC2832e.f6804e) / 2.0f);
    }

    public static int yandex(List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj7), "TextField")) {
                int intValue = ((Number) function2.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                InterfaceC16719e interfaceC16719e = (InterfaceC16719e) obj2;
                int intValue2 = interfaceC16719e != null ? ((Number) function2.invoke(interfaceC16719e, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                InterfaceC16719e interfaceC16719e2 = (InterfaceC16719e) obj3;
                int intValue3 = interfaceC16719e2 != null ? ((Number) function2.invoke(interfaceC16719e2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                InterfaceC16719e interfaceC16719e3 = (InterfaceC16719e) obj4;
                int intValue4 = interfaceC16719e3 != null ? ((Number) function2.invoke(interfaceC16719e3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                InterfaceC16719e interfaceC16719e4 = (InterfaceC16719e) obj5;
                int intValue5 = interfaceC16719e4 != null ? ((Number) function2.invoke(interfaceC16719e4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                InterfaceC16719e interfaceC16719e5 = (InterfaceC16719e) obj6;
                int intValue6 = interfaceC16719e5 != null ? ((Number) function2.invoke(interfaceC16719e5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                InterfaceC16719e interfaceC16719e6 = (InterfaceC16719e) obj;
                int i9 = intValue4 + intValue5;
                return AbstractC2278e.billing(Math.max(intValue + i9, Math.max((interfaceC16719e6 != null ? ((Number) function2.invoke(interfaceC16719e6, Integer.valueOf(i))).intValue() : 0) + i9, intValue2)) + intValue6 + intValue3, AbstractC2278e.vip(0, 0, 0, 0, 15));
            }
        }
        AbstractC17404e.vip("Collection contains no element matching the predicate.");
        throw new C14803e(9);
    }

    @Override // defpackage.InterfaceC2747e
    public final int ad(InterfaceC0732e interfaceC0732e, List list, int i) {
        return yandex(list, i, new C14151e((byte) 0, 12));
    }

    @Override // defpackage.InterfaceC2747e
    public final int appmetrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        return billing(interfaceC0732e, list, i, new C14151e((byte) 0, 13));
    }

    public final int billing(InterfaceC0732e interfaceC0732e, List list, int i, Function2 function2) {
        Object obj;
        int i2;
        int i3;
        int i4;
        Object obj2;
        int i5;
        Object obj3;
        Object obj4;
        int i6;
        Object obj5;
        int i7;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i8);
            if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj), "Leading")) {
                break;
            }
            i8++;
        }
        InterfaceC16719e interfaceC16719e = (InterfaceC16719e) obj;
        if (interfaceC16719e != null) {
            i2 = i;
            i4 = AbstractC4107e.advert(i2, interfaceC16719e.loadAd(Alert.DURATION_SHOW_INDEFINITELY));
            i3 = ((Number) function2.invoke(interfaceC16719e, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            i3 = 0;
            i4 = i2;
        }
        int size2 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i9);
            if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj2), "Trailing")) {
                break;
            }
            i9++;
        }
        InterfaceC16719e interfaceC16719e2 = (InterfaceC16719e) obj2;
        if (interfaceC16719e2 != null) {
            i4 = AbstractC4107e.advert(i4, interfaceC16719e2.loadAd(Alert.DURATION_SHOW_INDEFINITELY));
            i5 = ((Number) function2.invoke(interfaceC16719e2, Integer.valueOf(i2))).intValue();
        } else {
            i5 = 0;
        }
        int size3 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i10);
            if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj3), "Label")) {
                break;
            }
            i10++;
        }
        InterfaceC16719e interfaceC16719e3 = (InterfaceC16719e) obj3;
        int intValue = interfaceC16719e3 != null ? ((Number) function2.invoke(interfaceC16719e3, Integer.valueOf(i4))).intValue() : 0;
        int size4 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i11);
            if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj4), "Prefix")) {
                break;
            }
            i11++;
        }
        InterfaceC16719e interfaceC16719e4 = (InterfaceC16719e) obj4;
        if (interfaceC16719e4 != null) {
            int intValue2 = ((Number) function2.invoke(interfaceC16719e4, Integer.valueOf(i4))).intValue();
            i4 = AbstractC4107e.advert(i4, interfaceC16719e4.loadAd(Alert.DURATION_SHOW_INDEFINITELY));
            i6 = intValue2;
        } else {
            i6 = 0;
        }
        int size5 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i12);
            if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj5), "Suffix")) {
                break;
            }
            i12++;
        }
        InterfaceC16719e interfaceC16719e5 = (InterfaceC16719e) obj5;
        if (interfaceC16719e5 != null) {
            int intValue3 = ((Number) function2.invoke(interfaceC16719e5, Integer.valueOf(i4))).intValue();
            i4 = AbstractC4107e.advert(i4, interfaceC16719e5.loadAd(Alert.DURATION_SHOW_INDEFINITELY));
            i7 = intValue3;
        } else {
            i7 = 0;
        }
        int size6 = list.size();
        for (int i13 = 0; i13 < size6; i13++) {
            Object obj8 = list.get(i13);
            if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj8), "TextField")) {
                int intValue4 = ((Number) function2.invoke(obj8, Integer.valueOf(i4))).intValue();
                int size7 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i14);
                    if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj6), "Hint")) {
                        break;
                    }
                    i14++;
                }
                InterfaceC16719e interfaceC16719e6 = (InterfaceC16719e) obj6;
                int intValue5 = interfaceC16719e6 != null ? ((Number) function2.invoke(interfaceC16719e6, Integer.valueOf(i4))).intValue() : 0;
                int size8 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i15);
                    if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj7), "Supporting")) {
                        break;
                    }
                    i15++;
                }
                InterfaceC16719e interfaceC16719e7 = (InterfaceC16719e) obj7;
                return purchase(interfaceC0732e, intValue4, intValue, i3, i5, i6, i7, intValue5, interfaceC16719e7 != null ? ((Number) function2.invoke(interfaceC16719e7, Integer.valueOf(i2))).intValue() : 0, AbstractC2278e.vip(0, 0, 0, 0, 15), this.metrica.invoke());
            }
        }
        AbstractC17404e.vip("Collection contains no element matching the predicate.");
        throw new C14803e(9);
    }

    @Override // defpackage.InterfaceC2747e
    public final int license(InterfaceC0732e interfaceC0732e, List list, int i) {
        return billing(interfaceC0732e, list, i, new C14151e((byte) 0, 14));
    }

    @Override // defpackage.InterfaceC2747e
    public final int metrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        return yandex(list, i, new C14151e((byte) 0, 11));
    }

    public final int purchase(InterfaceC0732e interfaceC0732e, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        InterfaceC12123e interfaceC12123e = this.purchase;
        int mo493e = interfaceC0732e.mo493e(interfaceC12123e.ad() + interfaceC12123e.license());
        int[] iArr = {i7, i5, i6, AbstractC15842e.adcel(i2, f, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i = Math.max(i, iArr[i9]);
        }
        return AbstractC2278e.purchase(Math.max(i3, Math.max(i4, mo493e + (i2 > 0 ? Math.max(interfaceC0732e.mo493e(this.billing * 2), AbstractC15842e.adcel(0, AbstractC0750e.ad.ad(f), i2)) : 0) + i)) + i8, j);
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [eّؖٝ, java.lang.Object] */
    @Override // defpackage.InterfaceC2747e
    public final InterfaceC17242e vip(final InterfaceC13158e interfaceC13158e, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        AbstractC2832e abstractC2832e;
        int i;
        AbstractC2832e abstractC2832e2;
        Object obj4;
        AbstractC2832e abstractC2832e3;
        Object obj5;
        int i2;
        Object obj6;
        Object obj7;
        AbstractC2832e abstractC2832e4;
        int i3;
        C4246e c4246e;
        int i4;
        int i5;
        AbstractC2832e abstractC2832e5;
        int i6;
        C4246e c4246e2;
        int i7;
        AbstractC2832e abstractC2832e6;
        float f;
        C4246e c4246e3;
        AbstractC2832e abstractC2832e7;
        int i8;
        int i9;
        float invoke = this.metrica.invoke();
        InterfaceC12123e interfaceC12123e = this.purchase;
        final int mo493e = interfaceC13158e.mo493e(interfaceC12123e.license());
        int mo493e2 = interfaceC13158e.mo493e(interfaceC12123e.ad());
        long ad = C5602e.ad(0, 0, 0, 0, 10, j);
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i10);
            if (AbstractC7890e.billing(AbstractC11203e.metrica((InterfaceC16719e) obj), "Leading")) {
                break;
            }
            i10++;
        }
        InterfaceC16719e interfaceC16719e = (InterfaceC16719e) obj;
        AbstractC2832e admob = interfaceC16719e != null ? interfaceC16719e.admob(ad) : null;
        int i11 = admob != null ? admob.f6806e : 0;
        int max = Math.max(0, admob != null ? admob.f6804e : 0);
        int size2 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i12);
            if (AbstractC7890e.billing(AbstractC11203e.metrica((InterfaceC16719e) obj2), "Trailing")) {
                break;
            }
            i12++;
        }
        InterfaceC16719e interfaceC16719e2 = (InterfaceC16719e) obj2;
        AbstractC2832e admob2 = interfaceC16719e2 != null ? interfaceC16719e2.admob(AbstractC2278e.adcel(-i11, 0, 2, ad)) : null;
        int i13 = i11 + (admob2 != null ? admob2.f6806e : 0);
        int max2 = Math.max(max, admob2 != null ? admob2.f6804e : 0);
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i14);
            if (AbstractC7890e.billing(AbstractC11203e.metrica((InterfaceC16719e) obj3), "Prefix")) {
                break;
            }
            i14++;
        }
        InterfaceC16719e interfaceC16719e3 = (InterfaceC16719e) obj3;
        if (interfaceC16719e3 != null) {
            abstractC2832e = admob;
            i = i13;
            abstractC2832e2 = interfaceC16719e3.admob(AbstractC2278e.adcel(-i13, 0, 2, ad));
        } else {
            abstractC2832e = admob;
            i = i13;
            abstractC2832e2 = null;
        }
        int i15 = i + (abstractC2832e2 != null ? abstractC2832e2.f6806e : 0);
        int max3 = Math.max(max2, abstractC2832e2 != null ? abstractC2832e2.f6804e : 0);
        int size4 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i16);
            if (AbstractC7890e.billing(AbstractC11203e.metrica((InterfaceC16719e) obj4), "Suffix")) {
                break;
            }
            i16++;
        }
        InterfaceC16719e interfaceC16719e4 = (InterfaceC16719e) obj4;
        AbstractC2832e admob3 = interfaceC16719e4 != null ? interfaceC16719e4.admob(AbstractC2278e.adcel(-i15, 0, 2, ad)) : null;
        int i17 = i15 + (admob3 != null ? admob3.f6806e : 0);
        int max4 = Math.max(max3, admob3 != null ? admob3.f6804e : 0);
        int size5 = list.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size5) {
                abstractC2832e3 = admob3;
                obj5 = null;
                break;
            }
            obj5 = list.get(i18);
            abstractC2832e3 = admob3;
            if (AbstractC7890e.billing(AbstractC11203e.metrica((InterfaceC16719e) obj5), "Label")) {
                break;
            }
            i18++;
            admob3 = abstractC2832e3;
        }
        InterfaceC16719e interfaceC16719e5 = (InterfaceC16719e) obj5;
        ?? obj8 = new Object();
        int i19 = -i17;
        obj8.f9318e = interfaceC16719e5 != null ? interfaceC16719e5.admob(AbstractC2278e.startapp(i19, ad, -mo493e2)) : null;
        int size6 = list.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size6) {
                i2 = mo493e2;
                obj6 = null;
                break;
            }
            obj6 = list.get(i20);
            i2 = mo493e2;
            if (AbstractC7890e.billing(AbstractC11203e.metrica((InterfaceC16719e) obj6), "Supporting")) {
                break;
            }
            i20++;
            mo493e2 = i2;
        }
        InterfaceC16719e interfaceC16719e6 = (InterfaceC16719e) obj6;
        int mo2529while = interfaceC16719e6 != null ? interfaceC16719e6.mo2529while(C5602e.adcel(j)) : 0;
        AbstractC2832e abstractC2832e8 = (AbstractC2832e) obj8.f9318e;
        int i21 = (abstractC2832e8 != null ? abstractC2832e8.f6804e : 0) + mo493e;
        final AbstractC2832e abstractC2832e9 = abstractC2832e;
        AbstractC2832e abstractC2832e10 = abstractC2832e3;
        float f2 = invoke;
        AbstractC2832e abstractC2832e11 = abstractC2832e10;
        InterfaceC16719e interfaceC16719e7 = interfaceC16719e6;
        long startapp = AbstractC2278e.startapp(i19, C5602e.ad(0, 0, 0, 0, 11, j), ((-i21) - i2) - mo2529while);
        int size7 = list.size();
        int i22 = 0;
        while (i22 < size7) {
            InterfaceC16719e interfaceC16719e8 = (InterfaceC16719e) list.get(i22);
            if (AbstractC7890e.billing(AbstractC11203e.metrica(interfaceC16719e8), "TextField")) {
                AbstractC2832e admob4 = interfaceC16719e8.admob(startapp);
                long ad2 = C5602e.ad(0, 0, 0, 0, 14, startapp);
                int size8 = list.size();
                int i23 = 0;
                while (true) {
                    if (i23 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i23);
                    if (AbstractC7890e.billing(AbstractC11203e.metrica((InterfaceC16719e) obj7), "Hint")) {
                        break;
                    }
                    i23++;
                }
                InterfaceC16719e interfaceC16719e9 = (InterfaceC16719e) obj7;
                AbstractC2832e admob5 = interfaceC16719e9 != null ? interfaceC16719e9.admob(ad2) : null;
                int max5 = Math.max(max4, Math.max(admob4.f6804e, admob5 != null ? admob5.f6804e : 0) + i21 + i2);
                int i24 = abstractC2832e9 != null ? abstractC2832e9.f6806e : 0;
                int i25 = admob2 != null ? admob2.f6806e : 0;
                int i26 = abstractC2832e2 != null ? abstractC2832e2.f6806e : 0;
                int i27 = abstractC2832e11 != null ? abstractC2832e11.f6806e : 0;
                int i28 = admob4.f6806e;
                AbstractC2832e abstractC2832e12 = (AbstractC2832e) obj8.f9318e;
                int i29 = i26 + i27;
                final int billing = AbstractC2278e.billing(Math.max(i28 + i29, Math.max((admob5 != null ? admob5.f6806e : 0) + i29, abstractC2832e12 != null ? abstractC2832e12.f6806e : 0)) + i24 + i25, j);
                final AbstractC2832e admob6 = interfaceC16719e7 != null ? interfaceC16719e7.admob(C5602e.ad(0, billing, 0, 0, 9, AbstractC2278e.adcel(0, -max5, 1, ad))) : null;
                int i30 = admob6 != null ? admob6.f6804e : 0;
                int i31 = admob4.f6804e;
                AbstractC2832e abstractC2832e13 = (AbstractC2832e) obj8.f9318e;
                if (abstractC2832e13 != null) {
                    int i32 = abstractC2832e13.f6804e;
                    abstractC2832e4 = admob4;
                    i3 = i32;
                } else {
                    abstractC2832e4 = admob4;
                    i3 = 0;
                }
                if (abstractC2832e9 != null) {
                    c4246e = obj8;
                    i4 = i31;
                    i5 = abstractC2832e9.f6804e;
                } else {
                    c4246e = obj8;
                    i4 = i31;
                    i5 = 0;
                }
                int i33 = admob2 != null ? admob2.f6804e : 0;
                int i34 = abstractC2832e2 != null ? abstractC2832e2.f6804e : 0;
                final AbstractC2832e abstractC2832e14 = abstractC2832e2;
                if (abstractC2832e11 != null) {
                    AbstractC2832e abstractC2832e15 = abstractC2832e4;
                    i6 = abstractC2832e11.f6804e;
                    abstractC2832e5 = abstractC2832e15;
                } else {
                    abstractC2832e5 = abstractC2832e4;
                    i6 = 0;
                }
                final AbstractC2832e abstractC2832e16 = abstractC2832e5;
                if (admob5 != null) {
                    C4246e c4246e4 = c4246e;
                    i7 = admob5.f6804e;
                    c4246e2 = c4246e4;
                } else {
                    c4246e2 = c4246e;
                    i7 = 0;
                }
                if (admob6 != null) {
                    c4246e3 = c4246e2;
                    float f3 = f2;
                    abstractC2832e6 = abstractC2832e11;
                    f = f3;
                    abstractC2832e7 = admob5;
                    i8 = i33;
                    i9 = admob6.f6804e;
                } else {
                    float f4 = f2;
                    abstractC2832e6 = abstractC2832e11;
                    f = f4;
                    c4246e3 = c4246e2;
                    abstractC2832e7 = admob5;
                    i8 = i33;
                    i9 = 0;
                }
                final int purchase = purchase(interfaceC13158e, i4, i3, i5, i8, i34, i6, i7, i9, j, f);
                final int i35 = purchase - i30;
                int size9 = list.size();
                int i36 = 0;
                while (i36 < size9) {
                    InterfaceC16719e interfaceC16719e10 = (InterfaceC16719e) list.get(i36);
                    if (AbstractC7890e.billing(AbstractC11203e.metrica(interfaceC16719e10), "Container")) {
                        final AbstractC2832e admob7 = interfaceC16719e10.admob(AbstractC2278e.ad(billing != Integer.MAX_VALUE ? billing : 0, billing, i35 != Integer.MAX_VALUE ? i35 : 0, i35));
                        final AbstractC2832e abstractC2832e17 = admob2;
                        final AbstractC2832e abstractC2832e18 = abstractC2832e7;
                        final C4246e c4246e5 = c4246e3;
                        final float f5 = f;
                        final AbstractC2832e abstractC2832e19 = abstractC2832e6;
                        return interfaceC13158e.ads(billing, purchase, C9139e.f18290e, new Function1() { // from class: eِۤؗ
                            /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
                            /* JADX WARN: Removed duplicated region for block: B:62:0x016b  */
                            @Override // kotlin.jvm.functions.Function1
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke(java.lang.Object r24) {
                                /*
                                    Method dump skipped, instructions count: 575
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.C12076e.invoke(java.lang.Object):java.lang.Object");
                            }
                        });
                    }
                    i36++;
                    c4246e3 = c4246e3;
                }
                AbstractC17404e.vip("Collection contains no element matching the predicate.");
                throw new C14803e(9);
            }
            i22++;
            f2 = f2;
            abstractC2832e11 = abstractC2832e11;
            abstractC2832e2 = abstractC2832e2;
            interfaceC16719e7 = interfaceC16719e7;
        }
        AbstractC17404e.vip("Collection contains no element matching the predicate.");
        throw new C14803e(9);
    }
}
