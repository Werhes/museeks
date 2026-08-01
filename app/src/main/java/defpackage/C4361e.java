package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4361e {
    public final int ad;
    public final long[] adcel;
    public final C18274e[] advert;
    public final long appmetrica;
    public final C16975e billing;
    public final long license;
    public final long metrica;
    public final int mopub;
    public final long purchase;
    public final long[] startapp;
    public final int vip;
    public final int yandex;

    public C4361e(int i, int i2, long j, long j2, long j3, long j4, C16975e c16975e, int i3, C18274e[] c18274eArr, int i4, long[] jArr, long[] jArr2) {
        this.ad = i;
        this.vip = i2;
        this.metrica = j;
        this.license = j2;
        this.appmetrica = j3;
        this.purchase = j4;
        this.billing = c16975e;
        this.yandex = i3;
        this.advert = c18274eArr;
        this.mopub = i4;
        this.startapp = jArr;
        this.adcel = jArr2;
    }

    public final C4361e ad(C16975e c16975e) {
        return new C4361e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, this.purchase, c16975e, this.yandex, this.advert, this.mopub, this.startapp, this.adcel);
    }
}
