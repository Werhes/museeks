package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٜۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6608e extends Animatable2.AnimationCallback {
    public final /* synthetic */ Function0 ad;
    public final /* synthetic */ Function0 vip;

    public C6608e(Function0 function0, Function0 function02) {
        this.ad = function0;
        this.vip = function02;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        Function0 function0 = this.vip;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        Function0 function0 = this.ad;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
