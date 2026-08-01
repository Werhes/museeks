package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۨ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8383e implements InterfaceC12765e, InterfaceC0987e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f17149e;

    public /* synthetic */ C8383e(Object obj) {
        this.f17149e = obj;
    }

    public C8085e ad(String str, boolean z) {
        return new C8085e(str, (C2580e) this.f17149e, z);
    }

    @Override // defpackage.InterfaceC0987e
    public /* synthetic */ ListenableFuture call() {
        C14742e c14742e = (C14742e) this.f17149e;
        return AbstractC2017e.appmetrica(AbstractC2017e.billing((ListenableFuture) c14742e.metrica, AbstractC9855e.vip(new C7703e(c14742e, 3)), (ExecutorC12022e) c14742e.appmetrica));
    }

    @Override // defpackage.InterfaceC12765e
    /* renamed from: final */
    public void mo213final(C0560e c0560e) {
        ((CountDownLatch) this.f17149e).countDown();
    }
}
