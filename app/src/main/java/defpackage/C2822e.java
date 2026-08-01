package defpackage;

import java.util.Enumeration;

/* renamed from: eؔۙۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2822e extends Cextends implements InterfaceC5051e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C18239e f6783e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C0915e f6784e;

    public C2822e(C0915e c0915e, C18239e c18239e) {
        this.f6784e = c0915e;
        this.f6783e = c18239e;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eؘٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [eؔۙۖ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, eؚؒۗ] */
    public static C2822e loadAd(Object obj) {
        C0915e c0915e;
        if (obj instanceof C2822e) {
            return (C2822e) obj;
        }
        C18239e c18239e = null;
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        Enumeration mo170goto = m168class.mo170goto();
        Ccatch m168class2 = Ccatch.m168class(((subs) mo170goto.nextElement()).billing());
        subs mo171interface = m168class2.mo171interface(0);
        Ctry ctry = InterfaceC5051e.f10825finally;
        if (mo171interface.equals(ctry)) {
            c0915e = new C0915e(ctry, C7832e.loadAd(m168class2.mo171interface(1)));
        } else {
            Ccatch m168class3 = Ccatch.m168class(m168class2);
            ?? obj3 = new Object();
            obj3.f3341e = C16527e.loadAd(m168class3);
            c0915e = obj3;
        }
        obj2.f6784e = c0915e;
        Object nextElement = mo170goto.nextElement();
        if (nextElement instanceof C18239e) {
            c18239e = (C18239e) nextElement;
        } else if (nextElement != null) {
            Ccatch m168class4 = Ccatch.m168class(nextElement);
            ?? obj4 = new Object();
            obj4.f35702e = C16527e.loadAd(m168class4);
            c18239e = obj4;
        }
        obj2.f6783e = c18239e;
        return obj2;
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return new C10154e(this.f6784e, this.f6783e);
    }
}
