package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؔۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2877e extends C17666e {
    public boolean adcel;
    public final C2692e appmetrica;
    public C2561e billing;
    public final C12214e license;
    public final AbstractC13616e metrica;
    public AbstractC17732e purchase;
    public boolean startapp;
    public boolean yandex;

    public C2877e(AbstractC13616e abstractC13616e) {
        this.metrica = abstractC13616e;
        C12214e c12214e = new C12214e();
        c12214e.metrica = new long[2];
        this.license = c12214e;
        this.appmetrica = new C2692e(2);
        this.startapp = true;
        this.adcel = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // defpackage.C17666e
    public final boolean ad(C2692e c2692e, InterfaceC0043e interfaceC0043e, C12309e c12309e, boolean z) {
        C2692e c2692e2;
        C12214e c12214e;
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        C2561e c2561e;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        int i3;
        boolean z7;
        int i4;
        int i5;
        int i6;
        int i7;
        List list;
        C2401e c2401e;
        InterfaceC0043e interfaceC0043e2 = interfaceC0043e;
        boolean ad = super.ad(c2692e, interfaceC0043e, c12309e, z);
        AbstractC6126e abstractC6126e = this.metrica;
        if (abstractC6126e.f27016e) {
            ?? r8 = 0;
            while (abstractC6126e != 0) {
                if (abstractC6126e instanceof InterfaceC4890e) {
                    this.purchase = AbstractC5851e.yandex((InterfaceC4890e) abstractC6126e, 16);
                } else if ((abstractC6126e.f27014e & 16) != 0 && (abstractC6126e instanceof AbstractC6126e)) {
                    AbstractC13616e abstractC13616e = abstractC6126e.f12873e;
                    int i8 = 0;
                    abstractC6126e = abstractC6126e;
                    r8 = r8;
                    while (abstractC13616e != null) {
                        if ((abstractC13616e.f27014e & 16) != 0) {
                            i8++;
                            r8 = r8;
                            if (i8 == 1) {
                                abstractC6126e = abstractC13616e;
                            } else {
                                if (r8 == 0) {
                                    r8 = new C12431e(0, new AbstractC13616e[16]);
                                }
                                if (abstractC6126e != 0) {
                                    r8.license(abstractC6126e);
                                    abstractC6126e = 0;
                                }
                                r8.license(abstractC13616e);
                            }
                        }
                        abstractC13616e = abstractC13616e.f27024e;
                        abstractC6126e = abstractC6126e;
                        r8 = r8;
                    }
                    if (i8 == 1) {
                    }
                }
                abstractC6126e = AbstractC5851e.vip(r8);
            }
            if (this.purchase != null) {
                int adcel = c2692e.adcel();
                int i9 = 0;
                while (true) {
                    c2692e2 = this.appmetrica;
                    c12214e = this.license;
                    if (i9 >= adcel) {
                        break;
                    }
                    long billing = c2692e.billing(i9);
                    C2401e c2401e2 = (C2401e) c2692e.mopub(i9);
                    if (c12214e.metrica(billing)) {
                        long j = c2401e2.billing;
                        List list2 = c2401e2.smaato;
                        long j2 = c2401e2.metrica;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            List list3 = C13664e.f27089e;
                            z7 = ad;
                            ArrayList arrayList = new ArrayList((list2 == null ? list3 : list2).size());
                            if (list2 == null) {
                                list2 = list3;
                            }
                            int size = list2.size();
                            i4 = adcel;
                            int i10 = 0;
                            while (i10 < size) {
                                int i11 = size;
                                C15715e c15715e = (C15715e) list2.get(i10);
                                long j3 = billing;
                                List list4 = list2;
                                long j4 = c15715e.vip;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    list = list4;
                                    c2401e = c2401e2;
                                    i6 = i10;
                                    i7 = i9;
                                    arrayList.add(new C15715e(c15715e.ad, this.purchase.mo210native(interfaceC0043e2, j4, true), c15715e.metrica, c15715e.license, c15715e.appmetrica));
                                } else {
                                    i6 = i10;
                                    i7 = i9;
                                    list = list4;
                                    c2401e = c2401e2;
                                }
                                i10 = i6 + 1;
                                list2 = list;
                                size = i11;
                                billing = j3;
                                c2401e2 = c2401e;
                                i9 = i7;
                            }
                            i5 = i9;
                            long j5 = billing;
                            C2401e c2401e3 = new C2401e(c2401e2.ad, c2401e2.vip, this.purchase.mo210native(interfaceC0043e2, j2, true), c2401e2.license, c2401e2.appmetrica, c2401e2.purchase, this.purchase.mo210native(interfaceC0043e2, j, true), c2401e2.yandex, c2401e2.startapp, arrayList, c2401e2.adcel, c2401e2.mopub, c2401e2.advert, c2401e2.amazon);
                            C2401e c2401e4 = c2401e2.admob;
                            if (c2401e4 == null) {
                                c2401e4 = c2401e2;
                            }
                            c2401e3.admob = c2401e4;
                            C2401e c2401e5 = c2401e2.admob;
                            if (c2401e5 != null) {
                                c2401e2 = c2401e5;
                            }
                            c2401e3.admob = c2401e2;
                            c2692e2.yandex(j5, c2401e3);
                            i9 = i5 + 1;
                            interfaceC0043e2 = interfaceC0043e;
                            adcel = i4;
                            ad = z7;
                        }
                    }
                    z7 = ad;
                    i4 = adcel;
                    i5 = i9;
                    i9 = i5 + 1;
                    interfaceC0043e2 = interfaceC0043e;
                    adcel = i4;
                    ad = z7;
                }
                boolean z8 = ad;
                if (c2692e2.adcel() == 0) {
                    c12214e.vip = 0;
                    this.ad.startapp();
                    return true;
                }
                int i12 = c12214e.vip;
                while (true) {
                    i12--;
                    if (-1 >= i12) {
                        break;
                    }
                    if (c2692e.purchase(c12214e.metrica[i12]) < 0 && i12 < (i3 = c12214e.vip)) {
                        int i13 = i3 - 1;
                        int i14 = i12;
                        while (i14 < i13) {
                            long[] jArr = c12214e.metrica;
                            int i15 = i14 + 1;
                            jArr[i14] = jArr[i15];
                            i14 = i15;
                        }
                        c12214e.vip--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(c2692e2.adcel());
                int adcel2 = c2692e2.adcel();
                for (int i16 = 0; i16 < adcel2; i16++) {
                    arrayList2.add(c2692e2.mopub(i16));
                }
                C2561e c2561e2 = new C2561e(arrayList2, c12309e);
                int size2 = arrayList2.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i17);
                    if (c12309e.loadAd(((C2401e) obj).ad)) {
                        break;
                    }
                    i17++;
                }
                C2401e c2401e6 = (C2401e) obj;
                if (c2401e6 != null) {
                    boolean z9 = c2401e6.license;
                    if (z) {
                        z2 = false;
                        if (!this.startapp && (z9 || c2401e6.yandex)) {
                            long j6 = this.purchase.f6803e;
                            long j7 = c2401e6.metrica;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                            z3 = true;
                            this.startapp = !((intBitsToFloat < 0.0f) | (intBitsToFloat > ((float) ((int) (j6 >> 32)))) | (intBitsToFloat2 < 0.0f) | (intBitsToFloat2 > ((float) ((int) (j6 & 4294967295L)))));
                            z5 = this.startapp;
                            z6 = this.yandex;
                            if (z5 == z6 && ((i2 = c2561e2.purchase) == 3 || i2 == 4 || i2 == 5)) {
                                c2561e2.purchase = z5 ? 4 : 5;
                            } else {
                                i = c2561e2.purchase;
                                if (i != 4 && z6 && !this.adcel) {
                                    c2561e2.purchase = 3;
                                } else if (i == 5 && z5 && z9) {
                                    c2561e2.purchase = 3;
                                }
                            }
                        }
                    } else {
                        z2 = false;
                        this.startapp = false;
                    }
                    z3 = true;
                    z5 = this.startapp;
                    z6 = this.yandex;
                    if (z5 == z6) {
                    }
                    i = c2561e2.purchase;
                    if (i != 4) {
                    }
                    if (i == 5) {
                        c2561e2.purchase = 3;
                    }
                } else {
                    z2 = false;
                    z3 = true;
                }
                if (!z8 && c2561e2.purchase == 3 && (c2561e = this.billing) != null) {
                    ?? r1 = c2561e.ad;
                    int size3 = r1.size();
                    ?? r4 = c2561e2.ad;
                    if (size3 == r4.size()) {
                        int size4 = r4.size();
                        for (?? r5 = z2; r5 < size4; r5++) {
                            if (C2152e.vip(((C2401e) r1.get(r5)).metrica, ((C2401e) r4.get(r5)).metrica)) {
                            }
                        }
                        z4 = z2;
                        this.billing = c2561e2;
                        return z4;
                    }
                }
                z4 = z3;
                this.billing = c2561e2;
                return z4;
            }
        }
        return true;
    }

    public final boolean appmetrica(C12309e c12309e, boolean z) {
        boolean z2;
        boolean z3;
        C13915e c13915e;
        if (this.appmetrica.adcel() == 0) {
            return false;
        }
        AbstractC13616e abstractC13616e = this.metrica;
        if (abstractC13616e.f27016e) {
            AbstractC17732e abstractC17732e = abstractC13616e.f27018e;
            if ((abstractC17732e == null || (c13915e = abstractC17732e.f34782e) == null) ? false : c13915e.m3724throw()) {
                C2561e c2561e = this.billing;
                long j = this.purchase.f6803e;
                AbstractC13616e abstractC13616e2 = abstractC13616e;
                C12431e c12431e = null;
                while (abstractC13616e2 != null) {
                    if (abstractC13616e2 instanceof InterfaceC4890e) {
                        ((InterfaceC4890e) abstractC13616e2).crashlytics(c2561e, EnumC13456e.f26729e, j);
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        if (((abstractC13616e2.f27014e & 16) != 0) && (abstractC13616e2 instanceof AbstractC6126e)) {
                            int i = 0;
                            for (AbstractC13616e abstractC13616e3 = ((AbstractC6126e) abstractC13616e2).f12873e; abstractC13616e3 != null; abstractC13616e3 = abstractC13616e3.f27024e) {
                                if ((abstractC13616e3.f27014e & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        abstractC13616e2 = abstractC13616e3;
                                    } else {
                                        if (c12431e == null) {
                                            c12431e = new C12431e(0, new AbstractC13616e[16]);
                                        }
                                        if (abstractC13616e2 != null) {
                                            c12431e.license(abstractC13616e2);
                                            abstractC13616e2 = null;
                                        }
                                        c12431e.license(abstractC13616e3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                    }
                    abstractC13616e2 = AbstractC5851e.vip(c12431e);
                }
                if (abstractC13616e.f27016e) {
                    C12431e c12431e2 = this.ad;
                    Object[] objArr = c12431e2.f24870e;
                    int i2 = c12431e2.f24868e;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((C2877e) objArr[i3]).appmetrica(c12309e, z);
                    }
                }
                if (abstractC13616e.f27016e) {
                    C12431e c12431e3 = null;
                    while (abstractC13616e != null) {
                        if (abstractC13616e instanceof InterfaceC4890e) {
                            ((InterfaceC4890e) abstractC13616e).crashlytics(c2561e, EnumC13456e.f26727e, j);
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            if (((abstractC13616e.f27014e & 16) != 0) && (abstractC13616e instanceof AbstractC6126e)) {
                                int i4 = 0;
                                for (AbstractC13616e abstractC13616e4 = ((AbstractC6126e) abstractC13616e).f12873e; abstractC13616e4 != null; abstractC13616e4 = abstractC13616e4.f27024e) {
                                    if ((abstractC13616e4.f27014e & 16) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            abstractC13616e = abstractC13616e4;
                                        } else {
                                            if (c12431e3 == null) {
                                                c12431e3 = new C12431e(0, new AbstractC13616e[16]);
                                            }
                                            if (abstractC13616e != null) {
                                                c12431e3.license(abstractC13616e);
                                                abstractC13616e = null;
                                            }
                                            c12431e3.license(abstractC13616e4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                        }
                        abstractC13616e = AbstractC5851e.vip(c12431e3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean license(C12309e c12309e) {
        Object[] objArr;
        C13915e c13915e;
        C2692e c2692e = this.appmetrica;
        boolean z = false;
        z = false;
        z = false;
        if (c2692e.adcel() != 0) {
            AbstractC13616e abstractC13616e = this.metrica;
            if (abstractC13616e.f27016e) {
                AbstractC17732e abstractC17732e = abstractC13616e.f27018e;
                if ((abstractC17732e == null || (c13915e = abstractC17732e.f34782e) == null) ? false : c13915e.m3724throw()) {
                    C2561e c2561e = this.billing;
                    long j = this.purchase.f6803e;
                    AbstractC13616e abstractC13616e2 = abstractC13616e;
                    C12431e c12431e = null;
                    while (abstractC13616e2 != null) {
                        if (abstractC13616e2 instanceof InterfaceC4890e) {
                            ((InterfaceC4890e) abstractC13616e2).crashlytics(c2561e, EnumC13456e.f26726e, j);
                            objArr = false;
                        } else {
                            objArr = true;
                        }
                        if (objArr != false) {
                            if (((abstractC13616e2.f27014e & 16) != 0) != false && (abstractC13616e2 instanceof AbstractC6126e)) {
                                int i = 0;
                                for (AbstractC13616e abstractC13616e3 = ((AbstractC6126e) abstractC13616e2).f12873e; abstractC13616e3 != null; abstractC13616e3 = abstractC13616e3.f27024e) {
                                    if (((abstractC13616e3.f27014e & 16) != 0) != false) {
                                        i++;
                                        if (i == 1) {
                                            abstractC13616e2 = abstractC13616e3;
                                        } else {
                                            if (c12431e == null) {
                                                c12431e = new C12431e(0, new AbstractC13616e[16]);
                                            }
                                            if (abstractC13616e2 != null) {
                                                c12431e.license(abstractC13616e2);
                                                abstractC13616e2 = null;
                                            }
                                            c12431e.license(abstractC13616e3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                        }
                        abstractC13616e2 = AbstractC5851e.vip(c12431e);
                    }
                    if (abstractC13616e.f27016e) {
                        C12431e c12431e2 = this.ad;
                        Object[] objArr2 = c12431e2.f24870e;
                        int i2 = c12431e2.f24868e;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((C2877e) objArr2[i3]).license(c12309e);
                        }
                    }
                    z = true;
                }
            }
        }
        vip(c12309e);
        c2692e.vip();
        this.purchase = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [eّّؔ] */
    public final void metrica() {
        C12431e c12431e = this.ad;
        Object[] objArr = c12431e.f24870e;
        int i = c12431e.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            ((C2877e) objArr[i2]).metrica();
        }
        AbstractC6126e abstractC6126e = this.metrica;
        ?? r3 = 0;
        while (abstractC6126e != 0) {
            if (abstractC6126e instanceof InterfaceC4890e) {
                ((InterfaceC4890e) abstractC6126e).mo720protected();
            } else if ((abstractC6126e.f27014e & 16) != 0 && (abstractC6126e instanceof AbstractC6126e)) {
                AbstractC13616e abstractC13616e = abstractC6126e.f12873e;
                int i3 = 0;
                abstractC6126e = abstractC6126e;
                r3 = r3;
                while (abstractC13616e != null) {
                    if ((abstractC13616e.f27014e & 16) != 0) {
                        i3++;
                        r3 = r3;
                        if (i3 == 1) {
                            abstractC6126e = abstractC13616e;
                        } else {
                            if (r3 == 0) {
                                r3 = new C12431e(0, new AbstractC13616e[16]);
                            }
                            if (abstractC6126e != 0) {
                                r3.license(abstractC6126e);
                                abstractC6126e = 0;
                            }
                            r3.license(abstractC13616e);
                        }
                    }
                    abstractC13616e = abstractC13616e.f27024e;
                    abstractC6126e = abstractC6126e;
                    r3 = r3;
                }
                if (i3 == 1) {
                }
            }
            abstractC6126e = AbstractC5851e.vip(r3);
        }
    }

    public final void purchase(long j, C12328e c12328e) {
        C12214e c12214e = this.license;
        if (c12214e.metrica(j) && c12328e.startapp(this) < 0) {
            c12214e.appmetrica(j);
            this.appmetrica.startapp(j);
        }
        C12431e c12431e = this.ad;
        Object[] objArr = c12431e.f24870e;
        int i = c12431e.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            ((C2877e) objArr[i2]).purchase(j, c12328e);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.metrica + ", children=" + this.ad + ", pointerIds=" + this.license + ')';
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // defpackage.C17666e
    public final void vip(C12309e c12309e) {
        super.vip(c12309e);
        C2561e c2561e = this.billing;
        if (c2561e == null) {
            return;
        }
        this.yandex = this.startapp;
        ?? r1 = c2561e.ad;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            C2401e c2401e = (C2401e) r1.get(i);
            boolean z = c2401e.license;
            long j = c2401e.ad;
            boolean loadAd = c12309e.loadAd(j);
            boolean z2 = this.startapp;
            if ((!z && !loadAd) || (!z && !z2)) {
                this.license.appmetrica(j);
            }
        }
        this.startapp = false;
        this.adcel = c2561e.purchase == 5;
    }
}
