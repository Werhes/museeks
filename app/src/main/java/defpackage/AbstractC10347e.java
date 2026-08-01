package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.ui.ThemedViewPager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٜٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10347e extends AbstractC10716e {

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final /* synthetic */ int f20423e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public Object f20424e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public Object f20425e;

    public AbstractC10347e(int i) {
        this.f20423e = i;
        switch (i) {
            case 1:
                return;
            default:
                this.f20424e = new C0916e();
                this.f20425e = BuildConfig.FLAVOR;
                return;
        }
    }

    @Override // defpackage.AbstractC13859e
    public void ads() {
        switch (this.f20423e) {
            case 1:
                super.ads();
                Iterator it = mo1350super().iterator();
                while (it.hasNext()) {
                    ((AbstractC13859e) it.next()).ads();
                }
                return;
            default:
                super.ads();
                return;
        }
    }

    @Override // defpackage.AbstractC10716e, defpackage.AbstractC13859e
    public void applovin() {
        Object c12763e;
        switch (this.f20423e) {
            case 0:
                super.applovin();
                try {
                    c12763e = this.f21115e;
                    if (c12763e == null) {
                        c12763e = null;
                    }
                    if (!(c12763e != null)) {
                        c12763e = null;
                    }
                } catch (Throwable th) {
                    c12763e = new C12763e(th);
                }
                ComposeView composeView = (ComposeView) ((View) (c12763e instanceof C12763e ? null : c12763e));
                if (composeView != null) {
                    composeView.appmetrica();
                    return;
                }
                return;
            default:
                super.applovin();
                Iterator it = mo1350super().iterator();
                while (it.hasNext()) {
                    ((AbstractC13859e) it.next()).applovin();
                }
                return;
        }
    }

    @Override // defpackage.AbstractC10716e
    /* renamed from: break */
    public String mo1348break() {
        return (String) this.f20425e;
    }

    @Override // defpackage.AbstractC13859e
    public void crashlytics() {
        switch (this.f20423e) {
            case 1:
                super.crashlytics();
                Iterator it = mo1350super().iterator();
                while (it.hasNext()) {
                    ((AbstractC13859e) it.next()).crashlytics();
                }
                return;
            default:
                super.crashlytics();
                return;
        }
    }

    /* renamed from: final */
    public abstract void mo212final(C13770e c13770e, int i);

    @Override // defpackage.AbstractC10716e, defpackage.AbstractC13859e
    public final void firebase() {
        switch (this.f20423e) {
            case 0:
                super.firebase();
                C0916e c0916e = (C0916e) this.f20424e;
                c0916e.license.setValue(Boolean.valueOf(AbstractC15933e.appmetrica.metrica));
                c0916e.metrica.setValue(AbstractC17202e.license(AbstractC15933e.appmetrica.metrica));
                return;
            default:
                super.firebase();
                Iterator it = mo1350super().iterator();
                while (it.hasNext()) {
                    ((AbstractC10716e) it.next()).firebase();
                }
                return;
        }
    }

    @Override // defpackage.AbstractC10716e, defpackage.AbstractC9019e
    /* renamed from: native */
    public void mo2515native(int i) {
        switch (this.f20423e) {
            case 0:
                ((C0916e) this.f20424e).ad.startapp(i);
                return;
            default:
                super.mo2515native(i);
                return;
        }
    }

    /* renamed from: new */
    public abstract List mo1349new();

    /* JADX WARN: Type inference failed for: r1v10, types: [eٕؔۦ, android.view.View, ua.itaysonlab.vkxreborn.ui.ThemedViewPager, java.lang.Object] */
    @Override // defpackage.AbstractC10716e
    /* renamed from: protected */
    public final View mo376protected(Context context, LayoutInflater layoutInflater) {
        switch (this.f20423e) {
            case 0:
                ComposeView composeView = new ComposeView(context, null, 6);
                composeView.setViewCompositionStrategy(new C0444e(this.f27449e));
                C0916e c0916e = (C0916e) this.f20424e;
                c0916e.license.setValue(Boolean.valueOf(AbstractC15933e.appmetrica.metrica));
                c0916e.metrica.setValue(AbstractC17202e.license(AbstractC15933e.appmetrica.metrica));
                composeView.setContent(new C2892e(-388723397, true, new C11684e(this, this, 0)));
                return composeView;
            default:
                if (mo1350super().size() != mo1349new().size()) {
                    throw new IllegalArgumentException("fragments.size != titles.size");
                }
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setFocusable(true);
                linearLayout.setClickable(true);
                Activity activity = (Activity) context;
                C5856e c5856e = new C5856e(activity);
                this.f20424e = c5856e;
                c5856e.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                C5856e c5856e2 = (C5856e) this.f20424e;
                if (c5856e2 == null) {
                    c5856e2 = null;
                }
                c5856e2.setId(R.id.tablayout);
                C5856e c5856e3 = (C5856e) this.f20424e;
                if (c5856e3 == null) {
                    c5856e3 = null;
                }
                c5856e3.setTabIndicatorFullWidth(false);
                c5856e3.setTabMode(0);
                c5856e3.setTabGravity(2);
                c5856e3.refreshTheme();
                ?? themedViewPager = new ThemedViewPager(activity, null);
                themedViewPager.f6464e = true;
                this.f20425e = themedViewPager;
                themedViewPager.setId(R.id.viewpager);
                C2608e c2608e = (C2608e) this.f20425e;
                if (c2608e == null) {
                    c2608e = null;
                }
                c2608e.setOffscreenPageLimit(mo1350super().size());
                C5856e c5856e4 = (C5856e) this.f20424e;
                if (c5856e4 == null) {
                    c5856e4 = null;
                }
                linearLayout.addView(c5856e4);
                C2608e c2608e2 = (C2608e) this.f20425e;
                if (c2608e2 == null) {
                    c2608e2 = null;
                }
                linearLayout.addView(c2608e2);
                if (mo1350super().size() == 1) {
                    C5856e c5856e5 = (C5856e) this.f20424e;
                    if (c5856e5 == null) {
                        c5856e5 = null;
                    }
                    c5856e5.setVisibility(8);
                }
                C5935e c5935e = new C5935e(this);
                C2608e c2608e3 = (C2608e) this.f20425e;
                if (c2608e3 == null) {
                    c2608e3 = null;
                }
                c2608e3.setAdapter(c5935e);
                C5856e c5856e6 = (C5856e) this.f20424e;
                if (c5856e6 == null) {
                    c5856e6 = null;
                }
                C2608e c2608e4 = (C2608e) this.f20425e;
                c5856e6.setupWithViewPager(c2608e4 != null ? c2608e4 : null);
                return linearLayout;
        }
    }

    /* renamed from: super */
    public abstract List mo1350super();

    @Override // defpackage.AbstractC10716e, defpackage.AbstractC9019e
    /* renamed from: this */
    public void mo1393this(int i) {
        switch (this.f20423e) {
            case 0:
                ((C0916e) this.f20424e).vip.startapp(i);
                return;
            default:
                super.mo1393this(i);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eۦؕ, java.lang.Object] */
    @Override // defpackage.AbstractC10716e, defpackage.AbstractC9019e
    /* renamed from: throw */
    public View mo2516throw(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.f20423e) {
            case 0:
                this.f21116e = new Object();
                View mo376protected = mo376protected(viewGroup.getContext(), layoutInflater);
                this.f21115e = mo376protected;
                mo376protected.setBackgroundColor(AbstractC15933e.ad(android.R.attr.windowBackground));
                View view = this.f21115e;
                if (view != null) {
                    return view;
                }
                return null;
            default:
                return super.mo2516throw(layoutInflater, viewGroup);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eۦؕ, java.lang.Object] */
    @Override // defpackage.AbstractC10716e
    /* renamed from: try */
    public AbstractC18491e mo216try() {
        switch (this.f20423e) {
            case 0:
                return new Object();
            default:
                return new C17256e(this, false, false, 126);
        }
    }
}
