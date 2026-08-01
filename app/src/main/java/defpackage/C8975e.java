package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8975e extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final C0462e ad;

    public C8975e(C0462e c0462e) {
        this.ad = c0462e;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        this.ad.firebase(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
    }
}
