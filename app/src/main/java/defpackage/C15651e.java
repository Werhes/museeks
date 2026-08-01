package defpackage;

/* renamed from: eِٕۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C15651e extends Exception {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Exception f30861e;

    public C15651e(String str, Exception exc) {
        super(str);
        this.f30861e = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f30861e;
    }
}
