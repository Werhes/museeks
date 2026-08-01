package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۗ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17954e extends AbstractC18491e {
    public final float adcel;
    public final boolean appmetrica;
    public ComposeView billing;
    public final Function1 purchase;
    public final C12742e startapp;
    public final C16330e yandex = new C16330e(0);

    public C17954e(List list, boolean z, Function1 function1) {
        this.appmetrica = z;
        this.purchase = function1;
        C12742e c12742e = new C12742e();
        c12742e.addAll(list);
        this.startapp = c12742e;
        this.adcel = 0.5f;
    }

    public final void loadAd(int i, float f) {
        int size;
        if (f >= this.adcel && (i = i + 1) > (size = this.startapp.size())) {
            i = size;
        }
        this.yandex.startapp(i);
    }

    @Override // defpackage.AbstractC18491e
    public final void mopub() {
    }

    @Override // defpackage.AbstractC18491e
    public final View purchase(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setViewCompositionStrategy(C6114e.f12843e);
        composeView.setContent(new C2892e(1336946297, true, new C1172e(this, 0)));
        VKXApplication vKXApplication = VKXApplication.f36528e;
        Resources resources = (vKXApplication != null ? vKXApplication : null).getResources();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
        composeView.setLayoutParams(new FrameLayout.LayoutParams(-1, resources.getDimensionPixelSize(typedValue.resourceId)));
        this.billing = composeView;
        return composeView;
    }

    @Override // defpackage.AbstractC18491e
    public final void smaato(int i) {
        ComposeView composeView = this.billing;
        if (composeView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = composeView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i2 = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) composeView.getLayoutParams();
        marginLayoutParams2.topMargin = i;
        marginLayoutParams2.bottomMargin = i2;
        composeView.setLayoutParams(marginLayoutParams2);
    }

    @Override // defpackage.AbstractC18491e
    public final View startapp() {
        ComposeView composeView = this.billing;
        if (composeView == null) {
            return null;
        }
        return composeView;
    }
}
