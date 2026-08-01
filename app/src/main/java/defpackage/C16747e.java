package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16747e implements InterfaceC16132e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f32833e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public AbstractC3424e f32834e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0576e f32835e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f32836e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C11139e f32837e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f32838e;

    public /* synthetic */ C16747e(C11139e c11139e, Object obj, AbstractC3424e abstractC3424e, int i) {
        this(c11139e, obj, (i & 4) != 0 ? null : abstractC3424e, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public C16747e(C11139e c11139e, Object obj, AbstractC3424e abstractC3424e, long j, long j2, boolean z) {
        AbstractC3424e abstractC3424e2;
        this.f32837e = c11139e;
        this.f32835e = AbstractC14533e.startapp(obj);
        if (abstractC3424e != null) {
            abstractC3424e2 = AbstractC12246e.metrica(abstractC3424e);
        } else {
            abstractC3424e2 = (AbstractC3424e) c11139e.ad.invoke(obj);
            abstractC3424e2.license();
        }
        this.f32834e = abstractC3424e2;
        this.f32836e = j;
        this.f32833e = j2;
        this.f32838e = z;
    }

    @Override // defpackage.InterfaceC16132e
    public final Object getValue() {
        return this.f32835e.getValue();
    }

    public final Object metrica() {
        return this.f32837e.vip.invoke(this.f32834e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationState(value=");
        sb.append(this.f32835e.getValue());
        sb.append(", velocity=");
        sb.append(metrica());
        sb.append(", isRunning=");
        sb.append(this.f32838e);
        sb.append(", lastFrameTimeNanos=");
        sb.append(this.f32836e);
        sb.append(", finishedTimeNanos=");
        return AbstractC10257e.mopub(sb, this.f32833e, ')');
    }
}
