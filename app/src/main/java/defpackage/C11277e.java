package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۛۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11277e implements InterfaceC11289e, InterfaceC13158e, InterfaceC11905e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f22654e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C0404e f22655e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C9157e f22656e;

    public C11277e(C9157e c9157e, C0404e c0404e) {
        this.f22656e = c9157e;
        this.f22655e = c0404e;
    }

    @Override // defpackage.InterfaceC11905e
    public final InterfaceC0043e ad(InterfaceC0043e interfaceC0043e) {
        C13221e c13221e;
        if (interfaceC0043e instanceof C13221e) {
            return interfaceC0043e;
        }
        if (interfaceC0043e instanceof AbstractC17732e) {
            AbstractC4134e mo2526e = ((AbstractC17732e) interfaceC0043e).mo2526e();
            return (mo2526e == null || (c13221e = mo2526e.f9107e) == null) ? interfaceC0043e : c13221e;
        }
        AbstractC14070e.vip("Unsupported LayoutCoordinates");
        throw new C14803e(9);
    }

    @Override // defpackage.InterfaceC13158e
    public final InterfaceC17242e ads(int i, int i2, Map map, Function1 function1) {
        return this.f22656e.mo500public(i, i2, map, null, function1);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: const */
    public final int mo491const(long j) {
        return this.f22656e.mo491const(j);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: default */
    public final long mo492default(float f) {
        return this.f22656e.mo492default(f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘْؖ */
    public final int mo493e(float f) {
        C9157e c9157e = this.f22656e;
        c9157e.getClass();
        return AbstractC4653e.ad(c9157e, f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘؕۥ */
    public final long mo494e(long j) {
        C9157e c9157e = this.f22656e;
        c9157e.getClass();
        return AbstractC4653e.appmetrica(j, c9157e);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eٓٛۢ */
    public final float mo495e(long j) {
        C9157e c9157e = this.f22656e;
        c9157e.getClass();
        return AbstractC4653e.license(j, c9157e);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: final */
    public final float mo496final(int i) {
        return this.f22656e.mo496final(i);
    }

    @Override // defpackage.InterfaceC14388e
    public final float firebase(long j) {
        C9157e c9157e = this.f22656e;
        c9157e.getClass();
        return AbstractC4653e.vip(j, c9157e);
    }

    @Override // defpackage.InterfaceC0732e
    public final EnumC7792e getLayoutDirection() {
        return this.f22656e.f34782e.f27610e;
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: instanceof */
    public final float mo497instanceof(float f) {
        return this.f22656e.vip() * f;
    }

    @Override // defpackage.InterfaceC11905e
    public final /* synthetic */ long metrica(InterfaceC0043e interfaceC0043e, InterfaceC0043e interfaceC0043e2) {
        return AbstractC5087e.adcel(this, interfaceC0043e, interfaceC0043e2);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: new */
    public final float mo498new(float f) {
        return f / this.f22656e.vip();
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: package */
    public final float mo499package() {
        return this.f22656e.mo499package();
    }

    @Override // defpackage.InterfaceC13158e
    /* renamed from: public */
    public final InterfaceC17242e mo500public(int i, int i2, Map map, Function1 function1, Function1 function12) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            AbstractC14070e.metrica("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C4855e(i, i2, function1, function12, this);
    }

    @Override // defpackage.InterfaceC14388e
    public final long tapsense(long j) {
        C9157e c9157e = this.f22656e;
        c9157e.getClass();
        return AbstractC4653e.metrica(j, c9157e);
    }

    @Override // defpackage.InterfaceC0732e
    /* renamed from: transient */
    public final boolean mo398transient() {
        return false;
    }

    @Override // defpackage.InterfaceC14388e
    public final float vip() {
        return this.f22656e.vip();
    }
}
