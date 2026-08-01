package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٞۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17908e implements InterfaceC17242e {
    public final int Signature;
    public final C8305e ad;
    public final int adcel;
    public final EnumC17426e admob;
    public final Function1 advert;
    public final int amazon;
    public final InterfaceC17242e appmetrica;
    public final boolean billing;
    public final float license;
    public final int loadAd;
    public final boolean metrica;
    public final Function1 mopub;
    public final float purchase;
    public final int remoteconfig;
    public final Object smaato;
    public final InterfaceC14388e startapp;
    public final int subscription;
    public final int vip;
    public final InterfaceC18435e yandex;

    public C17908e(C8305e c8305e, int i, boolean z, float f, InterfaceC17242e interfaceC17242e, float f2, boolean z2, InterfaceC18435e interfaceC18435e, InterfaceC14388e interfaceC14388e, int i2, Function1 function1, Function1 function12, List list, int i3, int i4, int i5, EnumC17426e enumC17426e, int i6, int i7) {
        this.ad = c8305e;
        this.vip = i;
        this.metrica = z;
        this.license = f;
        this.appmetrica = interfaceC17242e;
        this.purchase = f2;
        this.billing = z2;
        this.yandex = interfaceC18435e;
        this.startapp = interfaceC14388e;
        this.adcel = i2;
        this.mopub = function1;
        this.advert = function12;
        this.smaato = list;
        this.amazon = i3;
        this.loadAd = i4;
        this.Signature = i5;
        this.admob = enumC17426e;
        this.subscription = i6;
        this.remoteconfig = i7;
    }

    @Override // defpackage.InterfaceC17242e
    public final Map ad() {
        return this.appmetrica.ad();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public final C17908e appmetrica(int i, boolean z) {
        C8305e c8305e;
        int i2;
        List list;
        int i3;
        int i4;
        long j;
        List list2;
        int i5;
        if (this.billing) {
            return null;
        }
        ?? r2 = this.smaato;
        if (r2.isEmpty() || (c8305e = this.ad) == null) {
            return null;
        }
        int i6 = c8305e.yandex;
        int i7 = this.vip - i;
        if (i7 < 0 || i7 >= i6) {
            return null;
        }
        C6564e c6564e = (C6564e) AbstractC13480e.m3591interface(r2);
        C6564e c6564e2 = (C6564e) AbstractC13480e.m3570break(r2);
        if (c6564e.inmobi || c6564e2.inmobi) {
            return null;
        }
        int i8 = this.loadAd;
        int i9 = this.amazon;
        EnumC17426e enumC17426e = this.admob;
        if (i < 0) {
            if (Math.min((AbstractC3167e.ad(c6564e, enumC17426e) + c6564e.Signature) - i9, (AbstractC3167e.ad(c6564e2, enumC17426e) + c6564e2.Signature) - i8) <= (-i)) {
                return null;
            }
        } else if (Math.min(i9 - AbstractC3167e.ad(c6564e, enumC17426e), i8 - AbstractC3167e.ad(c6564e2, enumC17426e)) <= i) {
            return null;
        }
        int size = r2.size();
        int i10 = 0;
        List list3 = r2;
        while (i10 < size) {
            C6564e c6564e3 = (C6564e) list3.get(i10);
            boolean z2 = c6564e3.metrica;
            if (c6564e3.inmobi) {
                list = list3;
                i3 = size;
                i2 = i7;
            } else {
                long j2 = c6564e3.signatures;
                long j3 = 4294967295L;
                i2 = i7;
                c6564e3.signatures = ((z2 ? (int) (j2 >> 32) : ((int) (j2 >> 32)) + i) << 32) | ((z2 ? ((int) (j2 & 4294967295L)) + i : (int) (j2 & 4294967295L)) & 4294967295L);
                if (z) {
                    int size2 = c6564e3.yandex.size();
                    int i11 = 0;
                    list3 = list3;
                    while (i11 < size2) {
                        C0110e vip = c6564e3.mopub.vip(i11, c6564e3.vip);
                        if (vip != null) {
                            long j4 = vip.advert;
                            if (z2) {
                                j = j3;
                                i5 = (int) (j4 >> 32);
                            } else {
                                j = j3;
                                i5 = ((int) (j4 >> 32)) + i;
                            }
                            list2 = list3;
                            i4 = size;
                            vip.advert = ((z2 ? ((int) (j4 & j)) + i : (int) (j4 & j)) & j) | (i5 << 32);
                        } else {
                            i4 = size;
                            j = j3;
                            list2 = list3;
                        }
                        i11++;
                        list3 = list2;
                        j3 = j;
                        size = i4;
                    }
                }
                list = list3;
                i3 = size;
            }
            i10++;
            i7 = i2;
            list3 = list;
            size = i3;
        }
        return new C17908e(this.ad, i7, this.metrica || i > 0, i, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.adcel, this.mopub, this.advert, list3, this.amazon, this.loadAd, this.Signature, enumC17426e, this.subscription, this.remoteconfig);
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
