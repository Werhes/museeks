package defpackage;

import java.security.cert.CertPathBuilderException;

/* renamed from: eَؙۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6315e extends CertPathBuilderException {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Throwable f13144e;

    public C6315e(String str, Throwable th) {
        super(str);
        this.f13144e = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f13144e;
    }
}
