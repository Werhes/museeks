package defpackage;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۣۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C12851e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f25681e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25682e;

    public /* synthetic */ C12851e(int i, Object obj) {
        this.f25682e = i;
        this.f25681e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v108, types: [eُۖٚ] */
    /* JADX WARN: Type inference failed for: r4v0, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, eُٖؕ] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r6v0, types: [eؚٓٞ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [eؚٓٞ, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        String str;
        Function0 function0;
        int i2 = 2;
        switch (this.f25682e) {
            case 0:
                return new C1451e((C15074e) this.f25681e);
            case 1:
                C7016e c7016e = (C7016e) this.f25681e;
                if (c7016e.f14361e.appmetrica.isEmpty()) {
                    C8419e c8419e = c7016e.f14360e;
                    if (c8419e != null) {
                        c8419e.Signature(null);
                    }
                    c7016e.f14360e = null;
                } else {
                    C8419e c8419e2 = c7016e.f14360e;
                    if (c8419e2 == null || !c8419e2.purchase()) {
                        c7016e.f14360e = c7016e.m2265e();
                    }
                }
                return Unit.INSTANCE;
            case 2:
                C10117e c10117e = (C10117e) this.f25681e;
                c10117e.f10582e.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05vWVhRPQ==", 2), 2), Charset.defaultCharset()))));
                c10117e.purchase();
                return Unit.INSTANCE;
            case 3:
                C10142e c10142e = (C10142e) this.f25681e;
                c10142e.getClass();
                try {
                    c10142e.f20074e.Signature(2, 0, false);
                } catch (IOException e) {
                    c10142e.ad(2, 2, e);
                }
                return Unit.INSTANCE;
            case 4:
                Context context = (Context) ((C18464e) this.f25681e).f36191e;
                double d = 0.2d;
                try {
                    if (((ActivityManager) context.getSystemService(ActivityManager.class)).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d || d > 1.0d) {
                    throw new IllegalArgumentException("percent must be in the range [0.0, 1.0].");
                }
                C13572e c13572e = new C13572e(17);
                try {
                    ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
                    i = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                } catch (Exception unused2) {
                    i = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                return new C4421e(new C7699e((long) (d * i * 1048576), c13572e), c13572e);
            case 5:
                C10907e c10907e = (C10907e) this.f25681e;
                C3418e c3418e = c10907e.f21611e.f3369e;
                r4 = c3418e != null ? c3418e.f7649e : 0;
                int i3 = r4 == 0 ? -1 : AbstractC4872e.ad[r4.ordinal()];
                if (i3 == -1) {
                    c10907e.purchase();
                } else if (i3 == 1) {
                    c10907e.purchase();
                    Activity activity = c10907e.f10582e;
                    C3418e c3418e2 = c10907e.f21611e.f3369e;
                    if (c3418e2 == null || (str = c3418e2.f7650e) == null) {
                        return Unit.INSTANCE;
                    }
                    activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                } else {
                    if (i3 != 2) {
                        throw new C14803e(10);
                    }
                    c10907e.purchase();
                    ((AppActivity) c10907e.f10582e).isVip(new C5422e());
                }
                return Unit.INSTANCE;
            case 6:
                return (InputMethodManager) ((View) ((C16911e) this.f25681e).f33137e).getContext().getSystemService("input_method");
            case 7:
                C7135e c7135e = (C7135e) this.f25681e;
                long longValue = ((Number) c7135e.f14610e.invoke()).longValue();
                ?? obj = new Object();
                ?? obj2 = new Object();
                synchronized (c7135e.f14611e) {
                    obj.f14622e = longValue - c7135e.f14614e;
                    obj2.f14622e = 1000000000 / c7135e.f14608e;
                    Unit unit = Unit.INSTANCE;
                }
                AbstractC5336e.purchase(c7135e.f14612e, null, 0, new C5840e((C7142e) obj, (C7142e) obj2, c7135e, longValue, (InterfaceC5083e) null), 3);
                return Unit.INSTANCE;
            case 8:
                C11042e c11042e = (C11042e) ((C2245e) this.f25681e).mopub;
                if (c11042e != null) {
                    AbstractC12640e.advert(c11042e);
                }
                return Unit.INSTANCE;
            case 9:
                return Integer.valueOf(((C4993e) this.f25681e).yandex().amazon);
            case 10:
                return AbstractC10024e.ad(((C5164e) this.f25681e).pro());
            case 11:
                return new BaseInputConnection(((C14053e) this.f25681e).ad, false);
            case 12:
                return new C4600e((Integer) this.f25681e);
            case 13:
                ((C5264e) this.f25681e).m2514goto(new C4390e());
                return Unit.INSTANCE;
            case 14:
                C16031e c16031e = (C16031e) this.f25681e;
                c16031e.f31564e = null;
                c16031e.pro().onBackPressed();
                return Unit.INSTANCE;
            case 15:
                return (C3675e) this.f25681e;
            case 16:
                return (InterfaceC8370e) this.f25681e;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                AbstractActivityC8792e abstractActivityC8792e = (AbstractActivityC8792e) this.f25681e;
                C18046e ad = AbstractC1831e.ad();
                VKXApplication vKXApplication = VKXApplication.f36528e;
                AbstractC7754e.license(ad, vKXApplication != null ? vKXApplication : null, new C2109e(29, abstractActivityC8792e));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                InterfaceC3965e interfaceC3965e = (InterfaceC3965e) this.f25681e;
                if (interfaceC3965e != null) {
                    ((C3112e) interfaceC3965e).vip();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return AbstractC10024e.ad(((C7897e) this.f25681e).pro());
            case 20:
                AbstractC16519e.vip((AppActivity) ((C11986e) this.f25681e).pro(), new C12559e(i2, 14, r4));
                return Unit.INSTANCE;
            case 21:
                C8416e.appmetrica.vip(new C9025e((C6943e) this.f25681e));
                return Unit.INSTANCE;
            case 22:
                ?? r0 = (C11192e) this.f25681e;
                C2578e c2578e = C2578e.ad;
                C1164e c1164e = C1164e.ad;
                AbstractC14380e.mopub();
                C10990e c10990e = C10990e.f21759e;
                AbstractC14380e.mopub();
                ?? obj3 = new Object();
                obj3.ad = c1164e;
                AbstractC14380e.mopub();
                obj3.ad = c2578e;
                obj3.vip = c10990e;
                r0.metrica(obj3);
                return Unit.INSTANCE;
            case 23:
                C14478e c14478e = (C14478e) this.f25681e;
                if (c14478e.f28609e.purchase() <= c14478e.f28608e.purchase()) {
                    return null;
                }
                ((C3641e) c14478e.f28615e.getValue()).getClass();
                return Float.valueOf(c14478e.m3807e() + r1.purchase());
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C6759e c6759e = (C6759e) this.f25681e;
                return Float.valueOf(c6759e.f13959e.purchase() / (c6759e.f13956e.purchase() >= 1 ? r0 : 1));
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C12339e c12339e = (C12339e) this.f25681e;
                if (!((Boolean) c12339e.adcel.getValue()).booleanValue() && (function0 = c12339e.metrica) != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C4411e(((C10089e) this.f25681e).ad, R.style.Theme.DeviceDefault.DayNight);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C11439e c11439e = (C11439e) this.f25681e;
                AbstractC13201e.vip(c11439e.pro(), new C14474e((InterfaceC8346e) c11439e.f23004e.getValue()), new C0086e(null, 0L, null, false, false, true, 95));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C3625e c3625e = (C3625e) this.f25681e;
                AbstractC13201e.vip(c3625e.pro(), new C14474e((InterfaceC8346e) c3625e.f8170e.getValue()), new C0086e(null, 0L, null, false, false, true, 95));
                return Unit.INSTANCE;
            default:
                ((InterfaceC1232e) this.f25681e).ad();
                return Unit.INSTANCE;
        }
    }
}
