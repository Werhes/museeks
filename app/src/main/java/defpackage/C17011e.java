package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Objects;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٔۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17011e extends C7460e implements Function0 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f33320e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17011e(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f33320e = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C11887e c11887e;
        Function0 function0;
        int i = 2;
        int i2 = 0;
        InterfaceC5083e interfaceC5083e = null;
        switch (this.f33320e) {
            case 0:
                ((C3248e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 1:
                C3248e c3248e = (C3248e) this.f7266e;
                c3248e.f7381e.setValue((String) c3248e.f7383e.getValue());
                String str = (String) c3248e.f7381e.getValue();
                C6473e vip = str.length() == 0 ? C6473e.vip : C6473e.vip(str);
                ExecutorC11157e executorC11157e = AbstractC12346e.f24760e;
                Objects.requireNonNull(vip);
                if (Build.VERSION.SDK_INT >= 33) {
                    Object metrica = AbstractC12346e.metrica();
                    if (metrica != null) {
                        AbstractC2656e.vip(metrica, AbstractC11171e.ad(vip.ad.ad()));
                    }
                } else if (!vip.equals(AbstractC12346e.f24755e)) {
                    synchronized (AbstractC12346e.f24757e) {
                        AbstractC12346e.f24755e = vip;
                        AbstractC12346e.vip();
                    }
                }
                return Unit.INSTANCE;
            case 2:
                C3566e c3566e = (C3566e) this.f7266e;
                List adcel = c3566e.f8041e.adcel();
                if (adcel.size() == 1) {
                    C3662e c3662e = (C3662e) AbstractC13480e.m3604this(adcel);
                    if (c3662e != null) {
                        c3662e.metrica.invoke(c3566e.f10582e);
                    }
                    c3566e.m1376interface();
                } else {
                    c3566e.m1377this(EnumC10826e.f21459e);
                }
                return Unit.INSTANCE;
            case 3:
                return ((C3566e) this.f7266e).f10582e;
            case 4:
                ((C3566e) this.f7266e).purchase();
                return Unit.INSTANCE;
            case 5:
                ((C3566e) this.f7266e).adcel();
                return Unit.INSTANCE;
            case 6:
                ((C6703e) this.f7266e).purchase();
                return Unit.INSTANCE;
            case 7:
                ((C2038e) this.f7266e).billing();
                return Unit.INSTANCE;
            case 8:
                AppActivity appActivity = ((C2038e) this.f7266e).ad;
                AbstractC16519e.ad(AbstractC17947e.billing(appActivity), appActivity, false, new C12559e(i, 7, interfaceC5083e));
                return Unit.INSTANCE;
            case 9:
                ((C2038e) this.f7266e).yandex();
                return Unit.INSTANCE;
            case 10:
                ((C16929e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 11:
                C17180e c17180e = (C17180e) this.f7266e;
                Function0 function02 = c17180e.f33683e;
                c17180e.f33679e = true;
                function02.invoke();
                c17180e.purchase();
                return Unit.INSTANCE;
            case 12:
                C17180e c17180e2 = (C17180e) this.f7266e;
                Function0 function03 = c17180e2.f33684e;
                c17180e2.f33679e = true;
                function03.invoke();
                c17180e2.purchase();
                return Unit.INSTANCE;
            case 13:
                ((C7335e) this.f7266e).purchase();
                return Unit.INSTANCE;
            case 14:
                ((C11522e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 15:
                ((C0458e) this.f7266e).purchase();
                return Unit.INSTANCE;
            case 16:
                ((C5223e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C4850e c4850e = (C4850e) this.f7266e;
                C13391e c13391e = c4850e.vip;
                if (c13391e != null && (c11887e = (C11887e) c13391e.f26644e) != null && (function0 = c11887e.purchase) != null) {
                    function0.invoke();
                }
                c4850e.vip = null;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((InterfaceC1403e) this.f7266e).mo601super();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C14875e) this.f7266e).purchase();
                return Unit.INSTANCE;
            case 20:
                C14875e c14875e = (C14875e) this.f7266e;
                c14875e.getClass();
                C15420e c15420e = AbstractC6731e.ad;
                AbstractC5336e.purchase(c14875e, ExecutorC3603e.f8134e, 0, new C15238e(c14875e, interfaceC5083e, 25), 2);
                return Unit.INSTANCE;
            case 21:
                return ((C12856e) this.f7266e).appmetrica();
            case 22:
                ((C12284e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 23:
                C12284e c12284e = (C12284e) this.f7266e;
                c12284e.m3332import(true);
                AbstractC5336e.purchase(AbstractC4608e.metrica(c12284e.vip()), null, 0, new C15238e(c12284e, interfaceC5083e, 29), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C16070e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C16070e c16070e = (C16070e) this.f7266e;
                c16070e.f31643e.setValue(Boolean.TRUE);
                c16070e.f31645e.setValue(BuildConfig.FLAVOR);
                AbstractC5336e.purchase(AbstractC4608e.metrica(c16070e.vip()), null, 0, new C16600e(c16070e, interfaceC5083e, i2), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C4126e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((C4126e) this.f7266e).f27451e.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(AbstractC1786e.signatures(new StringBuilder("https://static."), AbstractC7205e.metrica, "/restore/"))));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((C0267e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            default:
                ((C0267e) this.f7266e).pro().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://vkx.app/license")));
                return Unit.INSTANCE;
        }
    }
}
