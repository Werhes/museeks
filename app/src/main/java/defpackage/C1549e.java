package defpackage;

import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;

/* renamed from: eؓؓؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1549e extends CertPathValidatorException {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Throwable f4421e;

    public C1549e(String str, Exception exc) {
        super(str);
        this.f4421e = exc;
    }

    public C1549e(String str, Exception exc, CertPath certPath, int i) {
        super(str, exc, certPath, i);
        this.f4421e = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f4421e;
    }
}
