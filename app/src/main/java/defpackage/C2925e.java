package defpackage;

import java.util.Enumeration;

/* renamed from: eؔۡ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2925e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Ctry f6913e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Cprotected f6914e;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eؔۡ۠] */
    public static C2925e loadAd(Object obj) {
        if (obj instanceof C2925e) {
            return (C2925e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        Enumeration mo170goto = m168class.mo170goto();
        obj2.f6914e = (Cprotected) mo170goto.nextElement();
        obj2.f6913e = (Ctry) mo170goto.nextElement();
        return obj2;
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return new C10154e(this.f6914e, this.f6913e);
    }
}
