package defpackage;

/* renamed from: eؘٖۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5675e extends Exception {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Exception f12052e;

    public C5675e(String str, Exception exc) {
        super(str);
        this.f12052e = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f12052e;
    }
}
