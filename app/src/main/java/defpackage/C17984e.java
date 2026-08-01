package defpackage;

/* renamed from: e٘ۙۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17984e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Ctry f35277e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Ctry f35278e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Ctry f35279e;

    public C17984e(Ctry ctry, Ctry ctry2) {
        this.f35279e = ctry;
        this.f35278e = ctry2;
        this.f35277e = null;
    }

    public C17984e(Ctry ctry, Ctry ctry2, Ctry ctry3) {
        this.f35279e = ctry;
        this.f35278e = ctry2;
        this.f35277e = ctry3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r4.size() > 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r0.f35278e = defpackage.Ctry.m4669interface(r4.mo171interface(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r4.size() > 1) goto L11;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [e٘ۙۤ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C17984e loadAd(java.lang.Object r4) {
        /*
            boolean r0 = r4 instanceof defpackage.C17984e
            if (r0 == 0) goto L7
            e٘ۙۤ r4 = (defpackage.C17984e) r4
            return r4
        L7:
            if (r4 == 0) goto L75
            e٘ۙۤ r0 = new e٘ۙۤ
            catch r4 = defpackage.Ccatch.m168class(r4)
            r0.<init>()
            r1 = 0
            subs r1 = r4.mo171interface(r1)
            try r1 = defpackage.Ctry.m4669interface(r1)
            r0.f35279e = r1
            try r2 = defpackage.InterfaceC13429e.mopub
            boolean r2 = r1.isVip(r2)
            r3 = 1
            if (r2 == 0) goto L37
            int r1 = r4.size()
            if (r1 <= r3) goto L5d
        L2c:
            subs r1 = r4.mo171interface(r3)
            try r1 = defpackage.Ctry.m4669interface(r1)
            r0.f35278e = r1
            goto L5d
        L37:
            try r2 = defpackage.InterfaceC13429e.advert
            boolean r2 = r1.isVip(r2)
            if (r2 != 0) goto L57
            try r2 = defpackage.InterfaceC13429e.smaato
            boolean r2 = r1.isVip(r2)
            if (r2 != 0) goto L57
            try r2 = defpackage.InterfaceC13429e.amazon
            boolean r1 = r1.isVip(r2)
            if (r1 == 0) goto L50
            goto L57
        L50:
            int r1 = r4.size()
            if (r1 <= r3) goto L5d
            goto L2c
        L57:
            int r1 = r4.size()
            if (r1 > r3) goto L6d
        L5d:
            int r1 = r4.size()
            r2 = 2
            if (r1 <= r2) goto L6c
            subs r4 = r4.mo171interface(r2)
            try r4 = (defpackage.Ctry) r4
            r0.f35277e = r4
        L6c:
            return r0
        L6d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "digestParamSet expected to be absent"
            r4.<init>(r0)
            throw r4
        L75:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17984e.loadAd(java.lang.Object):e٘ۙۤ");
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(3, 0);
        crashlyticsVar.appmetrica(this.f35279e);
        Ctry ctry = this.f35278e;
        if (ctry != null) {
            crashlyticsVar.appmetrica(ctry);
        }
        Ctry ctry2 = this.f35277e;
        if (ctry2 != null) {
            crashlyticsVar.appmetrica(ctry2);
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
