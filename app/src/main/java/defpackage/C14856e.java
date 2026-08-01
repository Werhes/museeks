package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٝۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14856e implements InterfaceC13158e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC9153e f29399e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC7183e f29400e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C3123e f29401e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C10350e f29402e;

    public C14856e(C10350e c10350e, InterfaceC7183e interfaceC7183e) {
        this.f29402e = c10350e;
        this.f29400e = interfaceC7183e;
        this.f29399e = (InterfaceC9153e) c10350e.vip.invoke();
        AbstractC12146e.ad();
        this.f29401e = new C3123e();
    }

    public final List ad(int i) {
        C3123e c3123e = this.f29401e;
        List list = (List) c3123e.vip(i);
        if (list != null) {
            return list;
        }
        InterfaceC9153e interfaceC9153e = this.f29399e;
        Object vip = interfaceC9153e.vip(i);
        List subscription = this.f29400e.subscription(vip, this.f29402e.ad(i, vip, interfaceC9153e.metrica(i)));
        c3123e.startapp(i, subscription);
        return subscription;
    }

    @Override // defpackage.InterfaceC13158e
    public final InterfaceC17242e ads(int i, int i2, Map map, Function1 function1) {
        return this.f29400e.ads(i, i2, map, function1);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: const */
    public final int mo491const(long j) {
        return this.f29400e.mo491const(j);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: default */
    public final long mo492default(float f) {
        return this.f29400e.mo492default(f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘْؖ */
    public final int mo493e(float f) {
        return this.f29400e.mo493e(f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘؕۥ */
    public final long mo494e(long j) {
        return this.f29400e.mo494e(j);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eٓٛۢ */
    public final float mo495e(long j) {
        return this.f29400e.mo495e(j);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: final */
    public final float mo496final(int i) {
        return this.f29400e.mo496final(i);
    }

    @Override // defpackage.InterfaceC14388e
    public final float firebase(long j) {
        return this.f29400e.firebase(j);
    }

    @Override // defpackage.InterfaceC0732e
    public final EnumC7792e getLayoutDirection() {
        return this.f29400e.getLayoutDirection();
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: instanceof */
    public final float mo497instanceof(float f) {
        return this.f29400e.mo497instanceof(f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: new */
    public final float mo498new(float f) {
        return this.f29400e.mo498new(f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: package */
    public final float mo499package() {
        return this.f29400e.mo499package();
    }

    @Override // defpackage.InterfaceC13158e
    /* renamed from: public */
    public final InterfaceC17242e mo500public(int i, int i2, Map map, Function1 function1, Function1 function12) {
        return this.f29400e.mo500public(i, i2, C9139e.f18290e, function1, function12);
    }

    @Override // defpackage.InterfaceC14388e
    public final long tapsense(long j) {
        return this.f29400e.tapsense(j);
    }

    @Override // defpackage.InterfaceC0732e
    /* renamed from: transient */
    public final boolean mo398transient() {
        return this.f29400e.mo398transient();
    }

    @Override // defpackage.InterfaceC14388e
    public final float vip() {
        return this.f29400e.vip();
    }
}
