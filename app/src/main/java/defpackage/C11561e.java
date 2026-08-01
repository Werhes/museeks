package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C11561e implements InterfaceC18244e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object license;
    public final /* synthetic */ Object metrica;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C11561e(int i, Object obj, Object obj2, Object obj3) {
        this.ad = i;
        this.vip = obj;
        this.metrica = obj2;
        this.license = obj3;
    }

    @Override // defpackage.InterfaceC18244e
    public final /* synthetic */ ListenableFuture apply(Object obj) {
        switch (this.ad) {
            case 0:
                C14742e c14742e = (C14742e) this.vip;
                C12183e c12183e = (C12183e) this.metrica;
                C12183e c12183e2 = (C12183e) this.license;
                if (AbstractC2017e.vip(c12183e).equals(AbstractC2017e.vip(c12183e2))) {
                    return AbstractC2017e.license(obj);
                }
                C12183e billing = AbstractC2017e.billing(c12183e2, AbstractC9855e.vip(new C2111e(c14742e, c12183e2, 2)), (ExecutorC12022e) c14742e.appmetrica);
                synchronized (c14742e.startapp) {
                }
                return billing;
            default:
                C9664e c9664e = (C9664e) this.vip;
                return c9664e.metrica.loadAd((C2111e) this.metrica, (Executor) this.license);
        }
    }
}
