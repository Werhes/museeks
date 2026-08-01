package defpackage;

/* renamed from: eٕؒ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1079e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public isPro f3609e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C16527e f3610e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C7230e f3611e;

    /* JADX WARN: Type inference failed for: r0v4, types: [eٌۦۢ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, eٕؒ۠] */
    /* JADX WARN: Type inference failed for: r5v1, types: [eؚٟ٘, java.lang.Object] */
    public static C1079e loadAd(Cdefault cdefault) {
        int i;
        C7230e c7230e = null;
        C9127e c9127e = null;
        if (cdefault == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(cdefault);
        ?? obj = new Object();
        if (m168class.size() != 3) {
            throw new IllegalArgumentException(AbstractC0054e.premium(m168class, new StringBuilder("Bad sequence size: ")));
        }
        subs mo171interface = m168class.mo171interface(0);
        if (mo171interface instanceof C7230e) {
            c7230e = (C7230e) mo171interface;
        } else if (mo171interface != null) {
            Ccatch m168class2 = Ccatch.m168class(mo171interface);
            ?? obj2 = new Object();
            if (m168class2.size() < 6 || m168class2.size() > 9) {
                throw new IllegalArgumentException(AbstractC0054e.premium(m168class2, new StringBuilder("Bad sequence size: ")));
            }
            if (m168class2.mo171interface(0) instanceof Cthis) {
                obj2.f14756e = Cthis.subs(m168class2.mo171interface(0));
                i = 1;
            } else {
                obj2.f14756e = new Cthis(0L);
                i = 0;
            }
            obj2.f14752e = C15592e.loadAd(m168class2.mo171interface(i));
            obj2.f14751e = C7087e.loadAd(m168class2.mo171interface(i + 1));
            obj2.f14754e = C16527e.loadAd(m168class2.mo171interface(i + 2));
            obj2.f14750e = Cthis.subs(m168class2.mo171interface(i + 3));
            subs mo171interface2 = m168class2.mo171interface(i + 4);
            if (mo171interface2 instanceof C9127e) {
                c9127e = (C9127e) mo171interface2;
            } else if (mo171interface2 != null) {
                Ccatch m168class3 = Ccatch.m168class(mo171interface2);
                ?? obj3 = new Object();
                if (m168class3.size() != 2) {
                    throw new IllegalArgumentException(AbstractC0054e.premium(m168class3, new StringBuilder("Bad sequence size: ")));
                }
                obj3.f18282e = Cinterface.m4595class(m168class3.mo171interface(0));
                obj3.f18281e = Cinterface.m4595class(m168class3.mo171interface(1));
                c9127e = obj3;
            }
            obj2.f14758e = c9127e;
            obj2.f14757e = Ccatch.m168class(m168class2.mo171interface(i + 5));
            for (int i2 = i + 6; i2 < m168class2.size(); i2++) {
                subs mo171interface3 = m168class2.mo171interface(i2);
                if (mo171interface3 instanceof isPro) {
                    obj2.f14753e = isPro.firebase(m168class2.mo171interface(i2));
                } else if ((mo171interface3 instanceof Ccatch) || (mo171interface3 instanceof C9216e)) {
                    obj2.f14755e = C9216e.admob(m168class2.mo171interface(i2));
                }
            }
            c7230e = obj2;
        }
        obj.f3611e = c7230e;
        obj.f3610e = C16527e.loadAd(m168class.mo171interface(1));
        obj.f3609e = isPro.firebase(m168class.mo171interface(2));
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(3, 0);
        crashlyticsVar.appmetrica(this.f3611e);
        crashlyticsVar.appmetrica(this.f3610e);
        crashlyticsVar.appmetrica(this.f3609e);
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
