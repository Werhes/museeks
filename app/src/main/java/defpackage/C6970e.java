package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6970e implements InterfaceC2747e {
    public final Function1 ad;
    public final C17894e appmetrica;
    public final InterfaceC12123e billing;
    public final C17894e license;
    public final C8651e metrica;
    public final C17894e purchase;
    public final boolean vip;
    public final float yandex;

    public C6970e(Function1 function1, boolean z, C8651e c8651e, C17894e c17894e, C17894e c17894e2, C17894e c17894e3, InterfaceC12123e interfaceC12123e, float f) {
        this.ad = function1;
        this.vip = z;
        this.metrica = c8651e;
        this.license = c17894e;
        this.appmetrica = c17894e2;
        this.purchase = c17894e3;
        this.billing = interfaceC12123e;
        this.yandex = f;
    }

    public static final int adcel(int i, C6970e c6970e, int i2, int i3, AbstractC2832e abstractC2832e, AbstractC2832e abstractC2832e2) {
        if (c6970e.vip) {
            i3 = AbstractC8703e.advert(1, 0.0f, (i2 - abstractC2832e2.f6804e) / 2.0f);
        }
        return Math.max(i + i3, (abstractC2832e != null ? abstractC2832e.f6804e : 0) / 2);
    }

    @Override // defpackage.InterfaceC2747e
    public final int ad(InterfaceC0732e interfaceC0732e, List list, int i) {
        return startapp(interfaceC0732e, list, i, new C17706e(7));
    }

    @Override // defpackage.InterfaceC2747e
    public final int appmetrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        return yandex(interfaceC0732e, list, i, new C17706e(6));
    }

    public final int billing(InterfaceC0732e interfaceC0732e, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int max = Math.max(i5 + i8, Math.max(i7 + i8, AbstractC15842e.adcel(i6, f, 0))) + i + i2;
        InterfaceC12123e interfaceC12123e = this.billing;
        EnumC7792e enumC7792e = EnumC7792e.f15794e;
        return AbstractC2278e.billing(Math.max(max, AbstractC1561e.appmetrica((i6 + interfaceC0732e.mo497instanceof(interfaceC12123e.metrica(enumC7792e) + interfaceC12123e.vip(enumC7792e))) * f)), j);
    }

    @Override // defpackage.InterfaceC2747e
    public final int license(InterfaceC0732e interfaceC0732e, List list, int i) {
        return yandex(interfaceC0732e, list, i, new C17706e(8));
    }

    @Override // defpackage.InterfaceC2747e
    public final int metrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        return startapp(interfaceC0732e, list, i, new C17706e(9));
    }

    public final int purchase(InterfaceC0732e interfaceC0732e, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int[] iArr = {i7, i3, i4, AbstractC15842e.adcel(i6, f, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        InterfaceC12123e interfaceC12123e = this.billing;
        float mo497instanceof = interfaceC0732e.mo497instanceof(interfaceC12123e.license());
        return AbstractC2278e.purchase(Math.max(i, Math.max(i2, AbstractC1561e.appmetrica(AbstractC15842e.startapp(mo497instanceof, Math.max(mo497instanceof, i6 / 2.0f), f) + i5 + interfaceC0732e.mo497instanceof(interfaceC12123e.ad())))) + i8, j);
    }

    public final int startapp(InterfaceC0732e interfaceC0732e, List list, int i, Function2 function2) {
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
                    if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj4), "Leading")) {
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
                    if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj5), "Prefix")) {
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
                    if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj6), "Suffix")) {
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
                return billing(interfaceC0732e, intValue4, intValue3, intValue5, intValue6, intValue, intValue2, interfaceC16719e6 != null ? ((Number) function2.invoke(interfaceC16719e6, Integer.valueOf(i))).intValue() : 0, AbstractC2278e.vip(0, 0, 0, 0, 15), this.license.invoke());
            }
        }
        AbstractC17404e.vip("Collection contains no element matching the predicate.");
        throw new C14803e(9);
    }

    /* JADX WARN: Type inference failed for: r7v9, types: [eّؖٝ, java.lang.Object] */
    @Override // defpackage.InterfaceC2747e
    public final InterfaceC17242e vip(final InterfaceC13158e interfaceC13158e, List list, long j) {
        Object obj;
        Object obj2;
        AbstractC2832e abstractC2832e;
        int i;
        AbstractC2832e abstractC2832e2;
        Object obj3;
        AbstractC2832e abstractC2832e3;
        int i2;
        AbstractC2832e abstractC2832e4;
        Object obj4;
        AbstractC2832e abstractC2832e5;
        int i3;
        AbstractC2832e abstractC2832e6;
        Object obj5;
        long j2;
        Object obj6;
        Object obj7;
        AbstractC2832e abstractC2832e7;
        int i4;
        C4246e c4246e;
        int i5;
        C4246e c4246e2;
        AbstractC2832e abstractC2832e8;
        int i6;
        long j3;
        int i7;
        AbstractC2832e abstractC2832e9;
        AbstractC2832e abstractC2832e10;
        int i8;
        AbstractC2832e abstractC2832e11;
        InterfaceC16719e interfaceC16719e;
        C6970e c6970e;
        InterfaceC13158e interfaceC13158e2;
        AbstractC2832e abstractC2832e12;
        int i9;
        AbstractC2832e abstractC2832e13;
        AbstractC2832e abstractC2832e14;
        int i10;
        int i11;
        int i12;
        C4246e c4246e3;
        int i13;
        C6970e c6970e2;
        AbstractC2832e abstractC2832e15;
        AbstractC2832e abstractC2832e16;
        int i14;
        AbstractC2832e abstractC2832e17;
        int i15;
        InterfaceC13158e interfaceC13158e3;
        float f;
        List list2 = list;
        float invoke = this.license.invoke();
        InterfaceC12123e interfaceC12123e = this.billing;
        int mo493e = interfaceC13158e.mo493e(interfaceC12123e.ad());
        long ad = C5602e.ad(0, 0, 0, 0, 10, j);
        int size = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i16);
            if (AbstractC7890e.billing(AbstractC11203e.metrica((InterfaceC16719e) obj), "Leading")) {
                break;
            }
            i16++;
        }
        InterfaceC16719e interfaceC16719e2 = (InterfaceC16719e) obj;
        AbstractC2832e admob = interfaceC16719e2 != null ? interfaceC16719e2.admob(ad) : null;
        int i17 = admob != null ? admob.f6806e : 0;
        int max = Math.max(0, admob != null ? admob.f6804e : 0);
        int size2 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i18);
            if (AbstractC7890e.billing(AbstractC11203e.metrica((InterfaceC16719e) obj2), "Trailing")) {
                break;
            }
            i18++;
        }
        InterfaceC16719e interfaceC16719e3 = (InterfaceC16719e) obj2;
        if (interfaceC16719e3 != null) {
            abstractC2832e = admob;
            i = i17;
            abstractC2832e2 = interfaceC16719e3.admob(AbstractC2278e.adcel(-i17, 0, 2, ad));
        } else {
            abstractC2832e = admob;
            i = i17;
            abstractC2832e2 = null;
        }
        int i19 = i + (abstractC2832e2 != null ? abstractC2832e2.f6806e : 0);
        int max2 = Math.max(max, abstractC2832e2 != null ? abstractC2832e2.f6804e : 0);
        int size3 = list2.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i20);
            int i21 = size3;
            if (AbstractC7890e.billing(AbstractC11203e.metrica((InterfaceC16719e) obj3), "Prefix")) {
                break;
            }
            i20++;
            size3 = i21;
        }
        InterfaceC16719e interfaceC16719e4 = (InterfaceC16719e) obj3;
        if (interfaceC16719e4 != null) {
            abstractC2832e3 = abstractC2832e2;
            i2 = i19;
            abstractC2832e4 = interfaceC16719e4.admob(AbstractC2278e.adcel(-i19, 0, 2, ad));
        } else {
            abstractC2832e3 = abstractC2832e2;
            i2 = i19;
            abstractC2832e4 = null;
        }
        int i22 = i2 + (abstractC2832e4 != null ? abstractC2832e4.f6806e : 0);
        int max3 = Math.max(max2, abstractC2832e4 != null ? abstractC2832e4.f6804e : 0);
        int size4 = list2.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i23);
            int i24 = size4;
            if (AbstractC7890e.billing(AbstractC11203e.metrica((InterfaceC16719e) obj4), "Suffix")) {
                break;
            }
            i23++;
            size4 = i24;
        }
        InterfaceC16719e interfaceC16719e5 = (InterfaceC16719e) obj4;
        if (interfaceC16719e5 != null) {
            abstractC2832e5 = abstractC2832e4;
            i3 = i22;
            abstractC2832e6 = interfaceC16719e5.admob(AbstractC2278e.adcel(-i22, 0, 2, ad));
        } else {
            abstractC2832e5 = abstractC2832e4;
            i3 = i22;
            abstractC2832e6 = null;
        }
        int i25 = i3 + (abstractC2832e6 != null ? abstractC2832e6.f6806e : 0);
        int max4 = Math.max(max3, abstractC2832e6 != null ? abstractC2832e6.f6804e : 0);
        int size5 = list2.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list2.get(i26);
            int i27 = size5;
            if (AbstractC7890e.billing(AbstractC11203e.metrica((InterfaceC16719e) obj5), "Label")) {
                break;
            }
            i26++;
            size5 = i27;
        }
        InterfaceC16719e interfaceC16719e6 = (InterfaceC16719e) obj5;
        ?? obj8 = new Object();
        int mo493e2 = interfaceC13158e.mo493e(interfaceC12123e.metrica(interfaceC13158e.getLayoutDirection())) + interfaceC13158e.mo493e(interfaceC12123e.vip(interfaceC13158e.getLayoutDirection()));
        int i28 = -AbstractC15842e.adcel(i25 + mo493e2, invoke, mo493e2);
        int i29 = -mo493e;
        AbstractC2832e admob2 = interfaceC16719e6 != null ? interfaceC16719e6.admob(AbstractC2278e.startapp(i28, ad, i29)) : null;
        obj8.f9318e = admob2;
        if (admob2 != null) {
            j2 = (Float.floatToRawIntBits(admob2.f6804e) & 4294967295L) | (Float.floatToRawIntBits(admob2.f6806e) << 32);
        } else {
            j2 = 0;
        }
        this.ad.invoke(new C2108e(j2));
        int size6 = list2.size();
        int i30 = 0;
        while (true) {
            if (i30 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i30);
            if (AbstractC7890e.billing(AbstractC11203e.metrica((InterfaceC16719e) obj6), "Supporting")) {
                break;
            }
            i30++;
        }
        InterfaceC16719e interfaceC16719e7 = (InterfaceC16719e) obj6;
        int mo2529while = interfaceC16719e7 != null ? interfaceC16719e7.mo2529while(C5602e.adcel(j)) : 0;
        AbstractC2832e abstractC2832e18 = (AbstractC2832e) obj8.f9318e;
        int max5 = Math.max((abstractC2832e18 != null ? abstractC2832e18.f6804e : 0) / 2, interfaceC13158e.mo493e(interfaceC12123e.license()));
        long j4 = j;
        long startapp = AbstractC2278e.startapp(-i25, j4, (i29 - max5) - mo2529while);
        InterfaceC16719e interfaceC16719e8 = interfaceC16719e7;
        long ad2 = C5602e.ad(0, 0, 0, 0, 11, startapp);
        int size7 = list2.size();
        int i31 = 0;
        while (i31 < size7) {
            InterfaceC16719e interfaceC16719e9 = interfaceC16719e8;
            InterfaceC16719e interfaceC16719e10 = (InterfaceC16719e) list2.get(i31);
            int i32 = max5;
            int i33 = size7;
            if (AbstractC7890e.billing(AbstractC11203e.metrica(interfaceC16719e10), "TextField")) {
                AbstractC2832e admob3 = interfaceC16719e10.admob(ad2);
                long ad3 = C5602e.ad(0, 0, 0, 0, 14, ad2);
                int size8 = list2.size();
                int i34 = 0;
                while (true) {
                    if (i34 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj9 = list2.get(i34);
                    int i35 = size8;
                    if (AbstractC7890e.billing(AbstractC11203e.metrica((InterfaceC16719e) obj9), "Hint")) {
                        obj7 = obj9;
                        break;
                    }
                    i34++;
                    size8 = i35;
                }
                InterfaceC16719e interfaceC16719e11 = (InterfaceC16719e) obj7;
                AbstractC2832e admob4 = interfaceC16719e11 != null ? interfaceC16719e11.admob(ad3) : null;
                int max6 = Math.max(max4, Math.max(admob3.f6804e, admob4 != null ? admob4.f6804e : 0) + i32 + mo493e);
                int i36 = abstractC2832e != null ? abstractC2832e.f6806e : 0;
                AbstractC2832e abstractC2832e19 = abstractC2832e3;
                int i37 = abstractC2832e3 != null ? abstractC2832e19.f6806e : 0;
                AbstractC2832e abstractC2832e20 = abstractC2832e5;
                int i38 = abstractC2832e5 != null ? abstractC2832e20.f6806e : 0;
                if (abstractC2832e6 != null) {
                    i4 = abstractC2832e6.f6806e;
                    abstractC2832e7 = abstractC2832e19;
                } else {
                    abstractC2832e7 = abstractC2832e19;
                    i4 = 0;
                }
                int i39 = admob3.f6806e;
                AbstractC2832e abstractC2832e21 = abstractC2832e7;
                AbstractC2832e abstractC2832e22 = (AbstractC2832e) obj8.f9318e;
                if (abstractC2832e22 != null) {
                    i5 = abstractC2832e22.f6806e;
                    c4246e = obj8;
                } else {
                    c4246e = obj8;
                    i5 = 0;
                }
                if (admob4 != null) {
                    abstractC2832e8 = admob3;
                    i6 = i36;
                    c4246e2 = c4246e;
                    j3 = j4;
                    i7 = admob4.f6806e;
                    abstractC2832e9 = admob4;
                    abstractC2832e10 = abstractC2832e6;
                    i8 = i38;
                    abstractC2832e11 = abstractC2832e20;
                    interfaceC16719e = interfaceC16719e9;
                    c6970e = this;
                    abstractC2832e12 = abstractC2832e;
                    i9 = max6;
                    abstractC2832e13 = abstractC2832e21;
                    interfaceC13158e2 = interfaceC13158e;
                } else {
                    c4246e2 = c4246e;
                    abstractC2832e8 = admob3;
                    i6 = i36;
                    j3 = j4;
                    i7 = 0;
                    abstractC2832e9 = admob4;
                    abstractC2832e10 = abstractC2832e6;
                    i8 = i38;
                    abstractC2832e11 = abstractC2832e20;
                    interfaceC16719e = interfaceC16719e9;
                    c6970e = this;
                    interfaceC13158e2 = interfaceC13158e;
                    abstractC2832e12 = abstractC2832e;
                    i9 = max6;
                    abstractC2832e13 = abstractC2832e21;
                }
                final int billing = c6970e.billing(interfaceC13158e2, i6, i37, i8, i4, i39, i5, i7, j3, invoke);
                final AbstractC2832e admob5 = interfaceC16719e != null ? interfaceC16719e.admob(C5602e.ad(0, billing, 0, 0, 9, AbstractC2278e.adcel(0, -i9, 1, ad))) : null;
                int i40 = admob5 != null ? admob5.f6804e : 0;
                AbstractC2832e abstractC2832e23 = abstractC2832e12;
                int i41 = abstractC2832e12 != null ? abstractC2832e23.f6804e : 0;
                final AbstractC2832e abstractC2832e24 = abstractC2832e13;
                int i42 = abstractC2832e13 != null ? abstractC2832e24.f6804e : 0;
                AbstractC2832e abstractC2832e25 = abstractC2832e11;
                int i43 = abstractC2832e25 != null ? abstractC2832e25.f6804e : 0;
                AbstractC2832e abstractC2832e26 = abstractC2832e10;
                int i44 = abstractC2832e26 != null ? abstractC2832e26.f6804e : 0;
                AbstractC2832e abstractC2832e27 = abstractC2832e8;
                int i45 = abstractC2832e27.f6804e;
                C4246e c4246e4 = c4246e2;
                AbstractC2832e abstractC2832e28 = (AbstractC2832e) c4246e4.f9318e;
                int i46 = abstractC2832e28 != null ? abstractC2832e28.f6804e : 0;
                int i47 = i40;
                final AbstractC2832e abstractC2832e29 = abstractC2832e9;
                if (abstractC2832e29 != null) {
                    abstractC2832e14 = abstractC2832e26;
                    i10 = i44;
                    i11 = i45;
                    i12 = abstractC2832e29.f6804e;
                } else {
                    abstractC2832e14 = abstractC2832e26;
                    i10 = i44;
                    i11 = i45;
                    i12 = 0;
                }
                if (admob5 != null) {
                    c4246e3 = c4246e4;
                    i13 = admob5.f6804e;
                    abstractC2832e15 = abstractC2832e25;
                    abstractC2832e16 = abstractC2832e27;
                    i14 = i46;
                    abstractC2832e17 = abstractC2832e23;
                    i15 = 0;
                    interfaceC13158e3 = interfaceC13158e;
                    f = invoke;
                    c6970e2 = this;
                } else {
                    c4246e3 = c4246e4;
                    i13 = 0;
                    c6970e2 = this;
                    abstractC2832e15 = abstractC2832e25;
                    abstractC2832e16 = abstractC2832e27;
                    i14 = i46;
                    abstractC2832e17 = abstractC2832e23;
                    i15 = 0;
                    interfaceC13158e3 = interfaceC13158e;
                    f = invoke;
                }
                final int purchase = c6970e2.purchase(interfaceC13158e3, i41, i42, i43, i10, i11, i14, i12, i13, j, f);
                final float f2 = f;
                int i48 = purchase - i47;
                int size9 = list.size();
                int i49 = i15;
                while (i49 < size9) {
                    InterfaceC16719e interfaceC16719e12 = (InterfaceC16719e) list.get(i49);
                    if (AbstractC7890e.billing(AbstractC11203e.metrica(interfaceC16719e12), "Container")) {
                        final AbstractC2832e admob6 = interfaceC16719e12.admob(AbstractC2278e.ad(billing != Integer.MAX_VALUE ? billing : i15, billing, i48 != Integer.MAX_VALUE ? i48 : i15, i48));
                        final AbstractC2832e abstractC2832e30 = abstractC2832e17;
                        final AbstractC2832e abstractC2832e31 = abstractC2832e15;
                        final AbstractC2832e abstractC2832e32 = abstractC2832e14;
                        final C4246e c4246e5 = c4246e3;
                        final AbstractC2832e abstractC2832e33 = abstractC2832e16;
                        return interfaceC13158e.ads(billing, purchase, C9139e.f18290e, new Function1() { // from class: eٕٕٝ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj10) {
                                float f3;
                                float f4;
                                int i50;
                                C6970e c6970e3;
                                AbstractC2832e abstractC2832e34;
                                int i51;
                                int i52;
                                AbstractC2832e abstractC2832e35;
                                int i53;
                                int i54;
                                C6970e c6970e4;
                                int i55;
                                int i56;
                                AbstractC2832e abstractC2832e36;
                                int i57;
                                int i58;
                                float f5;
                                float f6;
                                float f7;
                                float f8;
                                AbstractC3698e abstractC3698e = (AbstractC3698e) obj10;
                                AbstractC2832e abstractC2832e37 = (AbstractC2832e) c4246e5.f9318e;
                                C6970e c6970e5 = C6970e.this;
                                C17894e c17894e = c6970e5.appmetrica;
                                C17894e c17894e2 = c6970e5.purchase;
                                float vip = abstractC3698e.vip();
                                EnumC7792e layoutDirection = interfaceC13158e.getLayoutDirection();
                                float vip2 = abstractC3698e.vip() * c6970e5.yandex;
                                C8651e c8651e = c6970e5.metrica;
                                InterfaceC12123e interfaceC12123e2 = c6970e5.billing;
                                abstractC3698e.billing(admob6, 0, 0, 0.0f);
                                AbstractC2832e abstractC2832e38 = admob5;
                                int i59 = purchase - (abstractC2832e38 != null ? abstractC2832e38.f6804e : 0);
                                int appmetrica = AbstractC1561e.appmetrica(interfaceC12123e2.license() * vip);
                                AbstractC2832e abstractC2832e39 = abstractC2832e30;
                                if (abstractC2832e39 != null) {
                                    f3 = vip;
                                    f4 = vip2;
                                    AbstractC3698e.advert(abstractC3698e, abstractC2832e39, 0, AbstractC8703e.advert(1, 0.0f, (i59 - abstractC2832e39.f6804e) / 2.0f));
                                } else {
                                    f3 = vip;
                                    f4 = vip2;
                                }
                                int i60 = billing;
                                AbstractC2832e abstractC2832e40 = abstractC2832e24;
                                if (abstractC2832e37 != null) {
                                    i51 = 2;
                                    if (c6970e5.vip) {
                                        i50 = i60;
                                        c6970e3 = c6970e5;
                                        i58 = AbstractC8703e.advert(1, 0.0f, (i59 - abstractC2832e37.f6804e) / 2.0f);
                                    } else {
                                        i50 = i60;
                                        c6970e3 = c6970e5;
                                        i58 = appmetrica;
                                    }
                                    int i61 = -(abstractC2832e37.f6804e / 2);
                                    float f9 = f2;
                                    int adcel = AbstractC15842e.adcel(i58, f9, i61);
                                    float billing2 = AbstractC12220e.billing(interfaceC12123e2, layoutDirection) * f3;
                                    float purchase2 = AbstractC12220e.purchase(interfaceC12123e2, layoutDirection) * f3;
                                    if (abstractC2832e39 == null) {
                                        f5 = billing2;
                                        f6 = 0.0f;
                                    } else {
                                        f5 = billing2;
                                        float f10 = abstractC2832e39.f6806e;
                                        float f11 = f5 - f4;
                                        f6 = 0.0f;
                                        if (f11 < 0.0f) {
                                            f11 = 0.0f;
                                        }
                                        billing2 = f10 + f11;
                                    }
                                    if (abstractC2832e40 == null) {
                                        f7 = billing2;
                                        f8 = purchase2;
                                    } else {
                                        f7 = billing2;
                                        float f12 = abstractC2832e40.f6806e;
                                        float f13 = purchase2 - f4;
                                        if (f13 < f6) {
                                            f13 = 0.0f;
                                        }
                                        f8 = f12 + f13;
                                    }
                                    EnumC7792e enumC7792e = EnumC7792e.f15794e;
                                    float f14 = layoutDirection == enumC7792e ? f5 : purchase2;
                                    float f15 = layoutDirection == enumC7792e ? f7 : f8;
                                    float f16 = AbstractC2754e.ad;
                                    float f17 = f15;
                                    if (!(c8651e instanceof C8651e)) {
                                        throw new IllegalArgumentException("Unknown position: " + c8651e);
                                    }
                                    abstractC2832e34 = abstractC2832e40;
                                    abstractC3698e.billing(abstractC2832e37, AbstractC1561e.appmetrica(AbstractC15842e.startapp(c8651e.vip.ad(abstractC2832e37.f6806e, i50 - AbstractC1561e.appmetrica(f7 + f8), layoutDirection) + f17, ((C9577e) AbstractC2754e.purchase(c8651e)).ad(abstractC2832e37.f6806e, i50 - AbstractC1561e.appmetrica(f5 + purchase2), layoutDirection) + f14, f9)), adcel, 0.0f);
                                } else {
                                    i50 = i60;
                                    c6970e3 = c6970e5;
                                    abstractC2832e34 = abstractC2832e40;
                                    i51 = 2;
                                }
                                AbstractC2832e abstractC2832e41 = abstractC2832e31;
                                if (abstractC2832e41 != null) {
                                    if (abstractC2832e39 != null) {
                                        abstractC2832e36 = abstractC2832e41;
                                        i57 = abstractC2832e39.f6806e;
                                    } else {
                                        abstractC2832e36 = abstractC2832e41;
                                        i57 = 0;
                                    }
                                    C6970e c6970e6 = c6970e3;
                                    abstractC2832e35 = abstractC2832e34;
                                    int adcel2 = C6970e.adcel(0, c6970e6, i59, appmetrica, abstractC2832e37, abstractC2832e36);
                                    i53 = 0;
                                    c6970e3 = c6970e6;
                                    appmetrica = appmetrica;
                                    int i62 = i57;
                                    abstractC2832e41 = abstractC2832e36;
                                    i52 = i59;
                                    AbstractC3698e.smaato(abstractC3698e, abstractC2832e41, i62, adcel2, new C16853e(c17894e2, 0), 4);
                                } else {
                                    i52 = i59;
                                    abstractC2832e35 = abstractC2832e34;
                                    i53 = 0;
                                }
                                int i63 = (abstractC2832e41 != null ? abstractC2832e41.f6806e : 0) + (abstractC2832e39 != null ? abstractC2832e39.f6806e : 0);
                                int i64 = i52;
                                AbstractC2832e abstractC2832e42 = abstractC2832e33;
                                int i65 = appmetrica;
                                int i66 = i53;
                                C6970e c6970e7 = c6970e3;
                                AbstractC3698e.advert(abstractC3698e, abstractC2832e42, i63, C6970e.adcel(i66, c6970e7, i64, i65, abstractC2832e37, abstractC2832e42));
                                AbstractC2832e abstractC2832e43 = abstractC2832e29;
                                if (abstractC2832e43 != null) {
                                    int adcel3 = C6970e.adcel(i66, c6970e7, i64, i65, abstractC2832e37, abstractC2832e43);
                                    i54 = i66;
                                    c6970e4 = c6970e7;
                                    i56 = i65;
                                    i55 = i64;
                                    AbstractC3698e.smaato(abstractC3698e, abstractC2832e43, i63, adcel3, new C16853e(c17894e, 1), 4);
                                } else {
                                    i54 = i66;
                                    c6970e4 = c6970e7;
                                    i55 = i64;
                                    i56 = i65;
                                }
                                AbstractC2832e abstractC2832e44 = abstractC2832e32;
                                if (abstractC2832e44 != null) {
                                    int i67 = i55;
                                    i55 = i67;
                                    AbstractC3698e.smaato(abstractC3698e, abstractC2832e44, (i50 - (abstractC2832e35 != null ? abstractC2832e35.f6806e : 0)) - abstractC2832e44.f6806e, C6970e.adcel(i54, c6970e4, i67, i56, abstractC2832e37, abstractC2832e44), new C16853e(c17894e2, i51), 4);
                                }
                                if (abstractC2832e35 != null) {
                                    AbstractC3698e.advert(abstractC3698e, abstractC2832e35, i50 - abstractC2832e35.f6806e, AbstractC8703e.advert(1, 0.0f, (i55 - abstractC2832e35.f6804e) / 2.0f));
                                }
                                if (abstractC2832e38 != null) {
                                    AbstractC3698e.advert(abstractC3698e, abstractC2832e38, 0, i55);
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                    i49++;
                    purchase = purchase;
                }
                AbstractC17404e.vip("Collection contains no element matching the predicate.");
                throw new C14803e(9);
            }
            i31++;
            j4 = j;
            interfaceC16719e8 = interfaceC16719e9;
            size7 = i33;
            abstractC2832e5 = abstractC2832e5;
            list2 = list2;
            max5 = i32;
        }
        AbstractC17404e.vip("Collection contains no element matching the predicate.");
        throw new C14803e(9);
    }

    public final int yandex(InterfaceC0732e interfaceC0732e, List list, int i, Function2 function2) {
        Object obj;
        int i2;
        int i3;
        Object obj2;
        int i4;
        Object obj3;
        Object obj4;
        int i5;
        Object obj5;
        int i6;
        Object obj6;
        Object obj7;
        C6970e c6970e = this;
        float invoke = c6970e.license.invoke();
        int size = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i7);
            if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj), "Leading")) {
                break;
            }
            i7++;
        }
        InterfaceC16719e interfaceC16719e = (InterfaceC16719e) obj;
        if (interfaceC16719e != null) {
            i2 = AbstractC4107e.advert(i, interfaceC16719e.loadAd(Alert.DURATION_SHOW_INDEFINITELY));
            i3 = ((Number) function2.invoke(interfaceC16719e, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i8);
            if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj2), "Trailing")) {
                break;
            }
            i8++;
        }
        InterfaceC16719e interfaceC16719e2 = (InterfaceC16719e) obj2;
        if (interfaceC16719e2 != null) {
            i2 = AbstractC4107e.advert(i2, interfaceC16719e2.loadAd(Alert.DURATION_SHOW_INDEFINITELY));
            i4 = ((Number) function2.invoke(interfaceC16719e2, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i9);
            if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj3), "Label")) {
                break;
            }
            i9++;
        }
        InterfaceC16719e interfaceC16719e3 = (InterfaceC16719e) obj3;
        int intValue = interfaceC16719e3 != null ? ((Number) function2.invoke(interfaceC16719e3, Integer.valueOf(AbstractC15842e.adcel(i2, invoke, i)))).intValue() : 0;
        int size4 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i10);
            if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj4), "Prefix")) {
                break;
            }
            i10++;
        }
        InterfaceC16719e interfaceC16719e4 = (InterfaceC16719e) obj4;
        if (interfaceC16719e4 != null) {
            i5 = ((Number) function2.invoke(interfaceC16719e4, Integer.valueOf(i2))).intValue();
            i2 = AbstractC4107e.advert(i2, interfaceC16719e4.loadAd(Alert.DURATION_SHOW_INDEFINITELY));
        } else {
            i5 = 0;
        }
        int size5 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i11);
            if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj5), "Suffix")) {
                break;
            }
            i11++;
        }
        InterfaceC16719e interfaceC16719e5 = (InterfaceC16719e) obj5;
        if (interfaceC16719e5 != null) {
            i6 = ((Number) function2.invoke(interfaceC16719e5, Integer.valueOf(i2))).intValue();
            i2 = AbstractC4107e.advert(i2, interfaceC16719e5.loadAd(Alert.DURATION_SHOW_INDEFINITELY));
        } else {
            i6 = 0;
        }
        int size6 = list.size();
        int i12 = 0;
        while (i12 < size6) {
            Object obj8 = list.get(i12);
            if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj8), "TextField")) {
                int intValue2 = ((Number) function2.invoke(obj8, Integer.valueOf(i2))).intValue();
                int size7 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i13);
                    if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj6), "Hint")) {
                        break;
                    }
                    i13++;
                }
                InterfaceC16719e interfaceC16719e6 = (InterfaceC16719e) obj6;
                int intValue3 = interfaceC16719e6 != null ? ((Number) function2.invoke(interfaceC16719e6, Integer.valueOf(i2))).intValue() : 0;
                int size8 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i14);
                    if (AbstractC7890e.billing(AbstractC4107e.license((InterfaceC16719e) obj7), "Supporting")) {
                        break;
                    }
                    i14++;
                }
                InterfaceC16719e interfaceC16719e7 = (InterfaceC16719e) obj7;
                return c6970e.purchase(interfaceC0732e, i3, i4, i5, i6, intValue2, intValue, intValue3, interfaceC16719e7 != null ? ((Number) function2.invoke(interfaceC16719e7, Integer.valueOf(i))).intValue() : 0, AbstractC2278e.vip(0, 0, 0, 0, 15), invoke);
            }
            i12++;
            i6 = i6;
            c6970e = this;
            i5 = i5;
        }
        AbstractC17404e.vip("Collection contains no element matching the predicate.");
        throw new C14803e(9);
    }
}
