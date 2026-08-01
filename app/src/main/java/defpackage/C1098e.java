package defpackage;

import java.math.BigInteger;
import java.util.Date;

/* renamed from: eؒٗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1098e extends Cextends {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Cprotected f3638e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Cinterface f3639e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f3640e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Cinterface f3641e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final BigInteger f3642e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f3643e;

    public C1098e(Ccatch ccatch) {
        this.f3642e = Cthis.subs(ccatch.mo171interface(0)).firebase();
        this.f3640e = C6310e.subs(ccatch.mo171interface(1)).yandex();
        this.f3639e = Cinterface.m4595class(ccatch.mo171interface(2));
        this.f3641e = Cinterface.m4595class(ccatch.mo171interface(3));
        this.f3638e = Cprotected.subs(ccatch.mo171interface(4));
        this.f3643e = ccatch.size() == 6 ? C6310e.subs(ccatch.mo171interface(5)).yandex() : null;
    }

    public C1098e(BigInteger bigInteger, String str, Date date, Date date2, byte[] bArr) {
        this.f3642e = bigInteger;
        this.f3640e = str;
        this.f3639e = new Cinterface(date);
        this.f3641e = new Cinterface(date2);
        this.f3638e = new Cprotected(AbstractC12442e.license(bArr));
        this.f3643e = null;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(6, 0);
        crashlyticsVar.appmetrica(new Cthis(this.f3642e));
        crashlyticsVar.appmetrica(new C6310e(this.f3640e));
        crashlyticsVar.appmetrica(this.f3639e);
        crashlyticsVar.appmetrica(this.f3641e);
        crashlyticsVar.appmetrica(this.f3638e);
        String str = this.f3643e;
        if (str != null) {
            crashlyticsVar.appmetrica(new C6310e(str));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }

    public final byte[] loadAd() {
        return AbstractC12442e.license(this.f3638e.f36449e);
    }
}
