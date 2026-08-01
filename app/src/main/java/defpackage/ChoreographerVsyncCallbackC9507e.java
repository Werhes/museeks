package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerVsyncCallbackC9507e extends AbstractC17090e implements Choreographer$VsyncCallback {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Handler f18860e;

    public ChoreographerVsyncCallbackC9507e(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.f18860e = AbstractC9413e.subscription(null);
    }

    @Override // defpackage.AbstractC17090e
    public final void ad() {
        this.f33451e.registerDisplayListener(this, AbstractC9413e.subscription(null));
        this.f33453e.postVsyncCallback(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.f33453e.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.f33450e = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.f33452e = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.f33452e = -9223372036854775807L;
        }
        this.f18860e.postDelayed(new RunnableC1352e(16, this), 500L);
    }

    @Override // defpackage.AbstractC17090e
    public final void vip() {
        this.f33451e.unregisterDisplayListener(this);
        this.f18860e.removeCallbacksAndMessages(null);
        this.f33453e.removeVsyncCallback(this);
        this.f33450e = -9223372036854775807L;
        this.f33452e = -9223372036854775807L;
    }
}
