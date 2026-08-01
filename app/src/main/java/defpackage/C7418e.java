package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7418e extends AbstractC12947e {
    public final /* synthetic */ C9231e adcel;

    public C7418e(C9231e c9231e) {
        this.adcel = c9231e;
    }

    @Override // defpackage.AbstractC12947e
    public final void pro(Throwable th) {
        ((C5188e) this.adcel.ad).purchase(th);
    }

    @Override // defpackage.AbstractC12947e
    public final void signatures(C11980e c11980e) {
        C9231e c9231e = this.adcel;
        c9231e.metrica = c11980e;
        C11980e c11980e2 = (C11980e) c9231e.metrica;
        C5188e c5188e = (C5188e) c9231e.ad;
        c9231e.vip = new C18478e(c11980e2, c5188e.billing, c5188e.startapp, Build.VERSION.SDK_INT >= 34 ? AbstractC0711e.ad() : AbstractC10077e.loadAd());
        C5188e c5188e2 = (C5188e) c9231e.ad;
        c5188e2.getClass();
        ArrayList arrayList = new ArrayList();
        c5188e2.ad.writeLock().lock();
        try {
            c5188e2.metrica = 1;
            arrayList.addAll(c5188e2.vip);
            c5188e2.vip.clear();
            c5188e2.ad.writeLock().unlock();
            c5188e2.license.post(new RunnableC9280e(arrayList, c5188e2.metrica, (Throwable) null));
        } catch (Throwable th) {
            c5188e2.ad.writeLock().unlock();
            throw th;
        }
    }
}
