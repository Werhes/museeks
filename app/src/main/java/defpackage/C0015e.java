package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: eؑؑؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0015e extends Cextends implements InterfaceC5051e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C17482e f1150e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C8983e f1151e;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, eؘّٚ] */
    /* JADX WARN: Type inference failed for: r1v0, types: [eؑؑؖ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [e٘ؑۜ, java.lang.Object] */
    public static C0015e loadAd(Cdefault cdefault) {
        C17482e c17482e = null;
        C5723e c5723e = null;
        if (cdefault == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(cdefault);
        ?? obj = new Object();
        obj.f1150e = null;
        if (!Cthis.subs(m168class.mo171interface(0)).m4663class(3)) {
            throw new IllegalArgumentException("wrong version for PFX PDU");
        }
        obj.f1151e = C8983e.loadAd(m168class.mo171interface(1));
        if (m168class.size() == 3) {
            subs mo171interface = m168class.mo171interface(2);
            BigInteger bigInteger = C17482e.f34245e;
            if (mo171interface instanceof C17482e) {
                c17482e = (C17482e) mo171interface;
            } else if (mo171interface != null) {
                Ccatch m168class2 = Ccatch.m168class(mo171interface);
                ?? obj2 = new Object();
                subs mo171interface2 = m168class2.mo171interface(0);
                if (mo171interface2 instanceof C5723e) {
                    c5723e = (C5723e) mo171interface2;
                } else if (mo171interface2 != null) {
                    Ccatch m168class3 = Ccatch.m168class(mo171interface2);
                    ?? obj3 = new Object();
                    Enumeration mo170goto = m168class3.mo170goto();
                    obj3.f12121e = C16527e.loadAd(mo170goto.nextElement());
                    obj3.f12122e = Cprotected.subs(mo170goto.nextElement()).f36449e;
                    c5723e = obj3;
                }
                obj2.f34248e = c5723e;
                obj2.f34247e = AbstractC12442e.license(Cprotected.subs(m168class2.mo171interface(1)).f36449e);
                obj2.f34246e = m168class2.size() == 3 ? Cthis.subs(m168class2.mo171interface(2)).firebase() : C17482e.f34245e;
                c17482e = obj2;
            }
            obj.f1150e = c17482e;
        }
        return obj;
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(3, 0);
        crashlyticsVar.appmetrica(new Cthis(3L));
        crashlyticsVar.appmetrica(this.f1151e);
        C17482e c17482e = this.f1150e;
        if (c17482e != null) {
            crashlyticsVar.appmetrica(c17482e);
        }
        return new Ccatch(crashlyticsVar);
    }
}
