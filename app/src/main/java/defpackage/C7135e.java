package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7135e implements InterfaceC9089e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f14608e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C4886e f14609e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C13564e f14610e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f14611e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC18435e f14612e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C13578e f14613e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public long f14614e;

    public C7135e(C1633e c1633e) {
        C13564e c13564e = new C13564e(24);
        this.f14612e = c1633e;
        this.f14610e = c13564e;
        this.f14609e = new C4886e(new C12851e(7, this));
        this.f14611e = new Object();
        this.f14608e = 5;
    }

    public static final void ad(C7135e c7135e, long j) {
        ((C18464e) c7135e.f14609e.f10364e).m4497e(new C14134e(j, 3));
        synchronized (c7135e.f14611e) {
            c7135e.f14614e = j;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC9089e
    /* renamed from: catch */
    public final Object mo1675catch(Function1 function1, InterfaceC5083e interfaceC5083e) {
        return this.f14609e.mo1675catch(function1, interfaceC5083e);
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: const */
    public final InterfaceC8850e mo394const(InterfaceC8850e interfaceC8850e) {
        return AbstractC5797e.vip(this, interfaceC8850e);
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: eؘْؖ */
    public final Object mo395e(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: final */
    public final InterfaceC8850e mo396final(InterfaceC1598e interfaceC1598e) {
        return AbstractC8769e.appmetrica(this, interfaceC1598e);
    }

    @Override // defpackage.InterfaceC4595e
    public final InterfaceC1598e getKey() {
        return C12575e.f25231e;
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: public */
    public final InterfaceC4595e mo397public(InterfaceC1598e interfaceC1598e) {
        return AbstractC8769e.vip(this, interfaceC1598e);
    }

    public final void vip() {
        synchronized (this.f14611e) {
            C13578e c13578e = this.f14613e;
            if (c13578e != null) {
                c13578e.ad(null);
            }
        }
    }
}
