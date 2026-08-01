package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٔؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC9465e implements Runnable, Comparable, InterfaceC1232e {
    private volatile Object _heap;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f18806e = -1;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public long f18807e;

    public AbstractRunnableC9465e(long j) {
        this.f18807e = j;
    }

    @Override // defpackage.InterfaceC1232e
    public final void ad() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C2443e c2443e = AbstractC7205e.ad;
                if (obj == c2443e) {
                    return;
                }
                C16037e c16037e = obj instanceof C16037e ? (C16037e) obj : null;
                if (c16037e != null) {
                    c16037e.vip(this);
                }
                this._heap = c2443e;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f18807e - ((AbstractRunnableC9465e) obj).f18807e;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void license(C16037e c16037e) {
        if (this._heap == AbstractC7205e.ad) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c16037e;
    }

    public final int metrica(long j, C16037e c16037e, AbstractC0541e abstractC0541e) {
        synchronized (this) {
            if (this._heap == AbstractC7205e.ad) {
                return 2;
            }
            synchronized (c16037e) {
                try {
                    AbstractRunnableC9465e[] abstractRunnableC9465eArr = c16037e.ad;
                    AbstractRunnableC9465e abstractRunnableC9465e = abstractRunnableC9465eArr != null ? abstractRunnableC9465eArr[0] : null;
                    if (AbstractC0541e.f2709e.get(abstractC0541e) == 1) {
                        return 1;
                    }
                    if (abstractRunnableC9465e == null) {
                        c16037e.metrica = j;
                    } else {
                        long j2 = abstractRunnableC9465e.f18807e;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - c16037e.metrica > 0) {
                            c16037e.metrica = j;
                        }
                    }
                    long j3 = this.f18807e;
                    long j4 = c16037e.metrica;
                    if (j3 - j4 < 0) {
                        this.f18807e = j4;
                    }
                    c16037e.ad(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public String toString() {
        return AbstractC10257e.mopub(new StringBuilder("Delayed[nanos="), this.f18807e, ']');
    }

    public final C4894e vip() {
        Object obj = this._heap;
        if (obj instanceof C4894e) {
            return (C4894e) obj;
        }
        return null;
    }
}
