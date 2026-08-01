package defpackage;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10011e {
    public final SharedPreferences ad;
    public final C0576e metrica;
    public final Function1 vip;

    public C10011e(SharedPreferences sharedPreferences, Function1 function1) {
        this.ad = sharedPreferences;
        this.vip = function1;
        String string = sharedPreferences.getString("autocache", "0");
        this.metrica = AbstractC14533e.startapp(string != null ? string : "0");
    }
}
