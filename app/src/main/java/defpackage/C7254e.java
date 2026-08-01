package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leؚٚ;", "Leِٝؓ;", "Leٓٛٝ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؚٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C7254e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final float f14846e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final float f14847e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final long f14848e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final float f14849e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final boolean f14850e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final int f14851e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final float f14852e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final long f14853e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float f14854e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final InterfaceC16154e f14855e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final long f14856e;

    public C7254e(float f, float f2, float f3, float f4, float f5, long j, InterfaceC16154e interfaceC16154e, boolean z, long j2, long j3, int i) {
        this.f14854e = f;
        this.f14849e = f2;
        this.f14847e = f3;
        this.f14852e = f4;
        this.f14846e = f5;
        this.f14856e = j;
        this.f14855e = interfaceC16154e;
        this.f14850e = z;
        this.f14853e = j2;
        this.f14848e = j3;
        this.f14851e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7254e)) {
            return false;
        }
        C7254e c7254e = (C7254e) obj;
        return Float.compare(this.f14854e, c7254e.f14854e) == 0 && Float.compare(this.f14849e, c7254e.f14849e) == 0 && Float.compare(this.f14847e, c7254e.f14847e) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f14852e, c7254e.f14852e) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f14846e, c7254e.f14846e) == 0 && Float.compare(8.0f, 8.0f) == 0 && C13220e.ad(this.f14856e, c7254e.f14856e) && AbstractC7890e.billing(this.f14855e, c7254e.f14855e) && this.f14850e == c7254e.f14850e && C3618e.metrica(this.f14853e, c7254e.f14853e) && C3618e.metrica(this.f14848e, c7254e.f14848e) && this.f14851e == c7254e.f14851e;
    }

    public final int hashCode() {
        int license = AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.f14854e) * 31, this.f14849e, 31), this.f14847e, 31), 0.0f, 31), 0.0f, 31), this.f14852e, 31), 0.0f, 31), 0.0f, 31), this.f14846e, 31), 8.0f, 31);
        int i = C13220e.metrica;
        long j = this.f14856e;
        int applovin = (AbstractC0054e.applovin(this.f14855e, (((int) (j ^ (j >>> 32))) + license) * 31, 31) + (this.f14850e ? 1231 : 1237)) * 961;
        int i2 = C3618e.mopub;
        return (((AbstractC5087e.m1744class(AbstractC5087e.m1744class(applovin, this.f14853e, 31), this.f14848e, 31) + this.f14851e) * 31) + 3) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.f14854e);
        sb.append(", scaleY=");
        sb.append(this.f14849e);
        sb.append(", alpha=");
        sb.append(this.f14847e);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f14852e);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.f14846e);
        sb.append(", cameraDistance=8.0, transformOrigin=");
        sb.append((Object) C13220e.license(this.f14856e));
        sb.append(", shape=");
        sb.append(this.f14855e);
        sb.append(", clip=");
        sb.append(this.f14850e);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC5087e.m1754try(this.f14853e, ", spotShadowColor=", sb);
        AbstractC5087e.m1754try(this.f14848e, ", compositingStrategy=", sb);
        sb.append((Object) ("CompositingStrategy(value=" + this.f14851e + ')'));
        sb.append(", blendMode=");
        sb.append((Object) C8738e.billing(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٓٛٝ, java.lang.Object, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f27867e = this.f14854e;
        abstractC13616e.f27868e = this.f14849e;
        abstractC13616e.f27866e = this.f14847e;
        abstractC13616e.f27865e = this.f14852e;
        abstractC13616e.f27874e = this.f14846e;
        abstractC13616e.f27877e = 8.0f;
        abstractC13616e.f27864e = this.f14856e;
        abstractC13616e.f27872e = this.f14855e;
        abstractC13616e.f27875e = this.f14850e;
        abstractC13616e.f27876e = this.f14853e;
        abstractC13616e.f27871e = this.f14848e;
        abstractC13616e.f27869e = this.f14851e;
        abstractC13616e.f27870e = 3;
        abstractC13616e.f27873e = new C10570e(4, abstractC13616e);
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C14095e c14095e = (C14095e) abstractC13616e;
        c14095e.f27867e = this.f14854e;
        c14095e.f27868e = this.f14849e;
        c14095e.f27866e = this.f14847e;
        c14095e.f27865e = this.f14852e;
        c14095e.f27874e = this.f14846e;
        c14095e.f27877e = 8.0f;
        c14095e.f27864e = this.f14856e;
        c14095e.f27872e = this.f14855e;
        c14095e.f27875e = this.f14850e;
        c14095e.f27876e = this.f14853e;
        c14095e.f27871e = this.f14848e;
        c14095e.f27869e = this.f14851e;
        c14095e.f27870e = 3;
        AbstractC1599e.mopub(c14095e, c14095e.f27873e);
    }
}
