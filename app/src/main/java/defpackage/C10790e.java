package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؕۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10790e extends AbstractC16425e {
    public final ObjectAnimator appmetrica;
    public final boolean purchase;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.animation.TimeInterpolator, eٕؑٔ, java.lang.Object] */
    public C10790e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        ?? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.vip = numberOfFrames2;
        int[] iArr = obj.ad;
        if (iArr == null || iArr.length < numberOfFrames2) {
            obj.ad = new int[numberOfFrames2];
        }
        int[] iArr2 = obj.ad;
        int i3 = 0;
        for (int i4 = 0; i4 < numberOfFrames2; i4++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames2 - i4) - 1 : i4);
            iArr2[i4] = duration;
            i3 += duration;
        }
        obj.metrica = i3;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        ofInt.setAutoCancel(true);
        ofInt.setDuration(obj.metrica);
        ofInt.setInterpolator(obj);
        this.purchase = z2;
        this.appmetrica = ofInt;
    }

    @Override // defpackage.AbstractC16425e
    public final boolean ad() {
        return this.purchase;
    }

    @Override // defpackage.AbstractC16425e
    public final void billing() {
        this.appmetrica.reverse();
    }

    @Override // defpackage.AbstractC16425e
    public final void startapp() {
        this.appmetrica.cancel();
    }

    @Override // defpackage.AbstractC16425e
    public final void yandex() {
        this.appmetrica.start();
    }
}
