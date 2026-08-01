package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۘۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2811e extends AbstractC13359e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C0573e f6757e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6758e;

    public /* synthetic */ C2811e(C0573e c0573e, int i) {
        this.f6758e = i;
        this.f6757e = c0573e;
    }

    @Override // defpackage.InterfaceC18180e
    public final void metrica() {
        View view;
        int i = this.f6758e;
        C0573e c0573e = this.f6757e;
        switch (i) {
            case 0:
                if (c0573e.f2755class && (view = c0573e.inmobi) != null) {
                    view.setTranslationY(0.0f);
                    c0573e.signatures.setTranslationY(0.0f);
                }
                c0573e.signatures.setVisibility(8);
                c0573e.signatures.setTransitioning(false);
                c0573e.f2759native = null;
                C18540e c18540e = c0573e.premium;
                if (c18540e != null) {
                    c18540e.m4571final(c0573e.ads);
                    c0573e.ads = null;
                    c0573e.premium = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c0573e.pro;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC2016e.ad;
                    actionBarOverlayLayout.requestApplyInsets();
                    return;
                }
                return;
            default:
                c0573e.f2759native = null;
                c0573e.signatures.requestLayout();
                return;
        }
    }
}
