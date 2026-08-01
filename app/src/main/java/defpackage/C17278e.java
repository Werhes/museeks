package defpackage;

import java.math.BigInteger;

/* renamed from: eٗۜۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17278e extends Cextends {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final BigInteger f33905e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final BigInteger f33906e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final BigInteger f33907e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final BigInteger f33908e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f33909e;

    public C17278e(Ccatch ccatch) {
        if (ccatch.size() != 4 && ccatch.size() != 5) {
            throw new IllegalArgumentException(AbstractC0054e.premium(ccatch, new StringBuilder("invalid sequence: size = ")));
        }
        this.f33909e = AbstractC12442e.license(Cprotected.subs(ccatch.mo171interface(0)).f36449e);
        this.f33907e = Cthis.subs(ccatch.mo171interface(1)).firebase();
        this.f33906e = Cthis.subs(ccatch.mo171interface(2)).firebase();
        this.f33908e = Cthis.subs(ccatch.mo171interface(3)).firebase();
        this.f33905e = ccatch.size() == 5 ? Cthis.subs(ccatch.mo171interface(4)).firebase() : null;
    }

    public C17278e(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f33909e = AbstractC12442e.license(bArr);
        this.f33907e = bigInteger;
        this.f33906e = bigInteger2;
        this.f33908e = bigInteger3;
        this.f33905e = bigInteger4;
    }

    public static C17278e loadAd(Object obj) {
        if (obj instanceof C17278e) {
            return (C17278e) obj;
        }
        if (obj != null) {
            return new C17278e(Ccatch.m168class(obj));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(5, 0);
        crashlyticsVar.appmetrica(new Cprotected(this.f33909e));
        crashlyticsVar.appmetrica(new Cthis(this.f33907e));
        crashlyticsVar.appmetrica(new Cthis(this.f33906e));
        crashlyticsVar.appmetrica(new Cthis(this.f33908e));
        BigInteger bigInteger = this.f33905e;
        if (bigInteger != null) {
            crashlyticsVar.appmetrica(new Cthis(bigInteger));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
