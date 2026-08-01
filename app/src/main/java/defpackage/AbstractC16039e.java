package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import kotlin.Unit;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16039e implements InterfaceC18435e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f31588e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final NotificationManager f31589e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractServiceC5057e f31590e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f31591e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f31592e = AbstractC9743e.vip();

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C5363e f31593e = new C5363e(new C14515e(16, this));

    public AbstractC16039e(AbstractServiceC5057e abstractServiceC5057e) {
        this.f31590e = abstractServiceC5057e;
        this.f31589e = (NotificationManager) abstractServiceC5057e.getSystemService("notification");
    }

    public abstract int ad();

    public final void adcel(Exception exc) {
        C7546e c7546e = C11102e.ad;
        C11102e.license(exc, C9139e.f18290e);
        AbstractServiceC5057e abstractServiceC5057e = this.f31590e;
        boolean z = abstractServiceC5057e.f10871e == 1;
        if (!this.f31588e) {
            int appmetrica = z ? appmetrica() : abstractServiceC5057e.f10872e.ad.hashCode();
            C11389e purchase = purchase();
            purchase.vip.clear();
            purchase.applovin.icon = R.drawable.ic_cancel_outline_28;
            String message = exc.getMessage();
            if (message == null) {
                message = exc.getClass().getName();
            }
            purchase.license("error: ".concat(message));
            purchase.appmetrica(2, false);
            Unit unit = Unit.INSTANCE;
            this.f31589e.notify(appmetrica, purchase.vip());
        }
        if (z) {
            smaato(false);
        }
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f31592e.f29359e;
    }

    public final int appmetrica() {
        return ((Number) this.f31593e.getValue()).intValue();
    }

    public abstract String billing();

    public abstract int metrica();

    public final void mopub() {
        AbstractServiceC5057e abstractServiceC5057e = this.f31590e;
        boolean z = abstractServiceC5057e.f10871e == 1;
        if (!this.f31588e) {
            int appmetrica = z ? appmetrica() : abstractServiceC5057e.f10872e.ad.hashCode();
            C11389e purchase = purchase();
            purchase.vip.clear();
            purchase.applovin.icon = R.drawable.ic_check;
            VKXApplication.Companion companion = VKXApplication.f36531e;
            purchase.license(VKXApplication.Companion.vip(R.string.completed));
            purchase.appmetrica(2, false);
            purchase.loadAd = 0;
            purchase.Signature = 0;
            Unit unit = Unit.INSTANCE;
            this.f31589e.notify(appmetrica, purchase.vip());
        }
        if (z) {
            smaato(false);
        }
    }

    public final C11389e purchase() {
        String str;
        String vip = vip();
        AbstractServiceC5057e abstractServiceC5057e = this.f31590e;
        C11389e c11389e = new C11389e(abstractServiceC5057e, vip);
        Notification notification = c11389e.applovin;
        notification.icon = android.R.drawable.stat_sys_download;
        c11389e.adcel = -1;
        C12328e c12328e = AbstractC2890e.ad;
        c11389e.signatures = AbstractC15933e.ad(R.attr.global_accent);
        c11389e.remoteconfig = "progress";
        c11389e.admob = billing();
        c11389e.appmetrica(2, true);
        String str2 = BuildConfig.FLAVOR;
        notification.tickerText = C11389e.metrica(BuildConfig.FLAVOR);
        VKXApplication.Companion companion = VKXApplication.f36531e;
        String vip2 = VKXApplication.Companion.vip(R.string.cancel);
        Intent intent = new Intent(abstractServiceC5057e, abstractServiceC5057e.getClass());
        intent.setAction(AbstractServiceC5057e.f10869e);
        Unit unit = Unit.INSTANCE;
        c11389e.ad(R.drawable.ic_delete_outline_android_28, PendingIntent.getService(abstractServiceC5057e, 1400, intent, C7290e.adcel()), vip2);
        AbstractC3002e abstractC3002e = abstractServiceC5057e.f10872e;
        if ((abstractC3002e instanceof C0389e) || (abstractC3002e instanceof C0726e) || (abstractC3002e instanceof C1931e) || (abstractC3002e instanceof C9025e)) {
            int i = abstractC3002e.ad().ad;
            int i2 = abstractC3002e.ad().vip;
            c11389e.loadAd = i;
            c11389e.Signature = i2;
            if (abstractC3002e instanceof C9025e) {
                String str3 = ((C9025e) abstractC3002e).appmetrica.pro;
                if (str3 == null) {
                    str3 = BuildConfig.FLAVOR;
                }
                c11389e.appmetrica = C11389e.metrica(str3);
                StringBuilder sb = new StringBuilder("[");
                sb.append(abstractC3002e.ad().vip);
                sb.append('/');
                sb.append(abstractC3002e.ad().ad);
                sb.append("] ");
                AudioTrack audioTrack = abstractServiceC5057e.f10877e;
                str = audioTrack != null ? audioTrack.license : null;
                if (str != null) {
                    str2 = str;
                }
                sb.append(str2);
                c11389e.license(sb.toString());
            } else {
                c11389e.appmetrica = C11389e.metrica(abstractC3002e.vip);
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(abstractC3002e.ad().vip);
                sb2.append('/');
                sb2.append(abstractC3002e.ad().ad);
                sb2.append("] ");
                AudioTrack audioTrack2 = abstractServiceC5057e.f10877e;
                String str4 = audioTrack2 != null ? audioTrack2.ad : null;
                if (str4 == null) {
                    str4 = BuildConfig.FLAVOR;
                }
                sb2.append(str4);
                sb2.append(" - ");
                AudioTrack audioTrack3 = abstractServiceC5057e.f10877e;
                str = audioTrack3 != null ? audioTrack3.license : null;
                if (str != null) {
                    str2 = str;
                }
                sb2.append(str2);
                c11389e.license(sb2.toString());
            }
            if (Build.VERSION.SDK_INT >= 24) {
                c11389e.amazon = C11389e.metrica(yandex().concat(" плейлиста"));
            }
        } else if (abstractC3002e instanceof C1390e) {
            C1390e c1390e = (C1390e) abstractC3002e;
            c11389e.appmetrica = C11389e.metrica(c1390e.vip);
            c11389e.license(yandex().concat(" трека"));
            int i3 = c1390e.ad().ad;
            int i4 = c1390e.ad().vip;
            c11389e.loadAd = i3;
            c11389e.Signature = i4;
            return c11389e;
        }
        return c11389e;
    }

    public final void smaato(boolean z) {
        int i = z ? 1 : 2;
        int i2 = Build.VERSION.SDK_INT;
        AbstractServiceC5057e abstractServiceC5057e = this.f31590e;
        if (i2 >= 24) {
            AbstractC12026e.isPro(abstractServiceC5057e, i);
        } else {
            abstractServiceC5057e.stopForeground((i & 1) != 0);
        }
    }

    public final void startapp() {
        AbstractServiceC5057e abstractServiceC5057e = this.f31590e;
        if (abstractServiceC5057e.f10872e == null) {
            return;
        }
        if (this.f31588e) {
            smaato(true);
            return;
        }
        Notification vip = purchase().vip();
        int appmetrica = appmetrica();
        if (System.currentTimeMillis() - this.f31591e >= 1000) {
            this.f31589e.notify(appmetrica, vip);
            if (Build.VERSION.SDK_INT >= 31) {
                try {
                    abstractServiceC5057e.startForeground(appmetrica, vip);
                } catch (ForegroundServiceStartNotAllowedException unused) {
                    AbstractC14966e.ad(AbstractC11575e.vip(this), 6, "[startForeground] downloader service got ForegroundServiceStartNotAllowedException", null);
                }
            } else {
                abstractServiceC5057e.startForeground(appmetrica, vip);
            }
            this.f31591e = System.currentTimeMillis();
        }
    }

    public abstract String vip();

    public abstract String yandex();
}
