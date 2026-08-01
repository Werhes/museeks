package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.adcel;
import androidx.recyclerview.widget.startapp;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxreborn.ui.ThemedRecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۜۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3655e extends AbstractC10716e implements InterfaceC17156e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public ProgressBar f8222e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f8224e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f8226e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public float f8228e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public ThemedRecyclerView f8230e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public FrameLayout f8232e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public startapp f8233e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean f8234e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public ComposeView f8235e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final ArrayList f8223e = new ArrayList();

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final int f8227e = 40;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final boolean f8225e = true;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public boolean f8237e = true;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C0576e f8236e = AbstractC14533e.startapp(C4440e.ad);

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public Function0 f8231e = new C6349e(this, 0);

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public final C0576e f8229e = AbstractC14533e.startapp(Boolean.TRUE);

    /* renamed from: final, reason: not valid java name */
    public abstract startapp mo1386final();

    @Override // defpackage.AbstractC10716e, defpackage.AbstractC13859e
    public final void firebase() {
        super.firebase();
        FrameLayout frameLayout = this.f8232e;
        if (frameLayout != null) {
            if (frameLayout == null) {
                frameLayout = null;
            }
            frameLayout.setBackgroundColor(AbstractC15933e.ad(R.attr.windowBackground));
        }
    }

    /* renamed from: import, reason: not valid java name */
    public void mo1387import() {
        ThemedRecyclerView themedRecyclerView = this.f8230e;
        if (themedRecyclerView == null) {
            themedRecyclerView = null;
        }
        adcel layoutManager = themedRecyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null && !this.f8224e && linearLayoutManager.m97e() >= this.f8223e.size() - 1 && this.f8237e) {
            int mo861super = mo861super() + this.f8226e;
            this.f8226e = mo861super;
            mo1391private(mo861super);
        }
    }

    /* renamed from: instanceof, reason: not valid java name */
    public void mo1388instanceof() {
        if (this.f8224e) {
            return;
        }
        try {
            FrameLayout frameLayout = this.f8232e;
            if (frameLayout == null) {
                frameLayout = null;
            }
            frameLayout.setVisibility(0);
            ComposeView composeView = this.f8235e;
            if (composeView == null) {
                composeView = null;
            }
            composeView.setVisibility(8);
        } catch (Exception unused) {
        }
        this.f8226e = 0;
        this.f8237e = true;
        this.f8223e.clear();
        ThemedRecyclerView themedRecyclerView = this.f8230e;
        (themedRecyclerView != null ? themedRecyclerView : null).post(new RunnableC2783e(15, this));
        mo1389new();
        mo1391private(0);
    }

    /* renamed from: new, reason: not valid java name */
    public abstract void mo1389new();

    /* renamed from: package, reason: not valid java name */
    public final void m1390package() {
        startapp startappVar = this.f8233e;
        if (startappVar == null) {
            startappVar = null;
        }
        startappVar.adcel();
        View view = this.f21115e;
        if (view == null) {
            view = null;
        }
        ((C6559e) view).setRefreshing(false);
        FrameLayout frameLayout = this.f8232e;
        (frameLayout != null ? frameLayout : null).setVisibility(8);
    }

    /* renamed from: private, reason: not valid java name */
    public abstract void mo1391private(int i);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC10716e
    /* renamed from: protected */
    public final View mo376protected(Context context, LayoutInflater layoutInflater) {
        View view;
        C6559e c6559e = new C6559e((Activity) context);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ThemedRecyclerView themedRecyclerView = new ThemedRecyclerView(pro(), null, 2, 0 == true ? 1 : 0);
        this.f8233e = mo1386final();
        pro();
        themedRecyclerView.setLayoutManager(new LinearLayoutManager(1));
        themedRecyclerView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        startapp startappVar = this.f8233e;
        if (startappVar == null) {
            startappVar = null;
        }
        themedRecyclerView.setAdapter(startappVar);
        themedRecyclerView.setId(ua.itaysonlab.vkx.R.id.loader_recycler);
        themedRecyclerView.addOnScrollListener(new C7037e(1, this));
        themedRecyclerView.setClipToPadding(false);
        this.f8230e = themedRecyclerView;
        relativeLayout.addView(themedRecyclerView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8232e = frameLayout;
        frameLayout.setBackgroundColor(AbstractC15933e.ad(R.attr.windowBackground));
        FrameLayout frameLayout2 = this.f8232e;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        frameLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(context);
        this.f8222e = progressBar;
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(AbstractC15933e.ad(ua.itaysonlab.vkx.R.attr.global_accent)));
        ProgressBar progressBar2 = this.f8222e;
        if (progressBar2 == null) {
            progressBar2 = null;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        progressBar2.setLayoutParams(layoutParams);
        FrameLayout frameLayout3 = this.f8232e;
        if (frameLayout3 == null) {
            frameLayout3 = null;
        }
        ProgressBar progressBar3 = this.f8222e;
        if (progressBar3 == null) {
            progressBar3 = null;
        }
        frameLayout3.addView(progressBar3);
        View view2 = this.f8232e;
        if (view2 == null) {
            view2 = null;
        }
        relativeLayout.addView(view2);
        C4891e c4891e = this.f27449e;
        if (c4891e.license == EnumC7785e.f15780e) {
            view = new View(relativeLayout.getContext());
        } else {
            ComposeView composeView = new ComposeView(relativeLayout.getContext(), null, 6);
            composeView.setViewCompositionStrategy(new C0444e(c4891e));
            composeView.setContent(new C2892e(1163434782, true, new C11514e(this, 1)));
            this.f8235e = composeView;
            view = composeView;
        }
        relativeLayout.addView(view);
        c6559e.addView(relativeLayout);
        c6559e.setOnRefreshListener(new C17687e(15, this));
        if (!this.f8225e) {
            c6559e.setEnabled(false);
        }
        return c6559e;
    }

    @Override // defpackage.InterfaceC17156e
    public final void smaato() {
        try {
            ThemedRecyclerView themedRecyclerView = this.f8230e;
            if (themedRecyclerView == null) {
                themedRecyclerView = null;
            }
            themedRecyclerView.smoothScrollToPosition(0);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public void mo1392strictfp(Throwable th) {
        th.printStackTrace();
        this.f8236e.setValue(C15802e.smaato(th));
        this.f8231e = new C6349e(this, 1);
        FrameLayout frameLayout = this.f8232e;
        if (frameLayout == null) {
            frameLayout = null;
        }
        frameLayout.setVisibility(8);
        ComposeView composeView = this.f8235e;
        if (composeView == null) {
            composeView = null;
        }
        composeView.setVisibility(0);
        View view = this.f21115e;
        ((C6559e) (view != null ? view : null)).setRefreshing(false);
        this.f8234e = true;
        this.f8224e = false;
    }

    public void subscription() {
        mo1388instanceof();
    }

    /* renamed from: super */
    public int mo861super() {
        return this.f8227e;
    }

    @Override // defpackage.AbstractC10716e, defpackage.AbstractC9019e
    /* renamed from: this, reason: not valid java name */
    public final void mo1393this(int i) {
        ThemedRecyclerView themedRecyclerView = this.f8230e;
        if (themedRecyclerView != null) {
            themedRecyclerView.setPadding(0, 0, 0, i);
        }
    }

    /* renamed from: transient, reason: not valid java name */
    public final void m1394transient() {
        View view = this.f21115e;
        if (view == null) {
            view = null;
        }
        ((C6559e) view).setRefreshing(false);
        FrameLayout frameLayout = this.f8232e;
        if (frameLayout == null) {
            frameLayout = null;
        }
        frameLayout.setVisibility(8);
        ComposeView composeView = this.f8235e;
        (composeView != null ? composeView : null).setVisibility(8);
    }

    @Override // defpackage.AbstractC10716e
    /* renamed from: try */
    public AbstractC18491e mo216try() {
        return new C17256e(this, false, false, 126);
    }

    @Override // defpackage.AbstractC9019e
    /* renamed from: while, reason: not valid java name */
    public void mo1395while(View view) {
        startapp startappVar = this.f8233e;
        InterfaceC5083e interfaceC5083e = null;
        if (startappVar == null) {
            startappVar = null;
        }
        int i = 0;
        if (startappVar instanceof C11268e) {
            C1713e c1713e = new C1713e(this, interfaceC5083e, i);
            C5981e c5981e = AbstractC15448e.ad;
            C4013e c4013e = AbstractC15448e.vip;
            C11318e c11318e = new C11318e(new C7371e(c4013e, 22), new C17806e(c1713e, interfaceC5083e, 11), 3);
            C4891e c4891e = this.f27449e;
            EnumC7785e enumC7785e = EnumC7785e.f15779e;
            AbstractC7535e.Signature(AbstractC14114e.appmetrica(c11318e, c4891e, enumC7785e), AbstractC4608e.metrica(c4891e));
            AbstractC7535e.Signature(AbstractC14114e.appmetrica(new C11318e(new C7371e(c4013e, 23), new C17806e(new C1713e(this, interfaceC5083e, 1), interfaceC5083e, 13), 3), c4891e, enumC7785e), AbstractC4608e.metrica(c4891e));
        }
        if (this.f8224e) {
            return;
        }
        if (this.f8234e) {
            m1390package();
        } else {
            mo1391private(0);
        }
    }
}
