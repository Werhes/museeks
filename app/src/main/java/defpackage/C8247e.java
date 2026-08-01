package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eً۟ٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8247e extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ C6375e ad;

    public C8247e(C6375e c6375e) {
        this.ad = c6375e;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        this.ad.metrica.adcel.billing(-1, new C4403e(14));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.ad.metrica.adcel.billing(-1, new C4403e(15));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.ad.metrica.adcel.billing(-1, new C4403e(14));
    }
}
