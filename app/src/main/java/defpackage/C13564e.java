package defpackage;

import android.view.inputmethod.InputMethodManager;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٜۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13564e implements Function0 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26874e;

    public /* synthetic */ C13564e(int i) {
        this.f26874e = i;
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.lang.Iterable] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f26874e;
        EnumC14212e enumC14212e = EnumC14212e.f28078e;
        switch (i) {
            case 0:
                return 0;
            case 1:
                return new C13458e("io.ktor.util.date.WeekDay", EnumC18164e.values());
            case 2:
                return new C13458e("io.ktor.util.date.Month", EnumC15009e.values());
            case 3:
                C5363e c5363e = AbstractC0108e.ad;
                ArrayList arrayList = new ArrayList();
                C6404e c6404e = new C6404e();
                EnumC2392e enumC2392e = C4637e.appmetrica;
                EnumC15386e enumC15386e = EnumC15386e.S1080P_16_9;
                C6404e remoteconfig = AbstractC0869e.remoteconfig(enumC14212e, enumC15386e, c6404e, arrayList, c6404e);
                EnumC15386e enumC15386e2 = EnumC15386e.S720P_16_9;
                remoteconfig.ad(C16728e.amazon(enumC14212e, enumC15386e2));
                arrayList.add(remoteconfig);
                EnumC15386e enumC15386e3 = EnumC15386e.MAXIMUM_16_9;
                arrayList.addAll(AbstractC0108e.ad(enumC15386e, enumC15386e3));
                EnumC15386e enumC15386e4 = EnumC15386e.UHD;
                arrayList.addAll(AbstractC0108e.ad(enumC15386e, enumC15386e4));
                arrayList.addAll(AbstractC0108e.ad(enumC15386e, EnumC15386e.S1440P_16_9));
                arrayList.addAll(AbstractC0108e.ad(enumC15386e, enumC15386e));
                arrayList.addAll(AbstractC0108e.ad(enumC15386e2, enumC15386e3));
                arrayList.addAll(AbstractC0108e.ad(enumC15386e2, enumC15386e4));
                arrayList.addAll(AbstractC0108e.ad(enumC15386e2, enumC15386e));
                EnumC15386e enumC15386e5 = EnumC15386e.X_VGA;
                EnumC15386e enumC15386e6 = EnumC15386e.MAXIMUM_4_3;
                arrayList.addAll(AbstractC0108e.ad(enumC15386e5, enumC15386e6));
                arrayList.addAll(AbstractC0108e.ad(EnumC15386e.S1080P_4_3, enumC15386e6));
                return arrayList;
            case 4:
                ArrayList arrayList2 = new ArrayList();
                C6404e c6404e2 = new C6404e();
                EnumC2392e enumC2392e2 = C4637e.appmetrica;
                EnumC15386e enumC15386e7 = EnumC15386e.S1080P_16_9;
                AbstractC0869e.ads(enumC14212e, enumC15386e7, c6404e2, enumC14212e, enumC15386e7);
                C6404e pro = AbstractC0869e.pro(arrayList2, c6404e2);
                pro.ad(C16728e.amazon(enumC14212e, enumC15386e7));
                C6404e remoteconfig2 = AbstractC0869e.remoteconfig(enumC14212e, EnumC15386e.S1440P_16_9, pro, arrayList2, pro);
                remoteconfig2.ad(C16728e.amazon(enumC14212e, enumC15386e7));
                C6404e remoteconfig3 = AbstractC0869e.remoteconfig(enumC14212e, EnumC15386e.UHD, remoteconfig2, arrayList2, remoteconfig2);
                remoteconfig3.ad(C16728e.amazon(enumC14212e, enumC15386e7));
                AbstractC0869e.ads(EnumC14212e.f28076e, enumC15386e7, remoteconfig3, enumC14212e, enumC15386e7);
                arrayList2.add(remoteconfig3);
                return arrayList2;
            case 5:
                return new C16106e();
            case 6:
                return new C4662e(50);
            case 7:
                return AbstractC10531e.ad(true);
            case 8:
                return AbstractC10531e.ad(false);
            case 9:
                float f = AbstractC15863e.ad;
                long j = C3618e.adcel;
                return new C11371e(j, Collections.singletonList(new C10810e(j != 16 ? C3618e.vip(C3618e.license(j) * 0.7f, j) : j)), AbstractC15863e.ad, 0.15f, C10810e.license);
            case 10:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 11:
                return AbstractC12176e.ad(true);
            case 12:
                return new ArrayList();
            case 13:
                return new ArrayList();
            case 14:
                C15420e c15420e = AbstractC6731e.ad;
                return AbstractC1497e.ad.f25795e;
            case 15:
                return (C5653e) AbstractC13704e.ad.getValue();
            case 16:
                try {
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    declaredField3.setAccessible(true);
                    return new C2286e(declaredField3, declaredField, declaredField2);
                } catch (NoSuchFieldException unused) {
                    return C2390e.ad;
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C14808e c14808e = AbstractC11069e.Signature;
                return new C7208e(c14808e, c14808e);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C5015e c5015e = AbstractC10746e.ad;
                return C4814e.ad;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C15492e c15492e = AbstractC4344e.ad;
                return null;
            case 20:
                return Boolean.valueOf(AbstractC1452e.vip());
            case 21:
                C4782e c4782e = AbstractC7562e.ad;
                return Boolean.TRUE;
            case 22:
                C15492e c15492e2 = AbstractC12527e.ad;
                return Boolean.TRUE;
            case 23:
                return new C15765e(48);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return Long.valueOf(System.nanoTime());
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                List m3575continue = AbstractC13480e.m3575continue(new Object());
                if (m3575continue.size() <= 1) {
                    if (AbstractC13480e.m3603synchronized(m3575continue) == null) {
                        return new C2441e();
                    }
                    throw new ClassCastException();
                }
                throw new IllegalStateException(("Multiple default JDK security providers found: " + m3575continue).toString());
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return C1081e.vip;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return C16461e.vip;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return C7973e.vip;
            default:
                return C6886e.vip;
        }
    }
}
