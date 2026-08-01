package defpackage;

import android.os.StatFs;
import androidx.car.app.navigation.model.Maneuver;
import j$.time.format.DateTimeFormatterBuilder;
import java.io.File;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13117e implements Function0 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26082e;

    public /* synthetic */ C13117e(int i) {
        this.f26082e = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long j = 0;
        switch (this.f26082e) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                C5015e c5015e = AbstractC2844e.ad;
                return null;
            case 2:
                return AbstractC0122e.ad;
            case 3:
                return AbstractC12124e.ad;
            case 4:
                return new C11490e(j);
            case 5:
                return new C11490e(j);
            case 6:
                return AbstractC1682e.ad;
            case 7:
                InterfaceC9998e[] interfaceC9998eArr = new InterfaceC9998e[0];
                if (AbstractC5304e.m1866native("kotlinx.datetime.TimeBased")) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                C7469e c7469e = new C7469e("kotlinx.datetime.TimeBased");
                c7469e.ad(C13058e.vip, "nanoseconds");
                Unit unit = Unit.INSTANCE;
                return new C17709e("kotlinx.datetime.TimeBased", C6805e.appmetrica, c7469e.metrica.size(), AbstractC1660e.m670implements(interfaceC9998eArr), c7469e);
            case 8:
                C16005e c16005e = AbstractC9083e.ad;
                return Boolean.TRUE;
            case 9:
                C11883e c11883e = C5070e.appmetrica;
                return Boolean.TRUE;
            case 10:
                return Unit.INSTANCE;
            case 11:
                C4600e c4600e = new C4600e(AbstractC5087e.m1750native(((C18479e) AbstractC1831e.vip().billing).ad, "?section=all", new StringBuilder("https://vk.com/audios")), 7);
                C5363e c5363e = C0308e.appmetrica;
                c4600e.vip = AbstractC18271e.metrica().license.pro();
                return c4600e;
            case 12:
                C4600e c4600e2 = new C4600e(AbstractC5087e.m1750native(((C18479e) AbstractC1831e.vip().billing).ad, "?section=general", new StringBuilder("https://vk.com/audios")), 7);
                C5363e c5363e2 = C0308e.appmetrica;
                c4600e2.vip = AbstractC18271e.metrica().license.pro();
                return c4600e2;
            case 13:
                return AbstractC7237e.vip("ua.itaysonlab.vkxtv.components.main.TvMainNavigationComponent.NavigationPage", EnumC14098e.values(), new String[]{"search", "main", "library", "now_playing", "settings"}, new Annotation[][]{null, null, null, null, null});
            case 14:
                return Unit.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C10375e(null, null, null, null, null, null, 32767);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C0984e(null, null, null, null, null, null, null, null, null, 32767);
            case 20:
                C6730e c6730e = new C6730e(new C7988e(2));
                AbstractC17190e.vip(c6730e, new Function1[]{new C13887e(22)}, new C13887e(23));
                Unit unit2 = Unit.INSTANCE;
                return new C7013e(AbstractC8703e.metrica(c6730e));
            case 21:
                C6730e c6730e2 = new C6730e(new C7988e(2));
                AbstractC17190e.vip(c6730e2, new Function1[]{new C13887e(24)}, new C13887e(25));
                Unit unit3 = Unit.INSTANCE;
                return new C7013e(AbstractC8703e.metrica(c6730e2));
            case 22:
                C6730e c6730e3 = new C6730e(new C7988e(2));
                AbstractC13501e.tapsense(c6730e3);
                AbstractC13501e.isVip(c6730e3);
                Unit unit4 = Unit.INSTANCE;
                return new C7013e(AbstractC8703e.metrica(c6730e3));
            case 23:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C18511e c18511e = AbstractC11062e.f21949e;
                C10675e appmetrica = AbstractC11062e.f21948e.appmetrica("coil3_disk_cache");
                long j2 = 10485760;
                try {
                    File file = appmetrica.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    j2 = AbstractC3062e.appmetrica((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                } catch (Exception unused) {
                }
                return new C5653e(j2, c18511e, appmetrica);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return EnumC8519e.Companion.serializer();
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return EnumC8519e.Companion.serializer();
            default:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkshared.ValidationType", EnumC16168e.values(), new String[]{"2fa_sms", "2fa_push", "2fa_email", "2fa_app", "2fa_libverify", "2fa_callreset", null}, new Annotation[][]{null, null, null, null, null, null, null});
        }
    }
}
