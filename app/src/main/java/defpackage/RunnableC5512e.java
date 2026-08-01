package defpackage;

import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5512e implements Runnable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11787e;

    public /* synthetic */ RunnableC5512e(int i) {
        this.f11787e = i;
    }

    private final void ad() {
    }

    private final void vip() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11787e) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.ad;
                return;
            case 1:
                C12328e c12328e = ViewTreeObserverOnGlobalLayoutListenerC5014e.f10606e;
                synchronized (c12328e) {
                    try {
                        int i2 = 0;
                        if (Build.VERSION.SDK_INT < 30) {
                            Object[] objArr = c12328e.ad;
                            int i3 = c12328e.vip;
                            while (i2 < i3) {
                                ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = (ViewTreeObserverOnGlobalLayoutListenerC5014e) objArr[i2];
                                boolean showLayoutBounds = viewTreeObserverOnGlobalLayoutListenerC5014e.getShowLayoutBounds();
                                Class cls = ViewTreeObserverOnGlobalLayoutListenerC5014e.f10603e;
                                viewTreeObserverOnGlobalLayoutListenerC5014e.setShowLayoutBounds(AbstractC4584e.vip());
                                if (showLayoutBounds != viewTreeObserverOnGlobalLayoutListenerC5014e.getShowLayoutBounds()) {
                                    viewTreeObserverOnGlobalLayoutListenerC5014e.post(new RunnableC7305e(viewTreeObserverOnGlobalLayoutListenerC5014e, 2));
                                }
                                i2++;
                            }
                        } else {
                            Object[] objArr2 = c12328e.ad;
                            int i4 = c12328e.vip;
                            while (i2 < i4) {
                                ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e2 = (ViewTreeObserverOnGlobalLayoutListenerC5014e) objArr2[i2];
                                viewTreeObserverOnGlobalLayoutListenerC5014e2.post(new RunnableC7305e(viewTreeObserverOnGlobalLayoutListenerC5014e2, 3));
                                i2++;
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
            case 3:
                return;
            default:
                AbstractC9464e.yandex("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
                return;
        }
    }
}
