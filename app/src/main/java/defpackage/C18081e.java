package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Le٘ۢٚ;", "Leٕٓؓ;", "Leٌؗۘ;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: e٘ۢٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
final class C18081e extends AbstractC13992e<C8512e> {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final long f35454e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final float f35455e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Function0 f35456e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final float f35457e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Function0 f35458e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C13121e f35459e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final float f35460e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Function0 f35461e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final float f35462e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Function0 f35463e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C13121e f35464e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final long f35465e;

    public C18081e(float f, float f2, float f3, float f4, long j, long j2, C13121e c13121e, C13121e c13121e2, Function0 function0, Function0 function02, Function0 function03, Function0 function04) {
        this.f35463e = function0;
        this.f35458e = function02;
        this.f35456e = function03;
        this.f35461e = function04;
        this.f35454e = j;
        this.f35465e = j2;
        this.f35464e = c13121e;
        this.f35459e = c13121e2;
        this.f35462e = f;
        this.f35457e = f2;
        this.f35460e = f3;
        this.f35455e = f4;
    }

    @Override // defpackage.AbstractC13992e
    /* renamed from: Signature, reason: from getter */
    public final float getF35457e() {
        return this.f35457e;
    }

    @Override // defpackage.AbstractC13992e
    /* renamed from: adcel, reason: from getter */
    public final long getF35454e() {
        return this.f35454e;
    }

    @Override // defpackage.AbstractC13992e
    /* renamed from: advert, reason: from getter */
    public final C13121e getF35464e() {
        return this.f35464e;
    }

    @Override // defpackage.AbstractC13992e
    /* renamed from: amazon, reason: from getter */
    public final C13121e getF35459e() {
        return this.f35459e;
    }

    @Override // defpackage.AbstractC13992e
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof C18081e)) {
            return this.f35455e == ((C18081e) obj).f35455e;
        }
        return false;
    }

    @Override // defpackage.AbstractC13992e
    public final int hashCode() {
        return Float.floatToIntBits(this.f35455e) + (super.hashCode() * 31);
    }

    @Override // defpackage.AbstractC13992e
    /* renamed from: loadAd, reason: from getter */
    public final float getF35460e() {
        return this.f35460e;
    }

    @Override // defpackage.AbstractC13992e
    /* renamed from: mopub, reason: from getter */
    public final float getF35462e() {
        return this.f35462e;
    }

    @Override // defpackage.AbstractC13992e
    /* renamed from: smaato, reason: from getter */
    public final long getF35465e() {
        return this.f35465e;
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C8512e(this.f35455e, this.f35462e, this.f35457e, this.f35460e, this.f35454e, this.f35465e, this.f35464e, this.f35459e, this.f35463e, this.f35458e, this.f35456e, this.f35461e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C8512e c8512e = (C8512e) abstractC13616e;
        admob(c8512e);
        c8512e.f17316e = this.f35463e;
        c8512e.f17314e = this.f35458e;
        c8512e.f17317e = this.f35456e;
        c8512e.f17313e = this.f35461e;
        float f = this.f35455e;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (c8512e.f17319e == f) {
            return;
        }
        c8512e.f17319e = f;
        c8512e.mo1473e();
    }
}
