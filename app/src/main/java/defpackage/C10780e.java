package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10780e {
    public final InterfaceC0043e ad;
    public boolean appmetrica;
    public boolean license;
    public boolean metrica;
    public boolean vip;
    public final C12328e purchase = new C12328e();
    public final C17666e billing = new C17666e();
    public final C16529e yandex = new C16529e(10);

    public C10780e(InterfaceC0043e interfaceC0043e) {
        this.ad = interfaceC0043e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    public final void ad(long j, List list, boolean z) {
        C16529e c16529e;
        int i;
        C2877e c2877e;
        C2877e c2877e2;
        int size = list.size();
        C17666e c17666e = this.billing;
        C17666e c17666e2 = c17666e;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            c16529e = this.yandex;
            if (i2 >= size) {
                break;
            }
            AbstractC13616e abstractC13616e = (AbstractC13616e) list.get(i2);
            if (abstractC13616e.f27016e) {
                abstractC13616e.f27012e = new C14194e(this, abstractC13616e, 6);
                if (z2) {
                    C12431e c12431e = c17666e2.ad;
                    ?? r14 = c12431e.f24870e;
                    int i3 = c12431e.f24868e;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            c2877e2 = 0;
                            break;
                        }
                        c2877e2 = r14[i4];
                        if (AbstractC7890e.billing(((C2877e) c2877e2).metrica, abstractC13616e)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    c2877e = c2877e2;
                    if (c2877e != null) {
                        c2877e.startapp = true;
                        c2877e.license.ad(j);
                        if (z) {
                            Object appmetrica = c16529e.appmetrica(j);
                            if (appmetrica == null) {
                                appmetrica = new C12328e();
                                c16529e.yandex(j, appmetrica);
                            }
                            ((C12328e) appmetrica).ad(c2877e);
                        }
                        c17666e2 = c2877e;
                    } else {
                        z2 = false;
                    }
                }
                c2877e = new C2877e(abstractC13616e);
                c2877e.license.ad(j);
                if (z) {
                    Object appmetrica2 = c16529e.appmetrica(j);
                    if (appmetrica2 == null) {
                        appmetrica2 = new C12328e();
                        c16529e.yandex(j, appmetrica2);
                    }
                    ((C12328e) appmetrica2).ad(c2877e);
                }
                c17666e2.ad.license(c2877e);
                c17666e2 = c2877e;
            }
            i2++;
        }
        if (z) {
            long[] jArr = c16529e.vip;
            Object[] objArr = c16529e.metrica;
            long[] jArr2 = c16529e.ad;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr2[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i8;
                                long j3 = jArr[i9];
                                C12328e c12328e = (C12328e) objArr[i9];
                                i = i6;
                                C12431e c12431e2 = c17666e.ad;
                                Object[] objArr2 = c12431e2.f24870e;
                                int i10 = c12431e2.f24868e;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((C2877e) objArr2[i11]).purchase(j3, c12328e);
                                }
                            } else {
                                i = i6;
                            }
                            j2 >>= i;
                            i8++;
                            i6 = i;
                        }
                        if (i7 != i6) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        c16529e.ad();
    }

    public final void license(AbstractC13616e abstractC13616e) {
        if (this.vip) {
            this.appmetrica = true;
            this.purchase.ad(abstractC13616e);
            return;
        }
        C17666e c17666e = this.billing;
        C12328e c12328e = c17666e.vip;
        c12328e.purchase();
        c12328e.ad(c17666e);
        while (c12328e.mopub()) {
            C17666e c17666e2 = (C17666e) c12328e.smaato(c12328e.vip - 1);
            int i = 0;
            while (true) {
                C12431e c12431e = c17666e2.ad;
                if (i < c12431e.f24868e) {
                    C2877e c2877e = (C2877e) c12431e.f24870e[i];
                    if (AbstractC7890e.billing(c2877e.metrica, abstractC13616e)) {
                        c17666e2.ad.smaato(c2877e);
                        c2877e.metrica();
                    } else {
                        c12328e.ad(c2877e);
                        i++;
                    }
                }
            }
        }
    }

    public final void metrica() {
        if (this.vip) {
            this.metrica = true;
            return;
        }
        C17666e c17666e = this.billing;
        C12431e c12431e = c17666e.ad;
        Object[] objArr = c12431e.f24870e;
        int i = c12431e.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            ((C2877e) objArr[i2]).metrica();
        }
        if (this.license) {
            this.license = true;
        } else {
            c17666e.ad.startapp();
        }
    }

    public final boolean vip(C12309e c12309e, boolean z) {
        C2692e c2692e = (C2692e) c12309e.f24693e;
        InterfaceC0043e interfaceC0043e = this.ad;
        C17666e c17666e = this.billing;
        boolean ad = c17666e.ad(c2692e, interfaceC0043e, c12309e, z);
        C12431e c12431e = c17666e.ad;
        if (!ad) {
            return false;
        }
        boolean z2 = true;
        this.vip = true;
        Object[] objArr = c12431e.f24870e;
        int i = c12431e.f24868e;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((C2877e) objArr[i2]).appmetrica(c12309e, z) || z3;
        }
        Object[] objArr2 = c12431e.f24870e;
        int i3 = c12431e.f24868e;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((C2877e) objArr2[i4]).license(c12309e) || z4;
        }
        c17666e.vip(c12309e);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.vip = false;
        if (this.appmetrica) {
            this.appmetrica = false;
            C12328e c12328e = this.purchase;
            int i5 = c12328e.vip;
            for (int i6 = 0; i6 < i5; i6++) {
                license((AbstractC13616e) c12328e.yandex(i6));
            }
            c12328e.purchase();
        }
        if (this.metrica) {
            this.metrica = false;
            metrica();
        }
        if (this.license) {
            this.license = false;
            c17666e.ad.startapp();
        }
        return z2;
    }
}
