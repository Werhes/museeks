package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17780e {
    public static WeakReference license;
    public final SharedPreferences ad;
    public final ScheduledThreadPoolExecutor metrica;
    public C18464e vip;

    public C17780e(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.metrica = scheduledThreadPoolExecutor;
        this.ad = sharedPreferences;
    }

    public final synchronized C9789e ad() {
        C9789e c9789e;
        String m4492e = this.vip.m4492e();
        Pattern pattern = C9789e.license;
        c9789e = null;
        if (!TextUtils.isEmpty(m4492e)) {
            String[] split = m4492e.split("!", -1);
            if (split.length == 2) {
                c9789e = new C9789e(split[0], split[1]);
            }
        }
        return c9789e;
    }

    public final synchronized void metrica(C9789e c9789e) {
        this.vip.m4489e(c9789e.metrica);
    }

    public final synchronized void vip() {
        this.vip = C18464e.m4482e(this.ad, this.metrica);
    }
}
