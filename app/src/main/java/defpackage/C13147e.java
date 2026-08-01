package defpackage;

/* renamed from: eٌْۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13147e extends Cextends {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C17310e f26131e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C3322e f26130e = null;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C9120e f26129e = null;

    public C13147e(C17310e c17310e) {
        this.f26131e = c17310e;
    }

    public static void loadAd(StringBuilder sb, String str, String str2, String str3) {
        AbstractC13501e.Signature(sb, "    ", str2, ":", str);
        AbstractC13501e.Signature(sb, "    ", "    ", str3, str);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(3, 0);
        C17310e c17310e = this.f26131e;
        if (c17310e != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 0, c17310e));
        }
        C3322e c3322e = this.f26130e;
        if (c3322e != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(false, 1, c3322e));
        }
        C9120e c9120e = this.f26129e;
        if (c9120e != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(false, 2, c9120e));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }

    public final String toString() {
        String str = AbstractC1433e.ad;
        StringBuilder isPro = AbstractC8703e.isPro("DistributionPoint: [", str);
        C17310e c17310e = this.f26131e;
        if (c17310e != null) {
            loadAd(isPro, str, "distributionPoint", c17310e.toString());
        }
        C3322e c3322e = this.f26130e;
        if (c3322e != null) {
            loadAd(isPro, str, "reasons", c3322e.yandex());
        }
        C9120e c9120e = this.f26129e;
        if (c9120e != null) {
            loadAd(isPro, str, "cRLIssuer", c9120e.toString());
        }
        return AbstractC1786e.signatures(isPro, "]", str);
    }
}
