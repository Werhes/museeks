package defpackage;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.card.MaterialCardView;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ٘ؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8752e {
    public static final int ad;
    public static final int metrica;
    public static final int vip;

    static {
        VKXApplication.Companion companion = VKXApplication.f36531e;
        ad = VKXApplication.Companion.ad(92.0f);
        vip = VKXApplication.Companion.ad(34.0f);
        metrica = VKXApplication.Companion.ad(52.0f);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [eّؖٝ, java.lang.Object] */
    public static void ad(Activity activity, C18220e c18220e, boolean z, Function3 function3) {
        Handler handler = new Handler(Looper.getMainLooper());
        MaterialCardView materialCardView = new MaterialCardView(activity, null);
        materialCardView.setCardBackgroundColor(AbstractC15933e.ad(R.attr.bg_primary));
        materialCardView.setElevation(0.0f);
        materialCardView.setCardElevation(0.0f);
        VKXApplication.Companion companion = VKXApplication.f36531e;
        materialCardView.setRadius(VKXApplication.Companion.ad(8.0f));
        int i = ad;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        materialCardView.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(activity);
        C1607e c1607e = new C1607e(activity);
        c1607e.setIndeterminate(true);
        c1607e.setIndicatorSize(metrica);
        c1607e.setIndicatorColor(AbstractC15933e.ad(R.attr.global_accent));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
        layoutParams2.gravity = 17;
        Unit unit = Unit.INSTANCE;
        frameLayout.addView(c1607e, layoutParams2);
        AppCompatImageView appCompatImageView = new AppCompatImageView(activity, null);
        int i2 = vip;
        appCompatImageView.setPadding(i2, i2, i2, i2);
        appCompatImageView.setImageResource(R.drawable.ic_close);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(AbstractC15933e.ad(R.attr.text_secondary)));
        appCompatImageView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i, i);
        layoutParams3.gravity = 17;
        frameLayout.addView(appCompatImageView, layoutParams3);
        materialCardView.addView(frameLayout);
        C10985e c10985e = new C10985e(materialCardView, appCompatImageView, c1607e);
        ?? obj = new Object();
        DialogC11829e dialogC11829e = new DialogC11829e(activity, R.style.TransparentDialog);
        dialogC11829e.setContentView(materialCardView);
        dialogC11829e.setCancelable(false);
        dialogC11829e.setCanceledOnTouchOutside(false);
        dialogC11829e.show();
        int i3 = AbstractC3489e.ad;
        Window window = dialogC11829e.getWindow();
        if (window == null) {
            throw new IllegalStateException("This shouldn't be possible!");
        }
        AbstractC13467e.metrica(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        if (!z) {
            appCompatImageView.setOnClickListener(new ViewOnClickListenerC1932e(obj, handler, dialogC11829e, 1));
            handler.postDelayed(new RunnableC2783e(26, c10985e), 1500L);
        }
        obj.f9318e = AbstractC5336e.purchase(c18220e, new C16220e(handler, dialogC11829e, 1), 0, new C14164e(function3, c10985e, handler, dialogC11829e, (InterfaceC5083e) null), 2);
    }
}
