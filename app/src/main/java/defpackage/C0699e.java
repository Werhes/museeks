package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۦؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0699e implements InterfaceC0929e, InterfaceC18089e {
    public final InterfaceC10260e ad;
    public final float appmetrica;
    public final C6682e billing;
    public final C7560e license;
    public final float metrica;
    public final int purchase;
    public final InterfaceC6428e vip;

    public C0699e(InterfaceC10260e interfaceC10260e, InterfaceC6428e interfaceC6428e, float f, C7560e c7560e, float f2, int i, C6682e c6682e) {
        this.ad = interfaceC10260e;
        this.vip = interfaceC6428e;
        this.metrica = f;
        this.license = c7560e;
        this.appmetrica = f2;
        this.purchase = i;
        this.billing = c6682e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int mopub(List list, int i, int i2, int i3, int i4, C6682e c6682e) {
        long ad;
        int i5 = 0;
        if (list.isEmpty()) {
            ad = C18059e.ad(0, 0);
        } else {
            int i6 = Alert.DURATION_SHOW_INDEFINITELY;
            C10049e c10049e = new C10049e(i4, c6682e, AbstractC2278e.ad(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY), i2, i3);
            InterfaceC16719e interfaceC16719e = (InterfaceC16719e) AbstractC13480e.m3592native(0, list);
            int mo2529while = interfaceC16719e != null ? interfaceC16719e.mo2529while(i) : 0;
            int smaato = interfaceC16719e != null ? interfaceC16719e.smaato(mo2529while) : 0;
            int i7 = 0;
            if (c10049e.vip(list.size() > 1, 0, C18059e.ad(i, Alert.DURATION_SHOW_INDEFINITELY), interfaceC16719e == null ? null : new C18059e(C18059e.ad(smaato, mo2529while)), 0, 0, 0, false, false).f8154e) {
                C18059e ad2 = c6682e.ad(0, 0, interfaceC16719e != null);
                ad = C18059e.ad(ad2 != null ? (int) (ad2.ad & 4294967295L) : 0, 0);
            } else {
                int size = list.size();
                int i8 = i;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i9 >= size) {
                        break;
                    }
                    int i14 = i8 - smaato;
                    int i15 = i9 + 1;
                    int max = Math.max(i13, mo2529while);
                    InterfaceC16719e interfaceC16719e2 = (InterfaceC16719e) AbstractC13480e.m3592native(i15, list);
                    int mo2529while2 = interfaceC16719e2 != null ? interfaceC16719e2.mo2529while(i) : i5;
                    int smaato2 = interfaceC16719e2 != null ? interfaceC16719e2.smaato(mo2529while2) + i2 : i5;
                    int i16 = i15 - i11;
                    boolean z = i9 + 2 < list.size() ? 1 : i5;
                    int i17 = i12;
                    int i18 = mo2529while2;
                    int i19 = smaato2;
                    C3613e vip = c10049e.vip(z, i16, C18059e.ad(i14, i6), interfaceC16719e2 == null ? null : new C18059e(C18059e.ad(smaato2, mo2529while2)), i17, i7, max, false, false);
                    if (vip.f8155e) {
                        int i20 = max + i3 + i7;
                        C3284e ad3 = c10049e.ad(vip, interfaceC16719e2 != null, i17, i20, i14, i16);
                        int i21 = i19 - i2;
                        i12 = i17 + 1;
                        if (vip.f8154e) {
                            if (ad3 != null) {
                                long j = ad3.metrica;
                                if (!ad3.license) {
                                    i20 += ((int) (j & 4294967295L)) + i3;
                                }
                            }
                            i7 = i20;
                            i10 = i15;
                        } else {
                            i11 = i15;
                            i7 = i20;
                            smaato = i21;
                            i13 = 0;
                            i8 = i;
                        }
                    } else {
                        smaato = i19;
                        i8 = i14;
                        i12 = i17;
                        i13 = max;
                    }
                    i9 = i15;
                    i10 = i9;
                    mo2529while = i18;
                    i6 = Alert.DURATION_SHOW_INDEFINITELY;
                    i5 = 0;
                }
                ad = C18059e.ad(i7 - i3, i10);
            }
        }
        return (int) (ad >> 32);
    }

    @Override // defpackage.InterfaceC0929e
    public final int ad(InterfaceC0732e interfaceC0732e, List list, int i) {
        List list2 = (List) AbstractC13480e.m3592native(1, list);
        InterfaceC16719e interfaceC16719e = list2 != null ? (InterfaceC16719e) AbstractC13480e.m3604this(list2) : null;
        List list3 = (List) AbstractC13480e.m3592native(2, list);
        this.billing.vip(interfaceC16719e, list3 != null ? (InterfaceC16719e) AbstractC13480e.m3604this(list3) : null, AbstractC2278e.vip(0, 0, 0, i, 7));
        List list4 = (List) AbstractC13480e.m3604this(list);
        if (list4 == null) {
            list4 = C13664e.f27089e;
        }
        int mo493e = interfaceC0732e.mo493e(this.metrica);
        int size = list4.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < size) {
            int loadAd = ((InterfaceC16719e) list4.get(i2)).loadAd(i) + mo493e;
            int i6 = i2 + 1;
            if (i6 - i4 == this.purchase || i6 == list4.size()) {
                i3 = Math.max(i3, (i5 + loadAd) - mo493e);
                i4 = i2;
                i5 = 0;
            } else {
                i5 += loadAd;
            }
            i2 = i6;
        }
        return i3;
    }

    @Override // defpackage.InterfaceC18089e
    public final int adcel(AbstractC2832e abstractC2832e) {
        return abstractC2832e.mo1206break();
    }

    @Override // defpackage.InterfaceC0929e
    public final int appmetrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        List list2 = (List) AbstractC13480e.m3592native(1, list);
        InterfaceC16719e interfaceC16719e = list2 != null ? (InterfaceC16719e) AbstractC13480e.m3604this(list2) : null;
        List list3 = (List) AbstractC13480e.m3592native(2, list);
        this.billing.vip(interfaceC16719e, list3 != null ? (InterfaceC16719e) AbstractC13480e.m3604this(list3) : null, AbstractC2278e.vip(0, i, 0, 0, 13));
        List list4 = (List) AbstractC13480e.m3604this(list);
        if (list4 == null) {
            list4 = C13664e.f27089e;
        }
        return mopub(list4, i, interfaceC0732e.mo493e(this.metrica), interfaceC0732e.mo493e(this.appmetrica), this.purchase, this.billing);
    }

    @Override // defpackage.InterfaceC18089e
    public final long billing(int i, int i2, int i3, boolean z) {
        C8587e c8587e = AbstractC6451e.ad;
        return !z ? AbstractC2278e.ad(i, i2, 0, i3) : AbstractC15118e.license(i, i2, 0, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0699e)) {
            return false;
        }
        C0699e c0699e = (C0699e) obj;
        return this.ad.equals(c0699e.ad) && this.vip.equals(c0699e.vip) && C15765e.vip(this.metrica, c0699e.metrica) && this.license.equals(c0699e.license) && C15765e.vip(this.appmetrica, c0699e.appmetrica) && this.purchase == c0699e.purchase && AbstractC7890e.billing(this.billing, c0699e.billing);
    }

    public final int hashCode() {
        return this.billing.hashCode() + ((((AbstractC1414e.license((this.license.hashCode() + AbstractC1414e.license((this.vip.hashCode() + ((this.ad.hashCode() + 38161) * 31)) * 31, this.metrica, 31)) * 31, this.appmetrica, 31) + this.purchase) * 31) + Alert.DURATION_SHOW_INDEFINITELY) * 31);
    }

    @Override // defpackage.InterfaceC0929e
    public final int license(InterfaceC0732e interfaceC0732e, List list, int i) {
        List list2 = (List) AbstractC13480e.m3592native(1, list);
        InterfaceC16719e interfaceC16719e = list2 != null ? (InterfaceC16719e) AbstractC13480e.m3604this(list2) : null;
        List list3 = (List) AbstractC13480e.m3592native(2, list);
        this.billing.vip(interfaceC16719e, list3 != null ? (InterfaceC16719e) AbstractC13480e.m3604this(list3) : null, AbstractC2278e.vip(0, i, 0, 0, 13));
        List list4 = (List) AbstractC13480e.m3604this(list);
        if (list4 == null) {
            list4 = C13664e.f27089e;
        }
        return mopub(list4, i, interfaceC0732e.mo493e(this.metrica), interfaceC0732e.mo493e(this.appmetrica), this.purchase, this.billing);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC0929e
    public final int metrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        int i2;
        int[] iArr;
        int i3;
        List list2;
        int i4;
        long ad;
        C18059e c18059e;
        C0699e c0699e = this;
        int i5 = 1;
        List list3 = (List) AbstractC13480e.m3592native(1, list);
        InterfaceC16719e interfaceC16719e = list3 != null ? (InterfaceC16719e) AbstractC13480e.m3604this(list3) : null;
        List list4 = (List) AbstractC13480e.m3592native(2, list);
        int i6 = 0;
        c0699e.billing.vip(interfaceC16719e, list4 != null ? (InterfaceC16719e) AbstractC13480e.m3604this(list4) : null, AbstractC2278e.vip(0, 0, 0, i, 7));
        List list5 = (List) AbstractC13480e.m3604this(list);
        if (list5 == null) {
            list5 = C13664e.f27089e;
        }
        int mo493e = interfaceC0732e.mo493e(c0699e.metrica);
        int mo493e2 = interfaceC0732e.mo493e(c0699e.appmetrica);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        int size3 = list5.size();
        for (int i7 = 0; i7 < size3; i7++) {
            InterfaceC16719e interfaceC16719e2 = (InterfaceC16719e) list5.get(i7);
            int smaato = interfaceC16719e2.smaato(i);
            iArr2[i7] = smaato;
            iArr3[i7] = interfaceC16719e2.mo2529while(smaato);
        }
        int size4 = list5.size();
        C6682e c6682e = c0699e.billing;
        int i8 = Alert.DURATION_SHOW_INDEFINITELY;
        if (Integer.MAX_VALUE < size4) {
            c6682e.getClass();
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            c6682e.getClass();
        }
        int min = Math.min(Alert.DURATION_SHOW_INDEFINITELY, list5.size());
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += iArr2[i10];
        }
        int size5 = ((list5.size() - 1) * mo493e) + i9;
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i11 = iArr3[0];
        int i12 = size2 - 1;
        if (1 <= i12) {
            int i13 = 1;
            while (true) {
                int i14 = iArr3[i13];
                if (i11 < i14) {
                    i11 = i14;
                }
                if (i13 == i12) {
                    break;
                }
                i13++;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i15 = iArr2[0];
        int i16 = size - 1;
        if (1 <= i16) {
            int i17 = 1;
            while (true) {
                int i18 = iArr2[i17];
                if (i15 < i18) {
                    i15 = i18;
                }
                if (i17 == i16) {
                    break;
                }
                i17++;
            }
        }
        int i19 = size5;
        while (i15 <= i19 && i11 != i) {
            int i20 = (i15 + i19) / 2;
            if (list5.isEmpty()) {
                ad = C18059e.ad(i6, i6);
                list2 = list5;
                iArr = iArr2;
                i2 = min;
                i3 = i19;
            } else {
                i2 = min;
                C10049e c10049e = new C10049e(c0699e.purchase, c6682e, AbstractC2278e.ad(i6, i20, i6, i8), mo493e, mo493e2);
                InterfaceC16719e interfaceC16719e3 = (InterfaceC16719e) AbstractC13480e.m3592native(i6, list5);
                int i21 = interfaceC16719e3 != null ? iArr3[i6] : i6;
                int i22 = interfaceC16719e3 != null ? iArr2[i6] : i6;
                iArr = iArr2;
                int i23 = 0;
                int i24 = 0;
                if (c10049e.vip(list5.size() > i5 ? i5 : i6, 0, C18059e.ad(i20, Alert.DURATION_SHOW_INDEFINITELY), interfaceC16719e3 == null ? null : new C18059e(C18059e.ad(i22, i21)), 0, 0, 0, false, false).f8154e) {
                    C18059e ad2 = c6682e.ad(i6, i6, interfaceC16719e3 != null ? 1 : i6);
                    ad = C18059e.ad(ad2 != null ? (int) (ad2.ad & 4294967295L) : i6, i6);
                    i3 = i19;
                    list2 = list5;
                } else {
                    int size6 = list5.size();
                    int i25 = i20;
                    int i26 = i6;
                    int i27 = i26;
                    int i28 = i27;
                    int i29 = 0;
                    while (true) {
                        if (i26 >= size6) {
                            i3 = i19;
                            list2 = list5;
                            i4 = i27;
                            break;
                        }
                        i25 -= i22;
                        i4 = i26 + 1;
                        int max = Math.max(i29, i21);
                        InterfaceC16719e interfaceC16719e4 = (InterfaceC16719e) AbstractC13480e.m3592native(i4, list5);
                        i21 = interfaceC16719e4 != null ? iArr3[i4] : i6;
                        if (interfaceC16719e4 != null) {
                            i6 = iArr[i4] + mo493e;
                        }
                        boolean z = i26 + 2 < list5.size();
                        int i30 = i4 - i28;
                        long ad3 = C18059e.ad(i25, Alert.DURATION_SHOW_INDEFINITELY);
                        if (interfaceC16719e4 == null) {
                            i3 = i19;
                            list2 = list5;
                            c18059e = null;
                        } else {
                            i3 = i19;
                            list2 = list5;
                            c18059e = new C18059e(C18059e.ad(i6, i21));
                        }
                        C3613e vip = c10049e.vip(z, i30, ad3, c18059e, i23, i24, max, false, false);
                        if (vip.f8155e) {
                            int i31 = max + mo493e2 + i24;
                            int i32 = i23;
                            C3284e ad4 = c10049e.ad(vip, interfaceC16719e4 != null, i32, i31, i25, i30);
                            i6 -= mo493e;
                            i23 = i32 + 1;
                            if (vip.f8154e) {
                                if (ad4 != null) {
                                    long j = ad4.metrica;
                                    if (!ad4.license) {
                                        i31 = ((int) (j & 4294967295L)) + mo493e2 + i31;
                                    }
                                }
                                i24 = i31;
                            } else {
                                i25 = i20;
                                i28 = i4;
                                i24 = i31;
                                i29 = 0;
                            }
                        } else {
                            i29 = max;
                        }
                        i19 = i3;
                        i26 = i4;
                        i27 = i26;
                        list5 = list2;
                        i22 = i6;
                        i6 = 0;
                    }
                    ad = C18059e.ad(i24 - mo493e2, i4);
                }
            }
            int i33 = (int) (ad >> 32);
            int i34 = (int) (ad & 4294967295L);
            if (i33 > i || i34 < i2) {
                i15 = i20 + 1;
                if (i15 > i3) {
                    return i15;
                }
                iArr2 = iArr;
                i11 = i33;
                size5 = i20;
                i19 = i3;
                list5 = list2;
                i5 = 1;
                i6 = 0;
                i8 = Alert.DURATION_SHOW_INDEFINITELY;
                c0699e = this;
                min = i2;
            } else {
                if (i33 >= i) {
                    return i20;
                }
                i19 = i20 - 1;
                iArr2 = iArr;
                i11 = i33;
                size5 = i20;
                min = i2;
                list5 = list2;
                i5 = 1;
                i6 = 0;
                i8 = Alert.DURATION_SHOW_INDEFINITELY;
                c0699e = this;
            }
        }
        return size5;
    }

    @Override // defpackage.InterfaceC18089e
    public final void purchase(int i, int[] iArr, int[] iArr2, InterfaceC13158e interfaceC13158e) {
        this.ad.tapsense(interfaceC13158e, i, iArr, interfaceC13158e.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.InterfaceC18089e
    public final int startapp(AbstractC2832e abstractC2832e) {
        return abstractC2832e.mo1209protected();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=");
        sb.append(this.ad);
        sb.append(", verticalArrangement=");
        sb.append(this.vip);
        sb.append(", mainAxisSpacing=");
        AbstractC10257e.admob(this.metrica, sb, ", crossAxisAlignment=");
        sb.append(this.license);
        sb.append(", crossAxisArrangementSpacing=");
        AbstractC10257e.admob(this.appmetrica, sb, ", maxItemsInMainAxis=");
        sb.append(this.purchase);
        sb.append(", maxLines=2147483647, overflow=");
        sb.append(this.billing);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03e1 A[LOOP:1: B:106:0x03df->B:107:0x03e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0284 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.InterfaceC0929e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.InterfaceC17242e vip(defpackage.InterfaceC13158e r53, java.util.List r54, long r55) {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0699e.vip(eٍْٕ, java.util.List, long):eٗۚ");
    }

    @Override // defpackage.InterfaceC18089e
    public final InterfaceC17242e yandex(final AbstractC2832e[] abstractC2832eArr, InterfaceC13158e interfaceC13158e, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final EnumC7792e enumC7792e = EnumC7792e.f15794e;
        return interfaceC13158e.ads(i, i2, C9139e.f18290e, new Function1() { // from class: eّۣۚ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AbstractC11750e abstractC11750e;
                AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
                int[] iArr3 = iArr2;
                int i6 = iArr3 != null ? iArr3[i3] : 0;
                int i7 = i4;
                for (int i8 = i7; i8 < i5; i8++) {
                    AbstractC2832e abstractC2832e = abstractC2832eArr[i8];
                    Object signatures = abstractC2832e.signatures();
                    C11249e c11249e = signatures instanceof C11249e ? (C11249e) signatures : null;
                    if (c11249e == null || (abstractC11750e = c11249e.metrica) == null) {
                        abstractC11750e = this.license;
                    }
                    abstractC3698e.billing(abstractC2832e, iArr[i8 - i7], abstractC11750e.license(i2, abstractC2832e.mo1209protected(), enumC7792e) + i6, 0.0f);
                }
                return Unit.INSTANCE;
            }
        });
    }
}
