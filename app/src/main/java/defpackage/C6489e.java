package defpackage;

import java.math.BigInteger;
import java.util.Date;

/* renamed from: eؙٚٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6489e extends Cextends {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C4626e f13400e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Cinterface f13401e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16527e f13402e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Cinterface f13403e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final BigInteger f13404e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f13405e;

    public C6489e(Ccatch ccatch) {
        this.f13404e = Cthis.subs(ccatch.mo171interface(0)).firebase();
        this.f13402e = C16527e.loadAd(ccatch.mo171interface(1));
        this.f13401e = Cinterface.m4595class(ccatch.mo171interface(2));
        this.f13403e = Cinterface.m4595class(ccatch.mo171interface(3));
        subs mo171interface = ccatch.mo171interface(4);
        this.f13400e = mo171interface instanceof C4626e ? (C4626e) mo171interface : mo171interface != null ? new C4626e(Ccatch.m168class(mo171interface)) : null;
        this.f13405e = ccatch.size() == 6 ? C6310e.subs(ccatch.mo171interface(5)).yandex() : null;
    }

    public C6489e(C16527e c16527e, Date date, Date date2, C4626e c4626e) {
        this.f13404e = BigInteger.valueOf(1L);
        this.f13402e = c16527e;
        this.f13401e = new Cinterface(date);
        this.f13403e = new Cinterface(date2);
        this.f13400e = c4626e;
        this.f13405e = null;
    }

    public static C6489e loadAd(Object obj) {
        if (obj instanceof C6489e) {
            return (C6489e) obj;
        }
        if (obj != null) {
            return new C6489e(Ccatch.m168class(obj));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(6, 0);
        crashlyticsVar.appmetrica(new Cthis(this.f13404e));
        crashlyticsVar.appmetrica(this.f13402e);
        crashlyticsVar.appmetrica(this.f13401e);
        crashlyticsVar.appmetrica(this.f13403e);
        crashlyticsVar.appmetrica(this.f13400e);
        String str = this.f13405e;
        if (str != null) {
            crashlyticsVar.appmetrica(new C6310e(str));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
