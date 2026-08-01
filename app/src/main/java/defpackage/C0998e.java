package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؒؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0998e {
    public final C16616e ad;
    public final /* synthetic */ NextDockView metrica;
    public final C11980e vip;

    public C0998e(final NextDockView nextDockView, C16616e c16616e, C11980e c11980e) {
        this.metrica = nextDockView;
        this.ad = c16616e;
        this.vip = c11980e;
        ViewOnClickListenerC0858e viewOnClickListenerC0858e = new ViewOnClickListenerC0858e(nextDockView, this, 3);
        ((AppCompatImageView) c11980e.f23951e).setImageResource(c16616e.metrica);
        View view = (View) c11980e.f23949e;
        view.setContentDescription(c16616e.vip);
        view.setOnClickListener(viewOnClickListenerC0858e);
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: eؚۢؔ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                NextDockView.this.f36759e.invoke(this.ad.ad, view2);
                return true;
            }
        });
        ad(AbstractC15933e.ad(R.attr.text_secondary), 0);
    }

    public final void ad(int i, int i2) {
        C11980e c11980e = this.vip;
        ((AppCompatImageView) c11980e.f23951e).setImageTintList(ColorStateList.valueOf(i));
        if (this.metrica.f36764e) {
            ((FrameLayout) c11980e.f23948e).setBackgroundTintList(ColorStateList.valueOf(0));
        } else {
            ((FrameLayout) c11980e.f23948e).setBackgroundTintList(ColorStateList.valueOf(i2));
        }
    }

    public final void vip(boolean z, boolean z2) {
        int i = R.attr.global_accent;
        int i2 = R.attr.text_secondary;
        if (!z2) {
            if (z) {
                i2 = R.attr.global_accent;
            }
            ad(AbstractC15933e.ad(i2), z ? AbstractC15933e.ad(R.attr.global_accent) : 0);
            return;
        }
        int ad = AbstractC15933e.ad(z ? R.attr.text_secondary : R.attr.global_accent);
        if (z) {
            i2 = R.attr.global_accent;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(ad, AbstractC15933e.ad(i2));
        ofArgb.setDuration(350L);
        ofArgb.addUpdateListener(new C14182e(this, 0));
        ofArgb.start();
        if (this.metrica.f36764e) {
            return;
        }
        int ad2 = AbstractC15933e.ad(z ? 0 : R.attr.global_accent);
        if (!z) {
            i = 0;
        }
        ValueAnimator ofArgb2 = ValueAnimator.ofArgb(ad2, AbstractC15933e.ad(i));
        ofArgb2.setDuration(350L);
        ofArgb2.addUpdateListener(new C14182e(this, 1));
        ofArgb2.start();
    }
}
