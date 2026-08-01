package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13859e implements InterfaceC16400e, InterfaceC0816e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static int f27444e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C13462e f27445e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public View f27446e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C1059e f27447e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f27448e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C4891e f27449e = new C4891e(this, true);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int[] f27450e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Context f27451e;

    public AbstractC13859e(Object... objArr) {
        int i = f27444e;
        f27444e = i + 1;
        this.f27448e = i;
        this.f27450e = new int[4];
        if (objArr.length != 0) {
            throw new RuntimeException("Wrong number of arguments, should be 0! (Override this constuctor(Object...) to prevent mistakes)");
        }
    }

    public void ads() {
        this.f27449e.appmetrica(EnumC14621e.ON_PAUSE);
    }

    public abstract void applovin();

    @Override // defpackage.InterfaceC0816e
    public final C13462e billing() {
        if (this.f27447e == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f27445e == null) {
            this.f27445e = new C13462e();
        }
        return this.f27445e;
    }

    /* renamed from: class */
    public abstract void mo1847class(View view);

    public void crashlytics() {
        this.f27449e.appmetrica(EnumC14621e.ON_RESUME);
    }

    public abstract void firebase();

    /* renamed from: interface, reason: not valid java name */
    public final void m3686interface(C1059e c1059e) {
        this.f27447e = c1059e;
        Activity billing = C1059e.billing(c1059e.getContext());
        if (billing != null) {
            this.f27451e = billing;
        } else {
            this.f27451e = c1059e.getContext();
        }
    }

    public abstract View isPro(ViewGroup viewGroup);

    public void isVip() {
    }

    public void premium() {
        EnumC14621e enumC14621e = EnumC14621e.ON_CREATE;
        C4891e c4891e = this.f27449e;
        c4891e.appmetrica(enumC14621e);
        c4891e.appmetrica(EnumC14621e.ON_START);
    }

    public final Activity pro() {
        Context context = this.f27451e;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public final InterfaceC17022e remoteconfig() {
        C1059e c1059e = this.f27447e;
        InterfaceC17022e instanceDefaultTransitionTransformer = c1059e != null ? c1059e.getInstanceDefaultTransitionTransformer() : null;
        return instanceDefaultTransitionTransformer != null ? instanceDefaultTransitionTransformer : C1059e.getDefaultTransformer();
    }

    public void subs(int i, String[] strArr, int[] iArr) {
    }

    public boolean tapsense() {
        return this instanceof C16929e;
    }

    @Override // defpackage.InterfaceC16400e
    public final AbstractC0003e vip() {
        return this.f27449e;
    }
}
