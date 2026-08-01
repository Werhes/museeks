package defpackage;

import android.view.MotionEvent;
import androidx.car.app.model.Alert;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240e {
    public static final C0240e ad = new Object();

    public final boolean ad(MotionEvent motionEvent, int i) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040;
    }
}
