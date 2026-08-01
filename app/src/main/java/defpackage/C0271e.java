package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؑۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271e extends AbstractC7861e {
    @Override // defpackage.AbstractC7861e
    public final boolean appmetrica(AbstractC7904e abstractC7904e, Object obj, Object obj2) {
        synchronized (abstractC7904e) {
            try {
                if (abstractC7904e.f15982e != obj) {
                    return false;
                }
                abstractC7904e.f15982e = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC7861e
    public final void inmobi(C5109e c5109e, Thread thread) {
        c5109e.ad = thread;
    }

    @Override // defpackage.AbstractC7861e
    public final void isVip(C5109e c5109e, C5109e c5109e2) {
        c5109e.vip = c5109e2;
    }

    @Override // defpackage.AbstractC7861e
    public final boolean license(AbstractC7904e abstractC7904e, C16267e c16267e, C16267e c16267e2) {
        synchronized (abstractC7904e) {
            try {
                if (abstractC7904e.f15981e != c16267e) {
                    return false;
                }
                abstractC7904e.f15981e = c16267e2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC7861e
    public final boolean purchase(AbstractC7904e abstractC7904e, C5109e c5109e, C5109e c5109e2) {
        synchronized (abstractC7904e) {
            try {
                if (abstractC7904e.f15980e != c5109e) {
                    return false;
                }
                abstractC7904e.f15980e = c5109e2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
