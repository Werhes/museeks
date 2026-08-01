package defpackage;

import java.util.Enumeration;

/* renamed from: eٌۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8983e extends Cextends implements InterfaceC5051e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f18033e = true;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public subs f18034e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Ctry f18035e;

    public C8983e(Ctry ctry, Cextends cextends) {
        this.f18035e = ctry;
        this.f18034e = cextends;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eٌۜ, java.lang.Object] */
    public static C8983e loadAd(Object obj) {
        if (obj instanceof C8983e) {
            return (C8983e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        obj2.f18033e = true;
        Enumeration mo170goto = m168class.mo170goto();
        obj2.f18035e = (Ctry) mo170goto.nextElement();
        if (mo170goto.hasMoreElements()) {
            obj2.f18034e = ((Cstrictfp) mo170goto.nextElement()).firebase();
        }
        obj2.f18033e = m168class instanceof C5308e;
        return obj2;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [default, catch, eؚؖٚ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(2, 0);
        crashlyticsVar.appmetrica(this.f18035e);
        subs subsVar = this.f18034e;
        if (subsVar != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 0, subsVar));
        }
        if (this.f18033e) {
            return new Ccatch(crashlyticsVar);
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f14196e = -1;
        return ccatch;
    }
}
