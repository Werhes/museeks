package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4314e {
    public final HashMap ad = new HashMap();
    public final ArrayList metrica = new ArrayList();
    public final View vip;

    public C4314e(View view) {
        this.vip = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4314e)) {
            return false;
        }
        C4314e c4314e = (C4314e) obj;
        return this.vip == c4314e.vip && this.ad.equals(c4314e.ad);
    }

    public final int hashCode() {
        return this.ad.hashCode() + (this.vip.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder isPro = AbstractC8703e.isPro("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        isPro.append(this.vip);
        isPro.append("\n");
        String adcel = AbstractC10257e.adcel(isPro.toString(), "    values:");
        HashMap hashMap = this.ad;
        for (String str : hashMap.keySet()) {
            adcel = adcel + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return adcel;
    }
}
