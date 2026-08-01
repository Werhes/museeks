package defpackage;

/* renamed from: eٍؖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4012e extends Cextends {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[] f8928e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f8929e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f8930e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final byte[] f8931e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f8932e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f8933e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f8934e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[] f8935e;

    public C4012e(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f8933e = 0;
        this.f8930e = i;
        this.f8929e = AbstractC12442e.license(bArr);
        this.f8932e = AbstractC12442e.license(bArr2);
        this.f8928e = AbstractC12442e.license(bArr3);
        this.f8935e = AbstractC12442e.license(bArr4);
        this.f8931e = AbstractC12442e.license(bArr5);
        this.f8934e = -1;
    }

    public C4012e(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i2) {
        this.f8933e = 1;
        this.f8930e = i;
        this.f8929e = AbstractC12442e.license(bArr);
        this.f8932e = AbstractC12442e.license(bArr2);
        this.f8928e = AbstractC12442e.license(bArr3);
        this.f8935e = AbstractC12442e.license(bArr4);
        this.f8931e = AbstractC12442e.license(bArr5);
        this.f8934e = i2;
    }

    public C4012e(Ccatch ccatch) {
        int i;
        Cthis subs = Cthis.subs(ccatch.mo171interface(0));
        if (!subs.m4663class(0) && !subs.m4663class(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f8933e = subs.m4666native();
        if (ccatch.size() != 2 && ccatch.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        Ccatch m168class = Ccatch.m168class(ccatch.mo171interface(1));
        this.f8930e = Cthis.subs(m168class.mo171interface(0)).m4666native();
        this.f8929e = AbstractC12442e.license(Cprotected.subs(m168class.mo171interface(1)).f36449e);
        this.f8932e = AbstractC12442e.license(Cprotected.subs(m168class.mo171interface(2)).f36449e);
        this.f8928e = AbstractC12442e.license(Cprotected.subs(m168class.mo171interface(3)).f36449e);
        this.f8935e = AbstractC12442e.license(Cprotected.subs(m168class.mo171interface(4)).f36449e);
        if (m168class.size() == 6) {
            Cstrictfp m4634class = Cstrictfp.m4634class(m168class.mo171interface(5));
            if (m4634class.f36462e != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            AbstractC9947e.ad(m4634class);
            inmobi inmobiVar = Cthis.f36479e;
            Cdefault crashlytics = m4634class.crashlytics(false, inmobiVar);
            inmobiVar.m4630e(crashlytics);
            i = ((Cthis) crashlytics).m4666native();
        } else {
            if (m168class.size() != 5) {
                throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
            }
            i = -1;
        }
        this.f8934e = i;
        if (ccatch.size() != 3) {
            this.f8931e = null;
        } else {
            this.f8931e = AbstractC12442e.license(((Cprotected) Cprotected.f36448e.m4616e(Cstrictfp.m4634class(ccatch.mo171interface(2)), true)).f36449e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [subs, catch, eًٌَ] */
    /* JADX WARN: Type inference failed for: r1v4, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics((byte) 0, 0);
        int i = this.f8934e;
        crashlyticsVar.appmetrica(i >= 0 ? new Cthis(1L) : new Cthis(0L));
        crashlytics crashlyticsVar2 = new crashlytics((byte) 0, 0);
        crashlyticsVar2.appmetrica(new Cthis(this.f8930e));
        crashlyticsVar2.appmetrica(new Cprotected(this.f8929e));
        crashlyticsVar2.appmetrica(new Cprotected(this.f8932e));
        crashlyticsVar2.appmetrica(new Cprotected(this.f8928e));
        crashlyticsVar2.appmetrica(new Cprotected(this.f8935e));
        if (i >= 0) {
            crashlyticsVar2.appmetrica(new Cstrictfp(false, 0, new Cthis(i)));
        }
        ?? ccatch = new Ccatch(crashlyticsVar2);
        ccatch.f20096e = -1;
        crashlyticsVar.appmetrica(ccatch);
        crashlyticsVar.appmetrica(new Cstrictfp(true, 0, new Cprotected(this.f8931e)));
        ?? ccatch2 = new Ccatch(crashlyticsVar);
        ccatch2.f20096e = -1;
        return ccatch2;
    }
}
