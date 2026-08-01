package defpackage;

/* renamed from: eٌؚٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16079e extends Cextends implements premium {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Cextends f31673e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f31674e;

    public C16079e(subs subsVar) {
        Cextends cextends = null;
        if ((subsVar instanceof Ccatch) || (subsVar instanceof C6702e)) {
            this.f31674e = 0;
            if (subsVar instanceof C6702e) {
                cextends = (C6702e) subsVar;
            } else if (subsVar != null) {
                cextends = new C6702e(Ccatch.m168class(subsVar));
            }
            this.f31673e = cextends;
            return;
        }
        if (!(subsVar instanceof Cstrictfp)) {
            throw new IllegalArgumentException("Unknown check object in integrity check.");
        }
        this.f31674e = 1;
        Cextends firebase = ((Cstrictfp) subsVar).firebase();
        if (firebase instanceof C17411e) {
            cextends = (C17411e) firebase;
        } else if (firebase != null) {
            cextends = new C17411e(Ccatch.m168class(firebase));
        }
        this.f31673e = cextends;
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        Cextends cextends = this.f31673e;
        return cextends instanceof C17411e ? new Cstrictfp(true, 0, cextends) : cextends.billing();
    }
}
