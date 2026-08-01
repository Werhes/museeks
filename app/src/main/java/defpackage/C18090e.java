package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣ٘ؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18090e extends AbstractC3697e {
    @Override // defpackage.AbstractC3697e
    public final boolean ad(AbstractC18423e abstractC18423e, C9934e c9934e, C9934e c9934e2) {
        synchronized (abstractC18423e) {
            try {
                if (abstractC18423e.f36121e != c9934e) {
                    return false;
                }
                abstractC18423e.f36121e = c9934e2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC3697e
    public final void appmetrica(C16839e c16839e, C16839e c16839e2) {
        c16839e.vip = c16839e2;
    }

    @Override // defpackage.AbstractC3697e
    public final boolean metrica(AbstractC18423e abstractC18423e, C16839e c16839e, C16839e c16839e2) {
        synchronized (abstractC18423e) {
            try {
                if (abstractC18423e.f36120e != c16839e) {
                    return false;
                }
                abstractC18423e.f36120e = c16839e2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC3697e
    public final void purchase(C16839e c16839e, Thread thread) {
        c16839e.ad = thread;
    }

    @Override // defpackage.AbstractC3697e
    public final boolean vip(AbstractC18423e abstractC18423e, Object obj, Object obj2) {
        synchronized (abstractC18423e) {
            try {
                if (abstractC18423e.f36122e != obj) {
                    return false;
                }
                abstractC18423e.f36122e = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
