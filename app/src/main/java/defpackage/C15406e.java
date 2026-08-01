package defpackage;

import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15406e implements InterfaceC11426e {
    public final Function3 ad;
    public final InterfaceC11426e vip;

    public C15406e(Function3 function3, InterfaceC11426e interfaceC11426e) {
        this.ad = function3;
        this.vip = interfaceC11426e;
    }

    @Override // defpackage.InterfaceC11426e
    public final Object ad(C10263e c10263e, AbstractC10731e abstractC10731e) {
        return this.ad.invoke(this.vip, c10263e, abstractC10731e);
    }
}
