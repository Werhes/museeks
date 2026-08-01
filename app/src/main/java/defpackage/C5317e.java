package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؗۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5317e implements Closeable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final CharSequence f11413e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C3434e f11414e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C17466e f11415e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final CharSequence f11416e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C12695e f11417e;

    public C5317e(C3434e c3434e, CharSequence charSequence, CharSequence charSequence2, C12695e c12695e, C17466e c17466e) {
        this.f11417e = c12695e;
        this.f11415e = c17466e;
        this.f11414e = c3434e;
        this.f11416e = charSequence;
        this.f11413e = charSequence2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11415e.license();
        this.f11417e.appmetrica();
    }
}
