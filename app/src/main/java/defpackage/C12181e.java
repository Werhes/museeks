package defpackage;

/* renamed from: eّؑۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12181e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Cextends f24479e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Ctry f24480e;

    public C12181e(Ccatch ccatch) {
        this.f24480e = Ctry.m4669interface(ccatch.mo171interface(0));
        this.f24479e = Cstrictfp.m4634class(ccatch.mo171interface(1)).firebase();
    }

    public static C12181e loadAd(Object obj) {
        if (obj instanceof C12181e) {
            return (C12181e) obj;
        }
        if (obj != null) {
            return new C12181e(Ccatch.m168class(obj));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        ?? ccatch = new Ccatch(this.f24480e, new Cstrictfp(true, 0, this.f24479e));
        ccatch.f20096e = -1;
        return ccatch;
    }
}
