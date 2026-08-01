package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC3218e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f7344e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ String f7345e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ String f7346e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C8019e f7347e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7348e = 0;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f7349e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C10640e f7350e;

    public RunnableC3218e(C10640e c10640e, String str, String str2, C8019e c8019e, boolean z, InterfaceC9026e interfaceC9026e) {
        this.f7346e = str;
        this.f7345e = str2;
        this.f7347e = c8019e;
        this.f7344e = z;
        this.f7349e = interfaceC9026e;
        this.f7350e = c10640e;
    }

    public RunnableC3218e(C10640e c10640e, AtomicReference atomicReference, String str, String str2, C8019e c8019e, boolean z) {
        this.f7349e = atomicReference;
        this.f7346e = str;
        this.f7345e = str2;
        this.f7347e = c8019e;
        this.f7344e = z;
        this.f7350e = c10640e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5240e c5240e;
        InterfaceC8227e interfaceC8227e;
        C6936e c6936e;
        AtomicReference atomicReference;
        C10640e c10640e;
        InterfaceC8227e interfaceC8227e2;
        switch (this.f7348e) {
            case 0:
                String str = this.f7345e;
                String str2 = this.f7346e;
                InterfaceC9026e interfaceC9026e = (InterfaceC9026e) this.f7349e;
                C10640e c10640e2 = this.f7350e;
                Bundle bundle = new Bundle();
                try {
                    try {
                        interfaceC8227e = c10640e2.f20961e;
                        c6936e = (C6936e) c10640e2.f36443e;
                    } catch (RemoteException e) {
                        e = e;
                    }
                    if (interfaceC8227e == null) {
                        C13879e c13879e = c6936e.f14227e;
                        C6936e.yandex(c13879e);
                        c13879e.f27502e.metrica(str2, str, "Failed to get user properties; not connected to service");
                        c5240e = c6936e.f14223e;
                        C6936e.purchase(c5240e);
                        c5240e.m1794e(interfaceC9026e, bundle);
                        return;
                    }
                    List<C9097e> mo1664return = interfaceC8227e.mo1664return(str2, str, this.f7344e, this.f7347e);
                    Bundle bundle2 = new Bundle();
                    if (mo1664return != null) {
                        for (C9097e c9097e : mo1664return) {
                            String str3 = c9097e.f18219e;
                            String str4 = c9097e.f18221e;
                            if (str3 != null) {
                                bundle2.putString(str4, str3);
                            } else {
                                Long l = c9097e.f18222e;
                                if (l != null) {
                                    bundle2.putLong(str4, l.longValue());
                                } else {
                                    Double d = c9097e.f18224e;
                                    if (d != null) {
                                        bundle2.putDouble(str4, d.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        c10640e2.m2853e();
                        C5240e c5240e2 = c6936e.f14223e;
                        C6936e.purchase(c5240e2);
                        c5240e2.m1794e(interfaceC9026e, bundle2);
                        return;
                    } catch (RemoteException e2) {
                        e = e2;
                        bundle = bundle2;
                        C13879e c13879e2 = ((C6936e) c10640e2.f36443e).f14227e;
                        C6936e.yandex(c13879e2);
                        c13879e2.f27502e.metrica(str2, e, "Failed to get user properties; remote exception");
                        c5240e = ((C6936e) c10640e2.f36443e).f14223e;
                        C6936e.purchase(c5240e);
                        c5240e.m1794e(interfaceC9026e, bundle);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bundle = bundle2;
                        C5240e c5240e3 = ((C6936e) c10640e2.f36443e).f14223e;
                        C6936e.purchase(c5240e3);
                        c5240e3.m1794e(interfaceC9026e, bundle);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.f7349e;
                synchronized (atomicReference2) {
                    try {
                        try {
                            c10640e = this.f7350e;
                            interfaceC8227e2 = c10640e.f20961e;
                        } catch (RemoteException e3) {
                            C13879e c13879e3 = ((C6936e) this.f7350e.f36443e).f14227e;
                            C6936e.yandex(c13879e3);
                            c13879e3.f27502e.license("(legacy) Failed to get user properties; remote exception", null, this.f7346e, e3);
                            ((AtomicReference) this.f7349e).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f7349e;
                        }
                        if (interfaceC8227e2 == null) {
                            C13879e c13879e4 = ((C6936e) c10640e.f36443e).f14227e;
                            C6936e.yandex(c13879e4);
                            c13879e4.f27502e.license("(legacy) Failed to get user properties; not connected to service", null, this.f7346e, this.f7345e);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(interfaceC8227e2.mo1664return(this.f7346e, this.f7345e, this.f7344e, this.f7347e));
                        } else {
                            atomicReference2.set(interfaceC8227e2.mo1667this(null, this.f7346e, this.f7345e, this.f7344e));
                        }
                        c10640e.m2853e();
                        atomicReference = (AtomicReference) this.f7349e;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th3) {
                        ((AtomicReference) this.f7349e).notify();
                        throw th3;
                    }
                }
        }
    }
}
