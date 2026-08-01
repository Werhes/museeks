package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۥَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18482e {
    public final String ad;
    public final String metrica;
    public final boolean vip;

    public C18482e(String str, String str2) {
        AbstractC9528e.billing(str, "The log tag cannot be null or empty.");
        this.ad = str;
        this.metrica = str2;
        this.vip = str.length() <= 23;
    }

    public final void ad(Exception exc, String str, Object... objArr) {
        if (Build.TYPE.equals("user") || !this.vip) {
            return;
        }
        String str2 = this.ad;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, license(str, objArr), exc);
        }
    }

    public final String license(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.metrica;
        String m1746extends = TextUtils.isEmpty(str2) ? BuildConfig.FLAVOR : AbstractC5087e.m1746extends("[", str2, "] ");
        return !TextUtils.isEmpty(m1746extends) ? m1746extends.concat(String.valueOf(str)) : str;
    }

    public final void metrica(Object... objArr) {
        Log.e(this.ad, license("Bundle is null", objArr));
    }

    public final void vip(String str, Object... objArr) {
        if (Build.TYPE.equals("user") || !this.vip) {
            return;
        }
        String str2 = this.ad;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, license(str, objArr));
        }
    }
}
