package defpackage;

import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۛۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11995e {
    public final /* synthetic */ C18267e ad;

    public C11995e(C18267e c18267e) {
        this.ad = c18267e;
    }

    public static void ad(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void vip(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        C18267e c18267e = this.ad;
        c18267e.yandex = string;
        c18267e.startapp = bundle.getString("transferableTitle");
    }
}
