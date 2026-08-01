package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّّۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12440e implements Closeable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C6121e f24905e = new C6121e(12);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f24906e;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f24906e;
        if (i <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.f24906e = i - 1;
    }
}
