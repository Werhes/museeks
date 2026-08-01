package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًًٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8076e implements InterfaceC17242e {
    public final int Signature;
    public final int[] ad;
    public final C0444e adcel;
    public final int admob;
    public final int advert;
    public final long amazon;
    public final float appmetrica;
    public final boolean billing;
    public final InterfaceC17242e license;
    public final int loadAd;
    public final float metrica;
    public final InterfaceC14388e mopub;
    public final InterfaceC18435e pro;
    public final boolean purchase;
    public final int remoteconfig;
    public final EnumC17426e signatures;
    public final Object smaato;
    public final C0085e startapp;
    public final int subscription;
    public final int[] vip;
    public final boolean yandex;

    public C8076e(int[] iArr, int[] iArr2, float f, InterfaceC17242e interfaceC17242e, float f2, boolean z, boolean z2, boolean z3, C0085e c0085e, C0444e c0444e, InterfaceC14388e interfaceC14388e, int i, List list, long j, int i2, int i3, int i4, int i5, int i6, InterfaceC18435e interfaceC18435e) {
        this.ad = iArr;
        this.vip = iArr2;
        this.metrica = f;
        this.license = interfaceC17242e;
        this.appmetrica = f2;
        this.purchase = z;
        this.billing = z2;
        this.yandex = z3;
        this.startapp = c0085e;
        this.adcel = c0444e;
        this.mopub = interfaceC14388e;
        this.advert = i;
        this.smaato = list;
        this.amazon = j;
        this.loadAd = i2;
        this.Signature = i3;
        this.admob = i4;
        this.subscription = i5;
        this.remoteconfig = i6;
        this.pro = interfaceC18435e;
        this.signatures = z2 ? EnumC17426e.f34146e : EnumC17426e.f34145e;
    }

    @Override // defpackage.InterfaceC17242e
    public final Map ad() {
        return this.license.ad();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public final C8076e appmetrica(int i, boolean z) {
        char c;
        long j;
        long j2;
        int i2;
        if (this.yandex) {
            return null;
        }
        ?? r2 = this.smaato;
        if (r2.isEmpty()) {
            return null;
        }
        int[] iArr = this.ad;
        if (iArr.length == 0) {
            return null;
        }
        int[] iArr2 = this.vip;
        if (iArr2.length == 0) {
            return null;
        }
        int i3 = this.subscription;
        int i4 = this.Signature;
        int i5 = i4 - i3;
        int size = r2.size();
        for (int i6 = 0; i6 < size; i6++) {
            C13668e c13668e = (C13668e) r2.get(i6);
            boolean z2 = c13668e.subscription;
            int i7 = c13668e.amazon;
            if (z2) {
                return null;
            }
            if ((c13668e.metrica() <= 0) != (c13668e.metrica() + i <= 0)) {
                return null;
            }
            int metrica = c13668e.metrica();
            int i8 = this.loadAd;
            if (metrica <= i8) {
                if (i < 0) {
                    if ((c13668e.metrica() + i7) - i8 <= (-i)) {
                        return null;
                    }
                } else if (i8 - c13668e.metrica() <= i) {
                    return null;
                }
            }
            if (c13668e.metrica() + i7 >= i5) {
                if (i < 0) {
                    if ((c13668e.metrica() + i7) - i4 <= (-i)) {
                        return null;
                    }
                } else if (i4 - c13668e.metrica() <= i) {
                    return null;
                }
            }
        }
        int size2 = r2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            C13668e c13668e2 = (C13668e) r2.get(i9);
            boolean z3 = c13668e2.license;
            if (!c13668e2.subscription) {
                long j3 = c13668e2.pro;
                char c2 = ' ';
                long j4 = 4294967295L;
                c13668e2.pro = ((z3 ? (int) (j3 >> 32) : ((int) (j3 >> 32)) + i) << 32) | ((z3 ? ((int) (j3 & 4294967295L)) + i : (int) (j3 & 4294967295L)) & 4294967295L);
                if (z) {
                    int size3 = c13668e2.metrica.size();
                    int i10 = 0;
                    while (i10 < size3) {
                        C0110e vip = c13668e2.adcel.vip(i10, c13668e2.vip);
                        if (vip != null) {
                            char c3 = c2;
                            long j5 = vip.advert;
                            if (z3) {
                                c = c3;
                                j2 = j5;
                                i2 = (int) (j2 >> c);
                            } else {
                                c = c3;
                                j2 = j5;
                                i2 = ((int) (j2 >> c)) + i;
                            }
                            int i11 = z3 ? ((int) (j2 & j4)) + i : (int) (j2 & j4);
                            j = j4;
                            vip.advert = (i11 & j) | (i2 << c);
                        } else {
                            c = c2;
                            j = j4;
                        }
                        i10++;
                        c2 = c;
                        j4 = j;
                    }
                }
            }
        }
        int length = iArr2.length;
        int[] iArr3 = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr3[i12] = iArr2[i12] - i;
        }
        return new C8076e(iArr, iArr3, i, this.license, this.appmetrica, this.purchase || i > 0, this.billing, this.yandex, this.startapp, this.adcel, this.mopub, this.advert, r2, this.amazon, this.loadAd, this.Signature, this.admob, this.subscription, this.remoteconfig, this.pro);
    }

    @Override // defpackage.InterfaceC17242e
    public final int getWidth() {
        return this.license.getWidth();
    }

    @Override // defpackage.InterfaceC17242e
    public final Function1 license() {
        return this.license.license();
    }

    @Override // defpackage.InterfaceC17242e
    public final void metrica() {
        this.license.metrica();
    }

    @Override // defpackage.InterfaceC17242e
    public final int vip() {
        return this.license.vip();
    }
}
