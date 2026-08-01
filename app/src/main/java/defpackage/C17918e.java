package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٟ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17918e extends AbstractC0421e {
    @Override // defpackage.AbstractC0421e
    public final boolean Signature(AbstractC13307e abstractC13307e, Object obj, Object obj2) {
        synchronized (abstractC13307e) {
            try {
                if (abstractC13307e.f26540e != obj) {
                    return false;
                }
                abstractC13307e.f26540e = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC0421e
    public final void adcel(C9503e c9503e, Thread thread) {
        c9503e.ad = thread;
    }

    @Override // defpackage.AbstractC0421e
    public final boolean advert(AbstractC13307e abstractC13307e, C9503e c9503e, C9503e c9503e2) {
        synchronized (abstractC13307e) {
            try {
                if (abstractC13307e.f26539e != c9503e) {
                    return false;
                }
                abstractC13307e.f26539e = c9503e2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC0421e
    public final C9503e amazon(AbstractC2074e abstractC2074e) {
        C9503e c9503e;
        C9503e c9503e2 = C9503e.metrica;
        synchronized (abstractC2074e) {
            try {
                c9503e = abstractC2074e.f26539e;
                if (c9503e != c9503e2) {
                    abstractC2074e.f26539e = c9503e2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9503e;
    }

    @Override // defpackage.AbstractC0421e
    public final C9563e loadAd(AbstractC2074e abstractC2074e) {
        C9563e c9563e;
        C9563e c9563e2 = C9563e.license;
        synchronized (abstractC2074e) {
            try {
                c9563e = abstractC2074e.f26541e;
                if (c9563e != c9563e2) {
                    abstractC2074e.f26541e = c9563e2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9563e;
    }

    @Override // defpackage.AbstractC0421e
    public final void mopub(C9503e c9503e, C9503e c9503e2) {
        c9503e.vip = c9503e2;
    }

    @Override // defpackage.AbstractC0421e
    public final boolean smaato(AbstractC13307e abstractC13307e, C9563e c9563e, C9563e c9563e2) {
        synchronized (abstractC13307e) {
            try {
                if (abstractC13307e.f26541e != c9563e) {
                    return false;
                }
                abstractC13307e.f26541e = c9563e2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
