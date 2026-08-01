package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؔؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13013e implements InterfaceC11289e, InterfaceC11311e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final EnumC7792e f25936e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC11311e f25937e;

    public C13013e(InterfaceC11311e interfaceC11311e, EnumC7792e enumC7792e) {
        this.f25937e = interfaceC11311e;
        this.f25936e = enumC7792e;
    }

    @Override // defpackage.InterfaceC13158e
    public final InterfaceC17242e ads(int i, int i2, Map map, Function1 function1) {
        return mo500public(i, i2, map, null, function1);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: const */
    public final int mo491const(long j) {
        return this.f25937e.mo491const(j);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: default */
    public final long mo492default(float f) {
        return this.f25937e.mo492default(f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘْؖ */
    public final int mo493e(float f) {
        return this.f25937e.mo493e(f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘؕۥ */
    public final long mo494e(long j) {
        return this.f25937e.mo494e(j);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eٓٛۢ */
    public final float mo495e(long j) {
        return this.f25937e.mo495e(j);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: final */
    public final float mo496final(int i) {
        return this.f25937e.mo496final(i);
    }

    @Override // defpackage.InterfaceC14388e
    public final float firebase(long j) {
        return this.f25937e.firebase(j);
    }

    @Override // defpackage.InterfaceC0732e
    public final EnumC7792e getLayoutDirection() {
        return this.f25936e;
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: instanceof */
    public final float mo497instanceof(float f) {
        return this.f25937e.mo497instanceof(f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: new */
    public final float mo498new(float f) {
        return this.f25937e.mo498new(f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: package */
    public final float mo499package() {
        return this.f25937e.mo499package();
    }

    @Override // defpackage.InterfaceC13158e
    /* renamed from: public */
    public final InterfaceC17242e mo500public(int i, int i2, Map map, Function1 function1, Function1 function12) {
        int i3 = i < 0 ? 0 : i;
        int i4 = i2 < 0 ? 0 : i2;
        if ((i3 & (-16777216)) != 0 || ((-16777216) & i4) != 0) {
            AbstractC14070e.metrica("Size(" + i3 + " x " + i4 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C17246e(i3, i4, map, function1, 0);
    }

    @Override // defpackage.InterfaceC14388e
    public final long tapsense(long j) {
        return this.f25937e.tapsense(j);
    }

    @Override // defpackage.InterfaceC0732e
    /* renamed from: transient */
    public final boolean mo398transient() {
        return this.f25937e.mo398transient();
    }

    @Override // defpackage.InterfaceC14388e
    public final float vip() {
        return this.f25937e.vip();
    }
}
