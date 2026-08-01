package defpackage;

import android.os.Trace;
import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٜۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7305e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC5014e f14924e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14925e;

    public /* synthetic */ RunnableC7305e(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, int i) {
        this.f14925e = i;
        this.f14924e = viewTreeObserverOnGlobalLayoutListenerC5014e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f14925e;
        ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = this.f14924e;
        switch (i) {
            case 0:
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!viewTreeObserverOnGlobalLayoutListenerC5014e.f10675e.isEmpty()) {
                    try {
                        ((Function0) viewTreeObserverOnGlobalLayoutListenerC5014e.f10675e.removeLast()).invoke();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Unit unit = Unit.INSTANCE;
                Trace.endSection();
                return;
            case 1:
                viewTreeObserverOnGlobalLayoutListenerC5014e.f10609e = false;
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC5014e.f10616e;
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                viewTreeObserverOnGlobalLayoutListenerC5014e.m1703native(motionEvent);
                return;
            case 2:
                ViewTreeObserverOnGlobalLayoutListenerC5014e.smaato(viewTreeObserverOnGlobalLayoutListenerC5014e.getRoot());
                return;
            default:
                ViewTreeObserverOnGlobalLayoutListenerC5014e.smaato(viewTreeObserverOnGlobalLayoutListenerC5014e.getRoot());
                return;
        }
    }
}
