package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4034e {
    public final C0971e ad;
    public InterfaceC0043e advert;
    public InterfaceC5178e appmetrica;
    public boolean inmobi;
    public InterfaceC3358e isVip;
    public C2152e mopub;
    public InterfaceC17718e pro;
    public Function1 purchase;
    public boolean signatures;
    public InterfaceC18435e tapsense;
    public final C0576e vip = AbstractC14533e.startapp(null);
    public final C0576e metrica = AbstractC14533e.startapp(Boolean.TRUE);
    public Function1 license = new C16784e(this, 7);
    public final C5780e billing = new C5780e();
    public final C6260e yandex = new C6260e();
    public final C0576e startapp = AbstractC14533e.startapp(Boolean.FALSE);
    public final C6656e adcel = AbstractC14533e.purchase(new C18408e(this, 3));
    public final C0576e smaato = new C0576e(Unit.INSTANCE, C10990e.f21771e);
    public final C0576e amazon = AbstractC14533e.startapp(new C2152e(0));
    public final C0576e loadAd = AbstractC14533e.startapp(new C2152e(0));
    public final C0576e Signature = AbstractC14533e.startapp(null);
    public final C0576e admob = AbstractC14533e.startapp(null);
    public final C0576e subscription = AbstractC14533e.startapp(null);
    public final C0576e remoteconfig = AbstractC14533e.startapp(null);

    public C4034e(C0971e c0971e) {
        this.ad = c0971e;
        c0971e.appmetrica = new C16784e(this, 8);
        c0971e.purchase = new C8035e(11, this);
        c0971e.billing = new C1973e(this);
        c0971e.yandex = new C18408e(this, 4);
        c0971e.startapp = new C16784e(this, 1);
        c0971e.adcel = new C16784e(this, 2);
    }

    public final long ad(InterfaceC0043e interfaceC0043e, long j) {
        InterfaceC0043e interfaceC0043e2 = this.advert;
        if (interfaceC0043e2 == null || !interfaceC0043e2.billing()) {
            return 9205357640488583168L;
        }
        return adcel().mo207class(interfaceC0043e, j);
    }

    public final InterfaceC0043e adcel() {
        InterfaceC0043e interfaceC0043e = this.advert;
        if (interfaceC0043e == null) {
            throw AbstractC5087e.m1749interface("null coordinates");
        }
        if (!interfaceC0043e.billing()) {
            AbstractC8889e.ad("unattached coordinates");
        }
        return interfaceC0043e;
    }

    public final void advert(C9106e c9106e) {
        this.vip.setValue(c9106e);
        if (c9106e != null) {
            smaato();
        }
    }

    public final boolean amazon(long j, long j2, boolean z, C16658e c16658e) {
        ArrayList arrayList;
        InterfaceC17718e interfaceC17718e;
        C12476e c12476e;
        long j3;
        long j4;
        int i;
        long j5;
        int i2;
        C17096e c17096e;
        long j6;
        int ad;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        ArrayList arrayList2;
        int i8;
        int i9;
        C17096e c17096e2;
        int i10;
        int i11;
        int i12;
        C14980e c14980e;
        int i13;
        C14980e c14980e2;
        this.subscription.setValue(z ? EnumC12813e.f25631e : EnumC12813e.f25630e);
        this.remoteconfig.setValue(new C2152e(j));
        InterfaceC0043e adcel = adcel();
        C0971e c0971e = this.ad;
        ArrayList metrica = c0971e.metrica(adcel);
        int i14 = AbstractC1643e.ad;
        C14789e c14789e = new C14789e(6);
        int size = metrica.size();
        for (int i15 = 0; i15 < size; i15++) {
            c14789e.appmetrica(i15, ((C12850e) metrica.get(i15)).ad);
        }
        long j7 = 9223372034707292159L;
        long j8 = 9205357640488583168L;
        C17096e c17096e3 = new C17096e(j, j2, adcel, z, (j2 & 9223372034707292159L) == 9205357640488583168L ? null : purchase(), new C3751e(5, c14789e));
        int size2 = metrica.size();
        int i16 = 0;
        while (true) {
            arrayList = c17096e3.yandex;
            if (i16 >= size2) {
                break;
            }
            C12850e c12850e = (C12850e) metrica.get(i16);
            InterfaceC0043e metrica2 = c12850e.metrica();
            if (metrica2 == null || (c12476e = (C12476e) c12850e.metrica.invoke()) == null) {
                i = size2;
                i6 = i16;
                arrayList2 = metrica;
                j3 = j7;
                j4 = j8;
                c17096e2 = c17096e3;
            } else {
                j3 = j7;
                j4 = j8;
                long mo207class = c17096e3.metrica.mo207class(metrica2, 0L);
                long yandex = C2152e.yandex(c17096e3.ad, mo207class);
                long j9 = c17096e3.vip;
                long yandex2 = (j9 & j3) == j4 ? j4 : C2152e.yandex(j9, mo207class);
                long j10 = c12850e.ad;
                i = size2;
                int i17 = i16;
                long j11 = c12476e.metrica;
                float f = (int) (j11 >> 32);
                float f2 = (int) (j11 & 4294967295L);
                int i18 = (int) (yandex >> 32);
                if (Float.intBitsToFloat(i18) < 0.0f) {
                    j5 = 4294967295L;
                    i2 = 1;
                } else if (Float.intBitsToFloat(i18) > f) {
                    j5 = 4294967295L;
                    i2 = 3;
                } else {
                    j5 = 4294967295L;
                    i2 = 2;
                }
                int i19 = (int) (yandex & j5);
                int i20 = Float.intBitsToFloat(i19) < 0.0f ? 1 : Float.intBitsToFloat(i19) > f2 ? 3 : 2;
                boolean z3 = c17096e3.license;
                C9106e c9106e = c17096e3.appmetrica;
                if (z3) {
                    c17096e = c17096e3;
                    j6 = j10;
                    ad = AbstractC0426e.ad(i2, i20, c17096e, j6, c9106e != null ? c9106e.vip : null);
                    z2 = z3;
                    i6 = i17;
                    arrayList2 = metrica;
                    i3 = i2;
                    i5 = i3;
                    i8 = i20;
                    i4 = i8;
                    i7 = ad;
                    i9 = i7;
                } else {
                    c17096e = c17096e3;
                    j6 = j10;
                    ad = AbstractC0426e.ad(i2, i20, c17096e, j6, c9106e != null ? c9106e.ad : null);
                    i3 = i2;
                    i4 = i20;
                    i5 = ad;
                    z2 = z3;
                    i6 = i17;
                    i7 = i3;
                    arrayList2 = metrica;
                    i8 = i5;
                    i9 = i4;
                }
                c17096e2 = c17096e;
                int yandex3 = AbstractC7150e.yandex(i3, i4);
                if (yandex3 == 2 || yandex3 != ad) {
                    int length = c12476e.ad.ad.f20850e.length();
                    C3751e c3751e = c17096e2.purchase;
                    if (z2) {
                        int vip = AbstractC0426e.vip(yandex, c12476e);
                        if (c9106e == null || (c14980e2 = c9106e.vip) == null) {
                            i13 = vip;
                            length = i13;
                        } else {
                            i13 = vip;
                            int compare = c3751e.compare(Long.valueOf(c14980e2.metrica), Long.valueOf(j6));
                            if (compare < 0) {
                                length = 0;
                            } else if (compare <= 0) {
                                length = c14980e2.vip;
                            }
                        }
                        i11 = i13;
                        i12 = length;
                    } else {
                        int vip2 = AbstractC0426e.vip(yandex, c12476e);
                        if (c9106e == null || (c14980e = c9106e.ad) == null) {
                            i10 = vip2;
                            i11 = i10;
                        } else {
                            i10 = vip2;
                            int compare2 = c3751e.compare(Long.valueOf(c14980e.metrica), Long.valueOf(j6));
                            if (compare2 < 0) {
                                length = 0;
                            } else if (compare2 <= 0) {
                                length = c14980e.vip;
                            }
                            i11 = length;
                        }
                        i12 = i10;
                    }
                    int vip3 = (yandex2 & j3) == j4 ? -1 : AbstractC0426e.vip(yandex2, c12476e);
                    int i21 = c17096e2.mopub + 2;
                    c17096e2.mopub = i21;
                    long j12 = j6;
                    C4395e c4395e = new C4395e(j12, i21, i11, i12, vip3, c12476e);
                    c17096e2.startapp = c17096e2.ad(c17096e2.startapp, i5, i8);
                    c17096e2.adcel = c17096e2.ad(c17096e2.adcel, i7, i9);
                    c17096e2.billing.appmetrica(arrayList.size(), j12);
                    arrayList.add(c4395e);
                }
            }
            i16 = i6 + 1;
            size2 = i;
            c17096e3 = c17096e2;
            j7 = j3;
            j8 = j4;
            metrica = arrayList2;
        }
        C17096e c17096e4 = c17096e3;
        int i22 = c17096e4.mopub + 1;
        int size3 = arrayList.size();
        if (size3 == 0) {
            interfaceC17718e = null;
        } else if (size3 != 1) {
            int i23 = c17096e4.startapp;
            int i24 = i23 == -1 ? i22 : i23;
            int i25 = c17096e4.adcel;
            interfaceC17718e = new C13841e(c17096e4.billing, arrayList, i24, i25 == -1 ? i22 : i25, c17096e4.license, c17096e4.appmetrica);
        } else {
            C4395e c4395e2 = (C4395e) AbstractC13480e.m3590instanceof(arrayList);
            int i26 = c17096e4.startapp;
            int i27 = i26 == -1 ? i22 : i26;
            int i28 = c17096e4.adcel;
            interfaceC17718e = new C13918e(c17096e4.license, i27, i28 == -1 ? i22 : i28, c17096e4.appmetrica, c4395e2);
        }
        if (interfaceC17718e == null || !interfaceC17718e.advert(this.pro)) {
            return false;
        }
        C9106e ad2 = c16658e.ad(interfaceC17718e);
        if (!AbstractC7890e.billing(ad2, purchase())) {
            if (billing()) {
                ArrayList arrayList3 = c0971e.vip;
                int size4 = arrayList3.size();
                int i29 = 0;
                while (true) {
                    if (i29 >= size4) {
                        break;
                    }
                    if (((C12850e) arrayList3.get(i29)).license().f20850e.length() > 0) {
                        InterfaceC5178e interfaceC5178e = this.appmetrica;
                        if (interfaceC5178e != null) {
                            ((C6169e) interfaceC5178e).ad(9);
                        }
                    } else {
                        i29++;
                    }
                }
            }
            c0971e.mopub.setValue(interfaceC17718e.smaato(ad2));
            this.license.invoke(ad2);
            this.signatures = false;
        }
        this.pro = interfaceC17718e;
        return true;
    }

    public final EnumC12813e appmetrica() {
        return (EnumC12813e) this.subscription.getValue();
    }

    public final boolean billing() {
        return ((Boolean) this.metrica.getValue()).booleanValue();
    }

    public final C6571e license() {
        int i;
        int i2;
        int i3;
        if (purchase() == null) {
            return null;
        }
        C0971e c0971e = this.ad;
        if (c0971e.vip.isEmpty()) {
            return null;
        }
        C9122e c9122e = new C9122e();
        ArrayList metrica = c0971e.metrica(adcel());
        ListIterator listIterator = metrica.listIterator(metrica.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            C9106e c9106e = (C9106e) c0971e.ad().appmetrica(((C12850e) listIterator.previous()).ad);
            if (c9106e != null && c9106e.ad.vip != c9106e.vip.vip) {
                i = listIterator.nextIndex();
                break;
            }
        }
        if (i != -1) {
            int size = metrica.size();
            int i4 = 0;
            i2 = -1;
            i3 = -1;
            int i5 = 0;
            while (i5 < size) {
                C12850e c12850e = (C12850e) metrica.get(i5);
                C9106e c9106e2 = (C9106e) c0971e.ad().appmetrica(c12850e.ad);
                if (c9106e2 != null) {
                    C10566e license = c12850e.license();
                    long metrica2 = AbstractC9262e.metrica(c9106e2.ad.vip, c9106e2.vip.vip);
                    int i6 = i5 >= i ? 1 : i4;
                    if (i2 == -1) {
                        i2 = C12347e.billing(metrica2);
                        c9122e.vip(license, i4, C12347e.billing(metrica2));
                    }
                    c9122e.vip(license, C12347e.billing(metrica2), C12347e.purchase(metrica2));
                    StringBuilder sb = c9122e.f18278e;
                    if (i6 == 0) {
                        sb.append('\n');
                    } else {
                        i3 = sb.length();
                        c9122e.vip(license, C12347e.purchase(metrica2), license.f20850e.length());
                    }
                }
                i5++;
                i4 = 0;
            }
        } else {
            i2 = -1;
            i3 = -1;
        }
        C10566e purchase = c9122e.purchase();
        if (i2 == -1 || i3 == -1) {
            return null;
        }
        return new C6571e(purchase, new C12347e(AbstractC9262e.metrica(i2, i3)));
    }

    public final void loadAd() {
        C8419e c8419e;
        if (((Boolean) this.startapp.getValue()).booleanValue()) {
            boolean z = this.inmobi;
            C5780e c5780e = this.billing;
            if (z && billing()) {
                if (((C0763e) this.adcel.getValue()) == null) {
                    return;
                }
                c5780e.ad();
            } else {
                C16679e c16679e = c5780e.ad;
                if (c16679e == null || (c8419e = c16679e.f32722e) == null) {
                    return;
                }
                c8419e.Signature(null);
                c16679e.f32722e = null;
            }
        }
    }

    public final C12850e metrica(C14980e c14980e) {
        return (C12850e) this.ad.metrica.appmetrica(c14980e.metrica);
    }

    public final void mopub(boolean z) {
        C0576e c0576e = this.metrica;
        if (((Boolean) c0576e.getValue()).booleanValue() != z) {
            c0576e.setValue(Boolean.valueOf(z));
            loadAd();
        }
    }

    public final C9106e purchase() {
        return (C9106e) this.vip.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (defpackage.AbstractC14520e.vip(r11, r10) == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void smaato() {
        /*
            r20 = this;
            r0 = r20
            eٌۥً r1 = r0.purchase()
            eؑؒۛ r2 = r0.advert
            r3 = 0
            if (r1 == 0) goto L14
            eٔۜٓ r4 = r1.ad
            if (r4 == 0) goto L14
            eّۣۤ r4 = r0.metrica(r4)
            goto L15
        L14:
            r4 = r3
        L15:
            if (r1 == 0) goto L20
            eٔۜٓ r5 = r1.vip
            if (r5 == 0) goto L20
            eّۣۤ r5 = r0.metrica(r5)
            goto L21
        L20:
            r5 = r3
        L21:
            if (r4 == 0) goto L28
            eؑؒۛ r6 = r4.metrica()
            goto L29
        L28:
            r6 = r3
        L29:
            if (r5 == 0) goto L30
            eؑؒۛ r7 = r5.metrica()
            goto L31
        L30:
            r7 = r3
        L31:
            eؑۜٝ r8 = r0.admob
            eؑۜٝ r9 = r0.Signature
            if (r1 == 0) goto Lab
            if (r2 == 0) goto Lab
            boolean r10 = r2.billing()
            if (r10 == 0) goto Lab
            if (r6 != 0) goto L44
            if (r7 != 0) goto L44
            goto Lab
        L44:
            eؒؐۥ r10 = defpackage.AbstractC14520e.startapp(r2)
            r13 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            if (r6 == 0) goto L78
            r15 = 1
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            long r11 = r4.ad(r1, r15)
            long r18 = r11 & r13
            int r4 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r4 != 0) goto L60
            goto L7d
        L60:
            long r11 = r2.mo207class(r6, r11)
            eؓۡؖ r4 = new eؓۡؖ
            r4.<init>(r11)
            eّٟۡ r6 = r0.appmetrica()
            eّٟۡ r15 = defpackage.EnumC12813e.f25631e
            if (r6 == r15) goto L7e
            boolean r6 = defpackage.AbstractC14520e.vip(r11, r10)
            if (r6 == 0) goto L7d
            goto L7e
        L78:
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
        L7d:
            r4 = r3
        L7e:
            r9.setValue(r4)
            if (r7 == 0) goto La7
            r4 = 0
            long r4 = r5.ad(r1, r4)
            long r11 = r4 & r13
            int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r1 != 0) goto L8f
            goto La7
        L8f:
            long r1 = r2.mo207class(r7, r4)
            eؓۡؖ r4 = new eؓۡؖ
            r4.<init>(r1)
            eّٟۡ r5 = r0.appmetrica()
            eّٟۡ r6 = defpackage.EnumC12813e.f25630e
            if (r5 == r6) goto La6
            boolean r1 = defpackage.AbstractC14520e.vip(r1, r10)
            if (r1 == 0) goto La7
        La6:
            r3 = r4
        La7:
            r8.setValue(r3)
            return
        Lab:
            r9.setValue(r3)
            r8.setValue(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4034e.smaato():void");
    }

    public final void startapp() {
        InterfaceC5178e interfaceC5178e;
        this.ad.mopub.setValue(AbstractC2800e.ad);
        this.inmobi = false;
        loadAd();
        if (purchase() != null) {
            this.license.invoke(null);
            if (!billing() || (interfaceC5178e = this.appmetrica) == null) {
                return;
            }
            ((C6169e) interfaceC5178e).ad(9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vip() {
        /*
            r13 = this;
            eٌۥً r0 = r13.purchase()
            r1 = 0
            if (r0 == 0) goto L11
            eَؒؐ r0 = r13.ad
            eؘٖ۟ r2 = r0.ad()
            int r2 = r2.appmetrica
            if (r2 != 0) goto L14
        L11:
            r0 = r1
            goto La2
        L14:
            eٌۦٙ r2 = new eٌۦٙ
            r2.<init>()
            eؑؒۛ r3 = r13.adcel()
            java.util.ArrayList r3 = r0.metrica(r3)
            int r4 = r3.size()
            java.util.ListIterator r4 = r3.listIterator(r4)
        L29:
            boolean r5 = r4.hasPrevious()
            r6 = -1
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.previous()
            eّۣۤ r5 = (defpackage.C12850e) r5
            eؘٖ۟ r7 = r0.ad()
            long r8 = r5.ad
            java.lang.Object r5 = r7.appmetrica(r8)
            eٌۥً r5 = (defpackage.C9106e) r5
            if (r5 == 0) goto L29
            eٔۜٓ r7 = r5.ad
            int r7 = r7.vip
            eٔۜٓ r5 = r5.vip
            int r5 = r5.vip
            if (r7 == r5) goto L29
            int r4 = r4.nextIndex()
            goto L54
        L53:
            r4 = r6
        L54:
            if (r4 == r6) goto L9e
            int r5 = r3.size()
            r6 = 0
            r7 = r6
        L5c:
            if (r7 >= r5) goto L9e
            java.lang.Object r8 = r3.get(r7)
            eّۣۤ r8 = (defpackage.C12850e) r8
            eؘٖ۟ r9 = r0.ad()
            long r10 = r8.ad
            java.lang.Object r9 = r9.appmetrica(r10)
            eٌۥً r9 = (defpackage.C9106e) r9
            if (r9 == 0) goto L9b
            eَ۟ۢ r8 = r8.license()
            eٔۜٓ r10 = r9.ad
            int r10 = r10.vip
            eٔۜٓ r9 = r9.vip
            int r9 = r9.vip
            long r9 = defpackage.AbstractC9262e.metrica(r10, r9)
            if (r7 < r4) goto L86
            r11 = 1
            goto L87
        L86:
            r11 = r6
        L87:
            int r12 = defpackage.C12347e.billing(r9)
            int r9 = defpackage.C12347e.purchase(r9)
            r2.vip(r8, r12, r9)
            if (r11 != 0) goto L9b
            r8 = 10
            java.lang.StringBuilder r9 = r2.f18278e
            r9.append(r8)
        L9b:
            int r7 = r7 + 1
            goto L5c
        L9e:
            eَ۟ۢ r0 = r2.purchase()
        La2:
            if (r0 == 0) goto Lb6
            java.lang.String r2 = r0.f20850e
            int r2 = r2.length()
            if (r2 <= 0) goto Lad
            r1 = r0
        Lad:
            if (r1 == 0) goto Lb6
            kotlin.jvm.functions.Function1 r0 = r13.purchase
            if (r0 == 0) goto Lb6
            r0.invoke(r1)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4034e.vip():void");
    }

    public final boolean yandex() {
        C9106e purchase = purchase();
        if (purchase != null) {
            C14980e c14980e = purchase.vip;
            C14980e c14980e2 = purchase.ad;
            if (!AbstractC7890e.billing(c14980e2, c14980e)) {
                if (c14980e2.metrica == c14980e.metrica) {
                    return true;
                }
                InterfaceC0043e adcel = adcel();
                C0971e c0971e = this.ad;
                ArrayList metrica = c0971e.metrica(adcel);
                int size = metrica.size();
                for (int i = 0; i < size; i++) {
                    C9106e c9106e = (C9106e) c0971e.ad().appmetrica(((C12850e) metrica.get(i)).ad);
                    if (c9106e != null && c9106e.ad.vip != c9106e.vip.vip) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
