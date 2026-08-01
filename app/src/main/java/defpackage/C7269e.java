package defpackage;

import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٟٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7269e {
    public final C0731e ad;
    public static final AtomicReference vip = new AtomicReference();
    public static final AtomicReference metrica = new AtomicReference();
    public static final AtomicReference license = new AtomicReference();

    public C7269e(C0731e c0731e) {
        this.ad = c0731e;
    }

    public static final String billing(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        AbstractC9528e.startapp(atomicReference);
        AbstractC9528e.vip(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String ad(String str) {
        if (str == null) {
            return null;
        }
        return !this.ad.metrica() ? str : billing(str, AbstractC12992e.yandex, AbstractC12992e.metrica, vip);
    }

    public final String appmetrica(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.ad.metrica()) {
            return bundle.toString();
        }
        StringBuilder inmobi = AbstractC8703e.inmobi("Bundle[{");
        for (String str : bundle.keySet()) {
            if (inmobi.length() != 8) {
                inmobi.append(", ");
            }
            inmobi.append(vip(str));
            inmobi.append("=");
            Object obj = bundle.get(str);
            inmobi.append(obj instanceof Bundle ? purchase(new Object[]{obj}) : obj instanceof Object[] ? purchase((Object[]) obj) : obj instanceof ArrayList ? purchase(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        inmobi.append("}]");
        return inmobi.toString();
    }

    public final String license(C15541e c15541e) {
        C0731e c0731e = this.ad;
        if (!c0731e.metrica()) {
            return c15541e.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(c15541e.f30686e);
        sb.append(",name=");
        sb.append(ad(c15541e.f30689e));
        sb.append(",params=");
        C3276e c3276e = c15541e.f30687e;
        sb.append(c3276e == null ? null : !c0731e.metrica() ? c3276e.f7428e.toString() : appmetrica(c3276e.adcel()));
        return sb.toString();
    }

    public final String metrica(String str) {
        if (str == null) {
            return null;
        }
        return !this.ad.metrica() ? str : str.startsWith("_exp_") ? AbstractC5087e.m1746extends("experiment_id(", str, ")") : billing(str, AbstractC9408e.smaato, AbstractC9408e.advert, license);
    }

    public final String purchase(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder inmobi = AbstractC8703e.inmobi("[");
        for (Object obj : objArr) {
            String appmetrica = obj instanceof Bundle ? appmetrica((Bundle) obj) : String.valueOf(obj);
            if (appmetrica != null) {
                if (inmobi.length() != 1) {
                    inmobi.append(", ");
                }
                inmobi.append(appmetrica);
            }
        }
        inmobi.append("]");
        return inmobi.toString();
    }

    public final String vip(String str) {
        if (str == null) {
            return null;
        }
        return !this.ad.metrica() ? str : billing(str, AbstractC1266e.metrica, AbstractC1266e.vip, metrica);
    }
}
