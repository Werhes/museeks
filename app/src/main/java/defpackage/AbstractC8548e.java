package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؚۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8548e implements InterfaceC2537e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC2537e f17361e;

    public AbstractC8548e(InterfaceC2537e interfaceC2537e) {
        this.f17361e = interfaceC2537e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17361e.close();
    }

    @Override // defpackage.InterfaceC2537e
    public long signatures(C16151e c16151e, long j) {
        return this.f17361e.signatures(c16151e, j);
    }

    @Override // defpackage.InterfaceC2537e
    public final C1930e startapp() {
        return this.f17361e.startapp();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f17361e + ')';
    }
}
