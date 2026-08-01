package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۜۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4399e implements Comparable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f9579e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f9580e;

    public C4399e(C16975e c16975e, int i) {
        this.f9580e = (c16975e.appmetrica & 1) != 0;
        this.f9579e = AbstractC0054e.inmobi(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4399e c4399e = (C4399e) obj;
        return AbstractC7118e.ad.metrica(this.f9579e, c4399e.f9579e).metrica(this.f9580e, c4399e.f9580e).appmetrica();
    }
}
