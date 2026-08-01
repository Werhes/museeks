package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑ٘ۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372e implements InterfaceC2489e {
    public static final C2691e ad = new C2691e(5, new Object());
    public static final Set vip = Collections.singleton(C14677e.license);

    @Override // defpackage.InterfaceC2489e
    public final DynamicRangeProfiles ad() {
        return null;
    }

    @Override // defpackage.InterfaceC2489e
    public final Set metrica(C14677e c14677e) {
        AbstractC4265e.license(C14677e.license.equals(c14677e), "DynamicRange is not supported: " + c14677e);
        return vip;
    }

    @Override // defpackage.InterfaceC2489e
    public final Set vip() {
        return vip;
    }
}
