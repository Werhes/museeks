package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC5667e extends Service implements InterfaceC16400e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C6029e f12041e = new C6029e(this);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f12041e.pro(EnumC14621e.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f12041e.pro(EnumC14621e.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC14621e enumC14621e = EnumC14621e.ON_STOP;
        C6029e c6029e = this.f12041e;
        c6029e.pro(enumC14621e);
        c6029e.pro(EnumC14621e.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        this.f12041e.pro(EnumC14621e.ON_START);
        super.onStart(intent, i);
    }

    @Override // defpackage.InterfaceC16400e
    public AbstractC0003e vip() {
        return (C4891e) this.f12041e.f12699e;
    }
}
