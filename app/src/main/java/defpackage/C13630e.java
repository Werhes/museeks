package defpackage;

import android.os.Bundle;
import android.os.Looper;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۦؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13630e implements Function0 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27030e;

    public /* synthetic */ C13630e(int i) {
        this.f27030e = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 9;
        int i2 = 2;
        switch (this.f27030e) {
            case 0:
                return new C0963e((String) null, new C9837e("radiostations", i2));
            case 1:
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            case 3:
                return new C13458e("ready", C5987e.INSTANCE, new Annotation[0]);
            case 4:
                return EnumC11407e.Companion.serializer();
            case 5:
                return AbstractC7237e.vip("ua.itaysonlab.vkxreborn.nearby.inter_device_migration.CdcmToSenderMessage.TransferFinished.Result", EnumC11407e.values(), new String[]{"ok", "io", "unknown"}, new Annotation[][]{null, null, null});
            case 6:
                try {
                    return Long.valueOf(Looper.getMainLooper().getThread().getId());
                } catch (Exception unused) {
                    return null;
                }
            case 7:
                return Unit.INSTANCE;
            case 8:
                return Unit.INSTANCE;
            case 9:
                long j = AbstractC7363e.pro;
                return new C6032e(j, AbstractC7363e.adcel, AbstractC7363e.signatures, AbstractC7363e.mopub, AbstractC7363e.appmetrica, AbstractC7363e.isVip, AbstractC7363e.advert, AbstractC7363e.inmobi, AbstractC7363e.smaato, AbstractC7363e.ads, AbstractC7363e.Signature, AbstractC7363e.premium, AbstractC7363e.admob, AbstractC7363e.ad, AbstractC7363e.billing, AbstractC7363e.isPro, AbstractC7363e.amazon, AbstractC7363e.applovin, AbstractC7363e.loadAd, j, AbstractC7363e.purchase, AbstractC7363e.license, AbstractC7363e.vip, AbstractC7363e.yandex, AbstractC7363e.metrica, AbstractC7363e.startapp, AbstractC7363e.subscription, AbstractC7363e.remoteconfig, AbstractC7363e.tapsense);
            case 10:
                C15492e c15492e = AbstractC7893e.ad;
                return Boolean.TRUE;
            case 11:
                long license = AbstractC6532e.license(4284612846L);
                long license2 = AbstractC6532e.license(4281794739L);
                long license3 = AbstractC6532e.license(4278442694L);
                long license4 = AbstractC6532e.license(4278290310L);
                long j2 = C3618e.appmetrica;
                long license5 = AbstractC6532e.license(4289724448L);
                long j3 = C3618e.vip;
                return new C16423e(license, license2, license3, license4, j2, j2, license5, j2, j3, j3, j3, j2);
            case 12:
                return Unit.INSTANCE;
            case 13:
                C12894e c12894e = C7838e.f15858e;
                if (c12894e == null) {
                    c12894e = null;
                }
                ((C7838e) ((C14136e) c12894e.f25751e).invoke()).amazon(!((C7838e) ((C14136e) (C7838e.f15858e != null ? r2 : null).f25751e).invoke()).metrica());
                return Unit.INSTANCE;
            case 14:
                return Unit.INSTANCE;
            case 15:
                C0743e c0743e = new C0743e(i);
                C18046e ad = AbstractC1831e.ad();
                VKXApplication vKXApplication = VKXApplication.f36528e;
                AbstractC7754e.license(ad, vKXApplication != null ? vKXApplication : null, new C12439e(EnumC6916e.f14171e, c0743e, 7));
                return Unit.INSTANCE;
            case 16:
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C15492e c15492e2 = AbstractC12512e.ad;
                return null;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new Bundle();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                throw new IllegalStateException("No default size");
            case 20:
                throw new IllegalStateException("No default context");
            case 21:
                C15492e c15492e3 = AbstractC4449e.ad;
                return null;
            case 22:
                throw new IllegalStateException("No default glance id");
            case 23:
                C15492e c15492e4 = AbstractC4449e.ad;
                return C3247e.premium;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                AbstractC1889e.vip("Unexpected call to default provider");
                throw new C14803e(9);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C13458e("io.ktor.http.CookieEncoding", EnumC6792e.values());
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C9582e c9582e = C9582e.ad;
                return new C17327e(c9582e, AbstractC6069e.purchase(c9582e), 1);
            default:
                return AbstractC6874e.mopub(C1892e.ad, C16494e.ad, C16819e.ad, C17440e.ad);
        }
    }
}
