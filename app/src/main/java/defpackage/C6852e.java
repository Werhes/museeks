package defpackage;

import android.net.Uri;
import java.net.URL;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؑٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6852e {
    public final C10426e ad;
    public final InterfaceC8850e vip;

    public C6852e(C10426e c10426e, InterfaceC8850e interfaceC8850e) {
        this.ad = c10426e;
        this.vip = interfaceC8850e;
    }

    public static final URL ad(C6852e c6852e) {
        c6852e.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        C10426e c10426e = c6852e.ad;
        Uri.Builder appendPath2 = appendPath.appendPath(c10426e.ad).appendPath("settings");
        C13666e c13666e = c10426e.vip;
        return new URL(appendPath2.appendQueryParameter("build_version", c13666e.metrica).appendQueryParameter("display_version", c13666e.vip).build().toString());
    }
}
