package defpackage;

import android.app.Activity;
import android.app.Application;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.os.Trace;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.widget.PopupWindow;
import androidx.car.app.adcel;
import androidx.car.app.navigation.model.Maneuver;
import androidx.car.app.utils.purchase;
import androidx.car.app.vip;
import com.google.android.material.carousel.CarouselLayoutManager;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٟ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC17584e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f34432e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34433e;

    public /* synthetic */ RunnableC17584e(int i, Object obj) {
        this.f34433e = i;
        this.f34432e = obj;
    }

    private final void ad() {
        C12309e c12309e = (C12309e) this.f34432e;
        synchronized (c12309e.f24695e) {
            try {
                if (c12309e.f24694e) {
                    return;
                }
                AbstractC9464e.yandex("CameraController", "Tap-to-focus reset.");
                ((C1326e) c12309e.f24693e).adcel(new C16360e(0));
                c12309e.f24694e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        char c;
        long[] jArr;
        char c2;
        long[] jArr2;
        char c3 = 7;
        int i = 13;
        int i2 = 5;
        int i3 = 2;
        int i4 = 8;
        int i5 = 3;
        InterfaceC5083e interfaceC5083e = null;
        switch (this.f34433e) {
            case 0:
                ((AbstractC5133e) this.f34432e).vip();
                return;
            case 1:
                Activity activity = (Activity) this.f34432e;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = AbstractC13941e.billing;
                Method method = AbstractC13941e.purchase;
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i6 != 26 && i6 != 27) || method != null) && (AbstractC13941e.appmetrica != null || AbstractC13941e.license != null)) {
                    try {
                        Object obj2 = AbstractC13941e.metrica.get(activity);
                        if (obj2 != null && (obj = AbstractC13941e.vip.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C12108e c12108e = new C12108e(activity);
                            application.registerActivityLifecycleCallbacks(c12108e);
                            handler.post(new RunnableC17144e(c12108e, obj2, i3));
                            try {
                                if (i6 == 26 || i6 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new RunnableC17144e(application, c12108e, i5));
                                return;
                            } catch (Throwable th) {
                                handler.post(new RunnableC17144e(application, c12108e, i5));
                                throw th;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 2:
                ViewOnAttachStateChangeListenerC2004e viewOnAttachStateChangeListenerC2004e = (ViewOnAttachStateChangeListenerC2004e) this.f34432e;
                Trace.beginSection("measureAndLayout");
                try {
                    viewOnAttachStateChangeListenerC2004e.f5236e.tapsense(true);
                    Unit unit = Unit.INSTANCE;
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        viewOnAttachStateChangeListenerC2004e.amazon();
                        Trace.endSection();
                        viewOnAttachStateChangeListenerC2004e.f5222e = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 3:
                ViewOnAttachStateChangeListenerC5346e viewOnAttachStateChangeListenerC5346e = (ViewOnAttachStateChangeListenerC5346e) this.f34432e;
                boolean license = viewOnAttachStateChangeListenerC5346e.license();
                ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = viewOnAttachStateChangeListenerC5346e.f11468e;
                if (license) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        viewTreeObserverOnGlobalLayoutListenerC5014e.tapsense(true);
                        C3123e c3123e = viewOnAttachStateChangeListenerC5346e.f11465e;
                        int[] iArr = c3123e.vip;
                        long[] jArr3 = c3123e.ad;
                        int length = jArr3.length - 2;
                        if (length >= 0) {
                            int i7 = 0;
                            while (true) {
                                long j = jArr3[i7];
                                if ((((~j) << c3) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                                    int i9 = 0;
                                    while (i9 < i8) {
                                        if ((255 & j) < 128) {
                                            int i10 = iArr[(i7 << 3) + i9];
                                            if (!viewOnAttachStateChangeListenerC5346e.metrica().ad(i10)) {
                                                c2 = c3;
                                                jArr2 = jArr3;
                                                viewOnAttachStateChangeListenerC5346e.f11466e.add(new C18250e(i10, viewOnAttachStateChangeListenerC5346e.f11461e, 2, null));
                                                viewOnAttachStateChangeListenerC5346e.f11464e.amazon(Unit.INSTANCE);
                                                j >>= 8;
                                                i9++;
                                                c3 = c2;
                                                jArr3 = jArr2;
                                            }
                                        }
                                        c2 = c3;
                                        jArr2 = jArr3;
                                        j >>= 8;
                                        i9++;
                                        c3 = c2;
                                        jArr3 = jArr2;
                                    }
                                    c = c3;
                                    jArr = jArr3;
                                    if (i8 == 8) {
                                    }
                                } else {
                                    c = c3;
                                    jArr = jArr3;
                                }
                                if (i7 != length) {
                                    i7++;
                                    c3 = c;
                                    jArr3 = jArr;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        viewOnAttachStateChangeListenerC5346e.billing(viewTreeObserverOnGlobalLayoutListenerC5014e.getSemanticsOwner().ad(), viewOnAttachStateChangeListenerC5346e.f11459e);
                        Unit unit2 = Unit.INSTANCE;
                        Trace.endSection();
                        viewOnAttachStateChangeListenerC5346e.vip(viewOnAttachStateChangeListenerC5346e.metrica());
                        viewOnAttachStateChangeListenerC5346e.mopub();
                        viewOnAttachStateChangeListenerC5346e.f11458e = false;
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    } finally {
                    }
                }
                return;
            case 4:
                ActionMode actionMode = ((C0438e) this.f34432e).yandex;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 5:
                AbstractC17680e.yandex((View) ((C6571e) this.f34432e).f13543e);
                return;
            case 6:
                C9713e c9713e = (C9713e) this.f34432e;
                synchronized (c9713e.ad) {
                    try {
                        if (c9713e.smaato) {
                            return;
                        }
                        long j2 = c9713e.advert - 1;
                        c9713e.advert = j2;
                        if (j2 > 0) {
                            return;
                        }
                        if (j2 < 0) {
                            c9713e.metrica(new IllegalStateException());
                            return;
                        } else {
                            c9713e.ad();
                            return;
                        }
                    } finally {
                    }
                }
            case 7:
                C5153e c5153e = (C5153e) this.f34432e;
                if (c5153e.metrica.f11963e) {
                    c5153e.ad.ad.m4253e(3, false);
                    return;
                }
                return;
            case 8:
                ((C7116e) this.f34432e).metrica();
                return;
            case 9:
                AbstractC9743e.license(((C9173e) this.f34432e).ad, null);
                return;
            case 10:
                C0222e c0222e = (C0222e) this.f34432e;
                c0222e.getClass();
                if (Thread.currentThread() == ((Thread) c0222e.metrica)) {
                    c0222e.billing(-1, new C4403e(i));
                    return;
                }
                return;
            case 11:
                AbstractC9743e.license(((C11546e) this.f34432e).appmetrica, null);
                return;
            case 12:
                AbstractC5336e.startapp(new C15238e((C13738e) this.f34432e, interfaceC5083e, i));
                return;
            case 13:
                ad();
                return;
            case 14:
                Runnable runnable = (Runnable) this.f34432e;
                Process.setThreadPriority(-3);
                runnable.run();
                return;
            case 15:
                C18047e c18047e = (C18047e) ((adcel) this.f34432e).vip(C18047e.class);
                ArrayDeque arrayDeque = c18047e.ad;
                AbstractC14524e.ad();
                C4891e c4891e = c18047e.metrica;
                if (c4891e.license.equals(EnumC7785e.f15780e)) {
                    if (Log.isLoggable("CarApp", 3)) {
                        Log.d("CarApp", "Popping screens after the DESTROYED state is a no-op");
                        return;
                    }
                    return;
                }
                if (arrayDeque.size() > 1) {
                    List<C6436e> singletonList = Collections.singletonList((C6436e) arrayDeque.pop());
                    AbstractC14524e.ad();
                    C6436e c6436e = (C6436e) c18047e.ad.peek();
                    Objects.requireNonNull(c6436e);
                    c6436e.f13326e = true;
                    purchase.license("invalidate", new C9509e(i2, ((vip) c18047e.vip.vip(vip.class)).metrica, "invalidate", new C4403e(i4)));
                    if (c4891e.license.ad(EnumC7785e.f15779e)) {
                        c6436e.metrica(EnumC14621e.ON_START);
                    }
                    for (C6436e c6436e2 : singletonList) {
                        if (Log.isLoggable("CarApp", 3)) {
                            Log.d("CarApp", "Popping screen " + c6436e2 + " off the screen stack");
                        }
                        C18047e.vip(c6436e2, true);
                    }
                    if (Log.isLoggable("CarApp", 3)) {
                        Log.d("CarApp", "Screen " + c6436e + " is at the top of the screen stack");
                    }
                    if (c4891e.license.ad(EnumC7785e.f15776e) && arrayDeque.contains(c6436e)) {
                        c6436e.metrica(EnumC14621e.ON_RESUME);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ((CarouselLayoutManager) this.f34432e).m156e();
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C15624e) this.f34432e).remoteconfig(true);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ExecutorC18015e executorC18015e = (ExecutorC18015e) this.f34432e;
                Runnable runnable2 = executorC18015e.f35338e;
                if (runnable2 != null) {
                    runnable2.run();
                    executorC18015e.f35338e = null;
                    return;
                }
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                DialogC6137e.license((DialogC6137e) this.f34432e);
                return;
            case 20:
                C18478e c18478e = (C18478e) this.f34432e;
                PopupWindow popupWindow = (PopupWindow) c18478e.f36229e;
                if (popupWindow != null) {
                    popupWindow.showAtLocation(((AppActivity) c18478e.f36228e).getWindow().getDecorView(), 49, 0, 0);
                    return;
                }
                return;
            case 21:
                C4174e c4174e = (C4174e) this.f34432e;
                C18177e m1498super = c4174e.m1498super();
                c4174e.m1501transient(m1498super, 1028, new C7815e(m1498super, 18));
                c4174e.f9208e.license();
                return;
            case 22:
                C18536e c18536e = (C18536e) this.f34432e;
                if (c18536e.f36366transient >= 300000) {
                    ((C9860e) c18536e.loadAd.f6570e).f19463e = true;
                    c18536e.f36366transient = 0L;
                    return;
                }
                return;
            case 23:
                C4029e c4029e = (C4029e) this.f34432e;
                if (c4029e.f8958e) {
                    return;
                }
                InterfaceC16612e interfaceC16612e = c4029e.f8959e;
                if (interfaceC16612e != null) {
                    interfaceC16612e.metrica(c4029e.f8961e);
                }
                c4029e.f8960e.f32485e.remove(c4029e);
                c4029e.f8958e = true;
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C13905e) this.f34432e).metrica(null);
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C12894e c12894e = (C12894e) this.f34432e;
                AudioManager audioManager = (AudioManager) c12894e.f25751e;
                if (audioManager != null) {
                    C10079e c10079e = (C10079e) c12894e.f25750e;
                    c10079e.getClass();
                    audioManager.unregisterAudioDeviceCallback(c10079e);
                    return;
                }
                return;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C4546e.ad((C4546e) this.f34432e);
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((C13705e) this.f34432e).close();
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C6681e c6681e = (C6681e) this.f34432e;
                c6681e.f13789e = true;
                c6681e.metrica();
                return;
            default:
                ((C11010e) this.f34432e).m2981e();
                return;
        }
    }
}
