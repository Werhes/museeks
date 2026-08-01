package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.car.app.model.Alert;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18343e {
    public Integer ad;

    public final Integer ad(KeyEvent keyEvent) {
        int unicodeChar = keyEvent.getUnicodeChar();
        if ((Integer.MIN_VALUE & unicodeChar) != 0) {
            this.ad = Integer.valueOf(unicodeChar & Alert.DURATION_SHOW_INDEFINITELY);
            return null;
        }
        Integer num = this.ad;
        if (num == null) {
            return Integer.valueOf(unicodeChar);
        }
        this.ad = null;
        Integer valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar));
        Integer num2 = valueOf.intValue() != 0 ? valueOf : null;
        if (num2 != null) {
            unicodeChar = num2.intValue();
        }
        return Integer.valueOf(unicodeChar);
    }
}
