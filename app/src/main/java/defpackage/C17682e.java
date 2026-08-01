package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ٘ٔ */
/* loaded from: classes.dex */
public final class C17682e {
    public final AudioTrack ad;
    public C4434e license;
    public final Handler metrica;
    public final C12916e vip;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.AudioRouting$OnRoutingChangedListener, eؖۡۙ] */
    public C17682e(AudioTrack audioTrack, C12916e c12916e) {
        this.ad = audioTrack;
        this.vip = c12916e;
        Handler subscription = AbstractC9413e.subscription(null);
        this.metrica = subscription;
        ?? r0 = new AudioRouting.OnRoutingChangedListener() { // from class: eؖۡۙ
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                C17682e c17682e = C17682e.this;
                if (c17682e.license == null) {
                    return;
                }
                AbstractC8461e.purchase().execute(new RunnableC16019e(c17682e, audioRouting, 9));
            }
        };
        this.license = r0;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r0, subscription);
    }

    public static /* synthetic */ void ad(C17682e c17682e, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            c17682e.metrica.post(new RunnableC16019e(c17682e, routedDevice, 10));
        }
    }

    public static void vip(C17682e c17682e) {
        AudioTrack audioTrack = c17682e.ad;
        C4434e c4434e = c17682e.license;
        c4434e.getClass();
        audioTrack.removeOnRoutingChangedListener(c4434e);
        c17682e.license = null;
    }
}
