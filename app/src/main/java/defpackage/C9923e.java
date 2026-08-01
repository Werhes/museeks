package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۧٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9923e extends AbstractC12364e implements InterfaceC18087e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C18540e f19623e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Context f19624e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public MenuC8939e f19625e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public ActionBarContextView f19626e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f19627e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public WeakReference f19628e;

    @Override // defpackage.AbstractC12364e
    public final void Signature(int i) {
        admob(this.f19624e.getString(i));
    }

    @Override // defpackage.InterfaceC18087e
    public final boolean ad(MenuC8939e menuC8939e, MenuItem menuItem) {
        return ((C11106e) this.f19623e.f36383e).m3011import(this, menuItem);
    }

    @Override // defpackage.AbstractC12364e
    public final void admob(CharSequence charSequence) {
        this.f19626e.setTitle(charSequence);
    }

    @Override // defpackage.InterfaceC18087e
    public final void advert(MenuC8939e menuC8939e) {
        startapp();
        C13631e c13631e = this.f19626e.f114e;
        if (c13631e != null) {
            c13631e.advert();
        }
    }

    @Override // defpackage.AbstractC12364e
    public final void amazon(int i) {
        loadAd(this.f19624e.getString(i));
    }

    @Override // defpackage.AbstractC12364e
    public final MenuInflater appmetrica() {
        return new C17683e(this.f19626e.getContext());
    }

    @Override // defpackage.AbstractC12364e
    public final CharSequence billing() {
        return this.f19626e.getTitle();
    }

    @Override // defpackage.AbstractC12364e
    public final MenuC8939e license() {
        return this.f19625e;
    }

    @Override // defpackage.AbstractC12364e
    public final void loadAd(CharSequence charSequence) {
        this.f19626e.setSubtitle(charSequence);
    }

    @Override // defpackage.AbstractC12364e
    public final View metrica() {
        WeakReference weakReference = this.f19628e;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.AbstractC12364e
    public final boolean mopub() {
        return this.f19626e.f113e;
    }

    @Override // defpackage.AbstractC12364e
    public final CharSequence purchase() {
        return this.f19626e.getSubtitle();
    }

    @Override // defpackage.AbstractC12364e
    public final void smaato(View view) {
        this.f19626e.setCustomView(view);
        this.f19628e = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.AbstractC12364e
    public final void startapp() {
        this.f19623e.m4582super(this, this.f19625e);
    }

    @Override // defpackage.AbstractC12364e
    public final void subscription(boolean z) {
        this.f24786e = z;
        this.f19626e.setTitleOptional(z);
    }

    @Override // defpackage.AbstractC12364e
    public final void vip() {
        if (this.f19627e) {
            return;
        }
        this.f19627e = true;
        this.f19623e.m4571final(this);
    }
}
