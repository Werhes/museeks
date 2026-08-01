package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؐٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4557e extends C10068e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ int f9850e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4557e(int i) {
        super(10);
        this.f9850e = i;
    }

    @Override // defpackage.C10068e
    public final void billing(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float sin;
        float cos;
        switch (this.f9850e) {
            case 0:
                RectF license = C10068e.license(tabLayout, view);
                RectF license2 = C10068e.license(tabLayout, view2);
                if (license.left < license2.left) {
                    double d = (f * 3.141592653589793d) / 2.0d;
                    sin = (float) (1.0d - Math.cos(d));
                    cos = (float) Math.sin(d);
                } else {
                    double d2 = (f * 3.141592653589793d) / 2.0d;
                    sin = (float) Math.sin(d2);
                    cos = (float) (1.0d - Math.cos(d2));
                }
                drawable.setBounds(AbstractC16664e.metrica((int) license.left, sin, (int) license2.left), drawable.getBounds().top, AbstractC16664e.metrica((int) license.right, cos, (int) license2.right), drawable.getBounds().bottom);
                return;
            default:
                if (f >= 0.5f) {
                    view = view2;
                }
                RectF license3 = C10068e.license(tabLayout, view);
                float vip = f < 0.5f ? AbstractC16664e.vip(1.0f, 0.0f, 0.0f, 0.5f, f) : AbstractC16664e.vip(0.0f, 1.0f, 0.5f, 1.0f, f);
                drawable.setBounds((int) license3.left, drawable.getBounds().top, (int) license3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (vip * 255.0f));
                return;
        }
    }
}
