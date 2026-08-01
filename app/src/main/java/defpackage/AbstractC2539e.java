package defpackage;

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؔۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2539e {
    public static final C1735e ad;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String str = Build.FINGERPRINT;
        ad = (str == null || !str.toLowerCase(Locale.ROOT).equals("robolectric")) ? null : new Object();
    }
}
