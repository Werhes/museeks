package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9671e {
    public String ad;
    public C6342e adcel;
    public long advert;
    public InterfaceC15374e amazon;
    public boolean appmetrica;
    public int billing;
    public int license;
    public EnumC7792e loadAd;
    public InterfaceC2141e metrica;
    public boolean mopub;
    public int purchase;
    public long remoteconfig;
    public C7666e smaato;
    public InterfaceC14388e startapp;
    public C1839e vip;
    public long yandex = AbstractC9795e.ad;
    public long Signature = AbstractC2278e.yandex(0, 0, 0, 0);
    public int admob = -1;
    public int subscription = -1;

    public C9671e(String str, C1839e c1839e, InterfaceC2141e interfaceC2141e, int i, boolean z, int i2, int i3) {
        this.ad = str;
        this.vip = c1839e;
        this.metrica = interfaceC2141e;
        this.license = i;
        this.appmetrica = z;
        this.purchase = i2;
        this.billing = i3;
        long j = 0;
        this.advert = (j & 4294967295L) | (j << 32);
    }

    public final int ad(int i, EnumC7792e enumC7792e) {
        int i2 = this.admob;
        int i3 = this.subscription;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long ad = AbstractC2278e.ad(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
        if (this.billing > 1) {
            C7666e mopub = AbstractC7844e.mopub(this.smaato, enumC7792e, this.vip, this.startapp, this.metrica);
            this.smaato = mopub;
            ad = mopub.ad(this.billing, ad);
        }
        InterfaceC15374e appmetrica = appmetrica(enumC7792e);
        long vip = AbstractC3415e.vip(appmetrica.mo2750extends(), this.license, ad, this.appmetrica);
        boolean z = this.appmetrica;
        int i4 = this.license;
        int i5 = this.purchase;
        int billing = AbstractC7861e.billing(new C6342e((C9904e) appmetrica, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, vip).adcel());
        int startapp = C5602e.startapp(ad);
        if (billing < startapp) {
            billing = startapp;
        }
        this.admob = i;
        this.subscription = billing;
        return billing;
    }

    public final InterfaceC15374e appmetrica(EnumC7792e enumC7792e) {
        InterfaceC15374e interfaceC15374e = this.amazon;
        if (interfaceC15374e == null || enumC7792e != this.loadAd || interfaceC15374e.vip()) {
            this.loadAd = enumC7792e;
            String str = this.ad;
            C1839e license = AbstractC15890e.license(this.vip, enumC7792e);
            InterfaceC14388e interfaceC14388e = this.startapp;
            InterfaceC2141e interfaceC2141e = this.metrica;
            C13664e c13664e = C13664e.f27089e;
            interfaceC15374e = new C9904e(str, license, c13664e, c13664e, interfaceC2141e, interfaceC14388e);
        }
        this.amazon = interfaceC15374e;
        return interfaceC15374e;
    }

    public final void license(InterfaceC14388e interfaceC14388e) {
        long j;
        InterfaceC14388e interfaceC14388e2 = this.startapp;
        if (interfaceC14388e != null) {
            int i = AbstractC9795e.vip;
            j = AbstractC9795e.ad(interfaceC14388e.vip(), interfaceC14388e.mo499package());
        } else {
            j = AbstractC9795e.ad;
        }
        if (interfaceC14388e2 == null) {
            this.startapp = interfaceC14388e;
            this.yandex = j;
        } else if (interfaceC14388e == null || this.yandex != j) {
            this.startapp = interfaceC14388e;
            this.yandex = j;
            this.remoteconfig = (this.remoteconfig << 2) | 1;
            metrica();
        }
    }

    public final void metrica() {
        this.adcel = null;
        this.amazon = null;
        this.loadAd = null;
        this.admob = -1;
        this.subscription = -1;
        this.Signature = AbstractC2278e.yandex(0, 0, 0, 0);
        long j = 0;
        this.advert = (j & 4294967295L) | (j << 32);
        this.mopub = false;
    }

    public final void purchase(String str, C1839e c1839e, InterfaceC2141e interfaceC2141e, int i, boolean z, int i2, int i3) {
        this.ad = str;
        this.vip = c1839e;
        this.metrica = interfaceC2141e;
        this.license = i;
        this.appmetrica = z;
        this.purchase = i2;
        this.billing = i3;
        this.remoteconfig = (this.remoteconfig << 2) | 2;
        metrica();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.adcel != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) AbstractC9795e.vip(this.yandex));
        sb.append(", history=");
        return AbstractC5087e.m1750native(this.remoteconfig, ", constraints=$)", sb);
    }

    public final boolean vip(long j, EnumC7792e enumC7792e) {
        long j2;
        InterfaceC15374e interfaceC15374e;
        this.remoteconfig = (this.remoteconfig << 2) | 3;
        boolean z = true;
        if (this.billing > 1) {
            C7666e mopub = AbstractC7844e.mopub(this.smaato, enumC7792e, this.vip, this.startapp, this.metrica);
            this.smaato = mopub;
            j2 = mopub.ad(this.billing, j);
        } else {
            j2 = j;
        }
        C6342e c6342e = this.adcel;
        boolean z2 = false;
        if (c6342e != null && (interfaceC15374e = this.amazon) != null && !interfaceC15374e.vip() && enumC7792e == this.loadAd && (C5602e.vip(j2, this.Signature) || (C5602e.yandex(j2) == C5602e.yandex(this.Signature) && C5602e.adcel(j2) == C5602e.adcel(this.Signature) && C5602e.billing(j2) >= c6342e.adcel() && !((C6458e) c6342e.f13185e).license))) {
            if (!C5602e.vip(j2, this.Signature)) {
                C6342e c6342e2 = this.adcel;
                this.advert = AbstractC2278e.license(j2, (AbstractC7861e.billing(Math.min(((C9904e) c6342e2.f13183e).f19539e.metrica(), c6342e2.amazon())) << 32) | (AbstractC7861e.billing(c6342e2.adcel()) & 4294967295L));
                if (this.license == 3 || (((int) (r12 >> 32)) >= c6342e2.amazon() && ((int) (4294967295L & r12)) >= c6342e2.adcel())) {
                    z = false;
                }
                this.mopub = z;
                this.Signature = j2;
            }
            return false;
        }
        InterfaceC15374e appmetrica = appmetrica(enumC7792e);
        long vip = AbstractC3415e.vip(appmetrica.mo2750extends(), this.license, j2, this.appmetrica);
        boolean z3 = this.appmetrica;
        int i = this.license;
        int i2 = this.purchase;
        C6342e c6342e3 = new C6342e((C9904e) appmetrica, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, vip);
        this.Signature = j2;
        this.advert = AbstractC2278e.license(j2, (AbstractC7861e.billing(c6342e3.adcel()) & 4294967295L) | (AbstractC7861e.billing(c6342e3.amazon()) << 32));
        if (this.license != 3 && (((int) (r1 >> 32)) < c6342e3.amazon() || ((int) (r1 & 4294967295L)) < c6342e3.adcel())) {
            z2 = true;
        }
        this.mopub = z2;
        this.adcel = c6342e3;
        return true;
    }
}
