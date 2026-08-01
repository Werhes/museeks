package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۢٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12829e extends C7460e implements Function0 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f25652e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12829e(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f25652e = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f25652e) {
            case 0:
                ((C7888e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 1:
                ((C0365e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 2:
                ((C8006e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 3:
                ((C0585e) this.f7266e).purchase();
                return Unit.INSTANCE;
            case 4:
                C0585e c0585e = (C0585e) this.f7266e;
                Activity activity = c0585e.f10582e;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", c0585e.f10582e.getPackageName(), null));
                activity.startActivity(intent);
                return Unit.INSTANCE;
            case 5:
                ((C15435e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 6:
                ((C5250e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 7:
                C5250e c5250e = (C5250e) this.f7266e;
                c5250e.f11325e.setValue(Boolean.FALSE);
                C6571e c6571e = c5250e.f11322e;
                if (c6571e != null) {
                    c5250e.m2514goto(new C15820e(((Number) c6571e.f13544e).intValue(), 12, ((Number) c6571e.f13543e).longValue(), (String) null));
                }
                return Unit.INSTANCE;
            case 8:
                C5250e c5250e2 = (C5250e) this.f7266e;
                c5250e2.f11325e.setValue(Boolean.FALSE);
                c5250e2.f11326e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 9:
                C5250e c5250e3 = (C5250e) this.f7266e;
                c5250e3.getClass();
                C5250e.m1839instanceof(c5250e3, null, true, 1);
                return Unit.INSTANCE;
            case 10:
                C5929e c5929e = (C5929e) this.f7266e;
                c5929e.f12502e = true;
                c5929e.f12507e.invoke(AbstractC10064e.yandex(c5929e.f12503e, Collections.singletonMap("captcha_key", (String) c5929e.f12506e.getValue())));
                c5929e.purchase();
                return Unit.INSTANCE;
            case 11:
                ((C5016e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 12:
                ((C10376e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 13:
                ((C10376e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 14:
                ((C18530e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 15:
                ((C18530e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 16:
                ((C14452e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C14452e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C3409e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C3409e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 20:
                ((C3409e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 21:
                ((C3409e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 22:
                ((C3409e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 23:
                ((C1963e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C1963e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((C1963e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C1963e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((C1963e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((C13877e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            default:
                C13877e c13877e = (C13877e) this.f7266e;
                if ((((Boolean) c13877e.f27490e.getValue()).booleanValue() || c13877e.m3688private().f14178e) && (c13877e.m3688private() != EnumC6916e.f14173e || AbstractC12681e.ad())) {
                    EnumC6916e m3688private = c13877e.m3688private();
                    C10479e c10479e = new C10479e(3, c13877e);
                    C18046e ad = AbstractC1831e.ad();
                    VKXApplication vKXApplication = VKXApplication.f36528e;
                    if (vKXApplication == null) {
                        vKXApplication = null;
                    }
                    AbstractC7754e.license(ad, vKXApplication, new C12439e(m3688private, c10479e, 7));
                }
                return Unit.INSTANCE;
        }
    }
}
