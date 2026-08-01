package defpackage;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.metrica;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؒٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1421e<S> extends AbstractC11238e {

    /* renamed from: eؘؕٗ, reason: contains not printable characters */
    public View f4245e;

    /* renamed from: eؕ٘ۘ, reason: contains not printable characters */
    public View f4246e;

    /* renamed from: eٟؖٚ, reason: contains not printable characters */
    public View f4247e;

    /* renamed from: eؗۜؐ, reason: contains not printable characters */
    public View f4248e;

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public int f4249e;

    /* renamed from: eٍٜؓ, reason: contains not printable characters */
    public RecyclerView f4250e;

    /* renamed from: eّؑ۠, reason: contains not printable characters */
    public RecyclerView f4251e;

    /* renamed from: eّْؗ, reason: contains not printable characters */
    public C13391e f4252e;

    /* renamed from: eؚٔۦ, reason: contains not printable characters */
    public int f4253e;

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public C8649e f4254e;

    /* renamed from: eۡۘ, reason: contains not printable characters */
    public C16831e f4255e;

    /* renamed from: goto, reason: not valid java name */
    public final void m603goto(C16831e c16831e) {
        metrica metricaVar = (metrica) this.f4250e.getAdapter();
        int license = metricaVar.f863e.f17468e.license(c16831e);
        int license2 = license - metricaVar.f863e.f17468e.license(this.f4255e);
        boolean z = Math.abs(license2) > 3;
        boolean z2 = license2 > 0;
        this.f4255e = c16831e;
        if (z && z2) {
            this.f4250e.scrollToPosition(license - 3);
            this.f4250e.post(new RunnableC9280e(this, license, 2));
        } else if (!z) {
            this.f4250e.post(new RunnableC9280e(this, license, 2));
        } else {
            this.f4250e.scrollToPosition(license + 3);
            this.f4250e.post(new RunnableC9280e(this, license, 2));
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC17875e
    public final void inmobi(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f4249e);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f4254e);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f4255e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v16, types: [eؘؙۧ, java.lang.Object] */
    @Override // defpackage.AbstractComponentCallbacksC17875e
    public final View pro(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(startapp(), this.f4249e);
        this.f4252e = new C13391e(contextThemeWrapper, 10);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C16831e c16831e = this.f4254e.f17468e;
        if (C8977e.m2511extends(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = ua.itaysonlab.vkx.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = ua.itaysonlab.vkx.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = subs().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(ua.itaysonlab.vkx.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(ua.itaysonlab.vkx.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(ua.itaysonlab.vkx.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(ua.itaysonlab.vkx.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = C7512e.f15321e;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(ua.itaysonlab.vkx.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(ua.itaysonlab.vkx.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(ua.itaysonlab.vkx.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(ua.itaysonlab.vkx.R.id.mtrl_calendar_days_of_week);
        AbstractC2016e.loadAd(gridView, new C11671e(0));
        int i4 = this.f4254e.f17464e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new C2982e(i4) : new C2982e()));
        gridView.setNumColumns(c16831e.f32965e);
        gridView.setEnabled(false);
        this.f4250e = (RecyclerView) inflate.findViewById(ua.itaysonlab.vkx.R.id.mtrl_calendar_months);
        this.f4250e.setLayoutManager(new C11472e(this, i2, i2));
        this.f4250e.setTag("MONTHS_VIEW_GROUP_TAG");
        metrica metricaVar = new metrica(contextThemeWrapper, this.f4254e, new C0444e(this));
        this.f4250e.setAdapter(metricaVar);
        int integer = contextThemeWrapper.getResources().getInteger(ua.itaysonlab.vkx.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(ua.itaysonlab.vkx.R.id.mtrl_calendar_year_selector_frame);
        this.f4251e = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f4251e.setLayoutManager(new GridLayoutManager(integer, 1));
            this.f4251e.setAdapter(new C11647e(this));
            RecyclerView recyclerView2 = this.f4251e;
            ?? obj = new Object();
            AbstractC12206e.metrica(null);
            AbstractC12206e.metrica(null);
            recyclerView2.addItemDecoration(obj);
        }
        if (inflate.findViewById(ua.itaysonlab.vkx.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(ua.itaysonlab.vkx.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC2016e.loadAd(materialButton, new C17528e(2, this));
            View findViewById = inflate.findViewById(ua.itaysonlab.vkx.R.id.month_navigation_previous);
            this.f4248e = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(ua.itaysonlab.vkx.R.id.month_navigation_next);
            this.f4245e = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f4246e = inflate.findViewById(ua.itaysonlab.vkx.R.id.mtrl_calendar_year_selector_frame);
            this.f4247e = inflate.findViewById(ua.itaysonlab.vkx.R.id.mtrl_calendar_day_selector_frame);
            m604this(1);
            materialButton.setText(this.f4255e.metrica());
            this.f4250e.addOnScrollListener(new C1658e(this, metricaVar, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC8021e(2, this));
            this.f4245e.setOnClickListener(new ViewOnClickListenerC13778e(this, metricaVar, 1));
            this.f4248e.setOnClickListener(new ViewOnClickListenerC13778e(this, metricaVar, 0));
        }
        if (!C8977e.m2511extends(contextThemeWrapper, R.attr.windowFullscreen)) {
            new C17281e(1).ad(this.f4250e);
        }
        this.f4250e.scrollToPosition(metricaVar.f863e.f17468e.license(this.f4255e));
        AbstractC2016e.loadAd(this.f4250e, new C11671e(1));
        return inflate;
    }

    @Override // defpackage.AbstractComponentCallbacksC17875e
    public final void remoteconfig(Bundle bundle) {
        super.remoteconfig(bundle);
        if (bundle == null) {
            bundle = this.f35111e;
        }
        this.f4249e = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f4254e = (C8649e) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f4255e = (C16831e) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* renamed from: this, reason: not valid java name */
    public final void m604this(int i) {
        this.f4253e = i;
        if (i == 2) {
            this.f4251e.getLayoutManager().mo79e(this.f4255e.f32963e - ((C11647e) this.f4251e.getAdapter()).f23401e.f4254e.f17468e.f32963e);
            this.f4246e.setVisibility(0);
            this.f4247e.setVisibility(8);
            this.f4248e.setVisibility(8);
            this.f4245e.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f4246e.setVisibility(8);
            this.f4247e.setVisibility(0);
            this.f4248e.setVisibility(0);
            this.f4245e.setVisibility(0);
            m603goto(this.f4255e);
        }
    }
}
