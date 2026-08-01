package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16941e implements InterfaceC4075e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C15650e[] f33177e;

    public C16941e(C15650e[] c15650eArr) {
        this.f33177e = c15650eArr;
    }

    @Override // defpackage.InterfaceC4075e
    public final void ad(Throwable th) {
        vip();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f33177e + ']';
    }

    public final void vip() {
        for (C15650e c15650e : this.f33177e) {
            InterfaceC1232e interfaceC1232e = c15650e.f30860e;
            if (interfaceC1232e == null) {
                interfaceC1232e = null;
            }
            interfaceC1232e.ad();
        }
    }
}
