package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1681e extends AbstractC8715e {
    public final /* synthetic */ View metrica;
    public final /* synthetic */ int vip;

    public /* synthetic */ C1681e(View view, int i) {
        this.vip = i;
        this.metrica = view;
    }

    @Override // defpackage.AbstractC8715e
    public final void ad(Drawable drawable) {
        switch (this.vip) {
            case 0:
                AbstractC15807e abstractC15807e = (AbstractC15807e) this.metrica;
                abstractC15807e.setIndeterminate(false);
                abstractC15807e.ad(abstractC15807e.f31170e, abstractC15807e.f31168e);
                return;
            case 1:
                AbstractC15807e abstractC15807e2 = (AbstractC15807e) this.metrica;
                if (abstractC15807e2.f31176e) {
                    return;
                }
                abstractC15807e2.setVisibility(abstractC15807e2.f31171e);
                return;
            default:
                ColorStateList colorStateList = ((C0367e) this.metrica).f2408e;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.AbstractC8715e
    public void vip(Drawable drawable) {
        switch (this.vip) {
            case 2:
                C0367e c0367e = (C0367e) this.metrica;
                ColorStateList colorStateList = c0367e.f2408e;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(c0367e.f2413e, colorStateList.getDefaultColor()));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
