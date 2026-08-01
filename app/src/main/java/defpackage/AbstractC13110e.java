package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙْٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13110e implements InterfaceC0274e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC0274e f26068e;

    public AbstractC13110e(InterfaceC0274e interfaceC0274e) {
        this.f26068e = interfaceC0274e;
    }

    @Override // defpackage.InterfaceC0274e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26068e.close();
    }

    @Override // defpackage.InterfaceC0274e, java.io.Flushable
    public void flush() {
        this.f26068e.flush();
    }

    @Override // defpackage.InterfaceC0274e
    public final C1930e startapp() {
        return this.f26068e.startapp();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f26068e + ')';
    }

    @Override // defpackage.InterfaceC0274e
    /* renamed from: transient */
    public void mo272transient(C16151e c16151e, long j) {
        this.f26068e.mo272transient(c16151e, j);
    }
}
