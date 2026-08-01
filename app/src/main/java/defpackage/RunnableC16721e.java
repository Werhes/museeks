package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؒ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC16721e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f32778e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32779e;

    public /* synthetic */ RunnableC16721e(int i, Object obj) {
        this.f32779e = i;
        this.f32778e = obj;
    }

    public RunnableC16721e(AbstractDialogInterfaceOnCancelListenerC4604e abstractDialogInterfaceOnCancelListenerC4604e, C13572e c13572e) {
        this.f32779e = 7;
        Objects.requireNonNull(abstractDialogInterfaceOnCancelListenerC4604e);
        this.f32778e = c13572e;
    }

    public RunnableC16721e(BinderC7597e binderC7597e) {
        this.f32779e = 6;
        Objects.requireNonNull(binderC7597e);
        this.f32778e = binderC7597e;
    }

    public RunnableC16721e(C9809e c9809e, boolean z) {
        this.f32779e = 13;
        this.f32778e = c9809e;
    }

    public RunnableC16721e(C15398e c15398e, C10524e c10524e) {
        this.f32779e = 18;
        this.f32778e = c15398e;
    }

    private final /* synthetic */ void ad() {
        C9427e c9427e = (C9427e) this.f32778e;
        synchronized (C9427e.startapp) {
            try {
                if (c9427e.vip()) {
                    c9427e.appmetrica(15);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void metrica() {
        C1173e c1173e = (C1173e) this.f32778e;
        synchronized (c1173e.f3770e) {
            try {
                InterfaceC6786e interfaceC6786e = (InterfaceC6786e) c1173e.f3772e;
                if (interfaceC6786e != null) {
                    interfaceC6786e.subscription();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final /* synthetic */ void vip() {
        boolean isEmpty;
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        C1126e c1126e = (C1126e) this.f32778e;
        synchronized (c1126e.yandex) {
            isEmpty = c1126e.appmetrica.isEmpty();
        }
        if (!isEmpty && !c1126e.startapp && (connectivityManager = c1126e.metrica) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
            activeNetworkInfo.isConnected();
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0367, code lost:
    
        if (r0.m1795e() >= 242600) goto L87;
     */
    /* JADX WARN: Type inference failed for: r1v40, types: [eٓٛٓ, eؒۧۤ] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC16721e.run():void");
    }
}
