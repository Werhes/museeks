package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.mediarouter.app.appmetrica;
import androidx.mediarouter.app.billing;
import androidx.mediarouter.app.purchase;
import androidx.recyclerview.widget.loadAd;
import androidx.recyclerview.widget.startapp;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۜۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3654e extends startapp {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final LayoutInflater f8212e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final /* synthetic */ DialogC1747e f8213e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final AccelerateDecelerateInterpolator f8214e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C14396e f8215e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final Drawable f8216e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final int f8217e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final ArrayList f8218e = new ArrayList();

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final Drawable f8219e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Drawable f8220e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Drawable f8221e;

    public C3654e(DialogC1747e dialogC1747e) {
        this.f8213e = dialogC1747e;
        Context context = dialogC1747e.f4761e;
        this.f8212e = LayoutInflater.from(context);
        this.f8221e = AbstractC12992e.appmetrica(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f8220e = AbstractC12992e.appmetrica(context, R.attr.mediaRouteTvIconDrawable);
        this.f8216e = AbstractC12992e.appmetrica(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.f8219e = AbstractC12992e.appmetrica(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        this.f8217e = context.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
        this.f8214e = new AccelerateDecelerateInterpolator();
        crashlytics();
    }

    public final void ads(View view, int i) {
        C11792e c11792e = new C11792e(i, view.getLayoutParams().height, 1, view);
        c11792e.setAnimationListener(new AnimationAnimationListenerC14540e(2, this));
        c11792e.setDuration(this.f8217e);
        c11792e.setInterpolator(this.f8214e);
        view.startAnimation(c11792e);
    }

    @Override // androidx.recyclerview.widget.startapp
    public final void applovin(loadAd loadad) {
        this.f8213e.f4778e.values().remove(loadad);
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int billing() {
        return this.f8218e.size() + 1;
    }

    public final void crashlytics() {
        ArrayList arrayList = this.f8218e;
        arrayList.clear();
        DialogC1747e dialogC1747e = this.f8213e;
        ArrayList arrayList2 = dialogC1747e.f4750e;
        Context context = dialogC1747e.f4761e;
        ArrayList arrayList3 = dialogC1747e.f4751e;
        this.f8215e = new C14396e(1, dialogC1747e.f4752e);
        ArrayList arrayList4 = dialogC1747e.f4769e;
        if (arrayList4.isEmpty()) {
            arrayList.add(new C14396e(3, dialogC1747e.f4752e));
        } else {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                arrayList.add(new C14396e(3, (C6541e) it.next()));
            }
        }
        boolean z = false;
        if (!arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                C6541e c6541e = (C6541e) it2.next();
                if (!arrayList4.contains(c6541e)) {
                    if (!z2) {
                        dialogC1747e.f4752e.getClass();
                        AbstractC16709e vip = C6541e.vip();
                        String adcel = vip != null ? vip.adcel() : null;
                        if (TextUtils.isEmpty(adcel)) {
                            adcel = context.getString(R.string.mr_dialog_groupable_header);
                        }
                        arrayList.add(new C14396e(2, adcel));
                        z2 = true;
                    }
                    arrayList.add(new C14396e(3, c6541e));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C6541e c6541e2 = (C6541e) it3.next();
                C6541e c6541e3 = dialogC1747e.f4752e;
                if (c6541e3 != c6541e2) {
                    if (!z) {
                        c6541e3.getClass();
                        AbstractC16709e vip2 = C6541e.vip();
                        String mopub = vip2 != null ? vip2.mopub() : null;
                        if (TextUtils.isEmpty(mopub)) {
                            mopub = context.getString(R.string.mr_dialog_transferable_header);
                        }
                        arrayList.add(new C14396e(2, mopub));
                        z = true;
                    }
                    arrayList.add(new C14396e(4, c6541e2));
                }
            }
        }
        subs();
    }

    public final Drawable premium(C6541e c6541e) {
        Uri uri = c6541e.purchase;
        if (uri != null) {
            try {
                Drawable createFromStream = Drawable.createFromStream(this.f8213e.f4761e.getContentResolver().openInputStream(uri), null);
                if (createFromStream != null) {
                    return createFromStream;
                }
            } catch (IOException e) {
                Log.w("MediaRouteCtrlDialog", "Failed to load " + uri, e);
            }
        }
        int i = c6541e.amazon;
        return i != 1 ? i != 2 ? c6541e.appmetrica() ? this.f8219e : this.f8221e : this.f8216e : this.f8220e;
    }

    @Override // androidx.recyclerview.widget.startapp
    public final void remoteconfig(loadAd loadad, int i) {
        C14756e ad;
        C7712e c7712e;
        ArrayList arrayList = this.f8218e;
        int i2 = (i == 0 ? this.f8215e : (C14396e) arrayList.get(i - 1)).vip;
        C14396e c14396e = i == 0 ? this.f8215e : (C14396e) arrayList.get(i - 1);
        DialogC1747e dialogC1747e = this.f8213e;
        int i3 = 0;
        if (i2 == 1) {
            dialogC1747e.f4778e.put(((C6541e) c14396e.ad).metrica, (appmetrica) loadad);
            purchase purchaseVar = (purchase) loadad;
            View view = purchaseVar.ad;
            DialogC1747e dialogC1747e2 = purchaseVar.ads.f8213e;
            if (dialogC1747e2.f4788e && DesugarCollections.unmodifiableList(dialogC1747e2.f4752e.tapsense).size() > 1) {
                i3 = purchaseVar.applovin;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i3;
            view.setLayoutParams(layoutParams);
            C6541e c6541e = (C6541e) c14396e.ad;
            purchaseVar.remoteconfig(c6541e);
            purchaseVar.isPro.setText(c6541e.license);
            return;
        }
        if (i2 == 2) {
            ((C10485e) loadad).signatures.setText(c14396e.ad.toString());
            return;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                throw new IllegalStateException();
            }
            C9224e c9224e = (C9224e) loadad;
            View view2 = c9224e.signatures;
            C6541e c6541e2 = (C6541e) c14396e.ad;
            c9224e.applovin = c6541e2;
            ImageView imageView = c9224e.tapsense;
            imageView.setVisibility(0);
            c9224e.isVip.setVisibility(4);
            C3654e c3654e = c9224e.ads;
            List unmodifiableList = DesugarCollections.unmodifiableList(c3654e.f8213e.f4752e.tapsense);
            view2.setAlpha((unmodifiableList.size() == 1 && unmodifiableList.get(0) == c6541e2) ? c9224e.isPro : 1.0f);
            view2.setOnClickListener(new ViewOnClickListenerC8021e(5, c9224e));
            imageView.setImageDrawable(c3654e.premium(c6541e2));
            c9224e.inmobi.setText(c6541e2.license);
            return;
        }
        dialogC1747e.f4778e.put(((C6541e) c14396e.ad).metrica, (appmetrica) loadad);
        billing billingVar = (billing) loadad;
        float f = billingVar.firebase;
        ViewOnClickListenerC8021e viewOnClickListenerC8021e = billingVar.f472interface;
        ImageView imageView2 = billingVar.applovin;
        View view3 = billingVar.isPro;
        CheckBox checkBox = billingVar.crashlytics;
        C6541e c6541e3 = (C6541e) c14396e.ad;
        C3654e c3654e2 = billingVar.f471goto;
        DialogC1747e dialogC1747e3 = c3654e2.f8213e;
        if (c6541e3 == dialogC1747e3.f4752e && DesugarCollections.unmodifiableList(c6541e3.tapsense).size() > 0) {
            Iterator it = DesugarCollections.unmodifiableList(c6541e3.tapsense).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C6541e c6541e4 = (C6541e) it.next();
                if (!dialogC1747e3.f4751e.contains(c6541e4)) {
                    c6541e3 = c6541e4;
                    break;
                }
            }
        }
        billingVar.remoteconfig(c6541e3);
        imageView2.setImageDrawable(c3654e2.premium(c6541e3));
        billingVar.premium.setText(c6541e3.license);
        checkBox.setVisibility(0);
        boolean signatures = billingVar.signatures(c6541e3);
        boolean z = !dialogC1747e3.f4754e.contains(c6541e3) && (!billingVar.signatures(c6541e3) || DesugarCollections.unmodifiableList(dialogC1747e3.f4752e.tapsense).size() >= 2) && !(billingVar.signatures(c6541e3) && ((ad = dialogC1747e3.f4752e.ad()) == null || (c7712e = (C7712e) ad.inmobi.get(c6541e3.metrica)) == null || !c7712e.metrica));
        checkBox.setChecked(signatures);
        billingVar.ads.setVisibility(4);
        imageView2.setVisibility(0);
        view3.setEnabled(z);
        checkBox.setEnabled(z);
        billingVar.tapsense.setEnabled(z || signatures);
        billingVar.isVip.setEnabled(z || signatures);
        view3.setOnClickListener(viewOnClickListenerC8021e);
        checkBox.setOnClickListener(viewOnClickListenerC8021e);
        RelativeLayout relativeLayout = billingVar.subs;
        if (signatures && !billingVar.signatures.appmetrica()) {
            i3 = billingVar.f470class;
        }
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.height = i3;
        relativeLayout.setLayoutParams(layoutParams2);
        view3.setAlpha((z || signatures) ? 1.0f : f);
        checkBox.setAlpha((z || !signatures) ? 1.0f : f);
    }

    @Override // androidx.recyclerview.widget.startapp
    public final loadAd signatures(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.f8212e;
        if (i == 1) {
            return new purchase(this, layoutInflater.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
        }
        if (i == 2) {
            return new C10485e(layoutInflater.inflate(R.layout.mr_cast_header_item, viewGroup, false));
        }
        if (i == 3) {
            return new billing(this, layoutInflater.inflate(R.layout.mr_cast_route_item, viewGroup, false));
        }
        if (i == 4) {
            return new C9224e(this, layoutInflater.inflate(R.layout.mr_cast_group_item, viewGroup, false));
        }
        throw new IllegalStateException();
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int startapp(int i) {
        C14396e c14396e;
        if (i == 0) {
            c14396e = this.f8215e;
        } else {
            c14396e = (C14396e) this.f8218e.get(i - 1);
        }
        return c14396e.vip;
    }

    public final void subs() {
        DialogC1747e dialogC1747e = this.f8213e;
        ArrayList arrayList = dialogC1747e.f4754e;
        arrayList.clear();
        ArrayList arrayList2 = dialogC1747e.f4751e;
        ArrayList arrayList3 = new ArrayList();
        C14756e ad = dialogC1747e.f4752e.ad();
        if (ad != null) {
            C9701e c9701e = dialogC1747e.f4752e.ad;
            c9701e.getClass();
            C10085e.vip();
            for (C6541e c6541e : DesugarCollections.unmodifiableList(c9701e.vip)) {
                if (ad.loadAd(c6541e)) {
                    arrayList3.add(c6541e);
                }
            }
        }
        HashSet hashSet = new HashSet(arrayList2);
        hashSet.removeAll(arrayList3);
        arrayList.addAll(hashSet);
        adcel();
    }
}
