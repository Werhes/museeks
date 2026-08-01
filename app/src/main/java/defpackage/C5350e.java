package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5350e {
    public final String ad;
    public final C7407e vip;
    public static final C5350e metrica = new C5350e(BuildConfig.FLAVOR);
    public static final C5350e license = new C5350e("preload");

    public C5350e(String str) {
        this.ad = str;
        this.vip = Build.VERSION.SDK_INT >= 31 ? new C7407e(2) : null;
    }

    public final synchronized LogSessionId ad() {
        C7407e c7407e;
        c7407e = this.vip;
        c7407e.getClass();
        return (LogSessionId) c7407e.vip;
    }
}
