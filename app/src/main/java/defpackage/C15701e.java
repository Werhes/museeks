package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۚؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15701e {
    public final C18208e ad;
    public final boolean adcel;
    public final long appmetrica;
    public final boolean billing;
    public final long license;
    public final long metrica;
    public final boolean mopub;
    public final long purchase;
    public final boolean startapp;
    public final long vip;
    public final boolean yandex;

    public C15701e(C18208e c18208e, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        AbstractC2301e.billing(!z5 || z3);
        AbstractC2301e.billing(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        AbstractC2301e.billing(z6);
        this.ad = c18208e;
        this.vip = j;
        this.metrica = j2;
        this.license = j3;
        this.appmetrica = j4;
        this.purchase = j5;
        this.billing = z;
        this.yandex = z2;
        this.startapp = z3;
        this.adcel = z4;
        this.mopub = z5;
    }

    public final C15701e ad(long j) {
        if (j == this.license) {
            return this;
        }
        return new C15701e(this.ad, this.vip, this.metrica, j, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.adcel, this.mopub);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15701e.class == obj.getClass()) {
            C15701e c15701e = (C15701e) obj;
            if (this.vip == c15701e.vip && this.license == c15701e.license && this.appmetrica == c15701e.appmetrica && this.purchase == c15701e.purchase && this.billing == c15701e.billing && this.yandex == c15701e.yandex && this.startapp == c15701e.startapp && this.adcel == c15701e.adcel && this.mopub == c15701e.mopub && Objects.equals(this.ad, c15701e.ad)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.ad.hashCode() + 527) * 31) + ((int) this.vip)) * 31) + ((int) this.license)) * 31) + ((int) this.appmetrica)) * 31) + ((int) this.purchase)) * 31) + (this.billing ? 1 : 0)) * 31) + (this.yandex ? 1 : 0)) * 31) + (this.startapp ? 1 : 0)) * 31) + (this.adcel ? 1 : 0)) * 31) + (this.mopub ? 1 : 0);
    }

    public final C15701e vip(long j, long j2) {
        if (j == this.vip && j2 == this.metrica) {
            return this;
        }
        return new C15701e(this.ad, j, j2, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.adcel, this.mopub);
    }
}
