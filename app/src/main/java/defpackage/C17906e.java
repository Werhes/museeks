package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٞٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17906e implements InterfaceC2537e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f35151e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C16592e f35152e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16151e f35153e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f35154e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC4895e f35155e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public long f35156e;

    public C17906e(InterfaceC4895e interfaceC4895e) {
        this.f35155e = interfaceC4895e;
        C16151e metrica = interfaceC4895e.metrica();
        this.f35153e = metrica;
        C16592e c16592e = metrica.f31732e;
        this.f35152e = c16592e;
        this.f35154e = c16592e != null ? c16592e.vip : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f35151e = true;
    }

    @Override // defpackage.InterfaceC2537e
    public final long signatures(C16151e c16151e, long j) {
        C16592e c16592e;
        C16592e c16592e2;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "byteCount < 0: ").toString());
        }
        if (this.f35151e) {
            throw new IllegalStateException("closed");
        }
        C16592e c16592e3 = this.f35152e;
        C16151e c16151e2 = this.f35153e;
        if (c16592e3 != null && (c16592e3 != (c16592e2 = c16151e2.f31732e) || this.f35154e != c16592e2.vip)) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f35155e.request(this.f35156e + 1)) {
            return -1L;
        }
        if (this.f35152e == null && (c16592e = c16151e2.f31732e) != null) {
            this.f35152e = c16592e;
            this.f35154e = c16592e.vip;
        }
        long min = Math.min(j, c16151e2.f31731e - this.f35156e);
        this.f35153e.loadAd(this.f35156e, min, c16151e);
        this.f35156e += min;
        return min;
    }

    @Override // defpackage.InterfaceC2537e
    public final C1930e startapp() {
        return this.f35155e.startapp();
    }
}
