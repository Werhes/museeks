package defpackage;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٗؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17021e extends AbstractC8786e {
    public int appmetrica;
    public final Rect license;
    public final Rect metrica;
    public int purchase;

    public AbstractC17021e() {
        this.metrica = new Rect();
        this.license = new Rect();
        this.appmetrica = 0;
    }

    public AbstractC17021e(int i) {
        super(0);
        this.metrica = new Rect();
        this.license = new Rect();
        this.appmetrica = 0;
    }

    @Override // defpackage.AbstractC8786e
    public final void pro(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout tapsense = AppBarLayout.ScrollingViewBehavior.tapsense(coordinatorLayout.adcel(view));
        if (tapsense == null) {
            coordinatorLayout.admob(view, i);
            this.appmetrica = 0;
            return;
        }
        C3307e c3307e = (C3307e) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c3307e).leftMargin;
        int bottom = tapsense.getBottom() + ((ViewGroup.MarginLayoutParams) c3307e).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c3307e).rightMargin;
        int bottom2 = ((tapsense.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c3307e).bottomMargin;
        Rect rect = this.metrica;
        rect.set(paddingLeft, bottom, width, bottom2);
        C12948e lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.vip() + rect.left;
                rect.right -= lastWindowInsets.metrica();
            }
        }
        int i2 = c3307e.metrica;
        if (i2 == 0) {
            i2 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.license;
        Gravity.apply(i2, measuredWidth, measuredHeight, rect, rect2, i);
        int signatures = signatures(tapsense);
        view.layout(rect2.left, rect2.top - signatures, rect2.right, rect2.bottom - signatures);
        this.appmetrica = rect2.top - tapsense.getBottom();
    }

    public final int signatures(View view) {
        int i;
        if (this.purchase == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            AbstractC1802e abstractC1802e = ((C3307e) appBarLayout.getLayoutParams()).ad;
            int signatures = abstractC1802e instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) abstractC1802e).signatures() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + signatures > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = (signatures / i) + 1.0f;
            }
        }
        int i2 = this.purchase;
        return AbstractC13482e.mopub((int) (f * i2), 0, i2);
    }

    @Override // defpackage.AbstractC1802e
    public final boolean startapp(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout tapsense;
        C12948e lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (tapsense = AppBarLayout.ScrollingViewBehavior.tapsense(coordinatorLayout.adcel(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            if (tapsense.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.ad() + lastWindowInsets.license();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int totalScrollRange = tapsense.getTotalScrollRange() + size;
        int measuredHeight = tapsense.getMeasuredHeight();
        if (this instanceof SearchBar$ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.subscription(i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i4 == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION), view);
        return true;
    }
}
