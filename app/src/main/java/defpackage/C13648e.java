package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘْۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13648e implements InterfaceC17242e {
    public final int Signature;
    public final C3225e ad;
    public final long adcel;
    public final int admob;
    public final int advert;
    public final int amazon;
    public final InterfaceC17242e appmetrica;
    public final boolean billing;
    public final float license;
    public final EnumC17426e loadAd;
    public final boolean metrica;
    public final Object mopub;
    public final float purchase;
    public final int smaato;
    public final InterfaceC14388e startapp;
    public final int vip;
    public final InterfaceC18435e yandex;

    public C13648e(C3225e c3225e, int i, boolean z, float f, InterfaceC17242e interfaceC17242e, float f2, boolean z2, InterfaceC18435e interfaceC18435e, InterfaceC14388e interfaceC14388e, long j, List list, int i2, int i3, int i4, EnumC17426e enumC17426e, int i5, int i6) {
        this.ad = c3225e;
        this.vip = i;
        this.metrica = z;
        this.license = f;
        this.appmetrica = interfaceC17242e;
        this.purchase = f2;
        this.billing = z2;
        this.yandex = interfaceC18435e;
        this.startapp = interfaceC14388e;
        this.adcel = j;
        this.mopub = list;
        this.advert = i2;
        this.smaato = i3;
        this.amazon = i4;
        this.loadAd = enumC17426e;
        this.Signature = i5;
        this.admob = i6;
    }

    @Override // defpackage.InterfaceC17242e
    public final Map ad() {
        return this.appmetrica.ad();
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public final C13648e appmetrica(int i, boolean z) {
        C3225e c3225e;
        int i2;
        int i3;
        int i4;
        if (this.billing) {
            return null;
        }
        ?? r15 = this.mopub;
        if (r15.isEmpty() || (c3225e = this.ad) == null) {
            return null;
        }
        int i5 = c3225e.admob;
        int i6 = this.vip - i;
        if (i6 < 0 || i6 >= i5) {
            return null;
        }
        C3225e c3225e2 = (C3225e) AbstractC13480e.m3591interface(r15);
        C3225e c3225e3 = (C3225e) AbstractC13480e.m3570break(r15);
        if (c3225e2.remoteconfig || c3225e3.remoteconfig) {
            return null;
        }
        int i7 = this.smaato;
        int i8 = this.advert;
        if (i < 0) {
            if (Math.min((c3225e2.loadAd + c3225e2.admob) - i8, (c3225e3.loadAd + c3225e3.admob) - i7) <= (-i)) {
                return null;
            }
        } else if (Math.min(i8 - c3225e2.loadAd, i7 - c3225e3.loadAd) <= i) {
            return null;
        }
        int size = r15.size();
        int i9 = 0;
        while (i9 < size) {
            C3225e c3225e4 = (C3225e) r15.get(i9);
            boolean z2 = c3225e4.metrica;
            int[] iArr = c3225e4.isVip;
            if (!c3225e4.remoteconfig) {
                c3225e4.loadAd += i;
                int length = iArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 & 1;
                    if ((z2 && i11 != 0) || (!z2 && i11 == 0)) {
                        iArr[i10] = iArr[i10] + i;
                    }
                }
                if (z) {
                    int size2 = c3225e4.vip.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        C0110e vip = c3225e4.smaato.vip(i12, c3225e4.mopub);
                        if (vip != null) {
                            long j = vip.advert;
                            if (z2) {
                                i2 = i9;
                                i3 = (int) (j >> 32);
                                i4 = ((int) (j & 4294967295L)) + i;
                            } else {
                                i2 = i9;
                                i3 = ((int) (j >> 32)) + i;
                                i4 = (int) (j & 4294967295L);
                            }
                            vip.advert = (i4 & 4294967295L) | (i3 << 32);
                        } else {
                            i2 = i9;
                        }
                        i12++;
                        i9 = i2;
                    }
                }
            }
            i9++;
        }
        return new C13648e(this.ad, i6, this.metrica || i > 0, i, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.adcel, r15, this.advert, this.smaato, this.amazon, this.loadAd, this.Signature, this.admob);
    }

    @Override // defpackage.InterfaceC17242e
    public final int getWidth() {
        return this.appmetrica.getWidth();
    }

    @Override // defpackage.InterfaceC17242e
    public final Function1 license() {
        return this.appmetrica.license();
    }

    @Override // defpackage.InterfaceC17242e
    public final void metrica() {
        this.appmetrica.metrica();
    }

    public final long purchase() {
        InterfaceC17242e interfaceC17242e = this.appmetrica;
        return (interfaceC17242e.getWidth() << 32) | (interfaceC17242e.vip() & 4294967295L);
    }

    @Override // defpackage.InterfaceC17242e
    public final int vip() {
        return this.appmetrica.vip();
    }
}
