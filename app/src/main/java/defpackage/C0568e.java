package defpackage;

import android.os.Build;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؑۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0568e implements Function0 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f2749e;

    public /* synthetic */ C0568e(int i) {
        this.f2749e = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 1;
        int i2 = 2;
        int i3 = 0;
        switch (this.f2749e) {
            case 0:
                return C9533e.vip;
            case 1:
                return Boolean.valueOf(Build.BRAND.equals("google"));
            case 2:
                return new C8202e(0, 0);
            case 3:
                return new C13713e(new int[]{0}, new int[]{0});
            case 4:
                return new C4581e(i3);
            case 5:
                return new C4581e(i2);
            case 6:
                return Unit.INSTANCE;
            case 7:
                return new C6571e(EnumC13401e.f26655e, new C17187e(25));
            case 8:
                return Unit.INSTANCE;
            case 9:
                return Unit.INSTANCE;
            case 10:
                return Unit.INSTANCE;
            case 11:
                C5015e c5015e = AbstractC9016e.ad;
                return null;
            case 12:
                C15492e c15492e = AbstractC10870e.ad;
                return C16401e.ad;
            case 13:
                return C1367e.ad;
            case 14:
                return new C17187e(29);
            case 15:
                C15004e c15004e = new C15004e(new C7988e(2), i3);
                c15004e.appmetrica();
                AbstractC17190e.metrica(c15004e, '-');
                c15004e.purchase();
                AbstractC17190e.metrica(c15004e, '-');
                c15004e.vip();
                Unit unit = Unit.INSTANCE;
                return new C7423e(AbstractC8703e.metrica(c15004e));
            case 16:
                C15004e c15004e2 = new C15004e(new C7988e(2), i3);
                c15004e2.appmetrica();
                c15004e2.purchase();
                c15004e2.vip();
                Unit unit2 = Unit.INSTANCE;
                return new C7423e(AbstractC8703e.metrica(c15004e2));
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C2072e c2072e = new C2072e(new C7988e(2));
                AbstractC14780e abstractC14780e = (AbstractC14780e) AbstractC7514e.ad.getValue();
                if (abstractC14780e instanceof C7423e) {
                    c2072e.amazon(((C7423e) abstractC14780e).ad);
                }
                AbstractC17190e.vip(c2072e, new Function1[]{new C3685e(i3)}, new C3685e(i));
                C9299e c9299e = (C9299e) AbstractC8783e.ad.getValue();
                if (AbstractC0869e.premium(c9299e)) {
                    c2072e.loadAd(c9299e.ad);
                }
                Unit unit3 = Unit.INSTANCE;
                return new C14978e(AbstractC8703e.metrica(c2072e));
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C5015e c5015e2 = AbstractC16233e.ad;
                return null;
            case 20:
                C5015e c5015e3 = AbstractC12536e.ad;
                return null;
            case 21:
                return new C10685e();
            case 22:
                return new C12688e();
            case 23:
                return new Cpublic();
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C15492e c15492e2 = AbstractC2256e.ad;
                return C17354e.f34036e;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C10125e c10125e = new C10125e(new C7988e(2));
                c10125e.mopub(2);
                AbstractC17190e.metrica(c10125e, ':');
                c10125e.yandex(2);
                AbstractC17190e.vip(c10125e, new Function1[]{new C3685e(i2)}, new C3685e(3));
                Unit unit4 = Unit.INSTANCE;
                return new C9299e(AbstractC8703e.metrica(c10125e));
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                long j = C3618e.appmetrica;
                return new C0896e(j, j);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                throw new IllegalStateException(BuildConfig.FLAVOR);
            default:
                return new C13458e("err_network_issue", C5842e.INSTANCE, new Annotation[0]);
        }
    }
}
