package defpackage;

import android.os.PowerManager;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۦؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15092e {
    public static boolean ad(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    public static String vip(Locale locale) {
        return locale.toLanguageTag();
    }
}
