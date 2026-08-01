package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.mediarouter.app.license;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٗۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11792e extends Animation {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f23662e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f23663e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ View f23664e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23665e;

    public /* synthetic */ C11792e(int i, int i2, int i3, View view) {
        this.f23665e = i3;
        this.f23663e = i;
        this.f23662e = i2;
        this.f23664e = view;
    }

    public C11792e(C6559e c6559e, int i, int i2) {
        this.f23665e = 2;
        this.f23664e = c6559e;
        this.f23663e = i;
        this.f23662e = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.f23665e;
        int i2 = this.f23662e;
        int i3 = this.f23663e;
        View view = this.f23664e;
        switch (i) {
            case 0:
                license.subscription(view, i3 - ((int) ((i3 - i2) * f)));
                return;
            case 1:
                int i4 = i2 + ((int) ((i3 - i2) * f));
                int i5 = DialogC1747e.f4748e;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i4;
                view.setLayoutParams(layoutParams);
                return;
            default:
                ((C6559e) view).f13513e.setAlpha((int) (((i2 - i3) * f) + i3));
                return;
        }
    }
}
