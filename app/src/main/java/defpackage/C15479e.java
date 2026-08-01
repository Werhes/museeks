package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15479e implements InterfaceC14306e {
    public final /* synthetic */ AbstractC16904e ad;
    public final /* synthetic */ InterfaceC4978e adcel;
    public final /* synthetic */ InterfaceC13730e appmetrica;
    public final /* synthetic */ Function0 billing;
    public final /* synthetic */ float license;
    public final /* synthetic */ InterfaceC12123e metrica;
    public final /* synthetic */ InterfaceC18435e mopub;
    public final /* synthetic */ Function0 purchase;
    public final /* synthetic */ InterfaceC3886e startapp;
    public final /* synthetic */ EnumC17426e vip;
    public final /* synthetic */ C14544e yandex;

    public C15479e(AbstractC16904e abstractC16904e, EnumC17426e enumC17426e, InterfaceC12123e interfaceC12123e, float f, InterfaceC13730e interfaceC13730e, InterfaceC9959e interfaceC9959e, Function0 function0, C14544e c14544e, InterfaceC3886e interfaceC3886e, InterfaceC4978e interfaceC4978e, InterfaceC18435e interfaceC18435e) {
        this.ad = abstractC16904e;
        this.vip = enumC17426e;
        this.metrica = interfaceC12123e;
        this.license = f;
        this.appmetrica = interfaceC13730e;
        this.purchase = interfaceC9959e;
        this.billing = function0;
        this.yandex = c14544e;
        this.startapp = interfaceC3886e;
        this.adcel = interfaceC4978e;
        this.mopub = interfaceC18435e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [eْۨٝ] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v66 */
    @Override // defpackage.InterfaceC14306e
    public final InterfaceC17242e ad(C14856e c14856e, long j) {
        int i;
        int i2;
        EnumC17426e enumC17426e;
        int i3;
        int i4;
        C3497e c3497e;
        int i5;
        C14544e c14544e;
        int i6;
        InterfaceC3886e interfaceC3886e;
        AbstractC16904e abstractC16904e;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        C12718e c12718e;
        int i19;
        int i20;
        int i21;
        C8518e c8518e;
        int i22;
        long j2;
        int i23;
        int i24;
        ArrayList arrayList;
        int i25;
        int i26;
        ArrayList arrayList2;
        int i27;
        List list;
        int i28;
        int i29;
        C8518e c8518e2;
        int i30;
        int i31;
        InterfaceC7183e interfaceC7183e;
        int i32;
        ArrayList arrayList3;
        EnumC17426e enumC17426e2;
        int i33;
        C12718e c12718e2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        Object obj;
        ArrayList arrayList9;
        InterfaceC4978e interfaceC4978e;
        int i34;
        int i35;
        int i36;
        ArrayList arrayList10;
        int i37;
        C14870e c14870e;
        C14856e c14856e2;
        int[] iArr;
        int i38;
        int i39;
        int i40;
        C14544e c14544e2;
        EnumC17426e enumC17426e3;
        int i41;
        InterfaceC3886e interfaceC3886e2;
        int i42;
        long j3;
        int i43;
        int i44;
        List list2;
        C15479e c15479e = this;
        InterfaceC7183e interfaceC7183e2 = c14856e.f29400e;
        AbstractC16904e abstractC16904e2 = c15479e.ad;
        abstractC16904e2.premium.getValue();
        EnumC17426e enumC17426e4 = c15479e.vip;
        EnumC17426e enumC17426e5 = EnumC17426e.f34146e;
        boolean z = enumC17426e4 == enumC17426e5;
        AbstractC11203e.vip(j, z ? enumC17426e5 : EnumC17426e.f34145e);
        InterfaceC12123e interfaceC12123e = c15479e.metrica;
        int mo493e = z ? interfaceC7183e2.mo493e(interfaceC12123e.vip(interfaceC7183e2.getLayoutDirection())) : interfaceC7183e2.mo493e(AbstractC12220e.billing(interfaceC12123e, interfaceC7183e2.getLayoutDirection()));
        int mo493e2 = z ? interfaceC7183e2.mo493e(interfaceC12123e.metrica(interfaceC7183e2.getLayoutDirection())) : interfaceC7183e2.mo493e(AbstractC12220e.purchase(interfaceC12123e, interfaceC7183e2.getLayoutDirection()));
        int mo493e3 = interfaceC7183e2.mo493e(interfaceC12123e.license());
        int mo493e4 = interfaceC7183e2.mo493e(interfaceC12123e.ad()) + mo493e3;
        int i45 = mo493e + mo493e2;
        int i46 = z ? mo493e4 : i45;
        if (z) {
            mo493e2 = mo493e3;
        } else if (!z) {
            mo493e2 = mo493e;
        }
        int i47 = i46 - mo493e2;
        boolean z2 = z;
        long startapp = AbstractC2278e.startapp(-i45, j, -mo493e4);
        abstractC16904e2.amazon = c14856e;
        long j4 = startapp;
        int mo493e5 = interfaceC7183e2.mo493e(c15479e.license);
        int billing = z2 ? C5602e.billing(j) - mo493e4 : C5602e.yandex(j) - i45;
        long j5 = (mo493e << 32) | (mo493e3 & 4294967295L);
        int vip = c15479e.appmetrica.vip(c14856e, billing);
        if (vip < 0) {
            vip = 0;
        }
        int yandex = enumC17426e4 == enumC17426e5 ? C5602e.yandex(j4) : vip;
        if (enumC17426e4 != enumC17426e5) {
            i = mo493e5;
            i2 = C5602e.billing(j4);
        } else {
            i = mo493e5;
            i2 = vip;
        }
        int i48 = billing;
        AbstractC2278e.vip(0, yandex, 0, i2, 5);
        C3497e c3497e2 = (C3497e) c15479e.purchase.invoke();
        int i49 = i48 + mo493e2 + i47;
        InterfaceC4978e interfaceC4978e2 = c15479e.adcel;
        AbstractC13717e adcel = AbstractC12640e.adcel();
        Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
        AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
        InterfaceC7183e interfaceC7183e3 = interfaceC7183e2;
        try {
            C8331e c8331e = abstractC16904e2.license;
            int purchase = ((C16330e) c8331e.f17056e).purchase();
            int license = AbstractC0259e.license(c3497e2, c8331e.f17055e, purchase);
            if (purchase != license) {
                enumC17426e = enumC17426e4;
                ((C16330e) c8331e.f17056e).startapp(license);
                ((C0705e) c8331e.f17058e).metrica(purchase);
            } else {
                enumC17426e = enumC17426e4;
            }
            ((C16330e) c8331e.f17056e).purchase();
            float purchase2 = ((C2616e) c8331e.f17053e).purchase();
            abstractC16904e2.advert();
            int i50 = vip + i;
            int appmetrica2 = AbstractC1561e.appmetrica(interfaceC4978e2.purchase(i49, vip, mo493e2, i47) - (purchase2 * i50));
            Unit unit = Unit.INSTANCE;
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
            List metrica = AbstractC8677e.metrica(c3497e2, abstractC16904e2.applovin, abstractC16904e2.tapsense);
            C3123e c3123e = AbstractC12146e.ad;
            C3123e c3123e2 = new C3123e();
            int intValue = ((Number) c15479e.billing.invoke()).intValue();
            InterfaceC3314e interfaceC3314e = abstractC16904e2.ads;
            if (mo493e2 < 0) {
                AbstractC8889e.ad("negative beforeContentPadding");
            }
            if (i47 < 0) {
                AbstractC8889e.ad("negative afterContentPadding");
            }
            int i51 = i50 < 0 ? 0 : i50;
            int i52 = i47;
            EnumC17426e enumC17426e6 = enumC17426e;
            int i53 = intValue < 0 ? intValue : 0;
            if (enumC17426e6 == enumC17426e5) {
                i3 = appmetrica2;
                i4 = C5602e.yandex(j4);
            } else {
                i3 = appmetrica2;
                i4 = vip;
            }
            if (enumC17426e6 != enumC17426e5) {
                c3497e = c3497e2;
                i5 = C5602e.billing(j4);
            } else {
                c3497e = c3497e2;
                i5 = vip;
            }
            List list3 = metrica;
            long vip2 = AbstractC2278e.vip(0, i4, 0, i5, 5);
            C9139e c9139e = C9139e.f18290e;
            InterfaceC4978e interfaceC4978e3 = c15479e.adcel;
            InterfaceC18435e interfaceC18435e = c15479e.mopub;
            if (intValue <= 0) {
                c14870e = new C14870e(vip, i, i52, enumC17426e6, -mo493e2, i48 + i52, i53, interfaceC4978e3, interfaceC7183e3.ads(AbstractC2278e.billing(C5602e.adcel(j4) + i45, j), AbstractC2278e.purchase(C5602e.startapp(j4) + mo493e4, j), c9139e, new C4526e(16)), interfaceC18435e, c14856e, vip2);
                c14856e2 = c14856e;
                abstractC16904e = abstractC16904e2;
            } else {
                int i54 = i53;
                int i55 = i;
                int i56 = license;
                while (i56 > 0 && i3 > 0) {
                    i56--;
                    i3 -= i51;
                }
                int i57 = i3 * (-1);
                if (i56 >= intValue) {
                    i56 = intValue - 1;
                    i57 = 0;
                }
                C12718e c12718e3 = new C12718e();
                int i58 = -mo493e2;
                int i59 = i58 + (i55 < 0 ? i55 : 0);
                int i60 = i57 + i59;
                int i61 = i51;
                int i62 = 0;
                while (true) {
                    c14544e = c15479e.yandex;
                    i6 = i54;
                    interfaceC3886e = c15479e.startapp;
                    if (i60 >= 0 || i56 <= 0) {
                        break;
                    }
                    int i63 = i56 - 1;
                    List list4 = list3;
                    int i64 = i50;
                    EnumC17426e enumC17426e7 = enumC17426e6;
                    C8518e appmetrica3 = AbstractC13406e.appmetrica(c14856e, i63, vip2, c3497e, j5, enumC17426e7, interfaceC3886e, c14544e, interfaceC7183e3.getLayoutDirection(), vip, c3123e2);
                    c12718e3.add(0, appmetrica3);
                    i62 = Math.max(i62, appmetrica3.startapp);
                    i60 += i61;
                    i56 = i63;
                    enumC17426e6 = enumC17426e7;
                    i50 = i64;
                    list3 = list4;
                    mo493e2 = mo493e2;
                    i52 = i52;
                    j4 = j4;
                    i55 = i55;
                    i49 = i49;
                    intValue = intValue;
                    i54 = i6;
                    c15479e = this;
                }
                int i65 = i55;
                int i66 = i52;
                int i67 = i49;
                int i68 = intValue;
                int i69 = mo493e2;
                List list5 = list3;
                long j6 = j4;
                abstractC16904e = abstractC16904e2;
                int i70 = i6;
                int i71 = i50;
                EnumC17426e enumC17426e8 = enumC17426e6;
                C3497e c3497e3 = c3497e;
                int i72 = i60;
                if (i72 < i59) {
                    i72 = i59;
                }
                int i73 = i72 - i59;
                int i74 = i62;
                int i75 = i48;
                int i76 = i75 + i66;
                int i77 = i76 < 0 ? 0 : i76;
                int i78 = i56;
                int i79 = -i73;
                int i80 = i59;
                long j7 = vip2;
                int i81 = i78;
                int i82 = 0;
                boolean z3 = false;
                while (i82 < c12718e3.f25459e) {
                    if (i79 >= i77) {
                        c12718e3.firebase(i82);
                        Unit unit2 = Unit.INSTANCE;
                        z3 = true;
                    } else {
                        i81++;
                        i79 += i61;
                        i82++;
                    }
                }
                boolean z4 = z3;
                int i83 = mo493e4;
                boolean z5 = z4;
                int i84 = i74;
                int i85 = i81;
                int i86 = i73;
                while (true) {
                    i7 = i68;
                    if (i85 >= i7) {
                        int i87 = i79;
                        i8 = i85;
                        i9 = i87;
                        break;
                    }
                    if (i79 >= i77 && i79 > 0 && !c12718e3.isEmpty()) {
                        int i88 = i85;
                        i9 = i79;
                        i8 = i88;
                        break;
                    }
                    int i89 = i77;
                    int i90 = i79;
                    int i91 = i84;
                    int i92 = i85;
                    i68 = i7;
                    int i93 = i75;
                    long j8 = j7;
                    int i94 = i80;
                    C8518e appmetrica4 = AbstractC13406e.appmetrica(c14856e, i92, j8, c3497e3, j5, enumC17426e8, interfaceC3886e, c14544e, interfaceC7183e3.getLayoutDirection(), vip, c3123e2);
                    int i95 = i68 - 1;
                    j7 = j8;
                    int i96 = i90 + (i92 == i95 ? vip : i61);
                    if (i96 > i94 || i92 == i95) {
                        i91 = Math.max(i91, appmetrica4.startapp);
                        c12718e3.addLast(appmetrica4);
                    } else {
                        i86 -= i61;
                        Unit unit3 = Unit.INSTANCE;
                        i78 = i92 + 1;
                        z5 = true;
                    }
                    i84 = i91;
                    i79 = i96;
                    i80 = i94;
                    i75 = i93;
                    i85 = i92 + 1;
                    i77 = i89;
                }
                int i97 = i84;
                int i98 = i7;
                if (i9 < i75) {
                    int i99 = i75 - i9;
                    int i100 = i9 + i99;
                    int i101 = i86 - i99;
                    int i102 = i69;
                    while (i101 < i102 && i78 > 0) {
                        i78--;
                        C8518e appmetrica5 = AbstractC13406e.appmetrica(c14856e, i78, j7, c3497e3, j5, enumC17426e8, interfaceC3886e, c14544e, interfaceC7183e3.getLayoutDirection(), vip, c3123e2);
                        c12718e3.add(0, appmetrica5);
                        i97 = Math.max(i97, appmetrica5.startapp);
                        i102 = i102;
                        i75 = i75;
                        i101 += i61;
                        i8 = i8;
                    }
                    i10 = i8;
                    int i103 = i101;
                    i11 = i75;
                    i12 = i102;
                    if (i103 < 0) {
                        int i104 = i100 + i103;
                        i14 = i97;
                        i15 = i104;
                        i13 = 0;
                    } else {
                        i13 = i103;
                        i14 = i97;
                        i15 = i100;
                    }
                } else {
                    i10 = i8;
                    i11 = i75;
                    i12 = i69;
                    i13 = i86;
                    i14 = i97;
                    i15 = i9;
                }
                if (i13 < 0) {
                    AbstractC8889e.ad("invalid currentFirstPageScrollOffset");
                }
                int i105 = -i13;
                C8518e c8518e3 = (C8518e) c12718e3.first();
                if (i12 > 0 || i65 < 0) {
                    int subs = c12718e3.subs();
                    int i106 = 0;
                    while (i106 < subs && i13 != 0) {
                        i16 = i12;
                        i17 = i61;
                        i18 = i13;
                        if (i17 > i13 || i106 == AbstractC6874e.billing(c12718e3)) {
                            break;
                        }
                        i13 = i18 - i17;
                        i106++;
                        c8518e3 = (C8518e) c12718e3.get(i106);
                        i61 = i17;
                        i12 = i16;
                    }
                }
                i18 = i13;
                i16 = i12;
                i17 = i61;
                int max = Math.max(0, i78 - i70);
                int i107 = 1;
                int i108 = i78 - 1;
                if (max <= i108) {
                    ArrayList arrayList11 = null;
                    while (true) {
                        if (arrayList11 == null) {
                            arrayList11 = new ArrayList();
                        }
                        i19 = i15;
                        i20 = max;
                        i21 = i105;
                        c8518e = c8518e3;
                        int i109 = i108;
                        i22 = i17;
                        j2 = j7;
                        i23 = i70;
                        arrayList = arrayList11;
                        c12718e = c12718e3;
                        i24 = i107;
                        arrayList.add(AbstractC13406e.appmetrica(c14856e, i109, j2, c3497e3, j5, enumC17426e8, interfaceC3886e, c14544e, interfaceC7183e3.getLayoutDirection(), vip, c3123e2));
                        if (i109 == i20) {
                            break;
                        }
                        int i110 = i109 - 1;
                        i107 = i24;
                        j7 = j2;
                        arrayList11 = arrayList;
                        c12718e3 = c12718e;
                        i105 = i21;
                        c8518e3 = c8518e;
                        i17 = i22;
                        i70 = i23;
                        i108 = i110;
                        max = i20;
                        i15 = i19;
                    }
                } else {
                    c12718e = c12718e3;
                    i19 = i15;
                    i20 = max;
                    i21 = i105;
                    c8518e = c8518e3;
                    i22 = i17;
                    j2 = j7;
                    i23 = i70;
                    i24 = 1;
                    arrayList = null;
                }
                int size = list5.size();
                ArrayList arrayList12 = arrayList;
                int i111 = 0;
                while (i111 < size) {
                    List list6 = list5;
                    int i112 = i24;
                    int intValue2 = ((Number) list6.get(i111)).intValue();
                    if (intValue2 < i20) {
                        if (arrayList12 == null) {
                            arrayList12 = new ArrayList();
                        }
                        i43 = i20;
                        ArrayList arrayList13 = arrayList12;
                        list2 = list6;
                        i44 = size;
                        arrayList13.add(AbstractC13406e.appmetrica(c14856e, intValue2, j2, c3497e3, j5, enumC17426e8, interfaceC3886e, c14544e, interfaceC7183e3.getLayoutDirection(), vip, c3123e2));
                        arrayList12 = arrayList13;
                    } else {
                        i43 = i20;
                        i44 = size;
                        list2 = list6;
                    }
                    i111++;
                    size = i44;
                    i20 = i43;
                    list5 = list2;
                    i24 = i112;
                }
                int i113 = i24;
                List list7 = list5;
                Object obj2 = C13664e.f27089e;
                ArrayList arrayList14 = arrayList12 == null ? obj2 : arrayList12;
                int size2 = arrayList14.size();
                int i114 = i14;
                int i115 = 0;
                while (i115 < size2) {
                    i114 = Math.max(i114, ((C8518e) arrayList14.get(i115)).startapp);
                    i115++;
                    obj2 = obj2;
                }
                ArrayList arrayList15 = obj2;
                int i116 = ((C8518e) c12718e.last()).ad;
                int i117 = i23;
                int min = Math.min(i117, (i98 - i116) - 1) + i116;
                int i118 = i116 + 1;
                if (i118 <= min) {
                    List list8 = null;
                    while (true) {
                        if (list8 == null) {
                            list8 = new ArrayList();
                        }
                        int i119 = i118;
                        list = list8;
                        i26 = i114;
                        i25 = i117;
                        arrayList2 = arrayList14;
                        i27 = min;
                        list.add(AbstractC13406e.appmetrica(c14856e, i119, j2, c3497e3, j5, enumC17426e8, interfaceC3886e, c14544e, interfaceC7183e3.getLayoutDirection(), vip, c3123e2));
                        if (i119 == i27) {
                            break;
                        }
                        i114 = i26;
                        i117 = i25;
                        list8 = list;
                        i118 = i119 + 1;
                        min = i27;
                        arrayList14 = arrayList2;
                    }
                } else {
                    i25 = i117;
                    i26 = i114;
                    arrayList2 = arrayList14;
                    i27 = min;
                    list = null;
                }
                int size3 = list7.size();
                int i120 = 0;
                while (i120 < size3) {
                    int intValue3 = ((Number) list7.get(i120)).intValue();
                    List list9 = list7;
                    if (i27 + 1 <= intValue3) {
                        i38 = i98;
                        if (intValue3 < i38) {
                            if (list == null) {
                                list = new ArrayList();
                            }
                            i40 = i120;
                            i39 = size3;
                            C8518e appmetrica6 = AbstractC13406e.appmetrica(c14856e, intValue3, j2, c3497e3, j5, enumC17426e8, interfaceC3886e, c14544e, interfaceC7183e3.getLayoutDirection(), vip, c3123e2);
                            c14544e2 = c14544e;
                            enumC17426e3 = enumC17426e8;
                            i41 = i18;
                            long j9 = j2;
                            interfaceC3886e2 = interfaceC3886e;
                            i42 = i83;
                            j3 = j9;
                            list.add(appmetrica6);
                            i120 = i40 + 1;
                            int i121 = i42;
                            interfaceC3886e = interfaceC3886e2;
                            j2 = j3;
                            i83 = i121;
                            i98 = i38;
                            i18 = i41;
                            enumC17426e8 = enumC17426e3;
                            list7 = list9;
                            c14544e = c14544e2;
                            size3 = i39;
                        }
                    } else {
                        i38 = i98;
                    }
                    i39 = size3;
                    i40 = i120;
                    c14544e2 = c14544e;
                    enumC17426e3 = enumC17426e8;
                    i41 = i18;
                    long j10 = j2;
                    interfaceC3886e2 = interfaceC3886e;
                    i42 = i83;
                    j3 = j10;
                    i120 = i40 + 1;
                    int i1212 = i42;
                    interfaceC3886e = interfaceC3886e2;
                    j2 = j3;
                    i83 = i1212;
                    i98 = i38;
                    i18 = i41;
                    enumC17426e8 = enumC17426e3;
                    list7 = list9;
                    c14544e = c14544e2;
                    size3 = i39;
                }
                EnumC17426e enumC17426e9 = enumC17426e8;
                int i122 = i83;
                int i123 = i18;
                int i124 = i98;
                long j11 = j2;
                if (list == null) {
                    list = arrayList15;
                }
                int size4 = list.size();
                int i125 = i26;
                for (int i126 = 0; i126 < size4; i126++) {
                    i125 = Math.max(i125, ((C8518e) list.get(i126)).startapp);
                }
                C8518e c8518e4 = c8518e;
                int i127 = (AbstractC7890e.billing(c8518e4, c12718e.first()) && arrayList2.isEmpty() && list.isEmpty()) ? i113 : 0;
                int billing2 = AbstractC2278e.billing(enumC17426e9 == enumC17426e5 ? i125 : i19, j6);
                if (enumC17426e9 == enumC17426e5) {
                    i125 = i19;
                }
                int purchase3 = AbstractC2278e.purchase(i125, j6);
                int i128 = enumC17426e9 == enumC17426e5 ? purchase3 : billing2;
                int i129 = i11;
                int i130 = i19;
                int i131 = i130 < Math.min(i128, i129) ? i113 : 0;
                if (i131 == 0 || i21 == 0) {
                    i28 = i129;
                    i29 = i21;
                } else {
                    i28 = i129;
                    StringBuilder sb = new StringBuilder("non-zero pagesScrollOffset=");
                    i29 = i21;
                    sb.append(i29);
                    AbstractC8889e.metrica(sb.toString());
                }
                int i132 = i29;
                ArrayList arrayList16 = new ArrayList(list.size() + arrayList2.size() + c12718e.subs());
                if (i131 != 0) {
                    if (!arrayList2.isEmpty() || !list.isEmpty()) {
                        AbstractC8889e.ad("No extra pages");
                    }
                    int subs2 = c12718e.subs();
                    int[] iArr2 = new int[subs2];
                    int i133 = i128;
                    for (int i134 = 0; i134 < subs2; i134++) {
                        iArr2[i134] = vip;
                    }
                    int[] iArr3 = new int[subs2];
                    c8518e2 = c8518e4;
                    C13964e c13964e = new C13964e(interfaceC7183e3.mo496final(i65), false, null);
                    EnumC7792e enumC7792e = EnumC7792e.f15794e;
                    if (enumC17426e9 == enumC17426e5) {
                        arrayList3 = arrayList16;
                        iArr = iArr3;
                        i30 = i123;
                        i31 = i122;
                        interfaceC7183e = interfaceC7183e3;
                        i32 = i28;
                        enumC17426e2 = enumC17426e9;
                        i33 = i130;
                        c13964e.tapsense(c14856e, i133, iArr2, enumC7792e, iArr);
                    } else {
                        arrayList3 = arrayList16;
                        iArr = iArr3;
                        i30 = i123;
                        i31 = i122;
                        interfaceC7183e = interfaceC7183e3;
                        i32 = i28;
                        enumC17426e2 = enumC17426e9;
                        i33 = i130;
                        c13964e.tapsense(c14856e, i133, iArr2, enumC7792e, iArr);
                    }
                    C15926e premium = AbstractC1660e.premium(iArr);
                    int i135 = premium.f22523e;
                    int i136 = premium.f22522e;
                    int i137 = premium.f22521e;
                    if ((i137 > 0 && i135 <= i136) || (i137 < 0 && i136 <= i135)) {
                        while (true) {
                            int i138 = iArr[i135];
                            c12718e2 = c12718e;
                            int i139 = i137;
                            C8518e c8518e5 = (C8518e) c12718e2.get(i135);
                            c8518e5.vip(i138, billing2, purchase3);
                            arrayList3.add(c8518e5);
                            if (i135 == i136) {
                                break;
                            }
                            i135 += i139;
                            i137 = i139;
                            c12718e = c12718e2;
                        }
                    } else {
                        c12718e2 = c12718e;
                    }
                    arrayList4 = arrayList2;
                } else {
                    c8518e2 = c8518e4;
                    i30 = i123;
                    i31 = i122;
                    interfaceC7183e = interfaceC7183e3;
                    i32 = i28;
                    arrayList3 = arrayList16;
                    enumC17426e2 = enumC17426e9;
                    i33 = i130;
                    c12718e2 = c12718e;
                    int size5 = arrayList2.size();
                    int i140 = i132;
                    for (int i141 = 0; i141 < size5; i141++) {
                        C8518e c8518e6 = (C8518e) arrayList2.get(i141);
                        i140 -= i71;
                        c8518e6.vip(i140, billing2, purchase3);
                        arrayList3.add(c8518e6);
                    }
                    arrayList4 = arrayList2;
                    int subs3 = c12718e2.subs();
                    int i142 = i132;
                    for (int i143 = 0; i143 < subs3; i143++) {
                        C8518e c8518e7 = (C8518e) c12718e2.get(i143);
                        c8518e7.vip(i142, billing2, purchase3);
                        arrayList3.add(c8518e7);
                        i142 += i71;
                    }
                    int size6 = list.size();
                    for (int i144 = 0; i144 < size6; i144++) {
                        C8518e c8518e8 = (C8518e) list.get(i144);
                        c8518e8.vip(i142, billing2, purchase3);
                        arrayList3.add(c8518e8);
                        i142 += i71;
                    }
                }
                if (i127 != 0) {
                    arrayList5 = arrayList3;
                } else {
                    ArrayList arrayList17 = new ArrayList(arrayList3.size());
                    int size7 = arrayList3.size();
                    int i145 = 0;
                    while (i145 < size7) {
                        Object obj3 = arrayList3.get(i145);
                        C8518e c8518e9 = (C8518e) obj3;
                        List list10 = list;
                        int i146 = size7;
                        if (c8518e9.ad >= ((C8518e) c12718e2.first()).ad && c8518e9.ad <= ((C8518e) c12718e2.last()).ad) {
                            arrayList17.add(obj3);
                        }
                        i145++;
                        list = list10;
                        size7 = i146;
                    }
                    arrayList5 = arrayList17;
                }
                List list11 = list;
                if (arrayList4.isEmpty()) {
                    arrayList6 = arrayList15;
                } else {
                    arrayList6 = new ArrayList(arrayList3.size());
                    int size8 = arrayList3.size();
                    for (int i147 = 0; i147 < size8; i147++) {
                        Object obj4 = arrayList3.get(i147);
                        if (((C8518e) obj4).ad < ((C8518e) c12718e2.first()).ad) {
                            arrayList6.add(obj4);
                        }
                    }
                }
                if (list11.isEmpty()) {
                    arrayList7 = arrayList6;
                    arrayList8 = arrayList15;
                } else {
                    ArrayList arrayList18 = new ArrayList(arrayList3.size());
                    int size9 = arrayList3.size();
                    int i148 = 0;
                    ArrayList arrayList19 = arrayList6;
                    while (i148 < size9) {
                        Object obj5 = arrayList3.get(i148);
                        ArrayList arrayList20 = arrayList19;
                        if (((C8518e) obj5).ad > ((C8518e) c12718e2.last()).ad) {
                            arrayList18.add(obj5);
                        }
                        i148++;
                        arrayList19 = arrayList20;
                    }
                    arrayList7 = arrayList19;
                    arrayList8 = arrayList18;
                }
                if (arrayList5.isEmpty()) {
                    arrayList9 = arrayList8;
                    arrayList10 = arrayList5;
                    i37 = purchase3;
                    interfaceC4978e = interfaceC4978e3;
                    i34 = i16;
                    i35 = i66;
                    i36 = i67;
                    obj = null;
                } else {
                    obj = arrayList5.get(0);
                    arrayList9 = arrayList8;
                    interfaceC4978e = interfaceC4978e3;
                    i34 = i16;
                    i35 = i66;
                    i36 = i67;
                    float f = -Math.abs(((C8518e) obj).mopub - interfaceC4978e.purchase(i36, vip, i34, i35));
                    int billing3 = AbstractC6874e.billing(arrayList5);
                    if (i113 <= billing3) {
                        float f2 = f;
                        Object obj6 = obj;
                        int i149 = 1;
                        while (true) {
                            Object obj7 = arrayList5.get(i149);
                            arrayList10 = arrayList5;
                            i37 = purchase3;
                            float f3 = -Math.abs(((C8518e) obj7).mopub - interfaceC4978e.purchase(i36, vip, i34, i35));
                            if (Float.compare(f2, f3) < 0) {
                                f2 = f3;
                                obj6 = obj7;
                            }
                            if (i149 == billing3) {
                                break;
                            }
                            i149++;
                            arrayList5 = arrayList10;
                            purchase3 = i37;
                        }
                        obj = obj6;
                    } else {
                        arrayList10 = arrayList5;
                        i37 = purchase3;
                    }
                }
                C8518e c8518e10 = (C8518e) obj;
                interfaceC7183e3 = interfaceC7183e;
                c14870e = new C14870e(arrayList10, vip, i65, i35, enumC17426e2, i58, i76, i25, c8518e2, c8518e10, i22 == 0 ? 0.0f : AbstractC3062e.vip((interfaceC4978e.purchase(i36, vip, i34, i35) - (c8518e10 != null ? c8518e10.mopub : 0)) / i22, -0.5f, 0.5f), i30, i10 < i124 || i33 > i32, interfaceC4978e, interfaceC7183e.ads(AbstractC2278e.billing(billing2 + i45, j), AbstractC2278e.purchase(i37 + i31, j), c9139e, new C10869e(interfaceC3314e, arrayList3, 23)), z5, arrayList7, arrayList9, interfaceC18435e, c14856e, j11);
                c14856e2 = c14856e;
            }
            AbstractC16904e abstractC16904e3 = abstractC16904e;
            abstractC16904e3.yandex(c14870e, interfaceC7183e3.mo398transient(), false);
            C4571e c4571e = abstractC16904e3.signatures;
            List list12 = c14870e.ad;
            Trace.beginSection("compose:pager:cache_window:keepAroundItems");
            try {
                if (c4571e.vip() && !list12.isEmpty()) {
                    int i150 = ((C8518e) AbstractC13480e.m3591interface(list12)).ad;
                    int i151 = ((C8518e) AbstractC13480e.m3570break(list12)).ad;
                    for (int i152 = c4571e.yandex; i152 < i150; i152++) {
                        c14856e2.ad(i152);
                    }
                    int i153 = i151 + 1;
                    int i154 = c4571e.startapp;
                    if (i153 <= i154) {
                        while (true) {
                            c14856e2.ad(i153);
                            if (i153 == i154) {
                                break;
                            }
                            i153++;
                        }
                    }
                }
                Unit unit4 = Unit.INSTANCE;
                Trace.endSection();
                return c14870e;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
            throw th2;
        }
    }
}
