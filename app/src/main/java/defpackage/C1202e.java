package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؒٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1202e implements InterfaceC13158e, InterfaceC0732e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final EnumC7792e f3831e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0732e f3832e;

    public C1202e(InterfaceC0732e interfaceC0732e, EnumC7792e enumC7792e) {
        this.f3832e = interfaceC0732e;
        this.f3831e = enumC7792e;
    }

    @Override // defpackage.InterfaceC13158e
    public final InterfaceC17242e ads(int i, int i2, Map map, Function1 function1) {
        return mo500public(i, i2, map, null, function1);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: const, reason: not valid java name */
    public final int mo491const(long j) {
        return this.f3832e.mo491const(j);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: default, reason: not valid java name */
    public final long mo492default(float f) {
        return this.f3832e.mo492default(f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘْؖ, reason: contains not printable characters */
    public final int mo493e(float f) {
        return this.f3832e.mo493e(f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘؕۥ, reason: contains not printable characters */
    public final long mo494e(long j) {
        return this.f3832e.mo494e(j);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eٓٛۢ, reason: contains not printable characters */
    public final float mo495e(long j) {
        return this.f3832e.mo495e(j);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: final, reason: not valid java name */
    public final float mo496final(int i) {
        return this.f3832e.mo496final(i);
    }

    @Override // defpackage.InterfaceC14388e
    public final float firebase(long j) {
        return this.f3832e.firebase(j);
    }

    @Override // defpackage.InterfaceC0732e
    public final EnumC7792e getLayoutDirection() {
        return this.f3831e;
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: instanceof, reason: not valid java name */
    public final float mo497instanceof(float f) {
        return this.f3832e.mo497instanceof(f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: new, reason: not valid java name */
    public final float mo498new(float f) {
        return this.f3832e.mo498new(f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: package, reason: not valid java name */
    public final float mo499package() {
        return this.f3832e.mo499package();
    }

    @Override // defpackage.InterfaceC13158e
    /* renamed from: public, reason: not valid java name */
    public final InterfaceC17242e mo500public(int i, int i2, Map map, Function1 function1, Function1 function12) {
        int i3 = i < 0 ? 0 : i;
        int i4 = i2 < 0 ? 0 : i2;
        if ((i3 & (-16777216)) != 0 || ((-16777216) & i4) != 0) {
            AbstractC14070e.metrica("Size(" + i3 + " x " + i4 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C17246e(i3, i4, map, function1, 1);
    }

    @Override // defpackage.InterfaceC14388e
    public final long tapsense(long j) {
        return this.f3832e.tapsense(j);
    }

    @Override // defpackage.InterfaceC0732e
    /* renamed from: transient */
    public final boolean mo398transient() {
        return this.f3832e.mo398transient();
    }

    @Override // defpackage.InterfaceC14388e
    public final float vip() {
        return this.f3832e.vip();
    }
}
