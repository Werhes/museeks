package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4134e extends AbstractC9292e implements InterfaceC16719e {

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public LinkedHashMap f9108e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final AbstractC17732e f9109e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public InterfaceC17242e f9111e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C17866e f9112e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public long f9110e = 0;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C13221e f9107e = new C13221e(this);

    public AbstractC4134e(AbstractC17732e abstractC17732e) {
        this.f9109e = abstractC17732e;
        C17866e c17866e = AbstractC8809e.ad;
        this.f9112e = new C17866e();
    }

    /* renamed from: eِؗؓ, reason: contains not printable characters */
    public static final void m1460e(AbstractC4134e abstractC4134e, InterfaceC17242e interfaceC17242e) {
        LinkedHashMap linkedHashMap;
        if (interfaceC17242e != null) {
            abstractC4134e.m1211super((interfaceC17242e.vip() & 4294967295L) | (interfaceC17242e.getWidth() << 32));
        } else {
            abstractC4134e.m1211super(0L);
        }
        if (!AbstractC7890e.billing(abstractC4134e.f9111e, interfaceC17242e) && interfaceC17242e != null && ((((linkedHashMap = abstractC4134e.f9108e) != null && !linkedHashMap.isEmpty()) || !interfaceC17242e.ad().isEmpty()) && !AbstractC7890e.billing(interfaceC17242e.ad(), abstractC4134e.f9108e))) {
            abstractC4134e.f9109e.f34782e.f27612e.admob.f34475e.purchase();
            LinkedHashMap linkedHashMap2 = abstractC4134e.f9108e;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                abstractC4134e.f9108e = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC17242e.ad());
        }
        abstractC4134e.f9111e = interfaceC17242e;
    }

    @Override // defpackage.AbstractC2832e
    /* renamed from: catch */
    public final void mo392catch(long j, float f, Function1 function1) {
        m1464e(j);
        if (this.f18511e) {
            return;
        }
        mo1462e();
    }

    @Override // defpackage.AbstractC9292e
    /* renamed from: continue, reason: not valid java name */
    public final C13915e mo1461continue() {
        return this.f9109e.f34782e;
    }

    /* renamed from: eٟؒؗ, reason: contains not printable characters */
    public void mo1462e() {
        mo1469e().metrica();
    }

    @Override // defpackage.AbstractC9292e
    /* renamed from: eؒۖۗ, reason: contains not printable characters */
    public final void mo1463e() {
        mo392catch(this.f9110e, 0.0f, null);
    }

    /* renamed from: eؚؚؓ, reason: contains not printable characters */
    public final void m1464e(long j) {
        if (!C11490e.vip(this.f9110e, j)) {
            this.f9110e = j;
            AbstractC17732e abstractC17732e = this.f9109e;
            C17596e c17596e = abstractC17732e.f34782e.f27612e.admob;
            if (c17596e != null) {
                c17596e.m4368else();
            }
            AbstractC9292e.m2535e(abstractC17732e);
        }
        if (this.f18514e) {
            return;
        }
        m2536else(mo1469e());
    }

    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public final long m1465e() {
        return (this.f6804e & 4294967295L) | (this.f6806e << 32);
    }

    @Override // defpackage.AbstractC9292e
    /* renamed from: eًًؓ, reason: contains not printable characters */
    public final AbstractC9292e mo1466e() {
        AbstractC17732e abstractC17732e = this.f9109e.f34794e;
        if (abstractC17732e != null) {
            return abstractC17732e.mo2526e();
        }
        return null;
    }

    @Override // defpackage.AbstractC9292e
    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public final long mo1467e() {
        return this.f9110e;
    }

    /* renamed from: eٕؓٝ, reason: contains not printable characters */
    public final long m1468e(AbstractC4134e abstractC4134e, boolean z) {
        long j = 0;
        for (AbstractC4134e abstractC4134e2 = this; !AbstractC7890e.billing(abstractC4134e2, abstractC4134e); abstractC4134e2 = abstractC4134e2.f9109e.f34794e.mo2526e()) {
            if (!abstractC4134e2.f18515e || !z) {
                j = C11490e.license(j, abstractC4134e2.f9110e);
            }
        }
        return j;
    }

    @Override // defpackage.AbstractC9292e
    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public final InterfaceC17242e mo1469e() {
        InterfaceC17242e interfaceC17242e = this.f9111e;
        if (interfaceC17242e != null) {
            return interfaceC17242e;
        }
        throw AbstractC8703e.Signature("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.AbstractC9292e
    /* renamed from: for, reason: not valid java name */
    public final boolean mo1470for() {
        return this.f9111e != null;
    }

    @Override // defpackage.InterfaceC0732e
    public final EnumC7792e getLayoutDirection() {
        return this.f9109e.f34782e.f27610e;
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: package */
    public final float mo499package() {
        return this.f9109e.mo499package();
    }

    @Override // defpackage.AbstractC2832e, defpackage.InterfaceC16719e
    public final Object signatures() {
        return this.f9109e.signatures();
    }

    @Override // defpackage.AbstractC9292e
    /* renamed from: switch, reason: not valid java name */
    public final AbstractC9292e mo1471switch() {
        AbstractC17732e abstractC17732e = this.f9109e.f34777e;
        if (abstractC17732e != null) {
            return abstractC17732e.mo2526e();
        }
        return null;
    }

    @Override // defpackage.AbstractC9292e, defpackage.InterfaceC0732e
    /* renamed from: transient */
    public final boolean mo398transient() {
        return true;
    }

    @Override // defpackage.InterfaceC14388e
    public final float vip() {
        return this.f9109e.vip();
    }

    @Override // defpackage.AbstractC9292e
    /* renamed from: volatile, reason: not valid java name */
    public final InterfaceC0043e mo1472volatile() {
        return this.f9107e;
    }
}
