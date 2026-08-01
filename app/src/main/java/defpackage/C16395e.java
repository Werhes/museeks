package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٟؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16395e implements Iterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f32202e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C1952e f32203e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C5414e f32204e;

    public C16395e(C1152e c1152e) {
        C5414e c5414e = new C5414e(c1152e);
        this.f32204e = c5414e;
        this.f32203e = new C1952e(c5414e.ad());
        this.f32202e = c1152e.f3732e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32202e > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f32203e.hasNext()) {
            this.f32203e = new C1952e(this.f32204e.ad());
        }
        this.f32202e--;
        return Byte.valueOf(this.f32203e.ad());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
