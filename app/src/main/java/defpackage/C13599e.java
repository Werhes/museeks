package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۣۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13599e {
    public final Service ad;
    public int metrica;
    public final NotificationManager vip;

    public C13599e(Service service) {
        this.ad = service;
        this.vip = (NotificationManager) service.getSystemService("notification");
    }

    public final void ad(AbstractC16696e abstractC16696e) {
        Service service = this.ad;
        AbstractC11815e.Signature(service, "cacheChannel", R.string.cache_ch, R.string.cache_ch_desc);
        NotificationManager notificationManager = this.vip;
        if (abstractC16696e == null) {
            notificationManager.cancel(this.metrica);
            service.stopForeground(true);
            return;
        }
        this.metrica = abstractC16696e.vip().hashCode();
        C11389e c11389e = new C11389e(service, "cacheChannel");
        Notification notification = c11389e.applovin;
        notification.icon = android.R.drawable.stat_sys_download;
        c11389e.adcel = -1;
        C12328e c12328e = AbstractC2890e.ad;
        c11389e.signatures = AbstractC15933e.ad(R.attr.global_accent);
        c11389e.remoteconfig = "progress";
        c11389e.admob = "cache_migration";
        c11389e.appmetrica(2, true);
        notification.tickerText = C11389e.metrica(BuildConfig.FLAVOR);
        c11389e.appmetrica = C11389e.metrica("Миграция кеша");
        c11389e.purchase = C11389e.metrica("на " + abstractC16696e.license());
        Notification vip = c11389e.vip();
        notificationManager.notify(this.metrica, vip);
        service.startForeground(this.metrica, vip);
    }
}
