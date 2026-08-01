package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18510e implements InterfaceC3604e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f36285e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public long f36286e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f36287e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public long f36288e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f36289e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public long f36290e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public long f36291e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AbstractC13109e f36292e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public long f36293e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C10755e f36294e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public long f36295e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public long f36296e;

    public C18510e(AbstractC13109e abstractC13109e, long j, long j2, long j3, long j4, boolean z) {
        AbstractC2301e.billing(j >= 0 && j2 > j);
        this.f36292e = abstractC13109e;
        this.f36289e = j;
        this.f36287e = j2;
        if (j3 == j2 - j || z) {
            this.f36296e = j4;
            this.f36285e = 4;
        } else {
            this.f36285e = 0;
        }
        this.f36294e = new C10755e();
    }

    @Override // defpackage.InterfaceC3604e
    public final InterfaceC6347e loadAd() {
        if (this.f36296e != 0) {
            return new C9926e(this);
        }
        return null;
    }

    @Override // defpackage.InterfaceC3604e
    public final void tapsense(long j) {
        this.f36290e = AbstractC9413e.mopub(j, 0L, this.f36296e - 1);
        this.f36285e = 2;
        this.f36293e = this.f36289e;
        this.f36288e = this.f36287e;
        this.f36291e = 0L;
        this.f36286e = this.f36296e;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    @Override // defpackage.InterfaceC3604e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long vip(defpackage.InterfaceC2283e r28) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18510e.vip(eَؔؐ):long");
    }
}
