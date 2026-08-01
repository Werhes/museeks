package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۧۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1487e extends AbstractC9613e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f4356e;

    public AbstractC1487e(C15398e c15398e) {
        super(c15398e);
        this.f19060e.f30357e++;
    }

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public final void m613e() {
        if (!this.f4356e) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public final void m614e() {
        if (this.f4356e) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo554e();
        this.f19060e.f30375e++;
        this.f4356e = true;
    }

    /* renamed from: eّٖٗ */
    public abstract void mo554e();
}
