package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٙ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11816e {
    public final int ad;
    public final boolean adcel;
    public final boolean appmetrica;
    public final C3335e billing;
    public final boolean license;
    public final int metrica;
    public final boolean mopub;
    public final int purchase;
    public final int startapp;
    public final int vip;
    public final int yandex;

    public C11816e(C10099e c10099e) {
        this.ad = c10099e.ad;
        this.vip = c10099e.vip;
        this.metrica = c10099e.metrica;
        this.license = c10099e.license;
        this.appmetrica = c10099e.appmetrica;
        this.purchase = c10099e.purchase;
        this.billing = c10099e.billing;
        this.yandex = c10099e.yandex;
        this.startapp = c10099e.startapp;
        this.adcel = c10099e.adcel;
        this.mopub = c10099e.mopub;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eَؘۤ, java.lang.Object] */
    public final C10099e ad() {
        ?? obj = new Object();
        obj.ad = this.ad;
        obj.vip = this.vip;
        obj.metrica = this.metrica;
        obj.license = this.license;
        obj.appmetrica = this.appmetrica;
        obj.purchase = this.purchase;
        obj.billing = this.billing;
        obj.yandex = this.yandex;
        obj.startapp = this.startapp;
        obj.adcel = this.adcel;
        obj.mopub = this.mopub;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11816e.class != obj.getClass()) {
            return false;
        }
        C11816e c11816e = (C11816e) obj;
        return this.ad == c11816e.ad && this.vip == c11816e.vip && this.metrica == c11816e.metrica && this.license == c11816e.license && this.appmetrica == c11816e.appmetrica && this.purchase == c11816e.purchase && this.yandex == c11816e.yandex && this.startapp == c11816e.startapp && this.adcel == c11816e.adcel && this.mopub == c11816e.mopub && this.billing.equals(c11816e.billing);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.ad), Integer.valueOf(this.vip), Integer.valueOf(this.metrica), Boolean.valueOf(this.license), Boolean.valueOf(this.appmetrica), Integer.valueOf(this.purchase), this.billing, Integer.valueOf(this.yandex), Integer.valueOf(this.startapp), Boolean.valueOf(this.mopub), Boolean.valueOf(this.adcel));
    }
}
