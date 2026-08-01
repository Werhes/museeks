package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؓۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056e {
    public static final C0056e metrica = new C0056e(new Bundle(), null);
    public final Bundle ad;
    public List vip;

    public C0056e(Bundle bundle, ArrayList arrayList) {
        this.ad = bundle;
        this.vip = arrayList;
    }

    public static C0056e vip(Bundle bundle) {
        if (bundle != null) {
            return new C0056e(bundle, null);
        }
        return null;
    }

    public final void ad() {
        if (this.vip == null) {
            ArrayList<String> stringArrayList = this.ad.getStringArrayList("controlCategories");
            this.vip = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.vip = Collections.EMPTY_LIST;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0056e)) {
            return false;
        }
        C0056e c0056e = (C0056e) obj;
        ad();
        c0056e.ad();
        return this.vip.equals(c0056e.vip);
    }

    public final int hashCode() {
        ad();
        return this.vip.hashCode();
    }

    public final boolean license() {
        ad();
        return this.vip.isEmpty();
    }

    public final ArrayList metrica() {
        ad();
        return new ArrayList(this.vip);
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(metrica().toArray()) + " }";
    }
}
