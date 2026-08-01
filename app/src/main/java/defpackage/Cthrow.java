package defpackage;

/* renamed from: throw, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cthrow extends Cdefault {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final inmobi f36482e = new inmobi(12, Cthrow.class);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C0674e f36483e;

    public Cthrow(C0674e c0674e) {
        this.f36483e = c0674e;
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2343super(7, z);
        c7850e.m2337implements(25, false, this.f36483e.f2940e);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.Cdefault
    public final Cdefault ads() {
        this.f36483e.getClass();
        return this;
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        return ~AbstractC12442e.isVip(this.f36483e.f2940e);
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (cdefault instanceof Cthrow) {
            return this.f36483e.loadAd(((Cthrow) cdefault).f36483e);
        }
        return false;
    }

    @Override // defpackage.Cdefault
    public final Cdefault premium() {
        this.f36483e.getClass();
        return this;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return this.f36483e.remoteconfig(z);
    }
}
