package defpackage;

import android.media.AudioManager;
import android.os.SystemClock;
import android.view.KeyEvent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12675e implements InvocationHandler {
    public final /* synthetic */ C15113e ad;

    public C12675e(C15113e c15113e) {
        this.ad = c15113e;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!method.getName().equals("onVolumeKeyLongPress")) {
            return null;
        }
        C12916e c12916e = this.ad.license;
        KeyEvent keyEvent = (KeyEvent) objArr[0];
        C5363e c5363e = ((PlaybackService) c12916e.f25784e).f36755e;
        if (!((Boolean) AbstractC16524e.appmetrica.ad()).booleanValue()) {
            return null;
        }
        int i = PlaybackService.f36732e;
        if (!((AudioManager) c5363e.getValue()).isMusicActive() || keyEvent.getAction() != 0 || keyEvent.getRepeatCount() != 0) {
            return null;
        }
        if (keyEvent.getKeyCode() == 24) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ((AudioManager) c5363e.getValue()).dispatchMediaKeyEvent(new KeyEvent(uptimeMillis, uptimeMillis, 0, 87, 0));
            ((AudioManager) c5363e.getValue()).dispatchMediaKeyEvent(new KeyEvent(uptimeMillis, uptimeMillis, 1, 87, 0));
            return null;
        }
        if (keyEvent.getKeyCode() != 25) {
            return null;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        ((AudioManager) c5363e.getValue()).dispatchMediaKeyEvent(new KeyEvent(uptimeMillis2, uptimeMillis2, 0, 88, 0));
        ((AudioManager) c5363e.getValue()).dispatchMediaKeyEvent(new KeyEvent(uptimeMillis2, uptimeMillis2, 1, 88, 0));
        return null;
    }
}
