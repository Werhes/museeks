package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۘۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4331e implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int ad;
    public final /* synthetic */ C6321e vip;

    public /* synthetic */ C4331e(InterfaceC5827e interfaceC5827e, C6321e c6321e, int i) {
        this.ad = i;
        this.vip = c6321e;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.ad) {
            case 0:
                C6321e c6321e = this.vip;
                Handler handler = c6321e.f13151e;
                if (Build.VERSION.SDK_INT < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    return;
                } else {
                    c6321e.ad(j);
                    return;
                }
            default:
                C6321e c6321e2 = this.vip;
                Handler handler2 = c6321e2.f13151e;
                if (Build.VERSION.SDK_INT < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    return;
                } else {
                    c6321e2.ad(j);
                    return;
                }
        }
    }
}
