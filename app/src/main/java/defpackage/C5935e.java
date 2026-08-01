package defpackage;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5935e extends AbstractC2817e {
    public final /* synthetic */ AbstractC10716e license;
    public final /* synthetic */ int metrica;
    public final C1059e vip;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5935e(AbstractC5224e abstractC5224e) {
        this(abstractC5224e, abstractC5224e.f27447e);
        this.metrica = 0;
        this.license = abstractC5224e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5935e(AbstractC10347e abstractC10347e) {
        this(abstractC10347e, abstractC10347e.f27447e);
        this.metrica = 1;
        this.license = abstractC10347e;
    }

    public C5935e(AbstractC10716e abstractC10716e, C1059e c1059e) {
        this.vip = c1059e;
    }

    @Override // defpackage.AbstractC2817e
    public final void ad(ViewPager viewPager, int i, Object obj) {
        boolean z;
        AbstractC13859e appmetrica = appmetrica(i);
        if (appmetrica != null) {
            switch (this.metrica) {
                case 0:
                    AbstractC5224e abstractC5224e = (AbstractC5224e) this.license;
                    abstractC5224e.getClass();
                    z = !(abstractC5224e instanceof C0567e);
                    break;
                default:
                    z = true;
                    break;
            }
            if (z) {
                appmetrica.applovin();
            } else {
                appmetrica.ads();
            }
        }
        viewPager.removeView((View) obj);
    }

    public final AbstractC13859e appmetrica(int i) {
        switch (this.metrica) {
            case 0:
                return (AbstractC13859e) AbstractC13480e.m3592native(i, ((AbstractC5224e) this.license).mo373final());
            default:
                return (AbstractC13859e) ((AbstractC10347e) this.license).mo1350super().get(i);
        }
    }

    @Override // defpackage.AbstractC2817e
    public final CharSequence metrica(int i) {
        switch (this.metrica) {
            case 0:
                return (CharSequence) ((AbstractC5224e) this.license).mo374new().get(i);
            default:
                return (CharSequence) ((AbstractC10347e) this.license).mo1349new().get(i);
        }
    }

    @Override // defpackage.AbstractC2817e
    public final int vip() {
        switch (this.metrica) {
            case 0:
                return ((AbstractC5224e) this.license).mo373final().size();
            default:
                return ((AbstractC10347e) this.license).mo1350super().size();
        }
    }
}
