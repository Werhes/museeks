package defpackage;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۢؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ScrollCaptureCallbackC17336e implements ScrollCaptureCallback {
    public final C6071e ad;
    public final C14826e appmetrica;
    public final ViewTreeObserverOnGlobalLayoutListenerC5014e license;
    public final C7407e metrica;
    public final C6456e purchase;
    public final C10163e vip;

    public ScrollCaptureCallbackC17336e(C6071e c6071e, C10163e c10163e, C14826e c14826e, C7407e c7407e, ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e) {
        this.ad = c6071e;
        this.vip = c10163e;
        this.metrica = c7407e;
        this.license = viewTreeObserverOnGlobalLayoutListenerC5014e;
        this.appmetrica = new C14826e(c14826e.f29359e.mo394const(C8931e.f17894e));
        this.purchase = new C6456e(c10163e.vip(), new C2415e(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        if (r2 == r4) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.ScrollCaptureCallbackC17336e r10, android.view.ScrollCaptureSession r11, defpackage.C10163e r12, defpackage.AbstractC10731e r13) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ScrollCaptureCallbackC17336e.ad(eٗۢؑ, android.view.ScrollCaptureSession, eٍَؓ, eُؑ۠):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC5336e.purchase(this.appmetrica, C1845e.f4938e, 0, new C15966e(this, runnable, (InterfaceC5083e) null, 0), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        C8419e purchase = AbstractC5336e.purchase(this.appmetrica, null, 0, new C1247e(this, scrollCaptureSession, rect, consumer, null, 12), 3);
        purchase.mo692else(new C17097e(11, cancellationSignal));
        cancellationSignal.setOnCancelListener(new C6938e(0, purchase));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.t(AbstractC9764e.adcel(this.vip));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.purchase.vip = 0.0f;
        ((C0576e) this.metrica.vip).setValue(Boolean.TRUE);
        runnable.run();
    }
}
