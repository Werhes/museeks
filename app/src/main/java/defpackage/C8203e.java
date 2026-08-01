package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۚ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8203e extends AbstractC8112e {
    public static final String appmetrica = C5401e.crashlytics("NetworkMeteredCtrlr");

    @Override // defpackage.AbstractC8112e
    public final boolean ad(C13394e c13394e) {
        return c13394e.adcel.ad == 5;
    }

    @Override // defpackage.AbstractC8112e
    public final boolean vip(Object obj) {
        C11584e c11584e = (C11584e) obj;
        if (Build.VERSION.SDK_INT >= 26) {
            return (c11584e.ad && c11584e.metrica) ? false : true;
        }
        C5401e.loadAd().smaato(appmetrica, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !c11584e.ad;
    }
}
