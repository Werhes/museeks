package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؗۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10079e extends AudioDeviceCallback {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C10079e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        switch (this.ad) {
            case 0:
                ((C7116e) this.vip).metrica();
                return;
            default:
                C12894e c12894e = (C12894e) this.vip;
                ((C17790e) c12894e.f25752e).m4432protected(Boolean.valueOf(c12894e.applovin()));
                return;
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        switch (this.ad) {
            case 0:
                C7116e c7116e = (C7116e) this.vip;
                if (AbstractC9413e.smaato(c7116e.startapp, audioDeviceInfoArr)) {
                    c7116e.startapp = null;
                }
                c7116e.metrica();
                return;
            default:
                C12894e c12894e = (C12894e) this.vip;
                ((C17790e) c12894e.f25752e).m4432protected(Boolean.valueOf(c12894e.applovin()));
                return;
        }
    }
}
