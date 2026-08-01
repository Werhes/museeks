package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؔۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3011e {
    public static final C13391e metrica = new C13391e("StreamingFormatChecker", BuildConfig.FLAVOR);
    public final LinkedList ad = new LinkedList();
    public long vip = -1;

    public final void ad(C15444e c15444e) {
        if (c15444e.purchase != -1) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long valueOf = Long.valueOf(elapsedRealtime);
        LinkedList linkedList = this.ad;
        linkedList.add(valueOf);
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (linkedList.size() == 5) {
            Long l = (Long) linkedList.peekFirst();
            AbstractC9528e.startapp(l);
            if (elapsedRealtime - l.longValue() < 5000) {
                long j = this.vip;
                if (j == -1 || elapsedRealtime - j >= TimeUnit.SECONDS.toMillis(5L)) {
                    this.vip = elapsedRealtime;
                    C13391e c13391e = metrica;
                    if (Log.isLoggable((String) c13391e.f26645e, 5)) {
                        Log.w("StreamingFormatChecker", c13391e.inmobi("ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit."));
                    }
                }
            }
        }
    }
}
