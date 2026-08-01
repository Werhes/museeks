package defpackage;

/* renamed from: eٗۦْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17411e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final isPro f34128e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Ccatch f34129e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C16527e f34130e;

    public C17411e(Ccatch ccatch) {
        this.f34130e = C16527e.loadAd(ccatch.mo171interface(0));
        int i = 1;
        if (ccatch.mo171interface(1) instanceof Cstrictfp) {
            this.f34129e = Ccatch.m168class(Cstrictfp.m4634class(ccatch.mo171interface(1)).subs(16));
            i = 2;
        } else {
            this.f34129e = null;
        }
        this.f34128e = isPro.firebase(ccatch.mo171interface(i));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(3, 0);
        crashlyticsVar.appmetrica(this.f34130e);
        Ccatch ccatch = this.f34129e;
        if (ccatch != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 0, ccatch));
        }
        crashlyticsVar.appmetrica(this.f34128e);
        ?? ccatch2 = new Ccatch(crashlyticsVar);
        ccatch2.f20096e = -1;
        return ccatch2;
    }
}
