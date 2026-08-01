package defpackage;

/* renamed from: eْۙۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13476e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C9216e f26748e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Ccatch f26749e;

    /* JADX WARN: Type inference failed for: r0v1, types: [eْۙۡ, java.lang.Object] */
    public static C13476e Signature(Object obj) {
        if (obj instanceof C13476e) {
            return (C13476e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        if (m168class.size() < 2 || m168class.size() > 3) {
            throw new IllegalArgumentException(AbstractC0054e.premium(m168class, new StringBuilder("Bad sequence size: ")));
        }
        obj2.f26749e = m168class;
        return obj2;
    }

    public final Cthis admob() {
        return Cthis.subs(this.f26749e.mo171interface(0));
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return this.f26749e;
    }

    public final C9216e loadAd() {
        Ccatch ccatch = this.f26749e;
        if (this.f26748e == null && ccatch.size() == 3) {
            this.f26748e = C9216e.admob(ccatch.mo171interface(2));
        }
        return this.f26748e;
    }

    public final boolean subscription() {
        return this.f26749e.size() == 3;
    }
}
