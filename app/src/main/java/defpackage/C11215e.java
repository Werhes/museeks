package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۘٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11215e implements InterfaceC12259e {
    public final Function1 ad;
    public final C2892e license;
    public final Function1 metrica;
    public final Function2 vip;

    public C11215e(Function1 function1, Function2 function2, Function1 function12, C2892e c2892e) {
        this.ad = function1;
        this.vip = function2;
        this.metrica = function12;
        this.license = c2892e;
    }

    @Override // defpackage.InterfaceC12259e
    public final Function1 ad() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC12259e
    public final Function1 getKey() {
        return this.ad;
    }
}
