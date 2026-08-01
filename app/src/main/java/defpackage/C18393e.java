package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e۟ۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18393e extends AbstractC1037e {
    public boolean ad = true;
    public final /* synthetic */ C16990e license;
    public final /* synthetic */ C7169e metrica;
    public final /* synthetic */ AtomicBoolean vip;

    public C18393e(AtomicBoolean atomicBoolean, C7169e c7169e, C16990e c16990e) {
        this.vip = atomicBoolean;
        this.metrica = c7169e;
        this.license = c16990e;
    }

    @Override // defpackage.AbstractC1037e
    public final void vip(int i, InterfaceC8500e interfaceC8500e) {
        Object obj;
        if (this.ad) {
            this.ad = false;
            AbstractC9464e.yandex("VideoCapture", "cameraCaptureResult timestampNs = " + interfaceC8500e.metrica() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
        }
        AtomicBoolean atomicBoolean = this.vip;
        if (atomicBoolean.get() || (obj = interfaceC8500e.ad().ad.get("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int intValue = ((Integer) obj).intValue();
        C7169e c7169e = this.metrica;
        if (intValue == c7169e.hashCode() && c7169e.ad(null) && !atomicBoolean.getAndSet(true)) {
            AbstractC3062e.amazon().execute(new RunnableC11247e(this, this.license, 16));
        }
    }
}
