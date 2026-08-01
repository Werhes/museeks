package defpackage;

import j$.util.DesugarCollections;
import java.security.cert.CertPathParameters;
import java.util.HashSet;
import java.util.Set;

/* renamed from: eٓ٘ۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14055e implements CertPathParameters {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f27797e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Set f27798e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C6107e f27799e;

    public C14055e(Csuper csuper) {
        this.f27799e = (C6107e) csuper.f36469e;
        this.f27798e = DesugarCollections.unmodifiableSet((HashSet) csuper.f36471e);
        this.f27797e = csuper.f36470e;
    }

    @Override // java.security.cert.CertPathParameters
    public final Object clone() {
        return this;
    }
}
