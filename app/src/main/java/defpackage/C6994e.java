package defpackage;

/* renamed from: eؚؚؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6994e extends Cextends {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[] f14318e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f14319e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f14320e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final byte[] f14321e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f14322e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f14323e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final byte[] f14324e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[] f14325e;

    public C6994e(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f14323e = 0;
        this.f14320e = j;
        this.f14322e = AbstractC12442e.license(bArr);
        this.f14318e = AbstractC12442e.license(bArr2);
        this.f14325e = AbstractC12442e.license(bArr3);
        this.f14324e = AbstractC12442e.license(bArr4);
        this.f14321e = AbstractC12442e.license(bArr5);
        this.f14319e = -1L;
    }

    public C6994e(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j2) {
        this.f14323e = 1;
        this.f14320e = j;
        this.f14322e = AbstractC12442e.license(bArr);
        this.f14318e = AbstractC12442e.license(bArr2);
        this.f14325e = AbstractC12442e.license(bArr3);
        this.f14324e = AbstractC12442e.license(bArr4);
        this.f14321e = AbstractC12442e.license(bArr5);
        this.f14319e = j2;
    }

    public C6994e(Ccatch ccatch) {
        long j;
        Cthis subs = Cthis.subs(ccatch.mo171interface(0));
        if (!subs.m4663class(0) && !subs.m4663class(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f14323e = subs.m4666native();
        if (ccatch.size() != 2 && ccatch.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        Ccatch m168class = Ccatch.m168class(ccatch.mo171interface(1));
        this.f14320e = Cthis.subs(m168class.mo171interface(0)).m4667throw();
        this.f14322e = AbstractC12442e.license(Cprotected.subs(m168class.mo171interface(1)).f36449e);
        this.f14318e = AbstractC12442e.license(Cprotected.subs(m168class.mo171interface(2)).f36449e);
        this.f14325e = AbstractC12442e.license(Cprotected.subs(m168class.mo171interface(3)).f36449e);
        this.f14324e = AbstractC12442e.license(Cprotected.subs(m168class.mo171interface(4)).f36449e);
        if (m168class.size() == 6) {
            Cstrictfp m4634class = Cstrictfp.m4634class(m168class.mo171interface(5));
            if (m4634class.f36462e != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            AbstractC9947e.ad(m4634class);
            inmobi inmobiVar = Cthis.f36479e;
            Cdefault crashlytics = m4634class.crashlytics(false, inmobiVar);
            inmobiVar.m4630e(crashlytics);
            j = ((Cthis) crashlytics).m4667throw();
        } else {
            if (m168class.size() != 5) {
                throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
            }
            j = -1;
        }
        this.f14319e = j;
        if (ccatch.size() != 3) {
            this.f14321e = null;
        } else {
            this.f14321e = AbstractC12442e.license(((Cprotected) Cprotected.f36448e.m4616e(Cstrictfp.m4634class(ccatch.mo171interface(2)), true)).f36449e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [subs, catch, eًٌَ] */
    /* JADX WARN: Type inference failed for: r1v4, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics((byte) 0, 0);
        long j = this.f14319e;
        crashlyticsVar.appmetrica(j >= 0 ? new Cthis(1L) : new Cthis(0L));
        crashlytics crashlyticsVar2 = new crashlytics((byte) 0, 0);
        crashlyticsVar2.appmetrica(new Cthis(this.f14320e));
        crashlyticsVar2.appmetrica(new Cprotected(this.f14322e));
        crashlyticsVar2.appmetrica(new Cprotected(this.f14318e));
        crashlyticsVar2.appmetrica(new Cprotected(this.f14325e));
        crashlyticsVar2.appmetrica(new Cprotected(this.f14324e));
        if (j >= 0) {
            crashlyticsVar2.appmetrica(new Cstrictfp(false, 0, new Cthis(j)));
        }
        ?? ccatch = new Ccatch(crashlyticsVar2);
        ccatch.f20096e = -1;
        crashlyticsVar.appmetrica(ccatch);
        crashlyticsVar.appmetrica(new Cstrictfp(true, 0, new Cprotected(this.f14321e)));
        ?? ccatch2 = new Ccatch(crashlyticsVar);
        ccatch2.f20096e = -1;
        return ccatch2;
    }
}
