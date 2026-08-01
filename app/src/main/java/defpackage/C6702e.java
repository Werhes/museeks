package defpackage;

/* renamed from: eؙۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6702e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Cprotected f13848e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0915e f13849e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C16527e f13850e;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, eؚؒۗ] */
    public C6702e(Ccatch ccatch) {
        C0915e c0915e;
        this.f13850e = C16527e.loadAd(ccatch.mo171interface(0));
        subs mo171interface = ccatch.mo171interface(1);
        if (mo171interface instanceof C0915e) {
            c0915e = (C0915e) mo171interface;
        } else if (mo171interface != null) {
            Ccatch m168class = Ccatch.m168class(mo171interface);
            ?? obj = new Object();
            obj.f3341e = C16527e.loadAd(m168class);
            c0915e = obj;
        } else {
            c0915e = null;
        }
        this.f13849e = c0915e;
        this.f13848e = Cprotected.subs(ccatch.mo171interface(2));
    }

    public C6702e(C16527e c16527e, C0915e c0915e, byte[] bArr) {
        this.f13850e = c16527e;
        this.f13849e = c0915e;
        this.f13848e = new Cprotected(AbstractC12442e.license(bArr));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(3, 0);
        crashlyticsVar.appmetrica(this.f13850e);
        crashlyticsVar.appmetrica(this.f13849e);
        crashlyticsVar.appmetrica(this.f13848e);
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
