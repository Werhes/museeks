package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eََٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10181e implements InterfaceC12259e {
    public final Function1 ad;
    public final C2892e metrica;
    public final Function1 vip;

    public C10181e(Function1 function1, Function1 function12, C2892e c2892e) {
        this.ad = function1;
        this.vip = function12;
        this.metrica = c2892e;
    }

    @Override // defpackage.InterfaceC12259e
    public final Function1 ad() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC12259e
    public final Function1 getKey() {
        return this.ad;
    }
}
