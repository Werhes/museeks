package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leؘِؗ;", "Leِٝؓ;", "Leُٕ۟;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؘِؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11552e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Function1 f23195e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final float f23196e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final float f23197e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final float f23198e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float f23199e;

    public C11552e(float f, float f2, float f3, float f4, Function1 function1) {
        this.f23199e = f;
        this.f23197e = f2;
        this.f23196e = f3;
        this.f23198e = f4;
        this.f23195e = function1;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            AbstractC9534e.ad("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        C11552e c11552e = obj instanceof C11552e ? (C11552e) obj : null;
        return c11552e != null && C15765e.vip(this.f23199e, c11552e.f23199e) && C15765e.vip(this.f23197e, c11552e.f23197e) && C15765e.vip(this.f23196e, c11552e.f23196e) && C15765e.vip(this.f23198e, c11552e.f23198e);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f23198e) + AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.f23199e) * 31, this.f23197e, 31), this.f23196e, 31)) * 31) + 1231;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eُٕ۟, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f31027e = this.f23199e;
        abstractC13616e.f31028e = this.f23197e;
        abstractC13616e.f31026e = this.f23196e;
        abstractC13616e.f31025e = this.f23198e;
        abstractC13616e.f31029e = true;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C15755e c15755e = (C15755e) abstractC13616e;
        c15755e.f31027e = this.f23199e;
        c15755e.f31028e = this.f23197e;
        c15755e.f31026e = this.f23196e;
        c15755e.f31025e = this.f23198e;
        c15755e.f31029e = true;
    }
}
