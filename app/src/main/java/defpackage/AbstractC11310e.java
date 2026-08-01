package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ۠ٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11310e {
    public static final ViewGroup.LayoutParams ad = new ViewGroup.LayoutParams(-2, -2);

    public static void ad(AbstractActivityC15824e abstractActivityC15824e, C2892e c2892e) {
        View childAt = ((ViewGroup) abstractActivityC15824e.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(c2892e);
            return;
        }
        ComposeView composeView2 = new ComposeView(abstractActivityC15824e, null, 6);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(c2892e);
        View decorView = abstractActivityC15824e.getWindow().getDecorView();
        if (AbstractC0436e.appmetrica(decorView) == null) {
            AbstractC0436e.startapp(decorView, abstractActivityC15824e);
        }
        if (AbstractC15143e.license(decorView) == null) {
            AbstractC15143e.billing(decorView, abstractActivityC15824e);
        }
        if (AbstractC15428e.vip(decorView) == null) {
            AbstractC15428e.appmetrica(decorView, abstractActivityC15824e);
        }
        abstractActivityC15824e.setContentView(composeView2, ad);
    }
}
