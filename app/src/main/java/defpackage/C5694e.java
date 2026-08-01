package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5694e implements InterfaceC6079e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f12089e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C0378e f12090e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C12402e f12091e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f12092e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC17430e f12093e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public long f12094e;

    public C5694e(InterfaceC17430e interfaceC17430e) {
        this.f12093e = interfaceC17430e;
        C12402e metrica = interfaceC17430e.metrica();
        this.f12091e = metrica;
        C0378e c0378e = metrica.f24834e;
        this.f12090e = c0378e;
        this.f12092e = c0378e != null ? c0378e.vip : -1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f12089e = true;
    }

    @Override // defpackage.InterfaceC6079e
    /* renamed from: this */
    public final long mo805this(C12402e c12402e, long j) {
        C0378e c0378e;
        C0378e c0378e2;
        if (this.f12089e) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1634e.mopub(j, "byteCount (", ") < 0").toString());
        }
        C0378e c0378e3 = this.f12090e;
        C12402e c12402e2 = this.f12091e;
        if (c0378e3 != null && (c0378e3 != (c0378e2 = c12402e2.f24834e) || this.f12092e != c0378e2.vip)) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f12093e.request(this.f12094e + 1)) {
            return -1L;
        }
        if (this.f12090e == null && (c0378e = c12402e2.f24834e) != null) {
            this.f12090e = c0378e;
            this.f12092e = c0378e.vip;
        }
        long min = Math.min(j, c12402e2.f24832e - this.f12094e);
        long j2 = this.f12094e;
        long j3 = j2 + min;
        AbstractC8913e.vip(c12402e2.f24832e, j2, j3);
        if (j2 != j3) {
            long j4 = j3 - j2;
            c12402e.f24832e += j4;
            C0378e c0378e4 = c12402e2.f24834e;
            while (true) {
                long j5 = c0378e4.metrica - c0378e4.vip;
                if (j2 < j5) {
                    break;
                }
                j2 -= j5;
                c0378e4 = c0378e4.purchase;
            }
            while (j4 > 0) {
                C0378e appmetrica = c0378e4.appmetrica();
                int i = appmetrica.vip + ((int) j2);
                appmetrica.vip = i;
                appmetrica.metrica = Math.min(i + ((int) j4), appmetrica.metrica);
                if (c12402e.f24834e == null) {
                    c12402e.f24834e = appmetrica;
                    c12402e.f24833e = appmetrica;
                } else {
                    c12402e.f24833e.license(appmetrica);
                    c12402e.f24833e = appmetrica;
                }
                j4 -= appmetrica.metrica - appmetrica.vip;
                c0378e4 = c0378e4.purchase;
                j2 = 0;
            }
        }
        this.f12094e += min;
        return min;
    }
}
