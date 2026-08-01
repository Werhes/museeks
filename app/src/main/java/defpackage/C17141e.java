package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: eٜٗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17141e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final Ctry f33545e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Hashtable f33547e = new Hashtable();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Vector f33546e = new Vector();

    static {
        new Ctry("2.5.29.9");
        new Ctry("2.5.29.14");
        new Ctry("2.5.29.15");
        new Ctry("2.5.29.16");
        new Ctry("2.5.29.17");
        new Ctry("2.5.29.18");
        new Ctry("2.5.29.19");
        new Ctry("2.5.29.20");
        new Ctry("2.5.29.21");
        new Ctry("2.5.29.23");
        new Ctry("2.5.29.24");
        new Ctry("2.5.29.27");
        new Ctry("2.5.29.28");
        new Ctry("2.5.29.29");
        new Ctry("2.5.29.30");
        new Ctry("2.5.29.31");
        new Ctry("2.5.29.32");
        new Ctry("2.5.29.33");
        new Ctry("2.5.29.35");
        new Ctry("2.5.29.36");
        new Ctry("2.5.29.37");
        new Ctry("2.5.29.46");
        new Ctry("2.5.29.54");
        new Ctry("1.3.6.1.5.5.7.1.1");
        new Ctry("1.3.6.1.5.5.7.1.11");
        new Ctry("1.3.6.1.5.5.7.1.12");
        new Ctry("1.3.6.1.5.5.7.1.2");
        new Ctry("1.3.6.1.5.5.7.1.3");
        new Ctry("1.3.6.1.5.5.7.1.4");
        f33545e = new Ctry("2.5.29.56");
        new Ctry("2.5.29.55");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, eؕٞ٘] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, eؕٞ٘] */
    public C17141e(Ccatch ccatch) {
        Enumeration mo170goto = ccatch.mo170goto();
        while (mo170goto.hasMoreElements()) {
            Ccatch m168class = Ccatch.m168class(mo170goto.nextElement());
            if (m168class.size() == 3) {
                Hashtable hashtable = this.f33547e;
                subs mo171interface = m168class.mo171interface(0);
                ads crashlytics = ads.crashlytics(m168class.mo171interface(1));
                Cprotected subs = Cprotected.subs(m168class.mo171interface(2));
                ?? obj = new Object();
                obj.ad = crashlytics.firebase();
                obj.vip = subs;
                hashtable.put(mo171interface, obj);
            } else {
                if (m168class.size() != 2) {
                    throw new IllegalArgumentException(AbstractC0054e.premium(m168class, new StringBuilder("Bad sequence size: ")));
                }
                Hashtable hashtable2 = this.f33547e;
                subs mo171interface2 = m168class.mo171interface(0);
                Cprotected subs2 = Cprotected.subs(m168class.mo171interface(1));
                ?? obj2 = new Object();
                obj2.ad = false;
                obj2.vip = subs2;
                hashtable2.put(mo171interface2, obj2);
            }
            this.f33546e.addElement(m168class.mo171interface(0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C17141e loadAd(Cdefault cdefault) {
        if (cdefault == 0) {
            return (C17141e) cdefault;
        }
        if (cdefault instanceof Ccatch) {
            return new C17141e((Ccatch) cdefault);
        }
        if (!(cdefault instanceof Cstrictfp)) {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(cdefault.getClass().getName()));
        }
        Cstrictfp m4634class = Cstrictfp.m4634class(cdefault);
        AbstractC9947e.ad(m4634class);
        subs subsVar = m4634class.f36464e;
        return loadAd((subsVar instanceof Cextends ? (Cextends) subsVar : subsVar.billing()).billing());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [default, catch, eًٌَ] */
    /* JADX WARN: Type inference failed for: r4v5, types: [subs, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        Vector vector = this.f33546e;
        crashlytics crashlyticsVar = new crashlytics(vector.size(), 0);
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            crashlytics crashlyticsVar2 = new crashlytics(3, 0);
            Ctry ctry = (Ctry) elements.nextElement();
            C3522e c3522e = (C3522e) this.f33547e.get(ctry);
            crashlyticsVar2.appmetrica(ctry);
            if (c3522e.ad) {
                crashlyticsVar2.appmetrica(ads.f4e);
            }
            crashlyticsVar2.appmetrica(c3522e.vip);
            ?? ccatch = new Ccatch(crashlyticsVar2);
            ccatch.f20096e = -1;
            crashlyticsVar.appmetrica(ccatch);
        }
        ?? ccatch2 = new Ccatch(crashlyticsVar);
        ccatch2.f20096e = -1;
        return ccatch2;
    }
}
