package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٞٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15630e implements InterfaceC8910e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Object f30823e = new Object();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f30824e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC11062e f30825e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AutoCloseable f30826e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C10675e f30827e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C13197e f30828e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f30829e;

    public C15630e(C10675e c10675e, AbstractC11062e abstractC11062e, String str, AutoCloseable autoCloseable) {
        this.f30827e = c10675e;
        this.f30825e = abstractC11062e;
        this.f30824e = str;
        this.f30826e = autoCloseable;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f30823e) {
            this.f30829e = true;
            C13197e c13197e = this.f30828e;
            if (c13197e != null) {
                try {
                    c13197e.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
            AutoCloseable autoCloseable = this.f30826e;
            if (autoCloseable != null) {
                try {
                    AbstractC8647e.m2458interface(autoCloseable);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused2) {
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC8910e
    /* renamed from: continue */
    public final C10675e mo2320continue() {
        C10675e c10675e;
        synchronized (this.f30823e) {
            if (this.f30829e) {
                throw new IllegalStateException("closed");
            }
            c10675e = this.f30827e;
        }
        return c10675e;
    }

    @Override // defpackage.InterfaceC8910e
    /* renamed from: eؘؕۥ */
    public final InterfaceC4895e mo2321e() {
        synchronized (this.f30823e) {
            if (this.f30829e) {
                throw new IllegalStateException("closed");
            }
            C13197e c13197e = this.f30828e;
            if (c13197e != null) {
                return c13197e;
            }
            C13197e c13197e2 = new C13197e(this.f30825e.mo1918implements(this.f30827e));
            this.f30828e = c13197e2;
            return c13197e2;
        }
    }

    @Override // defpackage.InterfaceC8910e
    public final AbstractC11062e getFileSystem() {
        return this.f30825e;
    }

    @Override // defpackage.InterfaceC8910e
    public final AbstractC9110e smaato() {
        return null;
    }
}
