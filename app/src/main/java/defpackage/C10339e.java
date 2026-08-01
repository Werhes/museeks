package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ٘ۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10339e implements InterfaceC2566e {
    public final C5070e ad;
    public final C16181e metrica;
    public final Function0 vip;

    public C10339e(C5070e c5070e, Function0 function0) {
        C14136e c14136e = new C14136e(25);
        this.ad = c5070e;
        this.vip = function0;
        c5070e.metrica = c14136e;
        this.metrica = new C16181e(this, 1);
    }

    @Override // defpackage.InterfaceC2566e
    public final InterfaceC14906e ad() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC2566e
    public final C5070e getState() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC2566e
    public final boolean license() {
        return true;
    }

    @Override // defpackage.InterfaceC2566e
    public final InterfaceC2869e metrica() {
        return null;
    }

    @Override // defpackage.InterfaceC2566e
    public final C15217e vip() {
        return null;
    }
}
