package defpackage;

import android.animation.ObjectAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۗٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14913e extends AbstractC11130e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public ObjectAnimator f29558e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public float f29559e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f29560e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C1681e f29561e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public ObjectAnimator f29562e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public float f29563e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C12780e f29564e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C17633e f29565e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final int[] f29554e = {0, 1350, 2700, 4050};

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final int[] f29553e = {667, 2017, 3367, 4717};

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final int[] f29555e = {1000, 2350, 3700, 5050};

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C9184e f29556e = new C9184e(5, Float.class, "animationFraction");

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C9184e f29557e = new C9184e(6, Float.class, "completeEndFraction");

    public C14913e(C12780e c12780e) {
        super(11);
        this.f29560e = 0;
        this.f29561e = null;
        this.f29564e = c12780e;
        this.f29565e = new C17633e(1);
    }

    /* renamed from: eِٜ٘, reason: contains not printable characters */
    public final void m3888e() {
        int i = 0;
        if (this.f29562e == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f29556e, 0.0f, 1.0f);
            this.f29562e = ofFloat;
            ofFloat.setDuration(5400L);
            this.f29562e.setInterpolator(null);
            this.f29562e.setRepeatCount(-1);
            this.f29562e.addListener(new C10141e(this, i));
        }
        if (this.f29558e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f29557e, 0.0f, 1.0f);
            this.f29558e = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f29558e.setInterpolator(this.f29565e);
            this.f29558e.addListener(new C10141e(this, 1));
        }
        this.f29560e = 0;
        ((C11638e) ((ArrayList) this.f22046e).get(0)).metrica = this.f29564e.metrica[0];
        this.f29559e = 0.0f;
        this.f29562e.start();
    }
}
