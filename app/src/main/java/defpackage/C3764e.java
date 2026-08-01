package defpackage;

import java.math.BigInteger;

/* renamed from: eؕۦۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3764e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f8368e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8369e = 1;

    public /* synthetic */ C3764e() {
    }

    public C3764e(BigInteger bigInteger) {
        if (AbstractC5907e.ad.compareTo(bigInteger) > 0) {
            throw new IllegalArgumentException("Invalid CRL number : not in (0..MAX)");
        }
        this.f8368e = bigInteger;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        switch (this.f8369e) {
            case 0:
                return new Cthis((BigInteger) this.f8368e);
            default:
                crashlytics crashlyticsVar = new crashlytics(2, 0);
                crashlyticsVar.appmetrica((C16013e) this.f8368e);
                ?? ccatch = new Ccatch(crashlyticsVar);
                ccatch.f20096e = -1;
                return ccatch;
        }
    }

    public String toString() {
        switch (this.f8369e) {
            case 0:
                return "CRLNumber: " + ((BigInteger) this.f8368e);
            default:
                return super.toString();
        }
    }
}
