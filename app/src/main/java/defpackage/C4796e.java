package defpackage;

import java.math.BigInteger;

/* renamed from: eُؙؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4796e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Cthis f10222e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Cthis f10223e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Cthis f10224e;

    public C4796e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f10224e = new Cthis(bigInteger);
        this.f10223e = new Cthis(bigInteger2);
        this.f10222e = new Cthis(bigInteger3);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(4, 0);
        crashlyticsVar.appmetrica(new Cthis(1024));
        crashlyticsVar.appmetrica(this.f10224e);
        crashlyticsVar.appmetrica(this.f10223e);
        crashlyticsVar.appmetrica(this.f10222e);
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
