package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٔۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14959e {
    public final Uri ad;
    public final String appmetrica;
    public final boolean license;
    public final int metrica;
    public final int purchase;
    public final int vip;

    public C14959e(Uri uri, int i, int i2, boolean z, String str, int i3) {
        uri.getClass();
        this.ad = uri;
        this.vip = i;
        this.metrica = i2;
        this.license = z;
        this.appmetrica = str;
        this.purchase = i3;
    }

    public C14959e(String str, String str2) {
        this.ad = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.vip = 0;
        this.metrica = 400;
        this.license = false;
        this.appmetrica = str2;
        this.purchase = 0;
    }
}
