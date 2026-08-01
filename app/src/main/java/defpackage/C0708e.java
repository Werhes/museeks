package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۦۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0708e implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AudioManager.OnAudioFocusChangeListener f2996e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Handler f2997e;

    public C0708e(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f2996e = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = AbstractC9413e.ad;
        this.f2997e = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        AbstractC9413e.m2565strictfp(this.f2997e, new RunnableC9766e(this, i, 1));
    }
}
