package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16744e implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C12350e f32826e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Handler f32827e;

    public C16744e(C12350e c12350e, Handler handler) {
        this.f32826e = c12350e;
        this.f32827e = new Handler(handler.getLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 2782386) {
            return false;
        }
        this.f32826e.onAudioFocusChange(message.arg1);
        return true;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        Handler handler = this.f32827e;
        handler.sendMessage(Message.obtain(handler, 2782386, i, 0));
    }
}
