package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؑۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0743e implements Function0 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3042e;

    public /* synthetic */ C0743e(int i) {
        this.f3042e = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3042e) {
            case 0:
                TimeZone timeZone = AbstractC0187e.ad;
                return Long.valueOf(System.currentTimeMillis());
            case 1:
                return Integer.valueOf(AbstractC15440e.f30517e.adcel(2147418112) + 65536);
            case 2:
                return UUID.randomUUID().toString();
            case 3:
                VKXApplication.Companion companion = VKXApplication.f36531e;
                VKXApplication.Companion.license();
                return Unit.INSTANCE;
            case 4:
                float f = AbstractC1981e.ad;
                return C11527e.ad;
            case 5:
                int i = AppActivity.f36539e;
                return Unit.INSTANCE;
            case 6:
                C5015e c5015e = AbstractC10560e.ad;
                return C1819e.ad;
            case 7:
                C5015e c5015e2 = AbstractC10560e.ad;
                return C18123e.ad;
            case 8:
                return new C5070e(-3.4028235E38f, 0.0f, 0.0f);
            case 9:
                return Unit.INSTANCE;
            case 10:
                return AbstractC12176e.ad(true);
            case 11:
                return EnumC17132e.Companion.serializer();
            case 12:
                return EnumC6664e.Companion.serializer();
            case 13:
                return EnumC6664e.Companion.serializer();
            case 14:
                return new C13758e(C13257e.ad, 0);
            case 15:
                return new C13758e(C9582e.ad, 0);
            case 16:
                return EnumC6905e.Companion.serializer();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C13758e(C9582e.ad, 0);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return EnumC6664e.Companion.serializer();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.apps.AppsAppDto.NotificationBadgeTypeDto", EnumC6905e.values(), new String[]{"notification_gift", "notification_discount", "notification_update"}, new Annotation[][]{null, null, null});
            case 20:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.apps.AppsAppTypeDto", EnumC17132e.values(), new String[]{"app", "game", "site", "standalone", "vk_app", "community_app", "html5_game", "mini_app"}, new Annotation[][]{null, null, null, null, null, null, null, null});
            case 21:
                return EnumC14431e.Companion.serializer();
            case 22:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.apps.AppsScopeDto.NameDto", EnumC14431e.values(), new String[]{"friends", "photos", "video", "pages", "status", "notes", "wall", "docs", "groups", "stats", "market", "stories", "app_widget", "messages", "manage", "notify", "audio", "support", "menu", "wallmenu", "ads", "offline", "notifications", "email", "adsweb", "leads", "group_messages", "exchange", "phone"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 23:
                return new C13758e(C2845e.ad, 0);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C13758e(C7058e.ad, 0);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C13758e(C12951e.ad, 0);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C13758e(C16652e.ad, 0);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C13758e(C13257e.ad, 0);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C13758e(C11181e.ad, 0);
            default:
                return new C13758e(C11181e.ad, 0);
        }
    }
}
