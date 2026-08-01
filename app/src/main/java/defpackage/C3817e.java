package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؑٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3817e extends ActionMode {
    public final Context ad;
    public final AbstractC12364e vip;

    public C3817e(Context context, AbstractC12364e abstractC12364e) {
        this.ad = context;
        this.vip = abstractC12364e;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.vip.vip();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.vip.metrica();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC15372e(this.ad, this.vip.license());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.vip.appmetrica();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.vip.purchase();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.vip.f24785e;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.vip.billing();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.vip.f24786e;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.vip.startapp();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.vip.mopub();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.vip.smaato(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.vip.amazon(i);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.vip.loadAd(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.vip.f24785e = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.vip.Signature(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.vip.admob(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.vip.subscription(z);
    }
}
