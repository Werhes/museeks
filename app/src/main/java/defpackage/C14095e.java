package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٛٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14095e extends AbstractC13616e implements InterfaceC17303e, InterfaceC17453e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public long f27864e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public float f27865e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public float f27866e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public float f27867e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public float f27868e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public int f27869e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public int f27870e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public long f27871e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public InterfaceC16154e f27872e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public C10570e f27873e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public float f27874e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public boolean f27875e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public long f27876e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public float f27877e;

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.appmetrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17453e
    public final void adcel(InterfaceC15671e interfaceC15671e) {
        if (this.f27875e) {
            AbstractC14594e.amazon(interfaceC15671e, this.f27872e);
        }
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.billing(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: break */
    public final /* synthetic */ boolean mo358break() {
        return false;
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: eؒۖۗ */
    public final /* synthetic */ boolean mo359e() {
        return false;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؚؚؓ */
    public final boolean mo293e() {
        return false;
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        AbstractC2832e admob = interfaceC16719e.admob(j);
        return interfaceC13158e.ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new C5337e(admob, this, 14));
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.metrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17453e
    public final boolean smaato() {
        return false;
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.startapp(this, abstractC9292e, interfaceC16719e, i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f27867e);
        sb.append(", scaleY=");
        sb.append(this.f27868e);
        sb.append(", alpha = ");
        sb.append(this.f27866e);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f27865e);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.f27874e);
        sb.append(", cameraDistance=");
        sb.append(this.f27877e);
        sb.append(", transformOrigin=");
        sb.append((Object) C13220e.license(this.f27864e));
        sb.append(", shape=");
        sb.append(this.f27872e);
        sb.append(", clip=");
        sb.append(this.f27875e);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC5087e.m1754try(this.f27876e, ", spotShadowColor=", sb);
        AbstractC5087e.m1754try(this.f27871e, ", compositingStrategy=", sb);
        sb.append((Object) ("CompositingStrategy(value=" + this.f27869e + ')'));
        sb.append(", blendMode=");
        sb.append((Object) C8738e.billing(this.f27870e));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
