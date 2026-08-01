package defpackage;

import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۤۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8326e {
    public static final AtomicBoolean ad = new AtomicBoolean(false);

    public static void ad() {
        if (Build.VERSION.SDK_INT < 29 || !ad.get()) {
            return;
        }
        AbstractC14204e.loadAd();
    }
}
