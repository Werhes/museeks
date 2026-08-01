package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7367e implements InterfaceC1753e {
    public final C0177e ad;

    public C7367e(C0177e c0177e) {
        this.ad = c0177e;
    }

    @Override // defpackage.InterfaceC1753e
    public final InterfaceC1753e appmetrica() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.InterfaceC1753e
    public final C10972e billing() {
        throw new IllegalStateException("already connected");
    }

    @Override // defpackage.InterfaceC1753e
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.InterfaceC1753e
    public final boolean license() {
        return true;
    }

    @Override // defpackage.InterfaceC1753e
    public final C0177e purchase() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC1753e
    public final C10972e yandex() {
        throw new IllegalStateException("already connected");
    }
}
