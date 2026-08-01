package defpackage;

/* renamed from: eٖۣؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16013e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Cprotected f31537e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Cprotected f31538e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Cthis f31539e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C16527e f31540e;

    /* JADX WARN: Type inference failed for: r0v1, types: [eٖۣؖ, java.lang.Object] */
    public static C16013e loadAd(subs subsVar) {
        if (subsVar instanceof C16013e) {
            return (C16013e) subsVar;
        }
        if (subsVar == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(subsVar);
        ?? obj = new Object();
        obj.f31540e = C16527e.loadAd(m168class.mo171interface(0));
        obj.f31538e = (Cprotected) m168class.mo171interface(1);
        obj.f31537e = (Cprotected) m168class.mo171interface(2);
        obj.f31539e = (Cthis) m168class.mo171interface(3);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(4, 0);
        crashlyticsVar.appmetrica(this.f31540e);
        crashlyticsVar.appmetrica(this.f31538e);
        crashlyticsVar.appmetrica(this.f31537e);
        crashlyticsVar.appmetrica(this.f31539e);
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.Cextends
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            eٖ۟ r0 = r4.f31540e
            r1 = 1
            if (r4 != r5) goto L6
            goto L5e
        L6:
            boolean r2 = r5 instanceof defpackage.subs
            if (r2 == 0) goto L5f
            subs r5 = (defpackage.subs) r5     // Catch: java.lang.Exception -> L5f
            eٖۣؖ r5 = loadAd(r5)     // Catch: java.lang.Exception -> L5f
            try r2 = r0.f32408e     // Catch: java.lang.Exception -> L5f
            eٖ۟ r3 = r5.f31540e     // Catch: java.lang.Exception -> L5f
            try r3 = r3.f32408e     // Catch: java.lang.Exception -> L5f
            boolean r2 = r2.isVip(r3)     // Catch: java.lang.Exception -> L5f
            if (r2 != 0) goto L1d
            goto L5f
        L1d:
            subs r0 = r0.f32407e     // Catch: java.lang.Exception -> L5f
            eٖ۟ r2 = r5.f31540e     // Catch: java.lang.Exception -> L5f
            subs r2 = r2.f32407e     // Catch: java.lang.Exception -> L5f
            eٖؑۗ r3 = defpackage.C0503e.f2592e     // Catch: java.lang.Exception -> L5f
            if (r0 != r2) goto L29
        L27:
            r0 = r1
            goto L3d
        L29:
            if (r0 != 0) goto L30
            boolean r0 = r3.tapsense(r2)     // Catch: java.lang.Exception -> L5f
            goto L3d
        L30:
            boolean r3 = r3.tapsense(r0)     // Catch: java.lang.Exception -> L5f
            if (r3 == 0) goto L39
            if (r2 != 0) goto L39
            goto L27
        L39:
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Exception -> L5f
        L3d:
            if (r0 != 0) goto L40
            goto L5f
        L40:
            protected r0 = r4.f31538e     // Catch: java.lang.Exception -> L5f
            protected r2 = r5.f31538e     // Catch: java.lang.Exception -> L5f
            boolean r0 = r0.isVip(r2)     // Catch: java.lang.Exception -> L5f
            if (r0 == 0) goto L5f
            protected r0 = r4.f31537e     // Catch: java.lang.Exception -> L5f
            protected r2 = r5.f31537e     // Catch: java.lang.Exception -> L5f
            boolean r0 = r0.isVip(r2)     // Catch: java.lang.Exception -> L5f
            if (r0 == 0) goto L5f
            this r0 = r4.f31539e     // Catch: java.lang.Exception -> L5f
            this r5 = r5.f31539e     // Catch: java.lang.Exception -> L5f
            boolean r5 = r0.isVip(r5)     // Catch: java.lang.Exception -> L5f
            if (r5 == 0) goto L5f
        L5e:
            return r1
        L5f:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16013e.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.Cextends
    public final int hashCode() {
        C16527e c16527e = this.f31540e;
        subs subsVar = c16527e.f32407e;
        return (((((((AbstractC12442e.isVip(this.f31539e.f36481e) * 7) + AbstractC12442e.isVip(this.f31537e.f36449e)) * 7) + AbstractC12442e.isVip(this.f31538e.f36449e)) * 7) + AbstractC12442e.isVip(c16527e.f32408e.f36491e)) * 7) + ((subsVar == null || C0503e.f2592e.tapsense(subsVar)) ? 0 : subsVar.hashCode());
    }
}
