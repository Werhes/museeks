package defpackage;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْْۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13518e {
    public final String ad;
    public final Object metrica;
    public final InterfaceC16700e vip;

    public AbstractC13518e(String str, InterfaceC16700e interfaceC16700e, Object obj) {
        this.ad = str;
        this.vip = interfaceC16700e;
        this.metrica = obj;
    }

    public final Object ad() {
        SharedPreferences sharedPreferences = AbstractC9357e.billing;
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        return this.vip.yandex(sharedPreferences, this.ad, this.metrica);
    }

    public final void vip(Object obj) {
        SharedPreferences sharedPreferences = AbstractC9357e.billing;
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        this.vip.adcel(sharedPreferences, this.ad, obj);
    }
}
