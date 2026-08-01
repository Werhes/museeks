package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۦٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3760e extends Drawable.ConstantState {
    public int ad;
    public boolean adcel;
    public Paint advert;
    public boolean appmetrica;
    public ColorStateList billing;
    public PorterDuff.Mode license;
    public ColorStateList metrica;
    public boolean mopub;
    public Bitmap purchase;
    public int startapp;
    public C18448e vip;
    public PorterDuff.Mode yandex;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.ad;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C2955e(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C2955e(this);
    }
}
