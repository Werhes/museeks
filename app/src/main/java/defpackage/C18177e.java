package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18177e {
    public final long ad;
    public final long adcel;
    public final long appmetrica;
    public final int billing;
    public final C18208e license;
    public final int metrica;
    public final AbstractC6690e purchase;
    public final long startapp;
    public final AbstractC6690e vip;
    public final C18208e yandex;

    public C18177e(long j, AbstractC6690e abstractC6690e, int i, C18208e c18208e, long j2, AbstractC6690e abstractC6690e2, int i2, C18208e c18208e2, long j3, long j4) {
        this.ad = j;
        this.vip = abstractC6690e;
        this.metrica = i;
        this.license = c18208e;
        this.appmetrica = j2;
        this.purchase = abstractC6690e2;
        this.billing = i2;
        this.yandex = c18208e2;
        this.startapp = j3;
        this.adcel = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18177e.class == obj.getClass()) {
            C18177e c18177e = (C18177e) obj;
            if (this.ad == c18177e.ad && this.metrica == c18177e.metrica && this.appmetrica == c18177e.appmetrica && this.billing == c18177e.billing && this.startapp == c18177e.startapp && this.adcel == c18177e.adcel && Objects.equals(this.vip, c18177e.vip) && Objects.equals(this.license, c18177e.license) && Objects.equals(this.purchase, c18177e.purchase) && Objects.equals(this.yandex, c18177e.yandex)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.ad), this.vip, Integer.valueOf(this.metrica), this.license, Long.valueOf(this.appmetrica), this.purchase, Integer.valueOf(this.billing), this.yandex, Long.valueOf(this.startapp), Long.valueOf(this.adcel));
    }
}
