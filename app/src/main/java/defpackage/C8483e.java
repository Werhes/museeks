package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؕٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8483e {
    public static final C8483e appmetrica = new C8483e(4611686018427387903L, true);
    public final long ad;
    public final long license;
    public final long metrica;
    public final boolean vip;

    static {
        new C8483e(Long.MAX_VALUE, false);
    }

    public C8483e(long j, boolean z) {
        this.ad = j;
        this.vip = z;
        long j2 = 10;
        this.metrica = j / j2;
        this.license = j % j2;
    }
}
