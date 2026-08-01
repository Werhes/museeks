package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.camera2.CameraCaptureSession;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.car.app.hardware.common.CarResultStub;
import androidx.car.app.navigation.model.Maneuver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؗٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC16019e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f31550e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f31551e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31552e;

    public /* synthetic */ RunnableC16019e(C8598e c8598e, Throwable th) {
        this.f31552e = 27;
        Map map = Collections.EMPTY_MAP;
        this.f31551e = c8598e;
        this.f31550e = th;
    }

    public /* synthetic */ RunnableC16019e(C12136e c12136e, int i, ListenableFuture listenableFuture) {
        this.f31552e = 0;
        this.f31551e = c12136e;
        this.f31550e = listenableFuture;
    }

    public /* synthetic */ RunnableC16019e(Object obj, Object obj2, int i) {
        this.f31552e = i;
        this.f31551e = obj;
        this.f31550e = obj2;
    }

    private final void ad() {
        C1342e c1342e = (C1342e) this.f31551e;
        Set<C14131e> set = (Set) this.f31550e;
        C5306e c5306e = c1342e.ad;
        AbstractC13062e.metrica();
        synchronized (c5306e.f11399e) {
            try {
                for (C14131e c14131e : set) {
                    Set keySet = ((HashMap) c5306e.f11400e).keySet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : keySet) {
                        if (((C14131e) obj).ad.equals(c14131e.ad)) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((HashMap) c5306e.f11400e).remove((C14131e) it.next());
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void appmetrica() {
        C3770e c3770e = (C3770e) this.f31551e;
        InterfaceC7970e interfaceC7970e = (InterfaceC7970e) this.f31550e;
        synchronized (c3770e) {
            try {
                if (c3770e.vip == null) {
                    c3770e.ad.add(interfaceC7970e);
                } else {
                    c3770e.vip.add(interfaceC7970e.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void license() {
        InterfaceC13824e interfaceC13824e;
        C10377e c10377e = (C10377e) this.f31551e;
        InterfaceC7970e interfaceC7970e = (InterfaceC7970e) this.f31550e;
        if (c10377e.vip != C10377e.license) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (c10377e) {
            interfaceC13824e = c10377e.ad;
            c10377e.ad = null;
            c10377e.vip = interfaceC7970e;
        }
        interfaceC13824e.yandex(interfaceC7970e);
    }

    private final void metrica() {
        C13945e c13945e = (C13945e) this.f31551e;
        C7169e c7169e = (C7169e) this.f31550e;
        C6797e c6797e = c13945e.billing;
        if (!c6797e.adcel.getAndSet(true)) {
            C9576e c9576e = c6797e.appmetrica;
            c9576e.getClass();
            c9576e.purchase = false;
            synchronized (c9576e.vip) {
                c9576e.metrica = null;
                c9576e.appmetrica = 0;
                c9576e.license.clear();
                Unit unit = Unit.INSTANCE;
            }
            C8765e c8765e = c6797e.purchase;
            c8765e.getClass();
            Log.i("PipePresenceSrc", "Stopping camera ID flow collection.");
            if (((AtomicBoolean) c8765e.f17670e).compareAndSet(true, false)) {
                C8419e c8419e = (C8419e) c8765e.f17672e;
                if (c8419e != null) {
                    c8419e.Signature(null);
                }
                c8765e.f17672e = null;
            }
            if (c6797e.ad.ad()) {
                ((C9872e) c6797e.ad.getValue()).license();
            }
        }
        if (c13945e.purchase != null) {
            Executor executor = c13945e.license;
            if (executor instanceof ExecutorC14931e) {
                ((ExecutorC14931e) executor).ad();
            }
            c13945e.purchase.quit();
        }
        c7169e.ad(null);
    }

    private final void vip() {
        C3862e c3862e = (C3862e) this.f31551e;
        InterfaceC2881e interfaceC2881e = (InterfaceC2881e) this.f31550e;
        synchronized (c3862e.ad) {
            try {
                c3862e.metrica.remove(interfaceC2881e);
                if (c3862e.metrica.isEmpty()) {
                    c3862e.appmetrica.getClass();
                    c3862e.appmetrica.ad(null);
                    c3862e.appmetrica = null;
                    c3862e.license = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7116e c7116e;
        int i = 0;
        switch (this.f31552e) {
            case 0:
                ((C12136e) this.f31551e).pro((ListenableFuture) this.f31550e);
                return;
            case 1:
                ((C12136e) this.f31551e).admob((AbstractC0281e) this.f31550e);
                return;
            case 2:
                AbstractC16048e.purchase((ViewOnAttachStateChangeListenerC5346e) this.f31551e, (LongSparseArray) this.f31550e);
                return;
            case 3:
                C12309e c12309e = (C12309e) this.f31551e;
                InterfaceC14599e interfaceC14599e = (InterfaceC14599e) this.f31550e;
                c12309e.getClass();
                interfaceC14599e.metrica(c12309e);
                return;
            case 4:
                ExecutorC11157e executorC11157e = (ExecutorC11157e) this.f31551e;
                Runnable runnable = (Runnable) this.f31550e;
                executorC11157e.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC11157e.ad();
                }
            case 5:
                C10382e c10382e = (C10382e) this.f31551e;
                RunnableC7410e runnableC7410e = (RunnableC7410e) this.f31550e;
                c10382e.metrica.pro();
                C9713e c9713e = c10382e.vip;
                synchronized (c9713e.ad) {
                    c9713e.vip();
                    runnableC7410e.run();
                }
                return;
            case 6:
                Context context = (Context) this.f31551e;
                C12594e c12594e = (C12594e) this.f31550e;
                AbstractC17305e.ad = (AudioManager) context.getSystemService("audio");
                c12594e.license();
                return;
            case 7:
                C17424e c17424e = (C17424e) this.f31551e;
                String str = (String) this.f31550e;
                SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e = (SurfaceHolderCallbackC0960e) c17424e.f34141e;
                String str2 = AbstractC9413e.ad;
                C4174e c4174e = surfaceHolderCallbackC0960e.ad.f33635e;
                C18177e m1494package = c4174e.m1494package();
                c4174e.m1501transient(m1494package, 1012, new C14229e(m1494package, str, 3));
                return;
            case 8:
                C17424e c17424e2 = (C17424e) this.f31551e;
                C18520e c18520e = (C18520e) this.f31550e;
                SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e2 = (SurfaceHolderCallbackC0960e) c17424e2.f34141e;
                String str3 = AbstractC9413e.ad;
                C13391e.purchase(surfaceHolderCallbackC0960e2.ad.f33594e, c18520e);
                return;
            case 9:
                C17682e.ad((C17682e) this.f31551e, (AudioRouting) this.f31550e);
                return;
            case 10:
                C17682e c17682e = (C17682e) this.f31551e;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.f31550e;
                if (c17682e.license == null || (c7116e = ((C8577e) c17682e.vip.f25784e).startapp) == null || audioDeviceInfo.equals(c7116e.startapp)) {
                    return;
                }
                c7116e.startapp = audioDeviceInfo;
                Context context2 = c7116e.ad;
                C3335e c3335e = c7116e.adcel;
                List ad = c7116e.ad();
                C1410e c1410e = C16717e.appmetrica;
                c7116e.vip(C16717e.vip(context2, context2.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c3335e, audioDeviceInfo, ad));
                return;
            case 11:
                C17790e c17790e = (C17790e) this.f31551e;
                Object apply = ((InterfaceC8223e) this.f31550e).apply(c17790e.f34884e);
                c17790e.f34884e = apply;
                RunnableC1488e runnableC1488e = new RunnableC1488e(c17790e, 1, apply);
                C2399e c2399e = (C2399e) c17790e.f34881e;
                if (c2399e.ad.getLooper().getThread().isAlive()) {
                    c2399e.license(runnableC1488e);
                    return;
                }
                return;
            case 12:
                ((AbstractC5004e) this.f31551e).signatures((Activity) this.f31550e);
                return;
            case 13:
                ((C17839e) this.f31551e).ad.onCaptureSequenceAborted((CameraCaptureSession) this.f31550e, -1);
                return;
            case 14:
                ad();
                return;
            case 15:
                ((InterfaceC2881e) this.f31551e).subscription().ad().yandex((InterfaceC2994e) this.f31550e);
                return;
            case 16:
                ((InterfaceC12424e) this.f31551e).ad().appmetrica((C1388e) this.f31550e);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                vip();
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((InterfaceC0867e) this.f31551e).accept((C0088e) this.f31550e);
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                metrica();
                return;
            case 20:
                CarResultStub.remoteconfig((Map.Entry) this.f31551e, this.f31550e);
                return;
            case 21:
                ((InterfaceC1926e) this.f31551e).mo732protected((C9021e) this.f31550e);
                return;
            case 22:
                AbstractActivityC15824e abstractActivityC15824e = (AbstractActivityC15824e) this.f31551e;
                abstractActivityC15824e.f8255e.ad(new C5063e((C6194e) this.f31550e, abstractActivityC15824e, i));
                return;
            case 23:
                license();
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                appmetrica();
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C15721e c15721e = (C15721e) this.f31551e;
                InterfaceC4868e interfaceC4868e = (InterfaceC4868e) this.f31550e;
                try {
                    interfaceC4868e.ad(c15721e.f30972e.f9037e);
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    interfaceC4868e.onError(e);
                    return;
                }
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C4594e) this.f31551e).metrica((String) this.f31550e, Boolean.FALSE);
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C8598e c8598e = (C8598e) this.f31551e;
                Throwable th = (Throwable) this.f31550e;
                Map map = Collections.EMPTY_MAP;
                C4594e c4594e = c8598e.billing;
                Thread currentThread = Thread.currentThread();
                c4594e.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                C17707e c17707e = c4594e.amazon;
                if (c17707e == null || !c17707e.appmetrica.get()) {
                    long j = currentTimeMillis / 1000;
                    String appmetrica = c4594e.appmetrica();
                    if (appmetrica == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    C13787e c13787e = new C13787e(appmetrica, j, map);
                    C14461e c14461e = c4594e.smaato;
                    c14461e.getClass();
                    String concat = "Persisting non-fatal event for session ".concat(appmetrica);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", concat, null);
                    }
                    c14461e.adcel(th, currentThread, "error", c13787e, false);
                    return;
                }
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ThreadFactoryC5915e threadFactoryC5915e = (ThreadFactoryC5915e) this.f31551e;
                Runnable runnable2 = (Runnable) this.f31550e;
                Process.setThreadPriority(threadFactoryC5915e.metrica);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC5915e.license;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            default:
                C4029e c4029e = (C4029e) this.f31551e;
                C16975e c16975e = (C16975e) this.f31550e;
                C16558e c16558e = c4029e.f8960e;
                if (c16558e.f32494e == 0 || c4029e.f8958e) {
                    return;
                }
                Looper looper = c16558e.f32499e;
                looper.getClass();
                c4029e.f8959e = c16558e.ad(looper, c4029e.f8961e, c16975e, false);
                c16558e.f32485e.add(c4029e);
                return;
        }
    }
}
