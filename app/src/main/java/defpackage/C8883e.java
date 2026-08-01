package defpackage;

import java.io.IOException;

/* renamed from: eٌۖؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8883e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Cthis f17840e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public ads f17841e;

    /* JADX WARN: Type inference failed for: r1v0, types: [eٌۖؒ, java.lang.Object] */
    public static C8883e loadAd(Object obj) {
        if (obj instanceof C8883e) {
            return (C8883e) obj;
        }
        if (obj instanceof C3522e) {
            C3522e c3522e = (C3522e) obj;
            int i = C3522e.metrica;
            try {
                return loadAd(Cdefault.inmobi(c3522e.vip.f36449e));
            } catch (IOException e) {
                throw new IllegalArgumentException("can't convert extension: " + e);
            }
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        obj2.f17841e = ads.f2e;
        obj2.f17840e = null;
        if (m168class.size() == 0) {
            obj2.f17841e = null;
            obj2.f17840e = null;
            return obj2;
        }
        if (m168class.mo171interface(0) instanceof ads) {
            obj2.f17841e = ads.crashlytics(m168class.mo171interface(0));
        } else {
            obj2.f17841e = null;
            obj2.f17840e = Cthis.subs(m168class.mo171interface(0));
        }
        if (m168class.size() <= 1) {
            return obj2;
        }
        if (obj2.f17841e == null) {
            throw new IllegalArgumentException("wrong sequence in constructor");
        }
        obj2.f17840e = Cthis.subs(m168class.mo171interface(1));
        return obj2;
    }

    public final boolean Signature() {
        ads adsVar = this.f17841e;
        return adsVar != null && adsVar.firebase();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(2, 0);
        ads adsVar = this.f17841e;
        if (adsVar != null) {
            crashlyticsVar.appmetrica(adsVar);
        }
        Cthis cthis = this.f17840e;
        if (cthis != null) {
            crashlyticsVar.appmetrica(cthis);
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }

    public final String toString() {
        Cthis cthis = this.f17840e;
        if (cthis == null) {
            return "BasicConstraints: isCa(" + Signature() + ")";
        }
        return "BasicConstraints: isCa(" + Signature() + "), pathLenConstraint = " + cthis.firebase();
    }
}
