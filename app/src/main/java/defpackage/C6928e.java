package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6928e implements InterfaceC1272e {
    public boolean Signature;
    public final int ad;
    public final SparseBooleanArray adcel;
    public boolean admob;
    public C11016e advert;
    public int amazon;
    public final SparseIntArray appmetrica;
    public final InterfaceC7854e billing;
    public final C1292e license;
    public boolean loadAd;
    public final List metrica;
    public final C11737e mopub;
    public int pro;
    public final C6233e purchase;
    public int remoteconfig;
    public InterfaceC5483e smaato;
    public final SparseBooleanArray startapp;
    public InterfaceC15956e subscription;
    public final int vip;
    public final SparseArray yandex;

    public C6928e(int i, int i2, InterfaceC7854e interfaceC7854e, C8010e c8010e, C6233e c6233e) {
        this.purchase = c6233e;
        this.ad = i;
        this.vip = i2;
        this.billing = interfaceC7854e;
        if (i == 1 || i == 2) {
            this.metrica = Collections.singletonList(c8010e);
        } else {
            ArrayList arrayList = new ArrayList();
            this.metrica = arrayList;
            arrayList.add(c8010e);
        }
        this.license = new C1292e(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.startapp = sparseBooleanArray;
        this.adcel = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.yandex = sparseArray;
        this.appmetrica = new SparseIntArray();
        this.mopub = new C11737e(1);
        this.smaato = InterfaceC5483e.isVip;
        this.pro = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (InterfaceC15956e) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new C16531e(new C11883e(this)));
        this.subscription = null;
    }

    @Override // defpackage.InterfaceC1272e
    public final InterfaceC1272e ad() {
        return this;
    }

    @Override // defpackage.InterfaceC1272e
    public final List appmetrica() {
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    @Override // defpackage.InterfaceC1272e
    public final void license(long j, long j2) {
        C11016e c11016e;
        AbstractC2301e.subscription(this.ad != 2);
        List list = this.metrica;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C8010e c8010e = (C8010e) list.get(i);
            boolean z = c8010e.appmetrica() == -9223372036854775807L;
            if (!z) {
                long license = c8010e.license();
                z = (license == -9223372036854775807L || license == 0 || license == j2) ? false : true;
            }
            if (z) {
                c8010e.billing(j2);
            }
        }
        if (j2 != 0 && (c11016e = this.advert) != null) {
            c11016e.ads(j2);
        }
        this.license.m564extends(0);
        this.appmetrica.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.yandex;
            if (i2 >= sparseArray.size()) {
                this.remoteconfig = 0;
                return;
            } else {
                ((InterfaceC15956e) sparseArray.valueAt(i2)).vip();
                i2++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // defpackage.InterfaceC1272e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean metrica(defpackage.InterfaceC2283e r7) {
        /*
            r6 = this;
            eؒۙۚ r0 = r6.license
            byte[] r0 = r0.ad
            eٟٔؑ r7 = (defpackage.C14446e) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.billing(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.purchase(r2, r1)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6928e.metrica(eَؔؐ):boolean");
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        if ((this.vip & 1) == 0) {
            interfaceC5483e = new C5609e(interfaceC5483e, this.billing);
        }
        this.smaato = interfaceC5483e;
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v18, types: [eُٕٚ, eٌٕۗ] */
    @Override // defpackage.InterfaceC1272e
    public final int vip(InterfaceC2283e interfaceC2283e, C14829e c14829e) {
        InterfaceC2283e interfaceC2283e2;
        ?? r1;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        long length = interfaceC2283e.getLength();
        int i5 = this.ad;
        boolean z2 = i5 == 2;
        if (this.loadAd) {
            long j = -9223372036854775807L;
            C11737e c11737e = this.mopub;
            if (length != -1 && !z2 && !c11737e.license) {
                int i6 = this.pro;
                C8010e c8010e = c11737e.vip;
                C1292e c1292e = c11737e.metrica;
                if (i6 <= 0) {
                    c11737e.ad(interfaceC2283e);
                    return 0;
                }
                if (c11737e.purchase) {
                    if (c11737e.yandex == -9223372036854775807L) {
                        c11737e.ad(interfaceC2283e);
                        return 0;
                    }
                    if (c11737e.appmetrica) {
                        long j2 = c11737e.billing;
                        if (j2 == -9223372036854775807L) {
                            c11737e.ad(interfaceC2283e);
                            return 0;
                        }
                        c11737e.startapp = c8010e.metrica(c11737e.yandex) - c8010e.vip(j2);
                        c11737e.ad(interfaceC2283e);
                        return 0;
                    }
                    int min = (int) Math.min(112800, interfaceC2283e.getLength());
                    long j3 = 0;
                    if (interfaceC2283e.getPosition() != j3) {
                        c14829e.f29362e = j3;
                        return 1;
                    }
                    c1292e.m564extends(min);
                    interfaceC2283e.smaato();
                    interfaceC2283e.ad(0, min, c1292e.ad);
                    int i7 = c1292e.vip;
                    int i8 = c1292e.metrica;
                    while (true) {
                        if (i7 >= i8) {
                            break;
                        }
                        if (c1292e.ad[i7] == 71) {
                            long billing = AbstractC13461e.billing(c1292e, i7, i6);
                            if (billing != -9223372036854775807L) {
                                j = billing;
                                break;
                            }
                        }
                        i7++;
                    }
                    c11737e.billing = j;
                    c11737e.appmetrica = true;
                    return 0;
                }
                long length2 = interfaceC2283e.getLength();
                int min2 = (int) Math.min(112800, length2);
                long j4 = length2 - min2;
                if (interfaceC2283e.getPosition() != j4) {
                    c14829e.f29362e = j4;
                    return 1;
                }
                c1292e.m564extends(min2);
                interfaceC2283e.smaato();
                interfaceC2283e.ad(0, min2, c1292e.ad);
                int i9 = c1292e.vip;
                int i10 = c1292e.metrica;
                int i11 = i10 - 188;
                while (true) {
                    if (i11 < i9) {
                        break;
                    }
                    byte[] bArr = c1292e.ad;
                    int i12 = -4;
                    int i13 = 0;
                    while (true) {
                        if (i12 > 4) {
                            break;
                        }
                        int i14 = (i12 * 188) + i11;
                        if (i14 < i9 || i14 >= i10 || bArr[i14] != 71) {
                            i13 = 0;
                        } else {
                            i13++;
                            if (i13 == 5) {
                                long billing2 = AbstractC13461e.billing(c1292e, i11, i6);
                                if (billing2 != -9223372036854775807L) {
                                    j = billing2;
                                    break;
                                }
                            }
                        }
                        i12++;
                    }
                    i11--;
                }
                c11737e.yandex = j;
                c11737e.purchase = true;
                return 0;
            }
            if (this.Signature) {
                i = 1;
                z = false;
                i2 = i5;
            } else {
                this.Signature = true;
                long j5 = c11737e.startapp;
                if (j5 != -9223372036854775807L) {
                    i = 1;
                    z = false;
                    i2 = i5;
                    ?? abstractC8712e = new AbstractC8712e(new C5438e(24), new Csuper(this.pro, c11737e.vip), j5, 1 + j5, 0L, length, 188L, 940);
                    this.advert = abstractC8712e;
                    this.smaato.pro((C2769e) abstractC8712e.metrica);
                } else {
                    i = 1;
                    z = false;
                    i2 = i5;
                    this.smaato.pro(new C5990e(j5));
                }
            }
            if (this.admob) {
                this.admob = z;
                license(0L, 0L);
                if (interfaceC2283e.getPosition() != 0) {
                    c14829e.f29362e = 0L;
                    return i;
                }
            }
            C11016e c11016e = this.advert;
            if (c11016e != null && ((C17909e) c11016e.appmetrica) != null) {
                return c11016e.pro(interfaceC2283e, c14829e);
            }
            interfaceC2283e2 = interfaceC2283e;
            r1 = z;
        } else {
            interfaceC2283e2 = interfaceC2283e;
            r1 = 0;
            i = 1;
            i2 = i5;
        }
        C1292e c1292e2 = this.license;
        byte[] bArr2 = c1292e2.ad;
        if (9400 - c1292e2.vip < 188) {
            int ad = c1292e2.ad();
            if (ad > 0) {
                System.arraycopy(bArr2, c1292e2.vip, bArr2, r1, ad);
            }
            c1292e2.m570throw(ad, bArr2);
        }
        while (true) {
            int ad2 = c1292e2.ad();
            SparseArray sparseArray = this.yandex;
            if (ad2 >= 188) {
                int i15 = c1292e2.vip;
                int i16 = c1292e2.metrica;
                byte[] bArr3 = c1292e2.ad;
                int i17 = i15;
                while (i17 < i16 && bArr3[i17] != 71) {
                    i17++;
                }
                c1292e2.m571try(i17);
                int i18 = i17 + 188;
                if (i18 > i16) {
                    int i19 = (i17 - i15) + this.remoteconfig;
                    this.remoteconfig = i19;
                    i3 = i2;
                    i4 = 2;
                    if (i3 == 2 && i19 > 376) {
                        throw C15125e.ad(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i3 = i2;
                    i4 = 2;
                    this.remoteconfig = r1;
                }
                int i20 = c1292e2.metrica;
                if (i18 > i20) {
                    return r1;
                }
                int smaato = c1292e2.smaato();
                if ((8388608 & smaato) != 0) {
                    c1292e2.m571try(i18);
                    return r1;
                }
                int i21 = (4194304 & smaato) != 0 ? 1 : r1;
                int i22 = (2096896 & smaato) >> 8;
                boolean z3 = (smaato & 32) != 0 ? true : r1;
                InterfaceC15956e interfaceC15956e = (smaato & 16) != 0 ? (InterfaceC15956e) sparseArray.get(i22) : null;
                if (interfaceC15956e == null) {
                    c1292e2.m571try(i18);
                    return r1;
                }
                if (i3 != i4) {
                    int i23 = smaato & 15;
                    SparseIntArray sparseIntArray = this.appmetrica;
                    int i24 = sparseIntArray.get(i22, i23 - 1);
                    sparseIntArray.put(i22, i23);
                    if (i24 == i23) {
                        c1292e2.m571try(i18);
                        return r1;
                    }
                    if (i23 != ((i24 + 1) & 15)) {
                        interfaceC15956e.vip();
                    }
                }
                if (z3) {
                    int ads = c1292e2.ads();
                    i21 |= (c1292e2.ads() & 64) != 0 ? i4 : r1;
                    c1292e2.m568protected(ads - 1);
                }
                boolean z4 = this.loadAd;
                if (i3 == i4 || z4 || !this.adcel.get(i22, r1)) {
                    c1292e2.m572while(i18);
                    interfaceC15956e.ad(i21, c1292e2);
                    c1292e2.m572while(i20);
                }
                if (i3 != i4 && !z4 && this.loadAd && length != -1) {
                    this.admob = true;
                }
                c1292e2.m571try(i18);
                return r1;
            }
            int i25 = c1292e2.metrica;
            int read = interfaceC2283e2.read(bArr2, i25, 9400 - i25);
            if (read == -1) {
                int i26 = r1;
                while (i26 < sparseArray.size()) {
                    InterfaceC15956e interfaceC15956e2 = (InterfaceC15956e) sparseArray.valueAt(i26);
                    if (interfaceC15956e2 instanceof C14921e) {
                        C14921e c14921e = (C14921e) interfaceC15956e2;
                        int i27 = (!z2 || c14921e.license()) ? i : r1;
                        if (c14921e.metrica == 3 && c14921e.adcel == -1 && ((!z2 || !(c14921e.ad instanceof C9090e)) && i27 != 0)) {
                            c14921e.ad(i, new C1292e());
                        }
                    }
                    i26++;
                    i = 1;
                }
                return -1;
            }
            c1292e2.m572while(i25 + read);
            i = 1;
        }
    }
}
