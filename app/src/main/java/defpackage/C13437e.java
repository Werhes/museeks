package defpackage;

/* renamed from: eْۗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13437e extends Cextends {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final Cthis f26705e = new Cthis(0);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C9216e f26706e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C10154e f26707e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Cthis f26708e = f26705e;

    public C13437e(C10154e c10154e, C9216e c9216e) {
        this.f26707e = c10154e;
        this.f26706e = c9216e;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(4, 0);
        Cthis cthis = f26705e;
        Cthis cthis2 = this.f26708e;
        if (!cthis2.isVip(cthis)) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 0, cthis2));
        }
        crashlyticsVar.appmetrica(this.f26707e);
        C9216e c9216e = this.f26706e;
        if (c9216e != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 2, c9216e));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
