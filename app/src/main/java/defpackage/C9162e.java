package defpackage;

/* renamed from: eٍٖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9162e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public byte[] f18335e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public byte[] f18336e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C0648e f18337e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f18338e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [default, catch, eًٌَ] */
    /* JADX WARN: Type inference failed for: r2v5, types: [subs, java.lang.Object, eٟؑۢ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics((byte) 0, 0);
        crashlyticsVar.appmetrica(new Cthis(this.f18338e));
        crashlyticsVar.appmetrica(new Cprotected(this.f18336e));
        crashlyticsVar.appmetrica(new Cprotected(this.f18335e));
        C0648e c0648e = this.f18337e;
        if (c0648e != null) {
            byte[] license = AbstractC12442e.license(c0648e.f2904e);
            byte[] license2 = AbstractC12442e.license(c0648e.f2903e);
            ?? obj = new Object();
            obj.f2904e = license;
            obj.f2903e = license2;
            crashlyticsVar.appmetrica(obj);
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
