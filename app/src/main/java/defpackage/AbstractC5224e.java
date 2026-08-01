package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.ui.ThemedViewPager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۢۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5224e extends AbstractC10716e implements InterfaceC9758e {

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final String f11120e = BuildConfig.FLAVOR;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public C6977e f11121e;

    @Override // defpackage.AbstractC13859e
    public void ads() {
        super.ads();
        Iterator it = mo373final().iterator();
        while (it.hasNext()) {
            ((AbstractC13859e) it.next()).ads();
        }
    }

    @Override // defpackage.AbstractC10716e, defpackage.AbstractC13859e
    public void applovin() {
        super.applovin();
        Iterator it = mo373final().iterator();
        while (it.hasNext()) {
            ((AbstractC13859e) it.next()).applovin();
        }
    }

    @Override // defpackage.AbstractC10716e
    /* renamed from: break */
    public final String mo1348break() {
        return this.f11120e;
    }

    @Override // defpackage.AbstractC10716e
    /* renamed from: case */
    public final void mo734case() {
    }

    @Override // defpackage.AbstractC13859e
    public final void crashlytics() {
        super.crashlytics();
        Iterator it = mo373final().iterator();
        while (it.hasNext()) {
            ((AbstractC13859e) it.next()).crashlytics();
        }
    }

    /* renamed from: final */
    public abstract List mo373final();

    @Override // defpackage.AbstractC10716e, defpackage.AbstractC13859e
    public void firebase() {
        super.firebase();
        Iterator it = mo373final().iterator();
        while (it.hasNext()) {
            ((AbstractC10716e) it.next()).firebase();
        }
    }

    /* renamed from: new */
    public abstract List mo374new();

    /* JADX WARN: Type inference failed for: r4v4, types: [eؙؚٕ, android.view.View, ua.itaysonlab.vkxreborn.ui.ThemedViewPager] */
    @Override // defpackage.AbstractC10716e
    /* renamed from: protected */
    public View mo376protected(Context context, LayoutInflater layoutInflater) {
        if (mo373final().size() != mo374new().size()) {
            throw new IllegalArgumentException("fragments.size != titles.size");
        }
        ?? themedViewPager = new ThemedViewPager((Activity) context, null);
        themedViewPager.f14293e = true;
        this.f11121e = themedViewPager;
        themedViewPager.setId(R.id.viewpager);
        C6977e c6977e = this.f11121e;
        if (c6977e == null) {
            c6977e = null;
        }
        c6977e.setOffscreenPageLimit(mo373final().size());
        C5935e c5935e = new C5935e(this);
        C6977e c6977e2 = this.f11121e;
        if (c6977e2 == null) {
            c6977e2 = null;
        }
        c6977e2.setAdapter(c5935e);
        C6977e c6977e3 = this.f11121e;
        if (c6977e3 == null) {
            c6977e3 = null;
        }
        c6977e3.addOnPageChangeListener(new C11595e(this));
        C6977e c6977e4 = this.f11121e;
        if (c6977e4 == null) {
            c6977e4 = null;
        }
        c6977e4.setCurrentItem(mo1775super(), false);
        C6977e c6977e5 = this.f11121e;
        if (c6977e5 != null) {
            return c6977e5;
        }
        return null;
    }

    public void purchase() {
        List mo373final = mo373final();
        C6977e c6977e = this.f11121e;
        if (c6977e == null) {
            c6977e = null;
        }
        Object m3592native = AbstractC13480e.m3592native(c6977e.getCurrentItem(), mo373final);
        InterfaceC9758e interfaceC9758e = m3592native instanceof InterfaceC9758e ? (InterfaceC9758e) m3592native : null;
        if (interfaceC9758e != null) {
            interfaceC9758e.purchase();
        }
    }

    /* renamed from: strictfp */
    public void mo377strictfp(int i, float f) {
        AbstractC18491e abstractC18491e = this.f21116e;
        if (abstractC18491e == null) {
            abstractC18491e = null;
        }
        ((C17954e) abstractC18491e).loadAd(i, f);
    }

    /* renamed from: super, reason: not valid java name */
    public int mo1775super() {
        return 0;
    }

    @Override // defpackage.AbstractC10716e
    /* renamed from: try */
    public AbstractC18491e mo216try() {
        return new C17954e(mo374new(), false, new C0609e(17, this));
    }
}
