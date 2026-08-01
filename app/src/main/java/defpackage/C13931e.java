package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٓۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13931e extends AbstractC0326e {
    @Override // defpackage.AbstractC0326e
    public final C17100e adcel(AbstractC0586e abstractC0586e) {
        C17100e c17100e;
        C17100e c17100e2 = C17100e.license;
        synchronized (abstractC0586e) {
            try {
                c17100e = abstractC0586e.f2775e;
                if (c17100e != c17100e2) {
                    abstractC0586e.f2775e = c17100e2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c17100e;
    }

    @Override // defpackage.AbstractC0326e
    public final void amazon(C2694e c2694e, C2694e c2694e2) {
        c2694e.vip = c2694e2;
    }

    @Override // defpackage.AbstractC0326e
    public final boolean appmetrica(AbstractC0586e abstractC0586e, C2694e c2694e, C2694e c2694e2) {
        synchronized (abstractC0586e) {
            try {
                if (abstractC0586e.f2774e != c2694e) {
                    return false;
                }
                abstractC0586e.f2774e = c2694e2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC0326e
    public final boolean license(AbstractC0586e abstractC0586e, Object obj, Object obj2) {
        synchronized (abstractC0586e) {
            try {
                if (abstractC0586e.f2776e != obj) {
                    return false;
                }
                abstractC0586e.f2776e = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC0326e
    public final void loadAd(C2694e c2694e, Thread thread) {
        c2694e.ad = thread;
    }

    @Override // defpackage.AbstractC0326e
    public final boolean metrica(AbstractC0586e abstractC0586e, C17100e c17100e, C17100e c17100e2) {
        synchronized (abstractC0586e) {
            try {
                if (abstractC0586e.f2775e != c17100e) {
                    return false;
                }
                abstractC0586e.f2775e = c17100e2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC0326e
    public final C2694e mopub(AbstractC0586e abstractC0586e) {
        C2694e c2694e;
        C2694e c2694e2 = C2694e.metrica;
        synchronized (abstractC0586e) {
            try {
                c2694e = abstractC0586e.f2774e;
                if (c2694e != c2694e2) {
                    abstractC0586e.f2774e = c2694e2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2694e;
    }
}
