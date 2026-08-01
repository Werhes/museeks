package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: eٍؔؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9216e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Vector f18405e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Hashtable f18406e;

    public static Cprotected Signature(C9216e c9216e, Ctry ctry) {
        C1597e loadAd;
        if (c9216e == null || (loadAd = c9216e.loadAd(ctry)) == null) {
            return null;
        }
        return loadAd.f4520e;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eٍؔؐ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, eؓؕ۠] */
    public static C9216e admob(subs subsVar) {
        C1597e c1597e;
        subs mo171interface;
        if (subsVar instanceof C9216e) {
            return (C9216e) subsVar;
        }
        if (subsVar == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(subsVar);
        ?? obj = new Object();
        obj.f18406e = new Hashtable();
        obj.f18405e = new Vector();
        Enumeration mo170goto = m168class.mo170goto();
        while (mo170goto.hasMoreElements()) {
            Object nextElement = mo170goto.nextElement();
            Ctry ctry = C1597e.f4513e;
            if (nextElement instanceof C1597e) {
                c1597e = (C1597e) nextElement;
            } else if (nextElement != null) {
                Ccatch m168class2 = Ccatch.m168class(nextElement);
                ?? obj2 = new Object();
                if (m168class2.size() == 2) {
                    obj2.f4522e = Ctry.m4669interface(m168class2.mo171interface(0));
                    obj2.f4521e = false;
                    mo171interface = m168class2.mo171interface(1);
                } else {
                    if (m168class2.size() != 3) {
                        throw new IllegalArgumentException(AbstractC0054e.premium(m168class2, new StringBuilder("Bad sequence size: ")));
                    }
                    obj2.f4522e = Ctry.m4669interface(m168class2.mo171interface(0));
                    obj2.f4521e = ads.crashlytics(m168class2.mo171interface(1)).firebase();
                    mo171interface = m168class2.mo171interface(2);
                }
                obj2.f4520e = Cprotected.subs(mo171interface);
                c1597e = obj2;
            } else {
                c1597e = null;
            }
            Hashtable hashtable = obj.f18406e;
            Ctry ctry2 = c1597e.f4522e;
            if (hashtable.containsKey(ctry2) && !AbstractC0361e.metrica("org.bouncycastle.x509.ignore_repeated_extensions")) {
                throw new IllegalArgumentException(AbstractC4653e.inmobi("repeated extension found: ", ctry2));
            }
            obj.f18406e.put(ctry2, c1597e);
            obj.f18405e.addElement(ctry2);
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        Vector vector = this.f18405e;
        crashlytics crashlyticsVar = new crashlytics(vector.size(), 0);
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            crashlyticsVar.appmetrica((C1597e) this.f18406e.get((Ctry) elements.nextElement()));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }

    public final C1597e loadAd(Ctry ctry) {
        return (C1597e) this.f18406e.get(ctry);
    }

    public final boolean subscription() {
        Vector vector = this.f18405e;
        for (int i = 0; i != vector.size(); i++) {
            if (((C1597e) this.f18406e.get(vector.elementAt(i))).f4521e) {
                return true;
            }
        }
        return false;
    }
}
