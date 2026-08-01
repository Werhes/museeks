package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٔۧؕ;", "Leٕٓؓ;", "Leؖٗٓ;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٔۧؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15112e extends AbstractC13992e<C4157e> {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C13121e f29893e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f29894e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final float f29895e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Function1 f29896e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final float f29897e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f29898e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final float f29899e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Function0 f29900e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final float f29901e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C13121e f29902e;

    public C15112e(float f, float f2, float f3, float f4, long j, long j2, C13121e c13121e, C13121e c13121e2, Function0 function0, Function1 function1) {
        this.f29900e = function0;
        this.f29896e = function1;
        this.f29894e = j;
        this.f29898e = j2;
        this.f29893e = c13121e;
        this.f29902e = c13121e2;
        this.f29901e = f;
        this.f29897e = f2;
        this.f29899e = f3;
        this.f29895e = f4;
    }

    @Override // defpackage.AbstractC13992e
    /* renamed from: Signature, reason: from getter */
    public final float getF35457e() {
        return this.f29899e;
    }

    @Override // defpackage.AbstractC13992e
    /* renamed from: adcel, reason: from getter */
    public final long getF35454e() {
        return this.f29894e;
    }

    @Override // defpackage.AbstractC13992e
    /* renamed from: advert, reason: from getter */
    public final C13121e getF35464e() {
        return this.f29893e;
    }

    @Override // defpackage.AbstractC13992e
    /* renamed from: amazon, reason: from getter */
    public final C13121e getF35459e() {
        return this.f29902e;
    }

    @Override // defpackage.AbstractC13992e
    public final boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof C15112e)) {
            return false;
        }
        C15112e c15112e = (C15112e) obj;
        return C15765e.vip(this.f29897e, c15112e.f29897e) && this.f29900e == c15112e.f29900e && this.f29896e == c15112e.f29896e;
    }

    @Override // defpackage.AbstractC13992e
    public final int hashCode() {
        return this.f29896e.hashCode() + ((this.f29900e.hashCode() + AbstractC1414e.license(super.hashCode() * 31, this.f29897e, 31)) * 31);
    }

    @Override // defpackage.AbstractC13992e
    /* renamed from: loadAd, reason: from getter */
    public final float getF35460e() {
        return this.f29895e;
    }

    @Override // defpackage.AbstractC13992e
    /* renamed from: mopub, reason: from getter */
    public final float getF35462e() {
        return this.f29901e;
    }

    @Override // defpackage.AbstractC13992e
    /* renamed from: smaato, reason: from getter */
    public final long getF35465e() {
        return this.f29898e;
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C4157e(this.f29897e, this.f29901e, this.f29899e, this.f29895e, this.f29894e, this.f29898e, this.f29893e, this.f29902e, this.f29900e, this.f29896e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C4157e c4157e = (C4157e) abstractC13616e;
        admob(c4157e);
        float f = c4157e.f9172e;
        C17166e c17166e = c4157e.f9173e;
        float f2 = this.f29897e;
        if (!C15765e.vip(f, f2)) {
            c4157e.f9172e = f2;
            AbstractC12640e.advert(c17166e);
        }
        Function0 function0 = c4157e.f9171e;
        Function1 function1 = this.f29896e;
        Function0 function02 = this.f29900e;
        if (function0 == function02 && c4157e.f9170e == function1) {
            return;
        }
        c4157e.f9171e = function02;
        c4157e.f9170e = function1;
        c17166e.m4273e();
    }
}
