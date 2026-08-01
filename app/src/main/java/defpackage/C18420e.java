package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۡؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C18420e implements Function0 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36106e;

    public /* synthetic */ C18420e(int i) {
        this.f36106e = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 1;
        switch (this.f36106e) {
            case 0:
                C14808e c14808e = AbstractC11069e.Signature;
                return new C7208e(c14808e, c14808e);
            case 1:
                return new C13458e("ua.itaysonlab.vkxtv.components.VkxTvRootComponent.Config.Application", C14907e.INSTANCE, new Annotation[0]);
            case 2:
                return new C13458e("ua.itaysonlab.vkxtv.components.VkxTvRootComponent.Config.Authorization", C14999e.INSTANCE, new Annotation[0]);
            case 3:
                return new C13458e("ua.itaysonlab.vkxtv.components.VkxTvRootComponent.Config.EulaQrCode", C14704e.INSTANCE, new Annotation[0]);
            case 4:
                return new C13458e("ua.itaysonlab.vkxtv.components.VkxTvRootComponent.Config.Intro", C13450e.INSTANCE, new Annotation[0]);
            case 5:
                return new C13458e("ua.itaysonlab.vkxtv.components.VkxTvRootComponent.Config.NagScreen", C14148e.INSTANCE, new Annotation[0]);
            case 6:
                return new C13458e("ua.itaysonlab.vkxtv.components.VkxTvRootComponent.Config.SelectProfile", C10139e.INSTANCE, new Annotation[0]);
            case 7:
                return new C13458e("ua.itaysonlab.vkxtv.components.VkxTvRootComponent.Config.SplashScreen", C16362e.INSTANCE, new Annotation[0]);
            case 8:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.unofficial.year_stats.Y25CBColor", EnumC0767e.values(), new String[]{"blue", "blue_light", "blue_dark", "cyan", "violet", "pink", "pink_dark"}, new Annotation[][]{null, null, null, null, null, null, null});
            case 9:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.unofficial.year_stats.Y25CBType", EnumC14399e.values(), new String[]{"base", "welcome", "number", "top", "summary", "base_ext", "achievement", "playlist", "placeholder", "video", "top_artist"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null});
            case 10:
                return EnumC14399e.Companion.serializer();
            case 11:
                return new C13758e(C16715e.ad, 0);
            case 12:
                return new C13758e(C16715e.ad, 0);
            case 13:
                return new C13758e(C9582e.ad, 0);
            case 14:
                return new C13758e(C16715e.ad, 0);
            case 15:
                return EnumC0767e.Companion.serializer();
            case 16:
                return new C13758e(C9448e.ad, 0);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C13758e(C16370e.ad, 0);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C13758e(C11052e.ad, 0);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C15004e c15004e = new C15004e(new C7988e(2), i);
                c15004e.appmetrica();
                AbstractC17190e.metrica(c15004e, '-');
                c15004e.purchase();
                Unit unit = Unit.INSTANCE;
                return new C15854e(AbstractC8703e.metrica(c15004e));
            default:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
        }
    }
}
