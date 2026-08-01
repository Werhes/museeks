package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٔؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13249e implements InterfaceC16460e, Iterable, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C3590e f26280e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f26281e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C18516e f26282e;

    public C13249e(C18516e c18516e, int i, AbstractC3091e abstractC3091e, C3590e c3590e) {
        this.f26282e = c18516e;
        this.f26281e = i;
        this.f26280e = c3590e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13249e)) {
            return false;
        }
        C13249e c13249e = (C13249e) obj;
        return c13249e.f26281e == this.f26281e && c13249e.f26282e.equals(this.f26282e) && c13249e.f26280e.equals(this.f26280e);
    }

    public final int hashCode() {
        return this.f26280e.hashCode() + ((this.f26282e.hashCode() + (this.f26281e * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1269e(this.f26282e, this.f26281e, null, this.f26280e);
    }
}
