package defpackage;

import android.view.MenuInflater;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12364e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f24785e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f24786e = false;

    public abstract void Signature(int i);

    public abstract Object adcel();

    public abstract void admob(CharSequence charSequence);

    public abstract void amazon(int i);

    public abstract MenuInflater appmetrica();

    public abstract CharSequence billing();

    public abstract MenuC8939e license();

    public abstract void loadAd(CharSequence charSequence);

    public abstract View metrica();

    public abstract boolean mopub();

    public abstract CharSequence purchase();

    public abstract void smaato(View view);

    public abstract void startapp();

    public abstract void subscription(boolean z);

    public abstract void vip();

    public Object yandex() {
        if (!this.f24786e) {
            this.f24785e = adcel();
            this.f24786e = true;
        }
        return this.f24785e;
    }
}
