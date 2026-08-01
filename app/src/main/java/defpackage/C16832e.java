package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٗۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16832e extends AbstractC5133e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C0576e f32969e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public boolean f32970e;

    public C16832e(Context context) {
        super(context, null);
        this.f32969e = AbstractC14533e.startapp(C14155e.vip);
    }

    @Override // defpackage.AbstractC5133e
    public final void ad(C13770e c13770e, int i) {
        c13770e.m3671package(576708319);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            ((Function2) this.f32969e.getValue()).invoke(c13770e, 0);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C17689e(this, i, 5);
        }
    }

    @Override // defpackage.AbstractC5133e
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f32970e;
    }
}
