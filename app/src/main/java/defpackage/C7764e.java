package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًًؘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7764e {
    public final String ad;
    public final Bundle appmetrica;
    public final long license;
    public final long metrica;
    public final String vip;

    public C7764e(long j, long j2, Bundle bundle, String str, String str2) {
        this.ad = str;
        this.vip = str2;
        this.appmetrica = bundle;
        this.metrica = j;
        this.license = j2;
    }

    public static C7764e ad(C15541e c15541e) {
        String str = c15541e.f30689e;
        String str2 = c15541e.f30686e;
        return new C7764e(c15541e.f30688e, c15541e.f30685e, c15541e.f30687e.adcel(), str, str2);
    }

    public final String toString() {
        String obj = this.appmetrica.toString();
        String str = this.vip;
        int length = String.valueOf(str).length();
        String str2 = this.ad;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + obj.length());
        AbstractC13501e.Signature(sb, "origin=", str, ",name=", str2);
        return AbstractC1786e.signatures(sb, ",params=", obj);
    }

    public final C15541e vip() {
        C3276e c3276e = new C3276e(new Bundle(this.appmetrica));
        return new C15541e(this.ad, c3276e, this.vip, this.metrica, this.license);
    }
}
