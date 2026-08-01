package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.car.app.navigation.model.Maneuver;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۘ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11212e extends C7460e implements Function0 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f22475e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11212e(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f22475e = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, eْؓۢ] */
    /* JADX WARN: Type inference failed for: r4v0, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r4v1, types: [eۡۦ] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r5v10, types: [eٖۥِ, eًٓۧ, eُؙؖ] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f22475e;
        int i2 = 1;
        int i3 = 3;
        int i4 = 0;
        Object obj = this.f7266e;
        switch (i) {
            case 0:
                C16869e c16869e = (C16869e) obj;
                c16869e.m4205transient(false);
                AbstractC16519e.ad(c16869e, c16869e.pro(), false, new C1240e(c16869e, (InterfaceC5083e) r4, i3));
                return Unit.INSTANCE;
            case 1:
                C16869e c16869e2 = (C16869e) obj;
                c16869e2.m4205transient(false);
                AbstractC16519e.vip((AppActivity) c16869e2.pro(), new C1240e(c16869e2, (InterfaceC5083e) r4, 7));
                return Unit.INSTANCE;
            case 2:
                C16869e c16869e3 = (C16869e) obj;
                c16869e3.getClass();
                AbstractC16696e abstractC16696e = (AbstractC16696e) ((List) AbstractC16696e.ad.getValue()).get(!(AbstractC16268e.purchase() instanceof C17770e) ? 1 : 0);
                c16869e3.f33047e.setValue(Boolean.FALSE);
                c16869e3.pro().onBackPressed();
                C16846e c16846e = C16846e.appmetrica;
                c16846e.getClass();
                C7838e c7838e = VKXApplication.f36530e;
                if (c7838e == null) {
                    c7838e = null;
                }
                c7838e.subscription();
                VKXApplication vKXApplication = VKXApplication.f36528e;
                AbstractC6232e.billing(C9115e.ad, vKXApplication != null ? vKXApplication : 0);
                c16846e.ad(new C7163e(AbstractC16268e.purchase(), abstractC16696e), true);
                return Unit.INSTANCE;
            case 3:
                ((C13622e) obj).mo734case();
                return Unit.INSTANCE;
            case 4:
                ((C12827e) obj).mo734case();
                return Unit.INSTANCE;
            case 5:
                C10137e c10137e = (C10137e) obj;
                c10137e.f20052e.invoke();
                c10137e.purchase();
                return Unit.INSTANCE;
            case 6:
                C10137e c10137e2 = (C10137e) obj;
                c10137e2.f20051e.invoke();
                c10137e2.purchase();
                return Unit.INSTANCE;
            case 7:
                C4031e c4031e = (C4031e) obj;
                AbstractC5336e.purchase(AbstractC4608e.metrica(c4031e.vip()), null, 0, new C16394e(c4031e, r4, i4), 3);
                return Unit.INSTANCE;
            case 8:
                C4031e c4031e2 = (C4031e) obj;
                c4031e2.getClass();
                AbstractC5336e.purchase(AbstractC4608e.metrica(c4031e2.vip()), null, 0, new C16394e(c4031e2, r4, i2), 3);
                return Unit.INSTANCE;
            case 9:
                ?? r5 = (C4031e) obj;
                if (((EnumC7808e) r5.f8964e.getValue()) == EnumC7808e.f15817e) {
                    C6571e m1455throws = r5.m1455throws();
                    if (m1455throws != null) {
                        ((InterfaceC10500e) m1455throws.f13543e).Signature(null);
                        r5.m1450for(null);
                    }
                    InterfaceC1686e m4168strictfp = r5.m4168strictfp();
                    C18010e c18010e = m4168strictfp instanceof C18010e ? (C18010e) m4168strictfp : null;
                    if (AbstractC7890e.billing(c18010e != null ? c18010e.purchase : null, "common")) {
                        C7838e c7838e2 = VKXApplication.f36530e;
                        if (c7838e2 == null) {
                            c7838e2 = null;
                        }
                        if (c7838e2.appmetrica() == EnumC11342e.f22808e) {
                            C7838e c7838e3 = VKXApplication.f36530e;
                            (c7838e3 != null ? c7838e3 : null).adcel();
                        } else {
                            C7838e c7838e4 = VKXApplication.f36530e;
                            (c7838e4 != null ? c7838e4 : null).smaato();
                        }
                    } else {
                        r5.m1450for(new C6571e(null, AbstractC5336e.purchase(AbstractC4608e.metrica(r5.vip()), null, 0, new C16394e(r5, r4, 2), 3)));
                        Unit unit = Unit.INSTANCE;
                    }
                } else if (((EnumC7808e) r5.f8964e.getValue()) == EnumC7808e.f15818e) {
                    r5.m1457volatile(new Object());
                }
                return Unit.INSTANCE;
            case 10:
                C13552e.applovin((C13552e) obj);
                return Unit.INSTANCE;
            case 11:
                ((C12672e) obj).mo734case();
                return Unit.INSTANCE;
            case 12:
                C12672e c12672e = (C12672e) obj;
                AbstractC5336e.purchase(AbstractC4608e.metrica(c12672e.vip()), null, 0, new C17071e(c12672e, r4, 4), 3);
                return Unit.INSTANCE;
            case 13:
                ((C2743e) obj).mo734case();
                return Unit.INSTANCE;
            case 14:
                C2743e c2743e = (C2743e) obj;
                AbstractC5336e.purchase(AbstractC4608e.metrica(c2743e.vip()), null, 0, new C17071e(c2743e, r4, 5), 3);
                return Unit.INSTANCE;
            case 15:
                ((C13679e) obj).mo734case();
                return Unit.INSTANCE;
            case 16:
                C13679e c13679e = (C13679e) obj;
                AbstractC5336e.purchase(AbstractC4608e.metrica(c13679e.vip()), null, 0, new C17071e(c13679e, r4, 6), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C4320e) obj).purchase();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C4320e c4320e = (C4320e) obj;
                if (c4320e.inmobi() != null) {
                    int i5 = AbstractC8752e.ad;
                    AbstractC8752e.ad(c4320e.f10582e, AbstractC4608e.metrica(c4320e.vip()), false, new C12358e(c4320e, (InterfaceC5083e) r4, 13));
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C14987e) obj).mo734case();
                return Unit.INSTANCE;
            case 20:
                ((C1071e) obj).mo734case();
                return Unit.INSTANCE;
            case 21:
                C1071e c1071e = (C1071e) obj;
                AbstractC16519e.vip((AppActivity) c1071e.pro(), new C17071e(c1071e, r4, 10));
                return Unit.INSTANCE;
            case 22:
                C1071e c1071e2 = (C1071e) obj;
                c1071e2.getClass();
                C15959e c15959e = C15959e.ad;
                C15959e.vip.vip();
                c1071e2.f3604e.setValue(BuildConfig.FLAVOR);
                return Unit.INSTANCE;
            case 23:
                Object value = ((C10651e) obj).metrica.f29092e.getValue();
                C3897e c3897e = value instanceof C3897e ? (C3897e) value : null;
                ArrayList arrayList = c3897e != null ? c3897e.license : null;
                return arrayList == null ? C13664e.f27089e : arrayList;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C10355e) obj).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C11046e c11046e = (C11046e) obj;
                c11046e.getClass();
                DecimalFormat decimalFormat = C5575e.ad;
                C5575e.ad(((C16101e) c11046e.f21898e.getValue()).metrica);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C11046e) obj).purchase();
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C11046e c11046e2 = (C11046e) obj;
                c11046e2.getClass();
                AbstractC5336e.purchase(c11046e2, null, 0, new C7195e(c11046e2, (InterfaceC5083e) r4, 24), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((C11046e) obj).purchase();
                return Unit.INSTANCE;
            default:
                Activity activity = ((C11046e) obj).f10582e;
                if (Build.VERSION.SDK_INT >= 26) {
                    activity.startActivityForResult(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES").setData(Uri.parse(String.format("package:%s", Arrays.copyOf(new Object[]{activity.getPackageName()}, 1)))), 39);
                }
                return Unit.INSTANCE;
        }
    }
}
