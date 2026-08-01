package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٔؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11743e implements InterfaceC2489e {
    public final DynamicRangeProfiles ad;

    public C11743e(DynamicRangeProfiles dynamicRangeProfiles) {
        this.ad = dynamicRangeProfiles;
    }

    public static Set license(Set set) {
        if (set.isEmpty()) {
            return C3295e.f7451e;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            C14677e c14677e = (C14677e) AbstractC6940e.ad.get(Long.valueOf(longValue));
            if (c14677e == null && AbstractC9464e.admob()) {
                Log.w("CXCP", "Dynamic range profile cannot be converted to a DynamicRange object: " + longValue);
            }
            if (c14677e != null) {
                linkedHashSet.add(c14677e);
            }
        }
        return DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    @Override // defpackage.InterfaceC2489e
    public final DynamicRangeProfiles ad() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC2489e
    public final Set metrica(C14677e c14677e) {
        LinkedHashMap linkedHashMap = AbstractC6940e.ad;
        Long ad = AbstractC6940e.ad(c14677e, this.ad);
        if (ad != null) {
            return license(this.ad.getProfileCaptureRequestConstraints(ad.longValue()));
        }
        throw new IllegalArgumentException(("DynamicRange is not supported: " + c14677e).toString());
    }

    @Override // defpackage.InterfaceC2489e
    public final Set vip() {
        return license(this.ad.getSupportedProfiles());
    }
}
