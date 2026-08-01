package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٟۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9652e extends BroadcastReceiver {
    public final /* synthetic */ AtomicBoolean ad;
    public final /* synthetic */ Executor appmetrica;
    public final /* synthetic */ C16554e license;
    public final /* synthetic */ C0485e metrica;
    public final /* synthetic */ Context vip;

    public C9652e(AtomicBoolean atomicBoolean, Context context, C0485e c0485e, C16554e c16554e, Executor executor) {
        this.ad = atomicBoolean;
        this.vip = context;
        this.metrica = c0485e;
        this.license = c16554e;
        this.appmetrica = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, eٍۣٕ, java.lang.Runnable] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.ad.compareAndSet(false, true)) {
            try {
                this.vip.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e);
            }
            C0485e c0485e = this.metrica;
            C16554e c16554e = this.license;
            Executor executor = this.appmetrica;
            ?? obj = new Object();
            obj.f19447e = new C1066e((RunnableFutureC9859e) obj, c16554e);
            executor.execute(obj);
            c0485e.loadAd(obj);
        }
    }
}
