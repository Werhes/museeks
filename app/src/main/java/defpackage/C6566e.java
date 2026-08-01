package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٟۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6566e extends AbstractC18423e {
    public final boolean adcel(Throwable th) {
        if (!AbstractC18423e.f36119e.vip(this, null, new C3148e(th))) {
            return false;
        }
        AbstractC18423e.metrica(this);
        return true;
    }

    public final boolean mopub(ListenableFuture listenableFuture) {
        C3148e c3148e;
        listenableFuture.getClass();
        Object obj = this.f36122e;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (AbstractC18423e.f36119e.vip(this, null, AbstractC18423e.purchase(listenableFuture))) {
                    AbstractC18423e.metrica(this);
                    return true;
                }
                return false;
            }
            RunnableC7789e runnableC7789e = new RunnableC7789e(this, listenableFuture);
            if (AbstractC18423e.f36119e.vip(this, null, runnableC7789e)) {
                try {
                    listenableFuture.ad(runnableC7789e, EnumC3132e.f7209e);
                    return true;
                } catch (Throwable th) {
                    try {
                        c3148e = new C3148e(th);
                    } catch (Throwable unused) {
                        c3148e = C3148e.vip;
                    }
                    AbstractC18423e.f36119e.vip(this, runnableC7789e, c3148e);
                    return true;
                }
            }
            obj = this.f36122e;
        }
        if (obj instanceof C12216e) {
            listenableFuture.cancel(((C12216e) obj).ad);
        }
        return false;
    }

    public final boolean startapp(Object obj) {
        if (obj == null) {
            obj = AbstractC18423e.f36118e;
        }
        if (!AbstractC18423e.f36119e.vip(this, null, obj)) {
            return false;
        }
        AbstractC18423e.metrica(this);
        return true;
    }
}
