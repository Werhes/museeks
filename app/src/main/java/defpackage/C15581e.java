package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٛۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15581e implements InterfaceC1753e {
    public final C10972e ad;

    public C15581e(Throwable th) {
        this.ad = new C10972e(this, null, th, 2);
    }

    @Override // defpackage.InterfaceC1753e
    public final InterfaceC1753e appmetrica() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.InterfaceC1753e
    public final C10972e billing() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC1753e
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.InterfaceC1753e
    public final boolean license() {
        return false;
    }

    @Override // defpackage.InterfaceC1753e
    public final C0177e purchase() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // defpackage.InterfaceC1753e
    public final C10972e yandex() {
        return this.ad;
    }
}
