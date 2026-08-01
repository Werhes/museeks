package defpackage;

/* renamed from: eٌٍُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9338e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Cprotected f18594e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Cthis f18595e;

    public C9338e(int i, byte[] bArr) {
        this.f18594e = new Cprotected(bArr);
        this.f18595e = new Cthis(i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eٌٍُ] */
    public static C9338e loadAd(Object obj) {
        if (obj instanceof C9338e) {
            return (C9338e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        obj2.f18594e = (Cprotected) m168class.mo171interface(0);
        obj2.f18595e = Cthis.subs(m168class.mo171interface(1));
        return obj2;
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return new C10154e(this.f18594e, this.f18595e);
    }
}
