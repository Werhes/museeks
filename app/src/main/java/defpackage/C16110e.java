package defpackage;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16110e {
    public final SharedPreferences ad;
    public final C0576e appmetrica;
    public final Function1 license;
    public final Function1 metrica;
    public final String vip;

    public C16110e(SharedPreferences sharedPreferences, String str, boolean z, Function1 function1, Function1 function12) {
        this.ad = sharedPreferences;
        this.vip = str;
        this.metrica = function1;
        this.license = function12;
        this.appmetrica = AbstractC14533e.startapp(Boolean.valueOf(sharedPreferences.getBoolean(str, z)));
    }

    public final void ad(boolean z) {
        if (((Boolean) this.license.invoke(Boolean.valueOf(z))).booleanValue()) {
            this.appmetrica.setValue(Boolean.valueOf(z));
            this.ad.edit().putBoolean(this.vip, z).apply();
            this.metrica.invoke(Boolean.valueOf(z));
        }
    }
}
