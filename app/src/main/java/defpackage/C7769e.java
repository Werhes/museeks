package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7769e implements InterfaceC8910e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC4895e f15738e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f15739e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC9110e f15740e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f15741e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC11062e f15742e;

    public C7769e(InterfaceC4895e interfaceC4895e, AbstractC11062e abstractC11062e, AbstractC9110e abstractC9110e) {
        this.f15742e = abstractC11062e;
        this.f15740e = abstractC9110e;
        this.f15738e = interfaceC4895e;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f15739e) {
            this.f15741e = true;
            InterfaceC4895e interfaceC4895e = this.f15738e;
            if (interfaceC4895e != null) {
                try {
                    interfaceC4895e.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC8910e
    /* renamed from: continue, reason: not valid java name */
    public final C10675e mo2320continue() {
        synchronized (this.f15739e) {
            if (this.f15741e) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC8910e
    /* renamed from: eؘؕۥ, reason: contains not printable characters */
    public final InterfaceC4895e mo2321e() {
        synchronized (this.f15739e) {
            if (this.f15741e) {
                throw new IllegalStateException("closed");
            }
            InterfaceC4895e interfaceC4895e = this.f15738e;
            if (interfaceC4895e != null) {
                return interfaceC4895e;
            }
            C13197e c13197e = new C13197e(this.f15742e.mo1918implements(null));
            this.f15738e = c13197e;
            return c13197e;
        }
    }

    @Override // defpackage.InterfaceC8910e
    public final AbstractC11062e getFileSystem() {
        return this.f15742e;
    }

    @Override // defpackage.InterfaceC8910e
    public final AbstractC9110e smaato() {
        return this.f15740e;
    }
}
