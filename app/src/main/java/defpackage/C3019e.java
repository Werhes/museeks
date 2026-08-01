package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۧۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3019e implements Closeable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f7076e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C16151e f7077e;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7077e == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f7077e = null;
    }
}
