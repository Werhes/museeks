package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٛؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0407e implements InterfaceC5003e {
    public final /* synthetic */ int ad = 1;
    public int license;
    public int metrica;
    public final WeakReference vip;

    public C0407e(TabLayout tabLayout) {
        this.vip = new WeakReference(tabLayout);
    }

    public C0407e(C5856e c5856e) {
        this.vip = new WeakReference(c5856e);
    }

    @Override // defpackage.InterfaceC5003e
    public final void ad(int i) {
        switch (this.ad) {
            case 0:
                this.metrica = this.license;
                this.license = i;
                return;
            default:
                this.metrica = this.license;
                this.license = i;
                TabLayout tabLayout = (TabLayout) this.vip.get();
                if (tabLayout != null) {
                    tabLayout.f952e = this.license;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC5003e
    public final void metrica(int i, float f) {
        boolean z;
        switch (this.ad) {
            case 0:
                C5856e c5856e = (C5856e) this.vip.get();
                if (c5856e != null) {
                    int i2 = this.license;
                    c5856e.yandex(i, f, i2 != 2 || this.metrica == 1, (i2 == 2 && this.metrica == 0) ? false : true);
                    return;
                }
                return;
            default:
                TabLayout tabLayout = (TabLayout) this.vip.get();
                if (tabLayout != null) {
                    int i3 = this.license;
                    boolean z2 = true;
                    if (i3 != 2 || this.metrica == 1) {
                        z = true;
                    } else {
                        z = true;
                        z2 = false;
                    }
                    if (i3 == 2 && this.metrica == 0) {
                        z = false;
                    }
                    tabLayout.yandex(i, f, z2, z, false);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC5003e
    public final void vip(int i) {
        switch (this.ad) {
            case 0:
                C5856e c5856e = (C5856e) this.vip.get();
                if (c5856e == null || c5856e.getSelectedTabPosition() == i || i >= c5856e.getTabCount()) {
                    return;
                }
                int i2 = this.license;
                c5856e.purchase((i < 0 || i >= c5856e.getTabCount()) ? null : (C18305e) c5856e.f12378e.get(i), i2 == 0 || (i2 == 2 && this.metrica == 0));
                return;
            default:
                TabLayout tabLayout = (TabLayout) this.vip.get();
                if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                    return;
                }
                int i3 = this.license;
                tabLayout.purchase((i < 0 || i >= tabLayout.getTabCount()) ? null : (C8811e) tabLayout.f918e.get(i), i3 == 0 || (i3 == 2 && this.metrica == 0));
                return;
        }
    }
}
