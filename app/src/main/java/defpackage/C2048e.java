package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leؓۘۛ;", "Leِٝؓ;", "Leٔؓۨ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؓۘۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C2048e extends AbstractC11865e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final float f5332e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C13415e f5333e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f5334e;

    public C2048e(int i, C13415e c13415e, float f) {
        this.f5334e = i;
        this.f5333e = c13415e;
        this.f5332e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2048e)) {
            return false;
        }
        C2048e c2048e = (C2048e) obj;
        return this.f5334e == c2048e.f5334e && AbstractC7890e.billing(this.f5333e, c2048e.f5333e) && C15765e.vip(this.f5332e, c2048e.f5332e);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f5332e) + ((this.f5333e.hashCode() + (((-2147476239) + this.f5334e) * 31)) * 31);
    }

    public final String toString() {
        return "MarqueeModifierElement(iterations=2147483647, animationMode=Immediately, delayMillis=1200, initialDelayMillis=" + this.f5334e + ", spacing=" + this.f5333e + ", velocity=" + ((Object) C15765e.metrica(this.f5332e)) + ')';
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C14478e(this.f5334e, this.f5333e, this.f5332e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C14478e c14478e = (C14478e) abstractC13616e;
        c14478e.f28613e.setValue(this.f5333e);
        c14478e.f28615e.setValue(new Object());
        int i = c14478e.f28610e;
        int i2 = this.f5334e;
        float f = this.f5332e;
        if (i == i2 && C15765e.vip(c14478e.f28611e, f)) {
            return;
        }
        c14478e.f28610e = i2;
        c14478e.f28611e = f;
        c14478e.m3806e();
    }
}
