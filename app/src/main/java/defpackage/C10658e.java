package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۥۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10658e implements InterfaceC3589e, Cloneable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C8905e f20986e;

    public C10658e(C8905e c8905e) {
        C8905e c8905e2 = new C8905e(c8905e.f17872e, c8905e.f17871e, c8905e.f17869e, 0);
        c8905e2.f17870e = c8905e.license();
        this.f20986e = c8905e2;
    }

    @Override // defpackage.InterfaceC3589e
    public final boolean Signature() {
        return C11603e.f23316e.contains(EnumC3488e.ad(this.f20986e.f17871e));
    }

    public final Object clone() {
        return super.clone();
    }

    @Override // defpackage.InterfaceC3589e
    public final String getId() {
        return this.f20986e.f17871e;
    }

    @Override // defpackage.InterfaceC3589e
    public boolean isEmpty() {
        return this.f20986e.f17870e.length == 0;
    }

    @Override // defpackage.InterfaceC3589e
    public final byte[] purchase() {
        return this.f20986e.license();
    }

    @Override // defpackage.InterfaceC3589e
    public final String toString() {
        return this.f20986e.appmetrica();
    }
}
