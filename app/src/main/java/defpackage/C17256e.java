package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۚۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17256e extends AbstractC18491e implements InterfaceC11370e {
    public C16866e adcel;
    public int advert;
    public final AbstractC10716e appmetrica;
    public final boolean billing;
    public AppCompatImageView mopub;
    public final boolean purchase;
    public float smaato;
    public LinearLayout startapp;
    public final boolean yandex;

    public C17256e(AbstractC10716e abstractC10716e, boolean z, boolean z2, int i) {
        z = (i & 2) != 0 ? true : z;
        z2 = (i & 8) != 0 ? false : z2;
        boolean z3 = (i & 16) == 0;
        this.appmetrica = abstractC10716e;
        this.purchase = z;
        this.billing = z2;
        this.yandex = z3;
        this.advert = AbstractC15933e.ad(R.attr.windowBackground);
        this.smaato = 1.0f;
    }

    public final void Signature(Function1 function1) {
        AppCompatImageView appCompatImageView = this.mopub;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        AbstractC17680e.amazon(appCompatImageView);
        AppCompatImageView appCompatImageView2 = this.mopub;
        (appCompatImageView2 != null ? appCompatImageView2 : null).setOnClickListener(new ViewOnClickListenerC0123e(10, function1));
    }

    public void ad(float f) {
        this.smaato = f;
        if (!this.billing) {
            this.startapp.setAlpha(f);
            return;
        }
        C16866e c16866e = this.adcel;
        if (c16866e == null) {
            c16866e = null;
        }
        TextView titleView = c16866e.getTitleView();
        if (titleView != null) {
            titleView.setAlpha(f);
        }
        this.startapp.setBackgroundTintList(ColorStateList.valueOf(AbstractC3898e.startapp(this.advert, (int) (AbstractC3062e.vip(f, 0.0f, 1.0f) * 255))));
    }

    @Override // defpackage.AbstractC18491e
    public final void advert(String str) {
        C16866e c16866e = this.adcel;
        if (c16866e != null) {
            if (c16866e == null) {
                c16866e = null;
            }
            c16866e.setTitle(str);
        }
    }

    public final void loadAd() {
        C16866e c16866e = this.adcel;
        if (c16866e == null) {
            c16866e = null;
        }
        Drawable drawable = c16866e.getContext().getDrawable(ua.itaysonlab.vkx.R.drawable.ic_arrow_back_24);
        VKXApplication.Companion companion = VKXApplication.f36531e;
        drawable.setTint(AbstractC15933e.ad(ua.itaysonlab.vkx.R.attr.reborn_title_color));
        C16866e c16866e2 = this.adcel;
        if (c16866e2 == null) {
            c16866e2 = null;
        }
        c16866e2.setNavigationIcon(drawable);
        C16866e c16866e3 = this.adcel;
        (c16866e3 != null ? c16866e3 : null).setNavigationOnClickListener(new ViewOnClickListenerC12223e(this, 0));
    }

    @Override // defpackage.AbstractC18491e
    public void mopub() {
        this.advert = AbstractC15933e.ad(R.attr.windowBackground);
        if (!this.appmetrica.mo1920abstract()) {
            this.startapp.setBackgroundColor(AbstractC15933e.ad(ua.itaysonlab.vkx.R.attr.bg_page));
        } else if (!this.billing) {
            this.startapp.setBackgroundTintList(ColorStateList.valueOf(this.advert));
        }
        ad(this.smaato);
        C16866e c16866e = this.adcel;
        if (c16866e == null) {
            c16866e = null;
        }
        c16866e.setTitleTextColor(AbstractC15933e.ad(ua.itaysonlab.vkx.R.attr.reborn_title_color));
        if (this.purchase) {
            loadAd();
        }
        AppCompatImageView appCompatImageView = this.mopub;
        if (appCompatImageView != null) {
            VKXApplication.Companion companion = VKXApplication.f36531e;
            appCompatImageView.setImageTintList(ColorStateList.valueOf(AbstractC15933e.ad(ua.itaysonlab.vkx.R.attr.reborn_title_color)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.appcompat.widget.Toolbar, android.view.View, eؚٗۤ, com.google.android.material.appbar.MaterialToolbar] */
    @Override // defpackage.AbstractC18491e
    public final View purchase(Context context, ViewGroup viewGroup) {
        int dimensionPixelSize;
        LinearLayout linearLayout = new LinearLayout(context);
        this.startapp = linearLayout;
        int i = 1;
        if (this.billing) {
            VKXApplication vKXApplication = VKXApplication.f36528e;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            Resources resources = vKXApplication.getResources();
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(ua.itaysonlab.vkx.R.attr.actionBarSize, typedValue, true);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(typedValue.resourceId);
            int i2 = AbstractC3489e.ad;
            VKXApplication.Companion companion = VKXApplication.f36531e;
            dimensionPixelSize = VKXApplication.Companion.ad(128.0f) + i2 + dimensionPixelSize2;
        } else {
            VKXApplication vKXApplication2 = VKXApplication.f36528e;
            if (vKXApplication2 == null) {
                vKXApplication2 = null;
            }
            Resources resources2 = vKXApplication2.getResources();
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(ua.itaysonlab.vkx.R.attr.actionBarSize, typedValue2, true);
            dimensionPixelSize = resources2.getDimensionPixelSize(typedValue2.resourceId);
        }
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, dimensionPixelSize));
        AbstractC10716e abstractC10716e = this.appmetrica;
        if (abstractC10716e.mo1920abstract()) {
            this.startapp.setBackgroundResource(ua.itaysonlab.vkx.R.drawable.scrim_top);
        } else {
            this.startapp.setBackgroundColor(AbstractC15933e.ad(ua.itaysonlab.vkx.R.attr.bg_page));
        }
        ?? materialToolbar = new MaterialToolbar(AbstractC14436e.purchase(context, null, ua.itaysonlab.vkx.R.attr.toolbarStyle, ua.itaysonlab.vkx.R.style.Widget_MaterialComponents_Toolbar), null, 0);
        try {
            Field declaredField = Toolbar.class.getDeclaredField("mTitleTextView");
            materialToolbar.f33045e = declaredField;
            Field declaredField2 = Toolbar.class.getDeclaredField("eؘٙؓ");
            materialToolbar.f33046e = declaredField2;
            Field declaredField3 = Toolbar.class.getDeclaredField("eّٖۦ");
            materialToolbar.f33044e = declaredField3;
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            declaredField3.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        String mo1348break = abstractC10716e.mo1348break();
        if (mo1348break == null) {
            mo1348break = BuildConfig.FLAVOR;
        }
        materialToolbar.setTitle(mo1348break);
        materialToolbar.pro(context, ua.itaysonlab.vkx.R.style.TextAppearance_Material3_TitleLarge);
        materialToolbar.setContentInsetStartWithNavigation(0);
        materialToolbar.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView titleView = materialToolbar.getTitleView();
        if (titleView != null) {
            titleView.setOnClickListener(new ViewOnClickListenerC12223e(this, i));
        }
        this.adcel = materialToolbar;
        this.startapp.addView(materialToolbar);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        VKXApplication.Companion companion2 = VKXApplication.f36531e;
        appCompatImageView.setPadding(VKXApplication.Companion.ad(12.0f), 0, VKXApplication.Companion.ad(12.0f), 0);
        Context context2 = appCompatImageView.getContext();
        TypedValue typedValue3 = new TypedValue();
        context2.getTheme().resolveAttribute(ua.itaysonlab.vkx.R.attr.selectableItemBackground, typedValue3, true);
        appCompatImageView.setBackgroundResource(typedValue3.resourceId);
        appCompatImageView.setImageResource(ua.itaysonlab.vkx.R.drawable.ic_more);
        VKXApplication vKXApplication3 = VKXApplication.f36528e;
        if (vKXApplication3 == null) {
            vKXApplication3 = null;
        }
        Resources resources3 = vKXApplication3.getResources();
        Context context3 = appCompatImageView.getContext();
        TypedValue typedValue4 = new TypedValue();
        context3.getTheme().resolveAttribute(ua.itaysonlab.vkx.R.attr.actionBarSize, typedValue4, true);
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(-2, resources3.getDimensionPixelSize(typedValue4.resourceId)));
        this.mopub = appCompatImageView;
        if (!this.yandex) {
            AbstractC17680e.mopub(appCompatImageView);
        }
        LinearLayout linearLayout2 = this.startapp;
        AppCompatImageView appCompatImageView2 = this.mopub;
        linearLayout2.addView(appCompatImageView2 != null ? appCompatImageView2 : null);
        mopub();
        return this.startapp;
    }

    @Override // defpackage.AbstractC18491e
    public final void smaato(int i) {
        LinearLayout linearLayout = this.startapp;
        if (linearLayout != null) {
            linearLayout.setPadding(0, i, 0, 0);
        }
    }

    @Override // defpackage.AbstractC18491e
    public final View startapp() {
        return this.startapp;
    }
}
