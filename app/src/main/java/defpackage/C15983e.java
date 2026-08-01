package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٕؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15983e implements InterfaceC8498e {
    public final C3168e ad;
    public final C5363e license;
    public Bundle metrica;
    public boolean vip;

    public C15983e(C3168e c3168e, InterfaceC0816e interfaceC0816e) {
        this.ad = c3168e;
        this.license = new C5363e(new C13465e(25, interfaceC0816e));
    }

    @Override // defpackage.InterfaceC8498e
    public final Bundle ad() {
        Bundle vip = AbstractC2301e.vip((C6571e[]) Arrays.copyOf(new C6571e[0], 0));
        Bundle bundle = this.metrica;
        if (bundle != null) {
            vip.putAll(bundle);
        }
        for (Map.Entry entry : ((C17742e) this.license.getValue()).vip.entrySet()) {
            String str = (String) entry.getKey();
            Bundle ad = ((C14574e) ((C0333e) entry.getValue()).ad.f36194e).ad();
            if (!ad.isEmpty()) {
                vip.putBundle(str, ad);
            }
        }
        this.vip = false;
        return vip;
    }

    public final void vip() {
        if (this.vip) {
            return;
        }
        Bundle isPro = this.ad.isPro("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle vip = AbstractC2301e.vip((C6571e[]) Arrays.copyOf(new C6571e[0], 0));
        Bundle bundle = this.metrica;
        if (bundle != null) {
            vip.putAll(bundle);
        }
        if (isPro != null) {
            vip.putAll(isPro);
        }
        this.metrica = vip;
        this.vip = true;
    }
}
