package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC2718e implements ServiceConnection {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2691e f6604e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f6605e;

    public ServiceConnectionC2718e(C2691e c2691e, String str) {
        Objects.requireNonNull(c2691e);
        this.f6604e = c2691e;
        this.f6605e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [eؑ۠ۡ] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C2691e c2691e = this.f6604e;
        if (iBinder == null) {
            C13879e c13879e = ((C6936e) c2691e.f6570e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27495e.ad("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = AbstractBinderC8698e.metrica;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            ?? abstractC16277e = queryLocalInterface instanceof InterfaceC0614e ? (InterfaceC0614e) queryLocalInterface : new AbstractC16277e(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 5);
            C6936e c6936e = (C6936e) c2691e.f6570e;
            C13879e c13879e2 = c6936e.f14227e;
            C6936e.yandex(c13879e2);
            c13879e2.f27497e.ad("Install Referrer Service connected");
            C6915e c6915e = c6936e.f14226e;
            C6936e.yandex(c6915e);
            c6915e.m2254e(new RunnableC12554e(this, (InterfaceC0614e) abstractC16277e, this));
        } catch (RuntimeException e) {
            C13879e c13879e3 = ((C6936e) c2691e.f6570e).f14227e;
            C6936e.yandex(c13879e3);
            c13879e3.f27495e.vip(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C13879e c13879e = ((C6936e) this.f6604e.f6570e).f14227e;
        C6936e.yandex(c13879e);
        c13879e.f27497e.ad("Install Referrer Service disconnected");
    }
}
