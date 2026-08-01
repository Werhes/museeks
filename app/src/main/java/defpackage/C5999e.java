package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؘۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5999e extends AbstractC12364e implements InterfaceC18087e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C18540e f12637e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Context f12638e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final MenuC8939e f12639e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C0573e f12640e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public WeakReference f12641e;

    public C5999e(C0573e c0573e, Context context, C18540e c18540e) {
        this.f12640e = c0573e;
        this.f12638e = context;
        this.f12637e = c18540e;
        MenuC8939e menuC8939e = new MenuC8939e(context);
        menuC8939e.f17927e = 1;
        this.f12639e = menuC8939e;
        menuC8939e.f17925e = this;
    }

    @Override // defpackage.AbstractC12364e
    public final void Signature(int i) {
        admob(this.f12640e.subscription.getResources().getString(i));
    }

    @Override // defpackage.InterfaceC18087e
    public final boolean ad(MenuC8939e menuC8939e, MenuItem menuItem) {
        C18540e c18540e = this.f12637e;
        if (c18540e != null) {
            return ((C11106e) c18540e.f36383e).m3011import(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.AbstractC12364e
    public final void admob(CharSequence charSequence) {
        this.f12640e.isVip.setTitle(charSequence);
    }

    @Override // defpackage.InterfaceC18087e
    public final void advert(MenuC8939e menuC8939e) {
        if (this.f12637e == null) {
            return;
        }
        startapp();
        C13631e c13631e = this.f12640e.isVip.f114e;
        if (c13631e != null) {
            c13631e.advert();
        }
    }

    @Override // defpackage.AbstractC12364e
    public final void amazon(int i) {
        loadAd(this.f12640e.subscription.getResources().getString(i));
    }

    @Override // defpackage.AbstractC12364e
    public final MenuInflater appmetrica() {
        return new C17683e(this.f12638e);
    }

    @Override // defpackage.AbstractC12364e
    public final CharSequence billing() {
        return this.f12640e.isVip.getTitle();
    }

    @Override // defpackage.AbstractC12364e
    public final MenuC8939e license() {
        return this.f12639e;
    }

    @Override // defpackage.AbstractC12364e
    public final void loadAd(CharSequence charSequence) {
        this.f12640e.isVip.setSubtitle(charSequence);
    }

    @Override // defpackage.AbstractC12364e
    public final View metrica() {
        WeakReference weakReference = this.f12641e;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.AbstractC12364e
    public final boolean mopub() {
        return this.f12640e.isVip.f113e;
    }

    @Override // defpackage.AbstractC12364e
    public final CharSequence purchase() {
        return this.f12640e.isVip.getSubtitle();
    }

    @Override // defpackage.AbstractC12364e
    public final void smaato(View view) {
        this.f12640e.isVip.setCustomView(view);
        this.f12641e = new WeakReference(view);
    }

    @Override // defpackage.AbstractC12364e
    public final void startapp() {
        if (this.f12640e.applovin != this) {
            return;
        }
        MenuC8939e menuC8939e = this.f12639e;
        menuC8939e.isVip();
        try {
            this.f12637e.m4582super(this, menuC8939e);
        } finally {
            menuC8939e.tapsense();
        }
    }

    @Override // defpackage.AbstractC12364e
    public final void subscription(boolean z) {
        this.f24786e = z;
        this.f12640e.isVip.setTitleOptional(z);
    }

    @Override // defpackage.AbstractC12364e
    public final void vip() {
        C0573e c0573e = this.f12640e;
        if (c0573e.applovin != this) {
            return;
        }
        if (c0573e.f2758interface) {
            c0573e.ads = this;
            c0573e.premium = this.f12637e;
        } else {
            this.f12637e.m4571final(this);
        }
        this.f12637e = null;
        c0573e.appmetrica(false);
        ActionBarContextView actionBarContextView = c0573e.isVip;
        if (actionBarContextView.f112e == null) {
            actionBarContextView.appmetrica();
        }
        c0573e.pro.setHideOnContentScrollEnabled(c0573e.f2762throw);
        c0573e.applovin = null;
    }
}
