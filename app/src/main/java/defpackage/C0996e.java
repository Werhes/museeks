package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؒۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0996e implements Function0 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3444e;

    public /* synthetic */ C0996e(int i) {
        this.f3444e = i;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 6;
        int i2 = 1;
        int i3 = 0;
        switch (this.f3444e) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                C11999e.ad.vip(true);
                VKXApplication vKXApplication = VKXApplication.f36528e;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                AbstractC5336e.purchase(vKXApplication, null, 0, new AbstractC7185e(2, null), 3);
                return Unit.INSTANCE;
            case 2:
                C12232e c12232e = AbstractC3820e.ad;
                return new C0604e("kotlinx.datetime.DateTimeUnit.DateBased", c12232e.vip(AbstractC10710e.class), new InterfaceC7227e[]{c12232e.vip(C14076e.class), c12232e.vip(C3081e.class)}, new InterfaceC5372e[]{C3094e.ad, C10150e.ad});
            case 3:
                C12232e c12232e2 = AbstractC3820e.ad;
                return new C0604e("kotlinx.datetime.DateTimeUnit", c12232e2.vip(AbstractC0894e.class), new InterfaceC7227e[]{c12232e2.vip(C14076e.class), c12232e2.vip(C3081e.class), c12232e2.vip(C17705e.class)}, new InterfaceC5372e[]{C3094e.ad, C10150e.ad, C8550e.ad});
            case 4:
                InterfaceC9998e[] interfaceC9998eArr = new InterfaceC9998e[0];
                if (AbstractC5304e.m1866native("kotlinx.datetime.DayBased")) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                C7469e c7469e = new C7469e("kotlinx.datetime.DayBased");
                c7469e.ad(C13257e.vip, "days");
                Unit unit = Unit.INSTANCE;
                return new C17709e("kotlinx.datetime.DayBased", C6805e.appmetrica, c7469e.metrica.size(), AbstractC1660e.m670implements(interfaceC9998eArr), c7469e);
            case 5:
                SharedPreferences.Editor edit = C16251e.vip.edit();
                edit.clear();
                edit.apply();
                return Unit.INSTANCE;
            case 6:
                C7546e c7546e = C11102e.ad;
                C11102e.license(new Exception("User clicked on debug non critical button"), C9139e.f18290e);
                return Unit.INSTANCE;
            case 7:
                DecimalFormat decimalFormat = C5575e.ad;
                C8221e c8221e = VKXApplication.f36536e;
                C5575e.ad(((C18479e) (c8221e != null ? c8221e : null).billing).vip);
                return Unit.INSTANCE;
            case 8:
                return Unit.INSTANCE;
            case 9:
                DecimalFormat decimalFormat2 = C5575e.ad;
                C14027e.ad.getClass();
                C5575e.ad(String.valueOf(C14027e.metrica()));
                return Unit.INSTANCE;
            case 10:
                throw new Exception("User clicked on debug crash button");
            case 11:
                return "marker";
            case 12:
                return Float.valueOf(1.0f);
            case 13:
                return AbstractC1213e.vip("io.ktor.client.plugins.SaveBody");
            case 14:
                float f = AbstractC11454e.ad;
                return Boolean.TRUE;
            case 15:
                return new Handler(Looper.getMainLooper());
            case 16:
                return new C13758e(C13257e.ad, 0);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C13758e(C5719e.ad, 0);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                String str = AbstractC0172e.ad;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Object obj = linkedHashMap.get(0);
                Object obj2 = obj;
                if (obj == null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap.put(0, linkedHashMap2);
                    obj2 = linkedHashMap2;
                }
                new C13572e(i3, (Map) obj2, i).applovin(AbstractC1660e.isPro(new String[]{"video/avc", "video/mp4v-es", "video/3gpp", AbstractC0172e.ad, AbstractC0172e.license, AbstractC0172e.appmetrica, AbstractC0172e.purchase}), (List) AbstractC0172e.yandex.getValue());
                Unit unit2 = Unit.INSTANCE;
                Object obj3 = linkedHashMap.get(1);
                Object obj4 = obj3;
                if (obj3 == null) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap.put(1, linkedHashMap3);
                    obj4 = linkedHashMap3;
                }
                new C13572e(i2, (Map) obj4, i).applovin(AbstractC1660e.isPro(new String[]{"video/x-vnd.on2.vp8", AbstractC0172e.vip}), (List) AbstractC0172e.startapp.getValue());
                Unit unit3 = Unit.INSTANCE;
                C6571e c6571e = new C6571e(C14677e.license, new C11019e(linkedHashMap));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                Object obj5 = linkedHashMap4.get(0);
                Object obj6 = obj5;
                if (obj5 == null) {
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    linkedHashMap4.put(0, linkedHashMap5);
                    obj6 = linkedHashMap5;
                }
                new C13572e(i3, (Map) obj6, i).applovin(AbstractC1660e.isPro(new String[]{AbstractC0172e.ad, AbstractC0172e.appmetrica, AbstractC0172e.purchase}), (List) AbstractC0172e.yandex.getValue());
                Unit unit4 = Unit.INSTANCE;
                C6571e c6571e2 = new C6571e(C14677e.appmetrica, new C11019e(linkedHashMap4));
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                Object obj7 = linkedHashMap6.get(0);
                Object obj8 = obj7;
                if (obj7 == null) {
                    LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                    linkedHashMap6.put(0, linkedHashMap7);
                    obj8 = linkedHashMap7;
                }
                new C13572e(i3, (Map) obj8, i).applovin(AbstractC1660e.isPro(new String[]{AbstractC0172e.ad, AbstractC0172e.appmetrica, AbstractC0172e.purchase}), (List) AbstractC0172e.yandex.getValue());
                Unit unit5 = Unit.INSTANCE;
                Object obj9 = linkedHashMap6.get(1);
                Object obj10 = obj9;
                if (obj9 == null) {
                    LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                    linkedHashMap6.put(1, linkedHashMap8);
                    obj10 = linkedHashMap8;
                }
                new C13572e(i2, (Map) obj10, i).applovin(AbstractC6874e.adcel(AbstractC0172e.vip), (List) AbstractC0172e.startapp.getValue());
                Unit unit6 = Unit.INSTANCE;
                C6571e c6571e3 = new C6571e(C14677e.purchase, new C11019e(linkedHashMap6));
                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                Object obj11 = linkedHashMap9.get(0);
                Object obj12 = obj11;
                if (obj11 == null) {
                    LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                    linkedHashMap9.put(0, linkedHashMap10);
                    obj12 = linkedHashMap10;
                }
                new C13572e(i3, (Map) obj12, i).applovin(AbstractC1660e.isPro(new String[]{AbstractC0172e.ad, AbstractC0172e.appmetrica}), (List) AbstractC0172e.yandex.getValue());
                Unit unit7 = Unit.INSTANCE;
                return AbstractC10064e.billing(c6571e, c6571e2, c6571e3, new C6571e(C14677e.billing, new C11019e(linkedHashMap9)), new C6571e(C14677e.startapp, AbstractC0172e.ad()), new C6571e(C14677e.yandex, AbstractC0172e.ad()));
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return AbstractC1660e.isPro(new String[]{"audio/mp4a-latm", "audio/3gpp", "audio/amr-wb"});
            case 20:
                return AbstractC1660e.isPro(new String[]{"audio/vorbis", AbstractC0172e.metrica});
            case 21:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.ecosystem.EcosystemCheckOtpResponseDto.NextStepDto", EnumC14970e.values(), new String[]{"auth", "registration", "show_with_password", "show_without_password"}, new Annotation[][]{null, null, null, null});
            case 22:
                return new C13758e(C9582e.ad, 0);
            case 23:
                return new C13758e(C17830e.ad, 0);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.auth.AuthValidateAccountSupportedWaysDto", EnumC10783e.values(), new String[]{"callreset", "codegen", "email", "libverify", "passkey", "password", "push", "qr_code", "reserve_code", "sms"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null});
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C15492e c15492e = AbstractC0794e.ad;
                return C7523e.ad;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C15765e(0);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                try {
                    Iterator it = ((C15006e) AbstractC7762e.billing(Arrays.asList(new InterfaceC11983e[0]).iterator())).iterator();
                    InterfaceC11983e interfaceC11983e = (InterfaceC11983e) (it.hasNext() ? it.next() : null);
                    if (interfaceC11983e != null) {
                        return interfaceC11983e;
                    }
                    InterfaceC11983e.ad.getClass();
                    return C16245e.vip;
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(th.getMessage(), th);
                }
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return C12856e.ad();
            default:
                C9582e c9582e = C9582e.ad;
                return new C17327e(c9582e, c9582e, 1);
        }
    }
}
