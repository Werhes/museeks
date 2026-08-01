package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؕ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3672e {
    public static C3672e license;
    public final C8455e ad;
    public static final long vip = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern metrica = Pattern.compile("\\AA[\\w-]{38}\\z");

    public C3672e(C8455e c8455e) {
        this.ad = c8455e;
    }

    public final boolean ad(C0100e c0100e) {
        if (TextUtils.isEmpty(c0100e.metrica)) {
            return true;
        }
        long j = c0100e.purchase + c0100e.appmetrica;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.ad.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + vip;
    }
}
