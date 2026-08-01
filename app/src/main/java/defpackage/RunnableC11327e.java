package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC11327e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f22765e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f22766e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f22767e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f22768e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f22769e;

    public /* synthetic */ RunnableC11327e(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.f22769e = i;
        this.f22767e = obj;
        this.f22766e = obj2;
        this.f22768e = obj3;
        this.f22765e = obj4;
    }

    public RunnableC11327e(C8320e c8320e, AtomicReference atomicReference, String str, String str2) {
        this.f22769e = 8;
        this.f22767e = atomicReference;
        this.f22766e = str;
        this.f22768e = str2;
        Objects.requireNonNull(c8320e);
        this.f22765e = c8320e;
    }

    public /* synthetic */ RunnableC11327e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f22769e = i;
        this.f22765e = obj;
        this.f22767e = obj2;
        this.f22766e = obj3;
        this.f22768e = obj4;
    }

    private final void ad() {
        InterfaceC8227e interfaceC8227e;
        C10640e c10640e = (C10640e) this.f22767e;
        AtomicReference atomicReference = (AtomicReference) this.f22766e;
        C8019e c8019e = (C8019e) this.f22768e;
        Bundle bundle = (Bundle) this.f22765e;
        synchronized (atomicReference) {
            try {
                interfaceC8227e = c10640e.f20961e;
            } catch (RemoteException e) {
                C13879e c13879e = ((C6936e) c10640e.f36443e).f14227e;
                C6936e.yandex(c13879e);
                c13879e.f27502e.vip(e, "Failed to request trigger URIs; remote exception");
                atomicReference.notifyAll();
            }
            if (interfaceC8227e != null) {
                interfaceC8227e.mo1648e(c8019e, bundle, new BinderC10694e(c10640e, atomicReference));
                c10640e.m2853e();
            } else {
                C13879e c13879e2 = ((C6936e) c10640e.f36443e).f14227e;
                C6936e.yandex(c13879e2);
                c13879e2.f27502e.ad("Failed to request trigger URIs; not connected to service");
            }
        }
    }

    private final void vip() {
        InterfaceC8227e interfaceC8227e;
        C10640e c10640e = (C10640e) this.f22767e;
        AtomicReference atomicReference = (AtomicReference) this.f22766e;
        C8019e c8019e = (C8019e) this.f22768e;
        C1157e c1157e = (C1157e) this.f22765e;
        synchronized (atomicReference) {
            try {
                interfaceC8227e = c10640e.f20961e;
            } catch (RemoteException e) {
                C13879e c13879e = ((C6936e) c10640e.f36443e).f14227e;
                C6936e.yandex(c13879e);
                c13879e.f27502e.vip(e, "[sgtm] Failed to get upload batches; remote exception");
                atomicReference.notifyAll();
            }
            if (interfaceC8227e != null) {
                interfaceC8227e.mo1666synchronized(c8019e, c1157e, new BinderC3310e(c10640e, atomicReference));
                c10640e.m2853e();
            } else {
                C13879e c13879e2 = ((C6936e) c10640e.f36443e).f14227e;
                C6936e.yandex(c13879e2);
                c13879e2.f27502e.ad("[sgtm] Failed to get upload batches; not connected to service");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:130|131|(5:133|(1:135)|137|138|139)|141|(2:144|142)|145|146|147|148|(2:151|149)|152|153|(1:155)|156|138|139) */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x046d, code lost:
    
        if (java.lang.System.currentTimeMillis() >= (r5 + r10)) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x053d, code lost:
    
        r7.mo2261e().f27495e.vip(r2, "Failed to parse queued batch. appId");
     */
    /* JADX WARN: Type inference failed for: r5v32, types: [eٔ۟ٔ, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC11327e.run():void");
    }
}
