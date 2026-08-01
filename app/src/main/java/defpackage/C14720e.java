package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٔٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14720e implements AutoCloseable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC4895e f29131e;

    public /* synthetic */ C14720e(InterfaceC4895e interfaceC4895e) {
        this.f29131e = interfaceC4895e;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f29131e.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14720e) {
            return AbstractC7890e.billing(this.f29131e, ((C14720e) obj).f29131e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29131e.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.f29131e + ")";
    }
}
