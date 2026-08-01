package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؐ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10716e extends AbstractC9019e implements InterfaceC12650e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f21114e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public View f21115e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public AbstractC18491e f21116e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public View f21117e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final int f21118e;

    public AbstractC10716e() {
        super(new Object[0]);
        this.f21118e = 800;
    }

    /* renamed from: abstract */
    public boolean mo1920abstract() {
        return false;
    }

    @Override // defpackage.AbstractC13859e
    public void applovin() {
        this.f27446e = null;
        C4891e c4891e = this.f27449e;
        if (c4891e.license != EnumC7785e.f15780e) {
            c4891e.appmetrica(EnumC14621e.ON_STOP);
            c4891e.appmetrica(EnumC14621e.ON_DESTROY);
        }
        Activity pro = pro();
        boolean z = pro != null && pro.isChangingConfigurations();
        C13462e c13462e = this.f27445e;
        if (c13462e != null && !z) {
            c13462e.ad();
        }
        this.f27451e = null;
        this.f21117e = null;
        AbstractC18491e abstractC18491e = this.f21116e;
        if (abstractC18491e != null) {
            (abstractC18491e != null ? abstractC18491e : null).getClass();
        }
    }

    /* renamed from: break */
    public abstract String mo1348break();

    /* renamed from: case */
    public void mo734case() {
        pro().onBackPressed();
    }

    /* renamed from: catch */
    public void mo573catch() {
    }

    /* renamed from: default, reason: not valid java name */
    public final int m2915default() {
        if (!m2916implements()) {
            return -1;
        }
        Activity pro = pro();
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        Resources resources = vKXApplication.getResources();
        TypedValue typedValue = new TypedValue();
        pro.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
        return resources.getDimensionPixelSize(typedValue.resourceId);
    }

    @Override // defpackage.AbstractC13859e
    public void firebase() {
        View view = this.f27446e;
        if (view != null) {
            view.setBackgroundColor(AbstractC15933e.ad(android.R.attr.windowBackground));
        }
        AbstractC18491e abstractC18491e = this.f21116e;
        if (abstractC18491e != null) {
            if (abstractC18491e == null) {
                abstractC18491e = null;
            }
            abstractC18491e.mopub();
        }
    }

    /* renamed from: implements, reason: not valid java name */
    public final boolean m2916implements() {
        AbstractC18491e abstractC18491e = this.f21116e;
        if (abstractC18491e == null) {
            abstractC18491e = null;
        }
        return ((abstractC18491e instanceof C11355e) || mo1920abstract()) ? false : true;
    }

    @Override // defpackage.AbstractC9019e
    /* renamed from: native */
    public void mo2515native(int i) {
        this.f21114e = i;
        if (this.f21116e == null || i <= 0 || !mo1920abstract()) {
            return;
        }
        AbstractC18491e abstractC18491e = this.f21116e;
        if (abstractC18491e == null) {
            abstractC18491e = null;
        }
        abstractC18491e.smaato(i);
    }

    /* renamed from: protected */
    public abstract View mo376protected(Context context, LayoutInflater layoutInflater);

    @Override // defpackage.AbstractC9019e
    /* renamed from: this */
    public void mo1393this(int i) {
        View view = this.f27446e;
        if (view != null) {
            view.setPadding(0, 0, 0, i);
        }
    }

    @Override // defpackage.AbstractC9019e
    /* renamed from: throw */
    public View mo2516throw(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        AbstractC18491e abstractC18491e;
        if (mo1920abstract()) {
            viewGroup2 = new FrameLayout(pro());
        } else {
            LinearLayout linearLayout = new LinearLayout(pro());
            linearLayout.setOrientation(1);
            viewGroup2 = linearLayout;
        }
        viewGroup2.setBackgroundColor(AbstractC15933e.ad(android.R.attr.windowBackground));
        this.f21116e = mo216try();
        View mo376protected = mo376protected(pro(), layoutInflater);
        this.f21115e = mo376protected;
        if (mo376protected == null) {
            mo376protected = null;
        }
        viewGroup2.addView(mo376protected);
        if (mo1920abstract()) {
            AbstractC18491e abstractC18491e2 = this.f21116e;
            AbstractC18491e abstractC18491e3 = abstractC18491e2;
            if (abstractC18491e2 == null) {
                abstractC18491e3 = null;
            }
            View purchase = abstractC18491e3.purchase(pro(), viewGroup2);
            if (purchase != null) {
                if (purchase instanceof AppBarLayout) {
                    AppBarLayout appBarLayout = (AppBarLayout) purchase;
                    C3307e c3307e = new C3307e(-1);
                    c3307e.vip(new AppBarLayout.Behavior());
                    appBarLayout.setLayoutParams(c3307e);
                    appBarLayout.setElevation(0.0f);
                }
                mo573catch();
                viewGroup2.addView(purchase);
            }
            Unit unit = Unit.INSTANCE;
            AbstractC18491e abstractC18491e4 = this.f21116e;
            ((InterfaceC11370e) (abstractC18491e4 != null ? abstractC18491e4 : null)).ad(0.0f);
        }
        int i = this.f21114e;
        if (i > 0 && (abstractC18491e = this.f21116e) != null) {
            abstractC18491e.smaato(i);
        }
        return viewGroup2;
    }

    /* renamed from: try */
    public abstract AbstractC18491e mo216try();
}
