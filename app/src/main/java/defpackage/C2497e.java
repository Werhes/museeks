package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2497e {
    public final String ad;
    public final Long adcel;
    public final long appmetrica;
    public final long billing;
    public final long license;
    public final long metrica;
    public final Boolean mopub;
    public final long purchase;
    public final Long startapp;
    public final String vip;
    public final Long yandex;

    public C2497e(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        AbstractC9528e.purchase(str);
        AbstractC9528e.purchase(str2);
        AbstractC9528e.vip(j >= 0);
        AbstractC9528e.vip(j2 >= 0);
        AbstractC9528e.vip(j3 >= 0);
        AbstractC9528e.vip(j5 >= 0);
        this.ad = str;
        this.vip = str2;
        this.metrica = j;
        this.license = j2;
        this.appmetrica = j3;
        this.purchase = j4;
        this.billing = j5;
        this.yandex = l;
        this.startapp = l2;
        this.adcel = l3;
        this.mopub = bool;
    }

    public final C2497e ad(long j) {
        return new C2497e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, j, this.billing, this.yandex, this.startapp, this.adcel, this.mopub);
    }

    public final C2497e vip(Long l, Long l2, Boolean bool) {
        return new C2497e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, l, l2, bool);
    }
}
