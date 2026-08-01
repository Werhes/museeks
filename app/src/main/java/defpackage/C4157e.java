package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٗٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4157e extends AbstractC11409e {

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public final float[] f9169e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public Function1 f9170e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public Function0 f9171e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public float f9172e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public final C17166e f9173e;

    public C4157e(float f, float f2, float f3, float f4, long j, long j2, C13121e c13121e, C13121e c13121e2, Function0 function0, Function1 function1) {
        super(j, j2, c13121e, c13121e2, f2, f3, f4);
        this.f9171e = function0;
        this.f9170e = function1;
        this.f9172e = f;
        this.f9169e = new float[]{0.0f, 0.0f};
        C17166e c17166e = new C17166e(new C8953e(), new C1482e(this, 1));
        m2050e(c17166e);
        this.f9173e = c17166e;
    }

    @Override // defpackage.AbstractC11409e
    /* renamed from: eؚٜ۠, reason: contains not printable characters */
    public final void mo1473e() {
        this.f9173e.m4273e();
    }

    /* renamed from: eٌۘۤ, reason: contains not printable characters */
    public final float[] m1474e() {
        float[] fArr = this.f9169e;
        fArr[0] = 0.0f;
        float floatValue = ((Number) this.f9171e.invoke()).floatValue();
        float f = floatValue >= 0.0f ? floatValue : 0.0f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        fArr[1] = f;
        return fArr;
    }

    @Override // defpackage.AbstractC11409e
    /* renamed from: eٖٔۧ, reason: contains not printable characters */
    public final void mo1475e() {
        AbstractC12640e.advert(this.f9173e);
    }
}
