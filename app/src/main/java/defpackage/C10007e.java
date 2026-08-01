package defpackage;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؓؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10007e {
    public final String ad;
    public final /* synthetic */ C1195e appmetrica;
    public boolean license;
    public boolean metrica;
    public final boolean vip;

    public C10007e(C1195e c1195e, String str, boolean z) {
        this.appmetrica = c1195e;
        AbstractC9528e.purchase(str);
        this.ad = str;
        this.vip = z;
    }

    public final boolean ad() {
        if (!this.metrica) {
            this.metrica = true;
            this.license = this.appmetrica.m490e().getBoolean(this.ad, this.vip);
        }
        return this.license;
    }

    public final void vip(boolean z) {
        SharedPreferences.Editor edit = this.appmetrica.m490e().edit();
        edit.putBoolean(this.ad, z);
        edit.apply();
        this.license = z;
    }
}
