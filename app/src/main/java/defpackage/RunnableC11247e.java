package defpackage;

import android.graphics.Typeface;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۚٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11247e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f22595e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f22596e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f22597e;

    public /* synthetic */ RunnableC11247e(Object obj, Object obj2, int i) {
        this.f22597e = i;
        this.f22596e = obj;
        this.f22595e = obj2;
    }

    private final void ad() {
        WifiManager.WifiLock wifiLock;
        C11883e c11883e = (C11883e) this.f22596e;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f22595e;
        synchronized (c11883e) {
            if (atomicBoolean.get() && (wifiLock = (WifiManager.WifiLock) c11883e.f23814e) != null) {
                wifiLock.release();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        PowerManager.WakeLock wakeLock;
        Object obj = null;
        int i = 1;
        switch (this.f22597e) {
            case 0:
                ((C16259e) ((InterfaceC11221e) this.f22596e)).yandex((C3796e) this.f22595e, Unit.INSTANCE);
                return;
            case 1:
                ((InterfaceC13777e) this.f22596e).startapp((C6122e) this.f22595e);
                return;
            case 2:
                ((C8356e) ((C7850e) this.f22596e).f15896e).f17102e.startapp((C6122e) this.f22595e);
                return;
            case 3:
                ((C7340e) this.f22596e).firebase((InterfaceC6347e) this.f22595e);
                return;
            case 4:
                ((Executor) this.f22596e).execute((Runnable) this.f22595e);
                return;
            case 5:
                C17553e c17553e = (C17553e) this.f22596e;
                countDownLatch = (CountDownLatch) this.f22595e;
                try {
                    C6553e.ad().license.admob(c17553e.yandex.ad.vip(EnumC6651e.f13720e), 1);
                } catch (Exception unused) {
                }
                return;
            case 6:
                ((AbstractC14437e) this.f22596e).startapp((Typeface) this.f22595e);
                return;
            case 7:
                C6436e c6436e = (C6436e) this.f22596e;
                EnumC14621e enumC14621e = (EnumC14621e) this.f22595e;
                C4891e c4891e = c6436e.f13327e;
                if (c4891e.license.ad(EnumC7785e.f15778e)) {
                    if (enumC14621e == EnumC14621e.ON_DESTROY) {
                        c6436e.f13325e.getClass();
                    }
                    c4891e.appmetrica(enumC14621e);
                    return;
                }
                return;
            case 8:
                ((InterfaceC0867e) ((AtomicReference) this.f22595e).get()).accept(new C9801e((C13705e) this.f22596e));
                return;
            case 9:
                C0748e c0748e = (C0748e) this.f22596e;
                C6122e c6122e = (C6122e) this.f22595e;
                C6122e c6122e2 = c0748e.yandex;
                if (c6122e2 != null && c6122e2 == c6122e) {
                    c0748e.yandex = null;
                    c0748e.billing = null;
                }
                C9509e c9509e = c0748e.advert;
                if (c9509e != null) {
                    c9509e.billing();
                    c0748e.advert = null;
                    return;
                }
                return;
            case 10:
                C4246e c4246e = (C4246e) this.f22596e;
                C4246e c4246e2 = (C4246e) this.f22595e;
                AbstractC9743e.license((InterfaceC18435e) c4246e.f9318e, null);
                AbstractC9743e.license((InterfaceC18435e) c4246e2.f9318e, null);
                return;
            case 11:
                RunnableC2783e runnableC2783e = (RunnableC2783e) this.f22596e;
                countDownLatch = (CountDownLatch) this.f22595e;
                try {
                    runnableC2783e.run();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 12:
                C8591e c8591e = (C8591e) this.f22596e;
                Runnable runnable = (Runnable) this.f22595e;
                ThreadLocal threadLocal = c8591e.metrica;
                threadLocal.set(Boolean.TRUE);
                try {
                    runnable.run();
                    return;
                } finally {
                    threadLocal.remove();
                }
            case 13:
                ((C7463e) this.f22596e).vip.invoke((String) this.f22595e);
                return;
            case 14:
                View view = (View) this.f22596e;
                EnumC14893e enumC14893e = (EnumC14893e) this.f22595e;
                ArrayList arrayList = C16251e.metrica;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (AbstractC7890e.billing(((EnumC14893e) ((C6571e) next).f13543e).name(), enumC14893e.name())) {
                            obj = next;
                        }
                    }
                }
                if (obj != null) {
                    return;
                }
                arrayList.add(0, new C6571e(view, enumC14893e));
                if (arrayList.size() != 1 || C16251e.license) {
                    return;
                }
                C16251e.ad.vip();
                return;
            case 15:
                C16864e c16864e = (C16864e) this.f22596e;
                if (((AbstractC5113e) this.f22595e) == c16864e.remoteconfig) {
                    c16864e.m4189extends();
                    return;
                }
                return;
            case 16:
                C18393e c18393e = (C18393e) this.f22596e;
                C16990e c16990e = (C16990e) this.f22595e;
                ((ArrayList) c16990e.vip.f20507e).remove(c18393e);
                c16990e.appmetrica.remove(c18393e);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C10312e c10312e = (C10312e) this.f22596e;
                C18520e c18520e = (C18520e) this.f22595e;
                SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e = (SurfaceHolderCallbackC0960e) c10312e.f20360e;
                String str = AbstractC9413e.ad;
                C13391e.purchase(surfaceHolderCallbackC0960e.ad.f33627e, c18520e);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C10312e c10312e2 = (C10312e) this.f22596e;
                C2351e c2351e = (C2351e) this.f22595e;
                SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e2 = (SurfaceHolderCallbackC0960e) c10312e2.f20360e;
                String str2 = AbstractC9413e.ad;
                C17148e c17148e = surfaceHolderCallbackC0960e2.ad;
                c17148e.f33634e = c2351e;
                c17148e.f33577e.billing(25, new C17687e(2, c2351e));
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C10312e c10312e3 = (C10312e) this.f22596e;
                Exception exc = (Exception) this.f22595e;
                SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e3 = (SurfaceHolderCallbackC0960e) c10312e3.f20360e;
                String str3 = AbstractC9413e.ad;
                C4174e c4174e = surfaceHolderCallbackC0960e3.ad.f33635e;
                C18177e m1494package = c4174e.m1494package();
                c4174e.m1501transient(m1494package, 1030, new C7815e(m1494package, exc, 5));
                return;
            case 20:
                C10312e c10312e4 = (C10312e) this.f22596e;
                String str4 = (String) this.f22595e;
                SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e4 = (SurfaceHolderCallbackC0960e) c10312e4.f20360e;
                String str5 = AbstractC9413e.ad;
                C4174e c4174e2 = surfaceHolderCallbackC0960e4.ad.f33635e;
                C18177e m1494package2 = c4174e2.m1494package();
                c4174e2.m1501transient(m1494package2, 1019, new C14229e(m1494package2, str4, i));
                return;
            case 21:
                C6613e c6613e = (C6613e) this.f22596e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f22595e;
                C7302e c7302e = (C7302e) c6613e.f13643e;
                c7302e.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new RunnableC11247e(c7302e, atomicBoolean, 22), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 22:
                C7302e c7302e2 = (C7302e) this.f22596e;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f22595e;
                synchronized (c7302e2) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) c7302e2.f14915e) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 23:
                C6613e c6613e2 = (C6613e) this.f22596e;
                AtomicBoolean atomicBoolean3 = (AtomicBoolean) this.f22595e;
                C11883e c11883e = (C11883e) c6613e2.f13643e;
                c11883e.getClass();
                if (atomicBoolean3.get()) {
                    new Thread(new RunnableC11247e(c11883e, atomicBoolean3, 24), "ExoPlayer:WifiLockManager").start();
                    return;
                }
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ad();
                return;
            default:
                C9243e c9243e = (C9243e) this.f22596e;
                AbstractC0003e abstractC0003e = (AbstractC0003e) this.f22595e;
                if (c9243e.f18446e) {
                    return;
                }
                c9243e.f18448e = abstractC0003e;
                abstractC0003e.ad(c9243e);
                return;
        }
    }
}
