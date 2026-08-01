package defpackage;

import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16887e extends AbstractC5113e {
    public AbstractC5113e Signature;
    public C13705e admob;
    public final C9689e amazon;
    public C7169e loadAd;

    public C16887e(int i, Size size) {
        super(i, size);
        this.amazon = AbstractC5750e.purchase(new C2007e(14, this));
    }

    @Override // defpackage.AbstractC5113e
    public final void ad() {
        super.ad();
        AbstractC13062e.billing(new RunnableC10022e(this, 2));
    }

    public final boolean billing(AbstractC5113e abstractC5113e, Runnable runnable) {
        boolean z;
        Size size = this.yandex;
        AbstractC13062e.metrica();
        abstractC5113e.getClass();
        int i = abstractC5113e.startapp;
        Size size2 = abstractC5113e.yandex;
        AbstractC5113e abstractC5113e2 = this.Signature;
        if (abstractC5113e2 == abstractC5113e) {
            return false;
        }
        AbstractC4265e.yandex("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", abstractC5113e2 == null);
        AbstractC4265e.license(size.equals(size2), "The provider's size(" + size + ") must match the parent(" + size2 + ")");
        int i2 = this.startapp;
        AbstractC4265e.license(i2 == i, AbstractC8647e.inmobi(i2, i, "The provider's format(", ") must match the parent(", ")"));
        synchronized (this.ad) {
            z = this.metrica;
        }
        AbstractC4265e.yandex("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
        this.Signature = abstractC5113e;
        AbstractC15792e.amazon(true, abstractC5113e.metrica(), this.loadAd, AbstractC3062e.billing());
        abstractC5113e.license();
        AbstractC15792e.smaato(this.appmetrica).ad(new RunnableC14447e(abstractC5113e, 1), AbstractC3062e.billing());
        AbstractC15792e.smaato(abstractC5113e.billing).ad(runnable, AbstractC3062e.amazon());
        return true;
    }

    @Override // defpackage.AbstractC5113e
    public final ListenableFuture purchase() {
        return this.amazon;
    }
}
