package defpackage;

import android.util.Log;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؑۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216e {
    public final String ad;
    public AbstractC12314e adcel;
    public C13155e advert;
    public final Object appmetrica;
    public C17534e billing;
    public final int license;
    public final InterfaceC18435e metrica;
    public C8419e mopub;
    public boolean purchase;
    public final InterfaceC1108e startapp;
    public final C9823e vip;
    public final C5981e yandex;

    public C0216e(String str, C9823e c9823e, InterfaceC18435e interfaceC18435e) {
        this.ad = str;
        this.vip = c9823e;
        this.metrica = interfaceC18435e;
        C11498e c11498e = AbstractC17855e.ad;
        c11498e.getClass();
        this.license = C11498e.vip.incrementAndGet(c11498e);
        this.appmetrica = new Object();
        C5981e metrica = AbstractC6959e.metrica(3, 0, 4);
        this.yandex = metrica;
        this.startapp = AbstractC7535e.yandex(metrica);
        C5910e c5910e = C5910e.ad;
        this.adcel = c5910e;
        if (!metrica.purchase(c5910e)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void ad(C1096e c1096e) {
        synchronized (this.appmetrica) {
            try {
                if (this.purchase) {
                    return;
                }
                this.purchase = true;
                Log.i("CXCP", "Disconnecting " + this);
                C17534e c17534e = this.billing;
                if (c17534e != null) {
                    c17534e.ad();
                }
                C8419e c8419e = this.mopub;
                if (c8419e != null) {
                    c8419e.Signature(null);
                }
                C13155e c13155e = this.advert;
                if (c13155e != null) {
                    c13155e.vip();
                }
                if (!(metrica() instanceof C10211e)) {
                    if (!(this.adcel instanceof C12848e)) {
                        vip(new C12848e(null));
                    }
                    vip(new C10211e(this.ad, 2, null, null, null, null, null, null, c1096e));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AbstractC12314e metrica() {
        AbstractC12314e abstractC12314e;
        synchronized (this.appmetrica) {
            abstractC12314e = this.adcel;
        }
        return abstractC12314e;
    }

    public final String toString() {
        return "VirtualCamera-" + this.license;
    }

    public final void vip(AbstractC12314e abstractC12314e) {
        this.adcel = abstractC12314e;
        if (this.yandex.purchase(abstractC12314e)) {
            return;
        }
        throw new IllegalStateException(("Failed to emit " + abstractC12314e + " in " + this).toString());
    }
}
