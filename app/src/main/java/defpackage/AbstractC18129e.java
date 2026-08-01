package defpackage;

import android.os.Bundle;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Arrays;
import java.util.LinkedHashMap;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۥۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18129e {
    public static final C10215e ad;
    public static final C10914e metrica;
    public static final C14595e vip;

    static {
        int i = 8;
        ad = new C10215e(i);
        vip = new C14595e(i);
        metrica = new C10914e(i);
    }

    public static final void ad(InterfaceC9153e interfaceC9153e, Object obj, int i, Object obj2, C13770e c13770e, int i2) {
        c13770e.m3671package(1439843069);
        int i3 = (c13770e.purchase(interfaceC9153e) ? 4 : 2) | i2 | (c13770e.purchase(obj) ? 32 : 16) | (c13770e.license(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.purchase(obj2) ? 2048 : 1024);
        if (c13770e.m3673protected(i3 & 1, (i3 & 1171) != 1170)) {
            ((InterfaceC10545e) obj).ad(obj2, AbstractC16653e.license(980966366, new C0205e(interfaceC9153e, i, obj2, 9), c13770e), c13770e, 48);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9381e(interfaceC9153e, obj, i, obj2, i2);
        }
    }

    public static final C17742e appmetrica(InterfaceC0816e interfaceC0816e) {
        return (C17742e) new C11106e(interfaceC0816e.billing(), new C11993e(8), interfaceC0816e instanceof InterfaceC3475e ? ((InterfaceC3475e) interfaceC0816e).license() : C8567e.vip).m2999abstract(AbstractC3820e.ad.vip(C17742e.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static String billing(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static final void license(InterfaceC10998e interfaceC10998e) {
        EnumC7785e enumC7785e = ((C4891e) interfaceC10998e.vip()).license;
        if (enumC7785e != EnumC7785e.f15778e && enumC7785e != EnumC7785e.f15777e) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC10998e.yandex().m1258e("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C15983e c15983e = new C15983e(interfaceC10998e.yandex(), (InterfaceC0816e) interfaceC10998e);
            interfaceC10998e.yandex().m1261e("androidx.lifecycle.internal.SavedStateHandlesProvider", c15983e);
            interfaceC10998e.vip().ad(new C18149e(4, c15983e));
        }
    }

    public static final void metrica(InterfaceC2235e interfaceC2235e, long j, long j2, float f) {
        C13121e c13121e = new C13121e(f, 0.0f, 0, 0, null, 30);
        AbstractC4653e.subscription(interfaceC2235e, C3618e.metrica, j, j2, 0.0f, c13121e, null, 0, 104);
        long j3 = C3618e.appmetrica;
        long startapp = C2152e.startapp(j, AbstractC12246e.ad(f, f));
        float f2 = 2 * f;
        AbstractC4653e.subscription(interfaceC2235e, j3, startapp, AbstractC5092e.ad(C2108e.purchase(j2) - f2, C2108e.metrica(j2) - f2), 0.0f, c13121e, null, 0, 104);
    }

    public static String purchase(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return AbstractC8647e.isPro(i, "unknown status code: ", new StringBuilder(String.valueOf(i).length() + 21));
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return "API_NOT_CONNECTED";
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return "DEAD_CLIENT";
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static final C0333e vip(C8229e c8229e) {
        LinkedHashMap linkedHashMap = c8229e.ad;
        InterfaceC10998e interfaceC10998e = (InterfaceC10998e) linkedHashMap.get(ad);
        if (interfaceC10998e == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC0816e interfaceC0816e = (InterfaceC0816e) linkedHashMap.get(vip);
        if (interfaceC0816e == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(metrica);
        String str = (String) linkedHashMap.get(AbstractC2774e.f6687e);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC8498e m1258e = interfaceC10998e.yandex().m1258e("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle2 = null;
        C15983e c15983e = m1258e instanceof C15983e ? (C15983e) m1258e : null;
        if (c15983e == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        C17742e appmetrica = appmetrica(interfaceC0816e);
        C0333e c0333e = (C0333e) appmetrica.vip.get(str);
        if (c0333e != null) {
            return c0333e;
        }
        c15983e.vip();
        Bundle bundle3 = c15983e.metrica;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = AbstractC2301e.vip((C6571e[]) Arrays.copyOf(new C6571e[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                c15983e.metrica = null;
            }
            bundle2 = bundle4;
        }
        C0333e startapp = AbstractC12220e.startapp(bundle2, bundle);
        appmetrica.vip.put(str, startapp);
        return startapp;
    }
}
