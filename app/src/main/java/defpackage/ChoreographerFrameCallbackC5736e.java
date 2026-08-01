package defpackage;

import android.view.Choreographer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٛؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC5736e extends AbstractC17090e implements Choreographer.FrameCallback {
    @Override // defpackage.AbstractC17090e
    public final void ad() {
        long j;
        this.f33451e.registerDisplayListener(this, AbstractC9413e.subscription(null));
        this.f33453e.postFrameCallback(this);
        if (this.f33451e.getDisplay(0) != null) {
            j = (long) (1.0E9d / r0.getRefreshRate());
        } else {
            AbstractC2803e.smaato("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j = -9223372036854775807L;
        }
        this.f33452e = j;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f33450e = j;
        this.f33453e.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long j;
        if (i == 0) {
            this.f33453e.postFrameCallback(this);
            if (this.f33451e.getDisplay(0) != null) {
                j = (long) (1.0E9d / r5.getRefreshRate());
            } else {
                AbstractC2803e.smaato("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                j = -9223372036854775807L;
            }
            this.f33452e = j;
        }
    }

    @Override // defpackage.AbstractC17090e
    public final void vip() {
        this.f33451e.unregisterDisplayListener(this);
        this.f33453e.removeFrameCallback(this);
        this.f33450e = -9223372036854775807L;
        this.f33452e = -9223372036854775807L;
    }
}
