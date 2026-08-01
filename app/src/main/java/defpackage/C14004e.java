package defpackage;

/* renamed from: eٕۣٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14004e extends Cextends implements premium {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Cdefault f27736e;

    public C14004e() {
        this.f27736e = C0503e.f2592e;
    }

    public C14004e(Cdefault cdefault) {
        this.f27736e = cdefault;
    }

    public C14004e(C9300e c9300e) {
        this.f27736e = null;
        this.f27736e = c9300e.billing();
    }

    public C14004e(Ctry ctry) {
        this.f27736e = ctry;
    }

    public static C14004e loadAd(Object obj) {
        if (obj == null || (obj instanceof C14004e)) {
            return (C14004e) obj;
        }
        if (obj instanceof Cdefault) {
            return new C14004e((Cdefault) obj);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
        try {
            return new C14004e(Cdefault.inmobi((byte[]) obj));
        } catch (Exception e) {
            throw new IllegalArgumentException(AbstractC1786e.remoteconfig(e, new StringBuilder("unable to parse encoded data: ")));
        }
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return this.f27736e;
    }
}
