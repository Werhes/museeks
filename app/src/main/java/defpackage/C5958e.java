package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۣ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5958e implements InterfaceC2566e {
    public final C5070e ad;
    public final C16181e appmetrica = new C16181e(this, 0);
    public final Function0 license;
    public final C15217e metrica;
    public final InterfaceC2869e vip;

    public C5958e(C5070e c5070e, InterfaceC6512e interfaceC6512e, C15217e c15217e, Function0 function0) {
        this.ad = c5070e;
        this.vip = interfaceC6512e;
        this.metrica = c15217e;
        this.license = function0;
    }

    @Override // defpackage.InterfaceC2566e
    public final InterfaceC14906e ad() {
        return this.appmetrica;
    }

    @Override // defpackage.InterfaceC2566e
    public final C5070e getState() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC2566e
    public final boolean license() {
        return false;
    }

    @Override // defpackage.InterfaceC2566e
    public final InterfaceC2869e metrica() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC2566e
    public final C15217e vip() {
        return this.metrica;
    }
}
