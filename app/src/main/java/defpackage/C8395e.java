package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؐٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8395e implements InterfaceC16460e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC12254e f17169e;

    public C8395e(InterfaceC12254e interfaceC12254e) {
        this.f17169e = interfaceC12254e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8395e) {
            return AbstractC7890e.billing(this.f17169e, ((C8395e) obj).f17169e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17169e.hashCode() * 31;
    }
}
