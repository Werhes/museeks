package defpackage;

/* renamed from: eؑۘۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0524e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f2668e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16527e f2669e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C9120e f2670e;

    public C0524e(Ccatch ccatch) {
        if (ccatch.size() != 3) {
            throw new IllegalArgumentException("unknown sequence");
        }
        this.f2670e = C9120e.loadAd(ccatch.mo171interface(0));
        this.f2669e = C16527e.loadAd(ccatch.mo171interface(1));
        boolean z = ccatch.mo171interface(2) instanceof isPro;
        subs mo171interface = ccatch.mo171interface(2);
        if (z) {
            this.f2668e = isPro.firebase(mo171interface).m4602class();
        } else {
            this.f2668e = Cprotected.subs(mo171interface).f36449e;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics((byte) 0, 0);
        crashlyticsVar.appmetrica(this.f2670e);
        crashlyticsVar.appmetrica(this.f2669e);
        crashlyticsVar.appmetrica(new Cprotected(this.f2668e));
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
