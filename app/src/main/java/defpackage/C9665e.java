package defpackage;

import android.widget.HorizontalScrollView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9665e implements InterfaceC4067e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ HorizontalScrollView metrica;
    public boolean vip;

    public /* synthetic */ C9665e(HorizontalScrollView horizontalScrollView, int i) {
        this.ad = i;
        this.metrica = horizontalScrollView;
    }

    @Override // defpackage.InterfaceC4067e
    public final void ad(ViewPager viewPager, AbstractC2817e abstractC2817e) {
        switch (this.ad) {
            case 0:
                C5856e c5856e = (C5856e) this.metrica;
                if (c5856e.f12337e == viewPager) {
                    c5856e.billing(abstractC2817e, this.vip);
                    return;
                }
                return;
            default:
                TabLayout tabLayout = (TabLayout) this.metrica;
                if (tabLayout.f915e == viewPager) {
                    tabLayout.billing(abstractC2817e, this.vip);
                    return;
                }
                return;
        }
    }
}
