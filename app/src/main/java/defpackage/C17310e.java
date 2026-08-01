package defpackage;

/* renamed from: eٖٗ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17310e extends Cextends implements premium {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f33952e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Cextends f33953e;

    public C17310e(C9120e c9120e) {
        this.f33952e = 0;
        this.f33953e = c9120e;
    }

    public C17310e(Cstrictfp cstrictfp) {
        int i = cstrictfp.f36462e;
        this.f33952e = i;
        int i2 = cstrictfp.f36463e;
        if (i2 == 128 && i == 0) {
            this.f33953e = new C9120e((Ccatch) Ccatch.f640e.m4616e(cstrictfp, false));
            return;
        }
        if (i2 != 128 || i != 1) {
            throw new IllegalArgumentException("unknown tag: " + AbstractC9947e.vip(i2, i));
        }
        AbstractC9947e.ad(cstrictfp);
        inmobi inmobiVar = Cfinal.f36386e;
        Cdefault crashlytics = cstrictfp.crashlytics(false, inmobiVar);
        inmobiVar.m4630e(crashlytics);
        this.f33953e = (Cfinal) crashlytics;
    }

    public static C17310e Signature(Cstrictfp cstrictfp) {
        AbstractC9947e.ad(cstrictfp);
        Cextends firebase = cstrictfp.firebase();
        if (firebase == null || (firebase instanceof C17310e)) {
            return (C17310e) firebase;
        }
        if (firebase instanceof Cstrictfp) {
            return new C17310e((Cstrictfp) firebase);
        }
        throw new IllegalArgumentException("unknown object in factory: ".concat(firebase.getClass().getName()));
    }

    public static void loadAd(StringBuilder sb, String str, String str2, String str3) {
        AbstractC13501e.Signature(sb, "    ", str2, ":", str);
        AbstractC13501e.Signature(sb, "    ", "    ", str3, str);
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return new Cstrictfp(2, 128, this.f33952e, this.f33953e);
    }

    public final String toString() {
        String str = AbstractC1433e.ad;
        StringBuilder isPro = AbstractC8703e.isPro("DistributionPointName: [", str);
        loadAd(isPro, str, this.f33952e == 0 ? "fullName" : "nameRelativeToCRLIssuer", this.f33953e.toString());
        return AbstractC1786e.signatures(isPro, "]", str);
    }
}
